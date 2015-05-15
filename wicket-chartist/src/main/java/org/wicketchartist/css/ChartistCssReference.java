package org.wicketchartist.css;

import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.ResourceReference;

/**
 * The Class ChartistCssReference. CssResourceReference for Chartist.js
 * 
 * @author mielimonka
 */
public class ChartistCssReference extends CssResourceReference {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Constant CHARTIST_REF. */
    private static final String CHARTIST_REF = "chartist.css";

    /** Singleton instance of this reference. */
    public static final ResourceReference INSTANCE = new ChartistCssReference();

    /**
     * Instantiates a new chartist css reference.
     */
    private ChartistCssReference() {
        super(ChartistCssReference.class, CHARTIST_REF);
    }
}
