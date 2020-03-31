/**
 * Copyright 2011-2019 PrimeFaces Extensions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.extensions.event;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.event.AjaxBehaviorEvent;

import org.primefaces.shaded.json.JSONObject;

/**
 * <code>orgchart</code> component.
 *
 * @author @jxmai / last modified by $Author$
 * @version $Revision$
 * @since 6.3
 */
@SuppressWarnings("serial")
public class OrgChartDropEvent extends AjaxBehaviorEvent {

    public static final String NAME = "drop";

    private transient JSONObject hierarchy;

    private String draggedNodeId;

    private String droppedZoneId;

    public OrgChartDropEvent(UIComponent component, Behavior behavior, String hierarchyStr,
                String draggedNodeId, String droppedZoneId) {
        super(component, behavior);
        hierarchy = new JSONObject(hierarchyStr);
        this.draggedNodeId = draggedNodeId;
        this.droppedZoneId = droppedZoneId;
    }

    public JSONObject getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(JSONObject hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getDraggedNodeId() {
        return draggedNodeId;
    }

    public void setDraggedNodeId(String draggedNodeId) {
        this.draggedNodeId = draggedNodeId;
    }

    public String getDroppedZoneId() {
        return droppedZoneId;
    }

    public void setDroppedZoneId(String droppedZoneId) {
        this.droppedZoneId = droppedZoneId;
    }

}
