/*******************************************************************************
 * Mission Control Technologies, Copyright (c) 2009-2012, United States Government
 * as represented by the Administrator of the National Aeronautics and Space 
 * Administration. All rights reserved.
 *
 * The MCT platform is licensed under the Apache License, Version 2.0 (the 
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations under 
 * the License.
 *
 * MCT includes source code licensed under additional open source licenses. See 
 * the MCT Open Source Licenses file included with this distribution or the About 
 * MCT Licenses dialog available at runtime from the MCT Help menu for additional 
 * information. 
 *******************************************************************************/
package org.acme.example;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The <code>ExampleActivator</code> class demonstrates a simple OSGI Activator to log module starting and stopping (initially commented out).  
 * when debugging. 
 * @author chris.webster@nasa.gov
 *
 */
public class ExampleActivator implements BundleActivator {

	//private static final Logger logger = LoggerFactory.getLogger(ExampleActivator.class);
	
	@Override
	public void start(BundleContext context) {
		//logger.info("starting bundle {0}", context.getBundle().getSymbolicName());
		
		//ServiceReference sr = context.getServiceReference(FeedAggregator.class.getName());
		//Object o = context.getService(sr);
		
	}

	@Override
	public void stop(BundleContext context) {
		//logger.info("stopping bundle {0}", context.getBundle().getSymbolicName());
	}

}
