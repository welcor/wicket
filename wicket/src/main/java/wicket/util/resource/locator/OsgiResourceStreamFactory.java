/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wicket.util.resource.locator;

import wicket.util.file.IResourceFinder;
import wicket.util.resource.IResourceStream;

/**
 * OSGI specific resource stream factory
 * 
 * @author Juergen Donnerstah
 */
public class OsgiResourceStreamFactory extends ResourceStreamFactory
{
	/**
	 * Construct.
	 */
	public OsgiResourceStreamFactory()
	{
	}

	/**
	 * Construct.
	 * 
	 * @param finder
	 */
	public OsgiResourceStreamFactory(final IResourceFinder finder)
	{
		super(finder);
	}

	/**
	 * 
	 * @see wicket.util.resource.locator.ResourceStreamFactory#newResourceStream(java.lang.Class,
	 *      java.lang.String)
	 */
	@Override
	public IResourceStream newResourceStream(final Class clazz, final String path)
	{
		return super.newResourceStream(clazz, "/" + path);
	}

}
