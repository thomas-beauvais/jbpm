/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.formbuilder.server.mock;

import org.apache.commons.httpclient.HttpConnection;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.methods.PutMethod;

public class MockPutMethod extends PutMethod {

    public MockPutMethod() {
        super();
    }

    public MockPutMethod(String uri) {
        super(uri);
    }

    @Override
    public int execute(HttpState state, HttpConnection conn) {
        return statusCode; // do nothing
    }
    
    private String responseBodyAsString;
    private int statusCode = 200;

    @Override
    public String getResponseBodyAsString() {
        return responseBodyAsString;
    }

    public void setResponseBodyAsString(String responseBodyAsString) {
        this.responseBodyAsString = responseBodyAsString;
    }
    
    @Override
    public int getStatusCode() {
        return statusCode;
    }
    
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
