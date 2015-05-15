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

import org.apache.wicket.markup.html.IHeaderResponse;
import org.wicketchartist.chart.data.BarChartOptions;
import org.wicketchartist.chart.data.BarLineChartData;
import org.wicketchartist.chart.data.ChartData;
import org.wicketchartist.chart.data.ChartOptions;
import org.wicketchartist.chart.data.ChartType;
import org.wicketchartist.exceptions.WrongChartDataException;
import org.wicketchartist.exceptions.WrongChartOptionsException;

/**
 * The Class ChartistBarChart.
 * 
 * @author mielimonka
 */
public class ChartistBarChart extends ChartistChart {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new chartist bar chart.
     *
     * @param id
     *            the id
     */
    public ChartistBarChart(String id) {
        super(id);
        setChartType(ChartType.BAR);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.wicket.Component#renderHead(org.apache.wicket.markup.html.IHeaderResponse)
     */
    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);
        response.renderOnDomReadyJavaScript("drawBarChart(" + getMarkupId() + ", " + getChartDataJson() + ")");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.wicketchartist.chart.ChartistChart#setChartData(org.wicketchartist.chart.data.ChartData)
     */
    @Override
    public void setChartData(ChartData chartData) throws WrongChartDataException {
        if (chartData instanceof BarLineChartData) {
            this.chartData = chartData;
        } else {
            throw new WrongChartDataException("Invalid type of chart data given.");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.wicketchartist.chart.ChartistChart#setOptions(org.wicketchartist.chart.data.ChartOptions)
     */
    @Override
    public void setOptions(ChartOptions options) throws WrongChartOptionsException {
        if (options instanceof BarChartOptions) {
            this.options = options;
        } else {
            throw new WrongChartOptionsException("Invalid type of chart options given");
        }
    }
}
