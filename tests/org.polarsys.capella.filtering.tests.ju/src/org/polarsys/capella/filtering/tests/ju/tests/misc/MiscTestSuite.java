/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.filtering.tests.ju.tests.misc;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.filtering.tests.ju.tests.misc.transition.TransitionTestSuite;
import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.api.BasicTestSuite;

import junit.framework.Test;

public class MiscTestSuite extends BasicTestSuite {

  public static Test suite() {
    return new MiscTestSuite();
  }

  @Override
  protected List<BasicTestArtefact> getTests() {
    List<BasicTestArtefact> testCases = new ArrayList<>();
    testCases.add(new FilteringCriterionSetHelperTest());
    testCases.add(new FilteringServicesTest());
    testCases.add(new FilteringUtilsTest());
    testCases.add(new TransitionTestSuite());

    return testCases;
  }

}