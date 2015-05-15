/**
 * Copyright 2015 Wicked Chartist
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.wicketchartist.chart.data;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class AxisOptions.
 * 
 * @author mielimonka
 */
public class AxisOptions implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The show label. */
    boolean showLabel;

    /** The show grid. */
    boolean showGrid;

    /** The offset. */
    int offset;

    /**
     * Checks if is show label.
     *
     * @return true, if is show label
     */
    public boolean isShowLabel() {
        return showLabel;
    }

    /**
     * Sets the show label.
     *
     * @param showLabel
     *            the new show label
     */
    public void setShowLabel(boolean showLabel) {
        this.showLabel = showLabel;
    }

    /**
     * Checks if is show grid.
     *
     * @return true, if is show grid
     */
    public boolean isShowGrid() {
        return showGrid;
    }

    /**
     * Sets the show grid.
     *
     * @param showGrid
     *            the new show grid
     */
    public void setShowGrid(boolean showGrid) {
        this.showGrid = showGrid;
    }

    /**
     * Gets the offset.
     *
     * @return the offset
     */
    @JsonSerialize(include = Inclusion.NON_DEFAULT)
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the offset.
     *
     * @param offset
     *            the new offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

}
