/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 22 19:17:50 GMT 2020
 */

package org.templateit;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.templateit.Reference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Reference_ESTest extends Reference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Reference reference0 = new Reference((-1), 0);
      Reference reference1 = new Reference(0, 0);
      boolean boolean0 = reference0.equals(reference1);
      assertEquals(0, reference0.column());
      assertEquals((-1), reference0.row());
      assertFalse(reference1.equals((Object)reference0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Reference reference0 = new Reference(4879, (-4021));
      Reference reference1 = new Reference((-3290), 3092);
      boolean boolean0 = reference0.equals(reference1);
      assertEquals(3092, reference1.column());
      assertFalse(boolean0);
      assertEquals((-3290), reference1.row());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Reference reference0 = new Reference(0, 0);
      int int0 = reference0.row();
      assertEquals(0, int0);
      assertEquals(0, reference0.column());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Reference reference0 = new Reference((-2844), (-2844));
      int int0 = reference0.row();
      assertEquals((-2844), int0);
      assertEquals((-2844), reference0.column());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Reference reference0 = new Reference(0, 0);
      int int0 = reference0.column();
      assertEquals(0, int0);
      assertEquals(0, reference0.row());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Reference reference0 = new Reference((-2844), (-2844));
      int int0 = reference0.column();
      assertEquals((-2844), int0);
      assertEquals((-2844), reference0.row());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Reference reference0 = new Reference(880, 880);
      Reference reference1 = new Reference(880, 880);
      boolean boolean0 = reference0.equals(reference1);
      assertTrue(boolean0);
      assertEquals(880, reference1.column());
      assertEquals(880, reference1.row());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Reference reference0 = new Reference(20, 20);
      Reference reference1 = new Reference((-1), (-1));
      boolean boolean0 = reference0.equals(reference1);
      assertFalse(boolean0);
      assertEquals(20, reference0.row());
      assertEquals(20, reference0.column());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Reference reference0 = new Reference(20, 20);
      Object object0 = new Object();
      boolean boolean0 = reference0.equals(object0);
      assertEquals(20, reference0.column());
      assertEquals(20, reference0.row());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Reference reference0 = new Reference(0, 0);
      boolean boolean0 = reference0.equals((Object) null);
      assertEquals(0, reference0.column());
      assertFalse(boolean0);
      assertEquals(0, reference0.row());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Reference reference0 = new Reference(880, 880);
      boolean boolean0 = reference0.equals(reference0);
      assertEquals(880, reference0.column());
      assertTrue(boolean0);
      assertEquals(880, reference0.row());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Reference reference0 = new Reference(880, 880);
      Reference reference1 = new Reference((-1), 880);
      boolean boolean0 = reference0.equals(reference1);
      assertEquals(880, reference1.column());
      assertFalse(boolean0);
      assertFalse(reference1.equals((Object)reference0));
      assertEquals((-1), reference1.row());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Reference reference0 = new Reference(880, 880);
      int int0 = reference0.row();
      assertEquals(880, reference0.column());
      assertEquals(880, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Reference reference0 = new Reference(20, 20);
      String string0 = reference0.toString();
      assertEquals("20,20", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Reference reference0 = new Reference(880, 880);
      reference0.hashCode();
      assertEquals(880, reference0.column());
      assertEquals(880, reference0.row());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Reference reference0 = new Reference(880, 880);
      int int0 = reference0.column();
      assertEquals(880, reference0.row());
      assertEquals(880, int0);
  }
}
