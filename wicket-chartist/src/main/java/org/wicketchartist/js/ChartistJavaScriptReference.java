package org.wicketchartist.js;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * The Class ChartistJavaScriptReference. JavaScriptResourceReference for Chartist.js
 * 
 * @author mielimonka
 */
public class ChartistJavaScriptReference extends JavaScriptResourceReference {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Constant CHARTIST_REF. */
    private static final String CHARTIST_REF = "chartist.min.js";

    /** Singleton instance of this reference. */
    public static final ChartistJavaScriptReference INSTANCE = new ChartistJavaScriptReference();

    /**
     * Instantiates a new chartistjs reference.
     */
    private ChartistJavaScriptReference() {
        super(ChartistJavaScriptReference.class, CHARTIST_REF);
    }
}
