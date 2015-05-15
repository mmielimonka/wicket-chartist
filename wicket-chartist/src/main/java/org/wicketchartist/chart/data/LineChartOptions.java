package org.wicketchartist.chart.data;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class LineChartOptions.
 * 
 * @author mielimonka
 */
public class LineChartOptions extends ChartOptions {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The width. */
    int width;

    /** The height. */
    int height;

    /** The low. */
    int low;

    /** The high. */
    int high;

    /** The show area. */
    boolean showArea = false;

    /** The show line. */
    boolean showLine = true;

    /** The show point. */
    boolean showPoint = true;

    /** The full width. */
    boolean fullWidth = false;

    /** The axis x options. */
    AxisOptions axisX;

    /** The axis y options. */
    AxisOptions axisY;

    /** The chart padding. */
    ChartPadding chartPadding;

    /**
     * Sets the width.
     *
     * @param width
     *            the new width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets the width.
     *
     * @return the width
     */
    @JsonSerialize(include = Inclusion.NON_DEFAULT)
    public String getWidth() {
        return this.width + "px";
    }

    /**
     * Sets the height.
     *
     * @param height
     *            the new height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the height.
     *
     * @return the height
     */
    @JsonSerialize(include = Inclusion.NON_DEFAULT)
    public String getHeight() {
        return this.height + "px";
    }

    /**
     * Checks if is show area.
     *
     * @return true, if is show area
     */
    public boolean isShowArea() {
        return showArea;
    }

    /**
     * Sets the show area.
     *
     * @param showArea
     *            the new show area
     */
    public void setShowArea(boolean showArea) {
        this.showArea = showArea;
    }

    /**
     * Checks if is full width.
     *
     * @return true, if is full width
     */
    public boolean isFullWidth() {
        return fullWidth;
    }

    /**
     * Sets the full width.
     *
     * @param fullWidth
     *            the new full width
     */
    public void setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
    }

    /**
     * Gets the chart padding.
     *
     * @return the chart padding
     */
    @JsonSerialize(include = Inclusion.NON_NULL)
    public ChartPadding getChartPadding() {
        return chartPadding;
    }

    /**
     * Sets the chart padding.
     *
     * @param chartPadding
     *            the new chart padding
     */
    public void setChartPadding(ChartPadding chartPadding) {
        this.chartPadding = chartPadding;
    }

    /**
     * Gets the low.
     *
     * @return the low
     */
    @JsonSerialize(include = Inclusion.NON_DEFAULT)
    public int getLow() {
        return low;
    }

    /**
     * Sets the low.
     *
     * @param low
     *            the new low
     */
    public void setLow(int low) {
        this.low = low;
    }

    /**
     * Gets the high.
     *
     * @return the high
     */
    @JsonSerialize(include = Inclusion.NON_DEFAULT)
    public int getHigh() {
        return high;
    }

    /**
     * Sets the high.
     *
     * @param high
     *            the new high
     */
    public void setHigh(int high) {
        this.high = high;
    }

    /**
     * Checks if is show line.
     *
     * @return true, if is show line
     */
    public boolean isShowLine() {
        return showLine;
    }

    /**
     * Sets the show line.
     *
     * @param showLine
     *            the new show line
     */
    public void setShowLine(boolean showLine) {
        this.showLine = showLine;
    }

    /**
     * Checks if is show point.
     *
     * @return true, if is show point
     */
    public boolean isShowPoint() {
        return showPoint;
    }

    /**
     * Sets the show point.
     *
     * @param showPoint
     *            the new show point
     */
    public void setShowPoint(boolean showPoint) {
        this.showPoint = showPoint;
    }

    /**
     * Gets the axis x.
     *
     * @return the axis x
     */
    @JsonSerialize(include = Inclusion.NON_NULL)
    public AxisOptions getAxisX() {
        return axisX;
    }

    /**
     * Sets the axis x.
     *
     * @param axisX
     *            the new axis x
     */
    public void setAxisX(AxisOptions axisX) {
        this.axisX = axisX;
    }

    /**
     * Gets the axis y.
     *
     * @return the axis y
     */
    @JsonSerialize(include = Inclusion.NON_NULL)
    public AxisOptions getAxisY() {
        return axisY;
    }

    /**
     * Sets the axis y.
     *
     * @param axisY
     *            the new axis y
     */
    public void setAxisY(AxisOptions axisY) {
        this.axisY = axisY;
    }
}
