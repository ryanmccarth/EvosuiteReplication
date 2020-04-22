/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 22 19:43:39 GMT 2020
 */

package com.mytdev.resources4j.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mytdev.resources4j.impl.EmbeddedResourcesBundleLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedResourcesBundleLoader_ESTest extends EmbeddedResourcesBundleLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmbeddedResourcesBundleLoader embeddedResourcesBundleLoader0 = null;
      try {
        embeddedResourcesBundleLoader0 = new EmbeddedResourcesBundleLoader((String) null, ".Sl");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmbeddedResourcesBundleLoader embeddedResourcesBundleLoader0 = new EmbeddedResourcesBundleLoader("", "");
      assertEquals("", embeddedResourcesBundleLoader0.getFileBasename());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      EmbeddedResourcesBundleLoader embeddedResourcesBundleLoader0 = new EmbeddedResourcesBundleLoader(class0, "");
      assertEquals("", embeddedResourcesBundleLoader0.getFileBasename());
  }
}