package org.wicketchartist.chart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
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

    private ChartistBehavior chartistBehavior;

    /** The current index of the JavaScript chart array. */
    private int currentId = 0;

    /**
     * Adds the chart.
     *
     * @param chart
     *            the chart
     */
    public void addChart(ChartistChart chart, WebPage component) {
        if (this.chartistCharts == null) {
            this.chartistCharts = new ArrayList<ChartistChart>();
        }

        if (chartistBehavior == null) {
            chartistBehavior = new ChartistBehavior();
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
