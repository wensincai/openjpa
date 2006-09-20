/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openjpa.conf;

import org.apache.openjpa.lib.conf.ProductDerivation;

/**
 * Adds datastore based extension to ProductDerivation.  
 *
 * @since 0.4.1
 * @author Pinaki Poddar
 */
public interface OpenJPAProductDerivation extends ProductDerivation {

    public static final int TYPE_SPEC = 0;
    public static final int TYPE_STORE = 200;
    public static final int TYPE_SPEC_STORE = 300;
    public static final int TYPE_PRODUCT_STORE = 400;
}
