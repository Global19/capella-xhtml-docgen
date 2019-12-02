/*******************************************************************************
 * Copyright (c) 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

/**
 * @author Arnaud Dieumegard *
 */
public class CapellaDocgenPreferenceInitializer extends AbstractPreferenceInitializer {
	
	@Override
	public void initializeDefaultPreferences() {
		CapellaDocgenPreferenceHelper.setDefaultValues();
	}

}