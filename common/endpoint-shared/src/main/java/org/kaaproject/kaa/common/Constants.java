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

package org.kaaproject.kaa.common;

/**
 * Common Kaa project Constants.
 */
public interface Constants { //NOSONAR
    /**
     * Used URI delimiter.
     */
    public static final String URI_DELIM = "/"; //NOSONAR

    /**
     * HTTP response content-type.
     */
    public static final String RESPONSE_CONTENT_TYPE = "\"application/x-kaa\""; //NOSONAR

    /**
     * HTTP response custom header for set RSA Signature encoded in base64
     */
    public static final String SIGNATURE_HEADER_NAME = "X-SIGNATURE"; //NOSONAR

}
