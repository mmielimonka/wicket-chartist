package org.wicketchartist.exceptions;

/**
 * The Class WrongChartDataException.
 * 
 * @author mielimonka
 */
public class WrongChartDataException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new wrong chart data exception.
     *
     * @param message
     *            the message
     */
    public WrongChartDataException(String message) {
        super(message);
    }

}
