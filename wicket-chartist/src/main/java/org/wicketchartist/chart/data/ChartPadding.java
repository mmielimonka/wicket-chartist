package org.wicketchartist.chart.data;

import java.io.Serializable;

/**
 * The Class ChartPadding.
 * 
 * @author mielimonka
 */
public class ChartPadding implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The right. */
    int right;

    /** The left. */
    int left;

    /**
     * Gets the right.
     *
     * @return the right
     */
    public int getRight() {
        return right;
    }

    /**
     * Sets the right.
     *
     * @param right
     *            the new right
     */
    public void setRight(int right) {
        this.right = right;
    }

    /**
     * Gets the left.
     *
     * @return the left
     */
    public int getLeft() {
        return left;
    }

    /**
     * Sets the left.
     *
     * @param left
     *            the new left
     */
    public void setLeft(int left) {
        this.left = left;
    }

}
