/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 22 18:45:34 GMT 2020
 */

package bierse.view;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bierse.model.Model;
import bierse.view.DefaultDrinkSellView;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultDrinkSellView_ESTest extends DefaultDrinkSellView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultDrinkSellView defaultDrinkSellView0 = null;
      try {
        defaultDrinkSellView0 = new DefaultDrinkSellView("VFau[ftqveo", (Model) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
