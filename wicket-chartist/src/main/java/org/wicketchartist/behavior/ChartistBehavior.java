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

    /** The Constant CHART_LIST_ID. */
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
