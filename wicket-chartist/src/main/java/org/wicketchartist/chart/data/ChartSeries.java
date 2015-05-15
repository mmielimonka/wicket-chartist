package org.wicketchartist.chart.data;

import java.io.Serializable;
import java.util.List;

/**
 * The Class ChartSeries.
 * 
 * @author mielimonka
 */
public class ChartSeries implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The data. */
    private List<Float> data;

    /** The name. */
    private String name;

    /**
     * Gets the data.
     *
     * @return the data
     */
    public List<Float> getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data
     *            the new data
     */
    public void setData(List<Float> data) {
        this.data = data;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

}
