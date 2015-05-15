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
