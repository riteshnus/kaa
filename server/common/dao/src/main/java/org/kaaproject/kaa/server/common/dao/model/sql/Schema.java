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
package org.kaaproject.kaa.server.common.dao.model.sql;

import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_APPLICATION_ID;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_CREATED_TIME;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_CREATED_USERNAME;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_DESCRIPTION;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_ENDPOINT_COUNT;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_MAJOR_VERSION;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_MINOR_VERSION;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_NAME;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_SCHEMA;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelConstants.SCHEMA_TABLE_NAME;
import static org.kaaproject.kaa.server.common.dao.model.sql.ModelUtils.getLongId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.kaaproject.kaa.common.dto.AbstractSchemaDto;
import org.kaaproject.kaa.common.dto.SchemaDto;

@Entity
@Table(name = SCHEMA_TABLE_NAME)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Schema<T extends AbstractSchemaDto> extends GenericModel<T> {

    private static final long serialVersionUID = 2866125011338808891L;

    @Column(name = SCHEMA_MAJOR_VERSION)
    protected int majorVersion;

    @Column(name = SCHEMA_MINOR_VERSION)
    protected int minorVersion;

    @Lob
    @Column(name = SCHEMA_SCHEMA)
    protected String schema;

    @Column(name = SCHEMA_NAME)
    protected String name;

    @Column(name = SCHEMA_DESCRIPTION)
    protected String description;

    @Column(name = SCHEMA_CREATED_USERNAME)
    protected String createdUsername;

    @Column(name = SCHEMA_CREATED_TIME)
    protected long createdTime;

    @Column(name = SCHEMA_ENDPOINT_COUNT)
    protected long endpointCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = SCHEMA_APPLICATION_ID, nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    protected Application application;

    public Schema() {
    }

    public Schema(Long id) {
        this.id = id;
    }

    public Schema(T dto) {
        if (dto != null) {
            this.id = getLongId(dto);
            Long appId = getLongId(dto.getApplicationId());
            this.application = appId != null ? new Application(appId) : null;
            this.majorVersion = dto.getMajorVersion();
            this.minorVersion = dto.getMinorVersion();
            this.schema = dto.getSchema();
            this.name = dto.getName();
            this.description = dto.getDescription();
            this.createdUsername = dto.getCreatedUsername();
            this.createdTime = dto.getCreatedTime();
            this.endpointCount = dto.getEndpointCount();
        }
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedUsername() {
        return createdUsername;
    }

    public void setCreatedUsername(String createdUsername) {
        this.createdUsername = createdUsername;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public long getEndpointCount() {
        return endpointCount;
    }

    public void setEndpointCount(long endpointCount) {
        this.endpointCount = endpointCount;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    @Override
    public int hashCode() {
        final int prime = 33;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + majorVersion;
        result = prime * result + minorVersion;
        result = prime * result + ((schema == null) ? 0 : schema.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((createdUsername == null) ? 0 : createdUsername.hashCode());
        result = prime * result + Long.valueOf(createdTime).hashCode();
        result = prime * result + Long.valueOf(endpointCount).hashCode();
        result = prime * result + ((application == null) ? 0 : application.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Schema<T> other = (Schema<T>) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (majorVersion != other.majorVersion) {
            return false;
        }
        if (minorVersion != other.minorVersion) {
            return false;
        }
        if (schema == null) {
            if (other.schema != null) {
                return false;
            }
        } else if (!schema.equals(other.schema)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (createdUsername == null) {
            if (other.createdUsername != null) {
                return false;
            }
        } else if (!createdUsername.equals(other.createdUsername)) {
            return false;
        }
        if (createdTime != other.createdTime) {
            return false;
        }
        if (endpointCount != other.endpointCount) {
            return false;
        }
        if (application == null) {
            if (other.application != null) {
                return false;
            }
        } else if (!application.equals(other.application)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Schema [id=" + id + ", majorVersion=" + majorVersion + ", minorVersion=" + minorVersion + ", schema=" + schema + ", name=" + name
                + ", description=" + description + ", createdUsername=" + createdUsername + ", createdTime=" + createdTime + ", endpointCount=" + endpointCount + "]";
    }

    @Override
    public T toDto() {
        T dto = createDto();
        dto.setId(getStringId());
        if (application != null) {
            dto.setApplicationId(application.getStringId());
        }
        dto.setMajorVersion(majorVersion);
        dto.setMinorVersion(minorVersion);
        dto.setSchema(schema);
        dto.setName(name);
        dto.setDescription(description);
        dto.setCreatedUsername(createdUsername);
        dto.setCreatedTime(createdTime);
        dto.setEndpointCount(endpointCount);
        return dto;
    }

    public SchemaDto toSchemaDto() {
        SchemaDto dto = new SchemaDto();
        dto.setId(getStringId());
        dto.setMajorVersion(majorVersion);
        dto.setMinorVersion(minorVersion);
        return dto;
    }
}
