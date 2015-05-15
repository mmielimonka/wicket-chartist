package org.wicketchartist.js;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * The Class JqueryJavaScriptReference.
 * 
 * @author mielimonka
 */
public class JqueryJavaScriptReference extends JavaScriptResourceReference {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Constant CHARTIST_REF. */
    private static final String JQUERY_REF = "jquery-1.11.2.min.js";

    /** Singleton instance of this reference. */
    public static final JqueryJavaScriptReference INSTANCE = new JqueryJavaScriptReference();

    /**
     * Instantiates a new jquery reference.
     */
    private JqueryJavaScriptReference() {
        super(JqueryJavaScriptReference.class, JQUERY_REF);
    }
}
