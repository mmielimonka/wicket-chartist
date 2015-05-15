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
package org.wicketchartist.chart.data;

import java.io.IOException;
import java.io.Serializable;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

/**
 * The Class ChartOptions.
 * 
 * @author mielimonka
 */
public abstract class ChartOptions implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * To json.
     *
     * @return the string
     * @throws JsonGenerationException
     *             the json generation exception
     * @throws JsonMappingException
     *             the json mapping exception
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public String toJson() throws JsonGenerationException, JsonMappingException, IOException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(this);
        return json;
    }
}
