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

package org.kaaproject.kaa.common.dto;

import java.util.ArrayList;
import java.util.List;

public enum KaaAuthorityDto {
    KAA_ADMIN,
    TENANT_ADMIN,
    TENANT_DEVELOPER,
    TENANT_USER;
    
    public static KaaAuthorityDto parse(String value) {
        KaaAuthorityDto authority = null;
        if (value != null && value.length() != 0) {
            for (KaaAuthorityDto current : KaaAuthorityDto.values()) {
                if (current.name().equalsIgnoreCase(value)) {
                    authority = current;
                    break;
                }
            }
        }
        return authority;
    }

    public static List<KaaAuthorityDto> parseList(String... values) {
        List<KaaAuthorityDto> authorities = null;
        if (values != null && values.length != 0) {
            authorities = new ArrayList<>(values.length);
            for (String value : values) {
                KaaAuthorityDto authority = parse(value);
                if (authority != null) {
                    authorities.add(authority);
                }
            }
        }
        return authorities;
    }
}
