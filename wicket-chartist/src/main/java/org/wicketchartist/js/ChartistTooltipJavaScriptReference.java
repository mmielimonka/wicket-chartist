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
