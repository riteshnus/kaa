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

import java.util.List;

import org.kaaproject.kaa.common.dto.event.EventClassDto;
import org.kaaproject.kaa.server.admin.client.KaaAdmin;
import org.kaaproject.kaa.server.admin.client.mvp.activity.grid.AbstractDataProvider;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.MultiSelectionModel;

public class EventClassesDataProvider extends AbstractDataProvider<EventClassDto>{

    private String ecfId;
    private int version;
    
    public EventClassesDataProvider(MultiSelectionModel<EventClassDto> selectionModel,
                                    AsyncCallback<List<EventClassDto>> asyncCallback,
                                    String ecfId, int version) {
        super(selectionModel, asyncCallback);
        this.ecfId = ecfId;
        this.version = version;
    }

    @Override
    protected void loadData(final LoadCallback callback, final HasData<EventClassDto> display) {
        KaaAdmin.getDataSource().getEventClassesByFamilyIdVersionAndType(ecfId, version, null, new AsyncCallback<List<EventClassDto>>() {
            @Override
            public void onFailure(Throwable caught) {
                callback.onFailure(caught);

            }
            @Override
            public void onSuccess(List<EventClassDto> result) {
                callback.onSuccess(result, display);
            }
        });
    }

}
