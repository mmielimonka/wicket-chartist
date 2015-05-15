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
package org.wicket.chartist.showcase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.wicketchartist.behavior.ChartistBehavior;
import org.wicketchartist.chart.ChartContainer;
import org.wicketchartist.chart.ChartistBarChart;
import org.wicketchartist.chart.ChartistLineChart;
import org.wicketchartist.chart.ChartistPieChart;
import org.wicketchartist.chart.data.BarLineChartData;
import org.wicketchartist.chart.data.ChartSeries;
import org.wicketchartist.chart.data.LineChartOptions;
import org.wicketchartist.chart.data.PieChartData;

/**
 * Homepage.
 *
 * @author mielimonka
 */
public class HomePage extends WebPage implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The bar chart. */
    private ChartistBarChart barChart;

    /** The pie chart. */
    private ChartistPieChart pieChart;

    /** The chart. */
    private ChartistLineChart chart;

    /** The container. */
    ChartContainer container = new ChartContainer();

    /** The link. */
    private AjaxLink link;

    /** The link2. */
    private AjaxLink link2;

    /** The link3. */
    private AjaxLink link3;

    /**
     * Constructor that is invoked when page is invoked without a session.
     */
    public HomePage() {

        ChartistBehavior beh = new ChartistBehavior();
        add(beh);

        addBarChart();
        addLineChart();
        addPieChart();
        addComponents();
    }

    /**
     * Adds the line chart.
     */
    private void addLineChart() {
        List<Float> testdata = new ArrayList<Float>();
        testdata.add(1f);
        testdata.add(2f);
        testdata.add(3f);
        testdata.add(5f);
        testdata.add(8f);
        testdata.add(13f);

        List<ChartSeries> series = new ArrayList<ChartSeries>();
        ChartSeries s = new ChartSeries();
        s.setData(testdata);
        series.add(s);

        List<String> labels = new ArrayList<String>();
        labels.add("1");
        labels.add("2");
        labels.add("3");
        labels.add("4");
        labels.add("5");
        labels.add("6");

        BarLineChartData chartData = new BarLineChartData();
        chartData.setLabels(labels);
        chartData.setSeries(series);

        chart = new ChartistLineChart("chart1");
        LineChartOptions options = new LineChartOptions();
        options.setShowArea(true);
        chart.setAddSVGPathAnimation(true);
        try {
            chart.setChartData(chartData);
            chart.setOptions(options);
        } catch (Exception e) {

        }

        chart.setTooltipEnabled(true);

        container.addChart(chart, this);
    }

    /**
     * Adds the bar chart.
     */
    private void addBarChart() {
        List<Float> testdata = new ArrayList<Float>();
        testdata.add(1f);
        testdata.add(2f);
        testdata.add(3f);
        testdata.add(5f);
        testdata.add(8f);
        testdata.add(13f);

        List<ChartSeries> series = new ArrayList<ChartSeries>();
        ChartSeries s = new ChartSeries();
        s.setData(testdata);
        series.add(s);

        List<String> labels = new ArrayList<String>();
        labels.add("1");
        labels.add("2");
        labels.add("3");
        labels.add("4");
        labels.add("5");
        labels.add("6");

        BarLineChartData chartData = new BarLineChartData();
        chartData.setSeries(series);
        chartData.setLabels(labels);

        barChart = new ChartistBarChart("chart");
        try {
            barChart.setChartData(chartData);
        } catch (Exception e) {

        }

        container.addChart(barChart, this);
    }

    /**
     * Adds the pie chart.
     */
    private void addPieChart() {
        List<Float> testdata = new ArrayList<Float>();
        testdata.add(1f);
        testdata.add(2f);
        testdata.add(3f);

        List<String> labels = new ArrayList<String>();
        labels.add("Label1");
        labels.add("Label2");
        labels.add("Label3");

        PieChartData chartData = new PieChartData();
        chartData.setSeries(testdata);
        chartData.setLabels(labels);

        pieChart = new ChartistPieChart("chart2");
        try {
            pieChart.setChartData(chartData);
        } catch (Exception e) {

        }

        container.addChart(pieChart, this);
    }

    /**
     * Adds the components.
     */
    private void addComponents() {
        link = new AjaxLink("update_button") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                BarLineChartData data = (BarLineChartData) chart.getChartData();
                data.getLabels().add("UPDATED");
                chart.update(target, chart.getChartData());
            }
        };

        add(link);

        link2 = new AjaxLink("update_button1") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                BarLineChartData data = (BarLineChartData) barChart.getChartData();
                ChartSeries s = new ChartSeries();
                List<Float> d = new ArrayList<Float>();
                d.add(10f);
                s.setData(d);
                data.getSeries().add(s);
                barChart.update(target, barChart.getChartData());
            }
        };

        add(link2);

        link3 = new AjaxLink("update_button2") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                PieChartData data = (PieChartData) pieChart.getChartData();
                data.getSeries().add(10f);
                pieChart.update(target, pieChart.getChartData());
            }
        };

        add(link3);
    }
}
