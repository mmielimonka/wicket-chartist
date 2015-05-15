package org.wicketchartist.chart.data;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

// TODO: Auto-generated Javadoc
/**
 * The Class PieChartOptions.
 * 
 * @author mielimonka
 */
public class PieChartOptions extends ChartOptions {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The donut. */
    boolean donut;

    /** The donut width. */
    int donutWidth;

    /** The start angle. */
    int startAngle;

    /** The total. */
    int total;

    /** The show label. */
    boolean showLabel = true;

    /** The chart padding. */
    int chartPadding;

    /** The label offset. */
    int labelOffset;

    /** The label direction. */
    String labelDirection;

    /**
     * Checks if is donut.
     *
     * @return true, if is donut
     */
    public boolean isDonut() {
        return donut;
    }

    /**
     * Sets the donut.
     *
     * @param donut
     *            the new donut
     */
    public void setDonut(boolean donut) {
        this.donut = donut;
    }

    /**
     * Gets the donut width.
     *
     * @return the donut width
     */
    public int getDonutWidth() {
        return donutWidth;
    }

    /**
     * Sets the donut width.
     *
     * @param donutWidth
     *            the new donut width
     */
    public void setDonutWidth(int donutWidth) {
        this.donutWidth = donutWidth;
    }

    /**
     * Gets the start angle.
     *
     * @return the start angle
     */
    public int getStartAngle() {
        return startAngle;
    }

    /**
     * Sets the start angle.
     *
     * @param startAngle
     *            the new start angle
     */
    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    /**
     * Gets the total.
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the total.
     *
     * @param total
     *            the new total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Checks if is show label.
     *
     * @return true, if is show label
     */
    public boolean isShowLabel() {
        return showLabel;
    }

    /**
     * Sets the show label.
     *
     * @param showLabel
     *            the new show label
     */
    public void setShowLabel(boolean showLabel) {
        this.showLabel = showLabel;
    }

    /**
     * Gets the chart padding.
     *
     * @return the chart padding
     */
    @JsonSerialize(include = Inclusion.NON_DEFAULT)
    public int getChartPadding() {
        return chartPadding;
    }

    /**
     * Sets the chart padding.
     *
     * @param chartPadding
     *            the new chart padding
     */
    public void setChartPadding(int chartPadding) {
        this.chartPadding = chartPadding;
    }

    /**
     * Gets the label offset.
     *
     * @return the label offset
     */
    @JsonSerialize(include = Inclusion.NON_DEFAULT)
    public int getLabelOffset() {
        return labelOffset;
    }

    /**
     * Sets the label offset.
     *
     * @param labelOffset
     *            the new label offset
     */
    public void setLabelOffset(int labelOffset) {
        this.labelOffset = labelOffset;
    }

    /**
     * Gets the label direction.
     *
     * @return the label direction
     */
    @JsonSerialize(include = Inclusion.NON_EMPTY)
    public String getLabelDirection() {
        return labelDirection;
    }

    /**
     * Sets the label direction.
     *
     * @param labelDirection
     *            the new label direction
     */
    public void setLabelDirection(String labelDirection) {
        this.labelDirection = labelDirection;
    }
}
