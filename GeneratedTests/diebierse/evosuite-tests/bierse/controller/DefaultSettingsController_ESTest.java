/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 22 18:34:37 GMT 2020
 */

package bierse.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bierse.controller.DefaultSettingsController;
import bierse.model.Model;
import bierse.view.IDrinkSettingsView;
import bierse.view.ISettingsView;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultSettingsController_ESTest extends DefaultSettingsController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ActionEvent actionEvent0 = new ActionEvent(pipedInputStream0, (byte)46, "SETTINGS_ACTION_DRINK_SELECTED");
      actionEvent0.setSource((Object) null);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      ActionEvent actionEvent0 = new ActionEvent("", 1, "SETTINGS_ACTION_CHOOSE_BACKGROUND");
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ActionEvent actionEvent0 = new ActionEvent(pipedInputStream0, (byte)46, "SETTINGS_ACTION_DRINK_SELECTED");
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.PipedInputStream cannot be cast to javax.swing.JComboBox
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      ActionEvent actionEvent0 = new ActionEvent("", (-25), "SETTINGS_ACTION_CANCEL");
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("<qS&;f(Rid", 31, "SETTINGS_ACTION_OK", 31);
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 1, "H~a2+,B1ZCAOd'vgW=");
      defaultSettingsController0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getModifiers());
  }
}
