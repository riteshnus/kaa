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
package org.kaaproject.kaa.client.channel.impl.channels.polling;

import java.util.LinkedHashMap;
import java.util.Map;

import org.kaaproject.kaa.client.channel.ChannelDirection;
import org.kaaproject.kaa.client.channel.ServerInfo;
import org.kaaproject.kaa.common.TransportType;

public interface RawDataProcessor {

    LinkedHashMap<String, byte[]> createRequest(Map<TransportType, ChannelDirection> types);

    void onResponse(byte [] response);

    void onServerError(ServerInfo info);

}
