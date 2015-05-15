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

import java.io.IOException;
import java.io.Serializable;

import org.apache.logging.log4j.Logger;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.wicketchartist.chart.data.ChartData;
import org.wicketchartist.chart.data.ChartOptions;
import org.wicketchartist.chart.data.ChartType;
import org.wicketchartist.exceptions.WrongChartDataException;
import org.wicketchartist.exceptions.WrongChartOptionsException;

/**
 * The abstract Class ChartistChart.
 * 
 * @author mielimonka
 */
public abstract class ChartistChart extends WebMarkupContainer implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The logger. */
    private static final Logger LOGGER = org.wicketchartist.util.LoggerFactory.getLogger(ChartistChart.class);

    /** The chart type. */
    private ChartType chartType;

    /** The chart data. */
    protected ChartData chartData;

    /** The options. */
    protected ChartOptions options;

    /** The id. */
    protected Integer chartId;

    /** The legend HTML id. */
    protected String legendId;

    /** The show legend. */
    protected boolean showLegend = false;

    /** If The tooltip for the line points is enabled. */
    protected boolean tooltipEnabled = false;

    /**
     * Instantiates a new chartist chart.
     *
     * @param id
     *            the id
     */
    public ChartistChart(String id) {
        super(id);
        addComponents();
    }

    /**
     * Adds the components.
     */
    private void addComponents() {
        setOutputMarkupId(true);
    }

    /**
     * Update.
     *
     * @param target
     *            the target
     * @param newData
     *            the new data
     */
    public void update(AjaxRequestTarget target, ChartData newData) {
        this.chartData = newData;
        if (this.chartId != null) {
            // update
            try {
                target.getHeaderResponse().renderOnDomReadyJavaScript(
                        "update(" + this.chartId + ", " + this.chartData.toJson() + ");");
            } catch (JsonGenerationException e) {
                LOGGER.debug("Error updating chart data", e);
            } catch (JsonMappingException e) {
                LOGGER.debug("Error updating chart data", e);
            } catch (IOException e) {
                LOGGER.debug("Error updating chart data", e);
            }
        }
    }

    /**
     * Gets the chart type.
     *
     * @return the chart type
     */
    public ChartType getChartType() {
        return chartType;
    }

    /**
     * Sets the chart type.
     *
     * @param chartType
     *            the new chart type
     */
    public void setChartType(ChartType chartType) {
        this.chartType = chartType;
    }

    /**
     * Gets the chart data.
     *
     * @return the chart data
     */
    public ChartData getChartData() {
        return chartData;
    }

    /**
     * Sets the chart data.
     *
     * @param chartData
     *            the new chart data
     * @throws WrongChartDataException
     *             the wrong chart data exception
     */
    public abstract void setChartData(ChartData chartData) throws WrongChartDataException;

    /**
     * Gets the chart data json.
     *
     * @return the chart data json
     */
    public String getChartDataJson() {
        String data = "{}";
        if (chartData != null) {
            try {
                data = chartData.toJson();
            } catch (JsonGenerationException e) {
            } catch (JsonMappingException e) {
            } catch (IOException e) {
            }
        }
        return data;
    }

    /**
     * Gets the chart options json.
     *
     * @return the chart options json
     */
    public String getChartOptionsJson() {
        try {
            return options.toJson();
        } catch (JsonGenerationException e) {
        } catch (JsonMappingException e) {
        } catch (IOException e) {
        }
        return "{}";
    }

    /**
     * Sets the chart id.
     *
     * @param chartId
     *            the new chart id
     */
    public void setChartId(Integer chartId) {
        this.chartId = chartId;
    }

    /**
     * Gets the options.
     *
     * @return the options
     */
    public ChartOptions getOptions() {
        return options;
    }

    /**
     * Sets the options.
     *
     * @param options
     *            the new options
     * @throws WrongChartOptionsException
     *             the wrong chart options exception
     */
    public abstract void setOptions(ChartOptions options) throws WrongChartOptionsException;

    /**
     * Gets the legend id.
     *
     * @return the legend id
     */
    public String getLegendId() {
        return legendId;
    }

    /**
     * Sets the legend id.
     *
     * @param legendId
     *            the new legend id
     */
    public void setLegendId(String legendId) {
        this.legendId = legendId;
    }

    /**
     * Checks if is show legend.
     *
     * @return true, if is show legend
     */
    public boolean isShowLegend() {
        return showLegend;
    }

    /**
     * Sets the show legend.
     *
     * @param showLegend
     *            the new show legend
     */
    public void setShowLegend(boolean showLegend) {
        this.showLegend = showLegend;
    }

    /**
     * Enable legend which has to be added to HTML as
     * <ul id="legendId">
     * </ul>
     * .
     *
     * @param legendId
     *            the legend HTML Element id
     */
    public void enableLegend(String legendId) {
        this.legendId = legendId;
        this.showLegend = true;
    }

    /**
     * Checks if is tooltip enabled.
     *
     * @return true, if is tooltip enabled
     */
    public boolean isTooltipEnabled() {
        return tooltipEnabled;
    }

    /**
     * Sets the tooltip enabled.
     *
     * @param tooltipEnabled
     *            the new tooltip enabled
     */
    public void setTooltipEnabled(boolean tooltipEnabled) {
        this.tooltipEnabled = tooltipEnabled;
    }
}
