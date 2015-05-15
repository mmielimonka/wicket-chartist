package org.wicketchartist.behavior;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.wicketchartist.css.ChartistCssReference;
import org.wicketchartist.js.ChartingJavaScriptReference;
import org.wicketchartist.js.ChartistJavaScriptReference;
import org.wicketchartist.js.ChartistTooltipJavaScriptReference;
import org.wicketchartist.js.JqueryJavaScriptReference;

/**
 * The Class ChartistBehavior.
 * 
 * @author mielimonka
 */
public class ChartistBehavior extends Behavior {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    private static final String CHART_LIST_ID = "chartist-container";

    /**
     * Instantiates a new chartist behavior.
     */
    public ChartistBehavior() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.wicket.behavior.Behavior#renderHead(org.apache.wicket.Component,
     * org.apache.wicket.markup.html.IHeaderResponse)
     */
    @Override
    public void renderHead(final Component component, final IHeaderResponse response) {
        // loading the needed files
        response.renderJavaScriptReference(ChartistJavaScriptReference.INSTANCE);
        response.renderJavaScriptReference(ChartingJavaScriptReference.INSTANCE);
        response.renderJavaScriptReference(ChartistTooltipJavaScriptReference.INSTANCE);
        response.renderJavaScriptReference(JqueryJavaScriptReference.INSTANCE);
        response.renderCSSReference(ChartistCssReference.INSTANCE);
        response.renderJavaScript(getJavaScript(), CHART_LIST_ID);
    }

    /**
     * Gets the java script.
     *
     * @return the java script
     */
    private String getJavaScript() {
        // render array used to store chartist charts
        return "var charts = [];";
    }

}
