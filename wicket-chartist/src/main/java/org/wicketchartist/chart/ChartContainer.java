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
package org.wicketchartist.chart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.resource.CssResourceReference;
import org.wicketchartist.behavior.ChartistBehavior;

/**
 * The Class ChartContainer.
 * 
 * @author mielimonka
 */
public class ChartContainer implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The chartist charts. */
    private List<ChartistChart> chartistCharts;

    /** The chartist behavior. */
    private ChartistBehavior chartistBehavior;

    /** The current index of the JavaScript chart array. */
    private int currentId = 0;

    /** The own css reference. */
    private CssResourceReference ownCssReference;

    /**
     * Instantiates a new chart container. Standard constructor
     */
    public ChartContainer() {

    }

    /**
     * Instantiates a new chart container.
     *
     * @param additionalCssReference
     *            the additional css reference instead of using the standard one shipped in the war file
     */
    public ChartContainer(CssResourceReference additionalCssReference) {
        this.ownCssReference = additionalCssReference;
    }

    /**
     * Adds the chart.
     *
     * @param chart
     *            the chart
     * @param component
     *            the component
     */
    public void addChart(ChartistChart chart, WebPage component) {
        if (this.chartistCharts == null) {
            this.chartistCharts = new ArrayList<ChartistChart>();
        }

        if (chartistBehavior == null) {
            if (ownCssReference != null) {
                chartistBehavior = new ChartistBehavior(ownCssReference);
            } else {
                chartistBehavior = new ChartistBehavior();
            }
            component.add(chartistBehavior);
        }

        // set id and increment
        chart.setChartId(currentId);
        chartistCharts.add(chart);
        component.add(chart);
        currentId++;
    }

    /**
     * Gets the chart.
     *
     * @param id
     *            the id
     * @return the chart
     */
    public ChartistChart getChart(int id) {
        return chartistCharts.get(id);
    }

    /**
     * Gets the chartist charts.
     *
     * @return the chartist charts
     */
    public List<ChartistChart> getChartistCharts() {
        return chartistCharts;
    }
}
