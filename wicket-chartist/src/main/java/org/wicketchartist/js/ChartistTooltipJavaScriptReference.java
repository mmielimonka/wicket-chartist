package org.wicketchartist.js;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * The Class ChartistTooltipJavaScriptReference. Used to render tooltip.js
 */
public class ChartistTooltipJavaScriptReference extends JavaScriptResourceReference {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Constant CHARTIST_REF. */
    private static final String TOOLTIP_REF = "tooltip.js";

    /** Singleton instance of this reference. */
    public static final ChartistTooltipJavaScriptReference INSTANCE = new ChartistTooltipJavaScriptReference();

    /**
     * Instantiates a new chartistjs reference.
     */
    private ChartistTooltipJavaScriptReference() {
        super(ChartistTooltipJavaScriptReference.class, TOOLTIP_REF);
    }
}
