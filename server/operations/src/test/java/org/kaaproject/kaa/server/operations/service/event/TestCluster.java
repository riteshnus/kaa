/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.operations.service.event;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.apache.curator.RetryPolicy;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.test.InstanceSpec;
import org.apache.curator.test.TestingCluster;
import org.kaaproject.kaa.server.common.zk.gen.BaseStatistics;
import org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo;
import org.kaaproject.kaa.server.common.zk.gen.IpComunicationParameters;
import org.kaaproject.kaa.server.common.zk.gen.OperationsNodeInfo;
import org.kaaproject.kaa.server.common.zk.gen.SupportedChannel;
import org.kaaproject.kaa.server.common.zk.gen.ZkChannelType;
import org.kaaproject.kaa.server.common.zk.gen.ZkHttpComunicationParameters;
import org.kaaproject.kaa.server.common.zk.gen.ZkHttpStatistics;
import org.kaaproject.kaa.server.common.zk.gen.ZkSupportedChannel;
import org.kaaproject.kaa.server.common.zk.operations.OperationsNode;
import org.kaaproject.kaa.server.common.zk.operations.OperationsNodeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class TestCluster.
 */
public class TestCluster {

    /** The Constant logger. */
    private static final Logger logger = LoggerFactory
            .getLogger(TestCluster.class);

    /** The Constant BOOTSTRAP_NODE_HOST. */
    private static final String BOOTSTRAP_NODE_HOST = "192.168.0.202";

    /** The Constant ENDPOINT_NODE_HOST. */
    public  static final String OPERATIONS_NODE_HOST = "127.0.0.1";

    /** The zookeeper cluster static instance. */
    private static TestingCluster zkCluster;

    /** The endpoint node static instance. */
    private static OperationsNode operationsNode;

    /**
     * Start.
     *
     * @throws Exception the exception
     */
    public static void checkStarted() throws Exception {
        zkCluster = new TestingCluster(new InstanceSpec(null, EventServiceThriftTestIT.ZK_PORT, -1, -1, true, -1, -1, -1));
        zkCluster.start();
        logger.info("ZK Cluster started");
        OperationsNodeInfo endpointNodeInfo = buildEndpointNodeInfo();

        operationsNode = new OperationsNode(endpointNodeInfo,
                zkCluster.getConnectString(), buildDefaultRetryPolicy());
        operationsNode.start();
    
    }

    /**
     * Stop.
     *
     * @throws Exception the exception
     */
    public static void stop() throws Exception {
        operationsNode.close();
        zkCluster.close();
    }

    public static void addOperationsListener(OperationsNodeListener listener) {
        operationsNode.addListener(listener);
    }

    public static void removeOperationsListener(OperationsNodeListener listener) {
        operationsNode.removeListener(listener);
    }
    /**
     * Builds the default retry policy.
     *
     * @return the retry policy
     */
    private static RetryPolicy buildDefaultRetryPolicy() {
        return new ExponentialBackoffRetry(100, 1);
    }

    /**
     * Builds the endpoint node info.
     *
     * @return the endpoint node info
     */
    private static OperationsNodeInfo buildEndpointNodeInfo() {
        OperationsNodeInfo nodeInfo = new OperationsNodeInfo();
        ByteBuffer testKeyData = ByteBuffer.wrap(new byte[]{10,11,12,45,34,23,67,89,66,12});
        nodeInfo.setConnectionInfo(new ConnectionInfo(OPERATIONS_NODE_HOST, 1000, testKeyData));
        nodeInfo.setTimeStarted(System.currentTimeMillis());
        List<SupportedChannel> supportedChannels = new ArrayList<>();
        ZkHttpComunicationParameters httpCommunicationParameters = new ZkHttpComunicationParameters(new IpComunicationParameters(OPERATIONS_NODE_HOST, 1000));
        BaseStatistics statistics = new BaseStatistics(2, 3, 1, System.currentTimeMillis());
        ZkHttpStatistics httpChannelStatistics = new ZkHttpStatistics(statistics );
        SupportedChannel channelHttp = new SupportedChannel(new ZkSupportedChannel(ZkChannelType.HTTP, true, httpCommunicationParameters, httpChannelStatistics));
        supportedChannels.add(channelHttp);
        nodeInfo.setSupportedChannelsArray(supportedChannels );;
        return nodeInfo;
    }

    public static OperationsNode getOperationsNode() {
        return operationsNode;
    }
}
