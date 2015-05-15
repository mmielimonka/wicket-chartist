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
