/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource - guilherme.silveira@caelum.com.br
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.caelum.restfulie;

import java.net.URI;
import java.net.URISyntaxException;

import br.com.caelum.restfulie.marshall.ResourceSerializer;

/**
 * Restfulie's client API entry point.<br/>

 * @author guilherme silveira
 */
public class Restfulie {

	/**
	 * Given an retrieved resource, gives access to restfulie's transition api.
	 */
	public static <T> Resource resource(T object) {
		return (Resource) object;
	}

	/**
	 * Entry point to configure serialization data prior to accessing the resources.
	 */
	public static Resources resources() {
		return new DefaultResources();
	}

	/**
	 * Entry point to direct access an uri.
	 */
	public static ResourceSerializer resource(URI uri) {
		return new EntryPointService(uri);
	}

	/**
	 * Entry point to direct access an uri.
	 * @throws URISyntaxException 
	 */
	public static ResourceSerializer resource(String uri) throws URISyntaxException {
		return new EntryPointService(new URI(uri));
	}

}
