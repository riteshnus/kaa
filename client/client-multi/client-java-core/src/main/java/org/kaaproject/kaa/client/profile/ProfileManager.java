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

/**
 * <p>Interface for the profile manager</p>
 * <p>Responsible for the profile container management and {@link ProfileListener} creation</p>
 *
 * @author Yaroslav Zeygerman
 *
 */
public interface ProfileManager {
    /**
     * Sets profile container implemented by the user.
     *
     * @param container User-defined container
     * @see AbstractProfileContainer
     */
    void setProfileContainer(ProfileContainer container);

    /**
     * Retrieves container responsible for profile serializing
     * 
     * @return Container which contains a serialized profile
     */
    SerializedProfileContainer getSerializedProfileContainer();

}
