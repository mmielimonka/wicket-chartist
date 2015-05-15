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
 * The Class ChartData. For Line and Bar chart
 * 
 * @author mielimonka
 */
public class BarLineChartData extends ChartData implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The series. */
    private List<ChartSeries> series;

    /** The labels. */
    private List<String> labels;

    /**
     * Gets the labels.
     *
     * @return the labels
     */
    public List<String> getLabels() {
        return labels;
    }

    /**
     * Sets the labels.
     *
     * @param labels
     *            the new labels
     */
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<ChartSeries> getSeries() {
        return series;
    }

    public void setSeries(List<ChartSeries> series) {
        this.series = series;
    }
}
