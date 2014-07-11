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

package org.kaaproject.kaa.client.profile;

import java.io.IOException;

import org.kaaproject.kaa.client.channel.ProfileTransport;

/**
 * Default {@link ProfileListener} implementation
 *
 * @author Yaroslav Zeygerman
 *
 */
public class DefaultProfileListener implements ProfileListener {
    private final ProfileTransport transport;

    DefaultProfileListener(ProfileTransport transport) {
        this.transport = transport;
    }

    @Override
    public void onProfileUpdated(byte [] profile) throws IOException {
        if (profile != null) {
            transport.sync();
        }
    }

}
