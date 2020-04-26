/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 22:42:03 GMT 2020
 */

package com.sivalabs.jblogger.web.controllers;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sivalabs.jblogger.web.controllers.ErrorController;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ErrorController_ESTest extends ErrorController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorController errorController0 = new ErrorController();
      errorController0.serverError();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorController errorController0 = new ErrorController();
      errorController0.notFound();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ErrorController errorController0 = new ErrorController();
      errorController0.accessDenied();
  }
}