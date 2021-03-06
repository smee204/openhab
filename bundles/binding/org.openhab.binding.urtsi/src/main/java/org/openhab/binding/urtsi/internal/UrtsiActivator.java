/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.urtsi.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Extension of the default OSGi bundle activator
 * 
 * @author Oliver Libutzki
 * @since 1.3.0
 */
public final class UrtsiActivator implements BundleActivator {

	private static Logger logger = LoggerFactory.getLogger(UrtsiActivator.class); 
	
	/**
	 * Called whenever the OSGi framework starts our bundle Urtsi
	 */
	public void start(BundleContext bc) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Somfy URTSI II binding has been started.");
		}
	}

	/**
	 * Called whenever the OSGi framework stops our bundle
	 */
	public void stop(BundleContext bc) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Somfy URTSI II binding has been stopped.");
		}
	}
	
}
