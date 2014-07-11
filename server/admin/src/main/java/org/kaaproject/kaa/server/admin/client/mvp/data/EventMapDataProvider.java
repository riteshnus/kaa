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

package org.kaaproject.kaa.server.admin.client.mvp.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.kaaproject.kaa.common.dto.event.ApplicationEventAction;
import org.kaaproject.kaa.common.dto.event.ApplicationEventMapDto;
import org.kaaproject.kaa.common.dto.event.EcfInfoDto;
import org.kaaproject.kaa.common.dto.event.EventClassDto;
import org.kaaproject.kaa.common.dto.event.EventClassType;
import org.kaaproject.kaa.server.admin.client.KaaAdmin;
import org.kaaproject.kaa.server.admin.client.mvp.activity.grid.AbstractDataProvider;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.MultiSelectionModel;

public class EventMapDataProvider extends AbstractDataProvider<ApplicationEventMapDto>{

    private EcfInfoDto ecf;
    private List<ApplicationEventMapDto> eventMaps;
    
    public EventMapDataProvider(MultiSelectionModel<ApplicationEventMapDto> selectionModel,
                                    AsyncCallback<List<ApplicationEventMapDto>> asyncCallback) {
        super(selectionModel, asyncCallback);
    }
    
    public void setEcf(EcfInfoDto ecf) {
        this.ecf = ecf;
    }
    
    public void setEventMaps(List<ApplicationEventMapDto> eventMaps) {
        this.eventMaps = eventMaps;
    }

    @Override
    protected void loadData(final LoadCallback callback, final HasData<ApplicationEventMapDto> display) {
        if (this.eventMaps == null && ecf != null) {
            KaaAdmin.getDataSource().getEventClassesByFamilyIdVersionAndType(ecf.getEcfId(), ecf.getVersion(), EventClassType.EVENT, new AsyncCallback<List<EventClassDto>>() {
                @Override
                public void onFailure(Throwable caught) {
                    callback.onFailure(caught);
                }
                
                @Override
                public void onSuccess(List<EventClassDto> result) {
                    List<ApplicationEventMapDto> eventMaps = new ArrayList<>(result.size());
                    for (EventClassDto eventClass : result) {
                        ApplicationEventMapDto eventMap = new ApplicationEventMapDto();
                        eventMap.setEventClassId(eventClass.getId());
                        eventMap.setFqn(eventClass.getFqn());
                        eventMap.setAction(ApplicationEventAction.BOTH);
                        eventMaps.add(eventMap);
                    }
                    callback.onSuccess(eventMaps, display);
                }
            });
        }
        else if (this.eventMaps != null) {
            callback.onSuccess(this.eventMaps, display);
        }
        else {
            List<ApplicationEventMapDto> data = Collections.emptyList();
            callback.onSuccess(data, display);
        }
    }

}
