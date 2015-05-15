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
