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

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class BarChartOptions.
 * 
 * @author mielimonka
 */
public class BarChartOptions extends ChartOptions {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The series bar distance. */
    int seriesBarDistance;

    /** The low. */
    int low;

    /** The high. */
    int high;

    /** The stack bars. */
    boolean stackBars = false;

    /** The reverse data. */
    boolean reverseData = false;

    /** The horizontal bars. */
    boolean horizontalBars = false;

    /** The axis x. */
    AxisOptions axisX;

    /** The axis y. */
    AxisOptions axisY;

    /**
     * Gets the series bar distance.
     *
     * @return the series bar distance
     */
    public int getSeriesBarDistance() {
        return seriesBarDistance;
    }

    /**
     * Sets the series bar distance.
     *
     * @param seriesBarDistance
     *            the new series bar distance
     */
    public void setSeriesBarDistance(int seriesBarDistance) {
        this.seriesBarDistance = seriesBarDistance;
    }

    /**
     * Gets the low.
     *
     * @return the low
     */
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

    /**
     * Checks if is stack bars.
     *
     * @return true, if is stack bars
     */
    public boolean isStackBars() {
        return stackBars;
    }

    /**
     * Sets the stack bars.
     *
     * @param stackBars
     *            the new stack bars
     */
    public void setStackBars(boolean stackBars) {
        this.stackBars = stackBars;
    }

    /**
     * Checks if is reverse data.
     *
     * @return true, if is reverse data
     */
    public boolean isReverseData() {
        return reverseData;
    }

    /**
     * Sets the reverse data.
     *
     * @param reverseData
     *            the new reverse data
     */
    public void setReverseData(boolean reverseData) {
        this.reverseData = reverseData;
    }

    /**
     * Checks if is horizontal bars.
     *
     * @return true, if is horizontal bars
     */
    public boolean isHorizontalBars() {
        return horizontalBars;
    }

    /**
     * Sets the horizontal bars.
     *
     * @param horizontalBars
     *            the new horizontal bars
     */
    public void setHorizontalBars(boolean horizontalBars) {
        this.horizontalBars = horizontalBars;
    }

}
