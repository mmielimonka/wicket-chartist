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
