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

import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class PieChartData.
 * 
 * @author mielimonka
 */
public class PieChartData extends ChartData {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The series. */
    private List<Float> series;

    /** The labels. */
    private List<String> labels;

    /**
     * Instantiates a new pie chart data.
     */
    public PieChartData() {

    }

    /**
     * Gets the series.
     *
     * @return the series
     */
    public List<Float> getSeries() {
        return series;
    }

    /**
     * Sets the series.
     *
     * @param series
     *            the new series
     */
    public void setSeries(List<Float> series) {
        this.series = series;
    }

    /**
     * Gets the labels.
     *
     * @return the labels
     */
    @JsonSerialize(include = Inclusion.NON_NULL)
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
}
