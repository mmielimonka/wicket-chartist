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
import java.util.List;

/**
 * The Class ChartSeries.
 * 
 * @author mielimonka
 */
public class ChartSeries implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The data. */
    private List<Float> data;

    /** The name. */
    private String name;

    /**
     * Gets the data.
     *
     * @return the data
     */
    public List<Float> getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data
     *            the new data
     */
    public void setData(List<Float> data) {
        this.data = data;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

}
