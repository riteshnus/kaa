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

package org.kaaproject.kaa.client.channel.impl.channels;

import java.security.GeneralSecurityException;
import java.util.LinkedHashMap;

import org.kaaproject.kaa.common.endpoint.CommonEPConstans;
import org.kaaproject.kaa.common.endpoint.security.MessageEncoderDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpRequestCreator {

    public static final Logger LOG = LoggerFactory //NOSONAR
            .getLogger(HttpRequestCreator.class);

    static LinkedHashMap<String, byte[]> createOperationHttpRequest(byte [] body, MessageEncoderDecoder messageEncDec) throws GeneralSecurityException {
        byte[] requestKeyEncoded = messageEncDec.getEncodedSessionKey();
        byte[] requestBodyEncoded = messageEncDec.encodeData(body);
        byte[] signature = messageEncDec.sign(requestBodyEncoded);

        if (LOG.isTraceEnabled()) {
            LOG.trace("Signature size: {}", signature.length);
            LOG.trace(MessageEncoderDecoder.bytesToHex(signature));
            LOG.trace("RequestKeyEncoded size: {}", requestKeyEncoded.length);
            LOG.trace(MessageEncoderDecoder.bytesToHex(requestKeyEncoded));
            LOG.trace("RequestBodyEncoded size: {}", requestBodyEncoded.length);
            LOG.trace(MessageEncoderDecoder.bytesToHex(requestBodyEncoded));
        }
        LinkedHashMap<String, byte[]> requestEntity = new LinkedHashMap<String, byte[]>();
        requestEntity.put(CommonEPConstans.REQUEST_SIGNATURE_ATTR_NAME,
                signature);
        requestEntity.put(CommonEPConstans.REQUEST_KEY_ATTR_NAME,
                requestKeyEncoded);
        requestEntity.put(CommonEPConstans.REQUEST_DATA_ATTR_NAME,
                requestBodyEncoded);
        return requestEntity;
    }

}
