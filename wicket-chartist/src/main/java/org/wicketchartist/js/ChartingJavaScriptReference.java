package org.wicketchartist.js;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * The Class ChartingJavaScriptReference. JavaScriptResourceReference for charting.js wrapper.
 */
public class ChartingJavaScriptReference extends JavaScriptResourceReference {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Constant CHARTING_REF. */
    private static final String CHARTING_REF = "charting.js";

    /** Singleton instance of this reference. */
    public static final ChartingJavaScriptReference INSTANCE = new ChartingJavaScriptReference();

    /**
     * Instantiates a new charting.js reference.
     */
    private ChartingJavaScriptReference() {
        super(ChartingJavaScriptReference.class, CHARTING_REF);
    }
}
