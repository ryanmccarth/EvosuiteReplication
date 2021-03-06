/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 22 19:14:46 GMT 2020
 */

package org.templateit;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.templateit.Parameter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parameter_ESTest extends Parameter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      assertEquals((-1), parameter0.getRow());
      
      parameter0.setRow(0);
      int int0 = parameter0.getRow();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      assertEquals((-1), parameter0.getRow());
      
      parameter0.setRow(1);
      int int0 = parameter0.getRow();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      parameter0.setName("zPe yeC\"aU0}");
      parameter0.getName();
      assertEquals((-1), parameter0.getRow());
      assertEquals((-1), parameter0.getColumn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      parameter0.setName("");
      parameter0.getName();
      assertEquals((-1), parameter0.getColumn());
      assertEquals((-1), parameter0.getRow());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      parameter0.setIndex((-2293));
      int int0 = parameter0.getIndex();
      assertEquals((-2293), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      assertEquals((-1), parameter0.getColumn());
      
      parameter0.setColumn(0);
      int int0 = parameter0.getColumn();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      assertEquals((-1), parameter0.getColumn());
      
      parameter0.setColumn(1);
      int int0 = parameter0.getColumn();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      parameter0.setIndex(1);
      int int0 = parameter0.getIndex();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      int int0 = parameter0.getRow();
      assertEquals((-1), int0);
      assertEquals((-1), parameter0.getColumn());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      int int0 = parameter0.getIndex();
      assertEquals(0, int0);
      assertEquals((-1), parameter0.getRow());
      assertEquals((-1), parameter0.getColumn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      parameter0.getName();
      assertEquals((-1), parameter0.getColumn());
      assertEquals((-1), parameter0.getRow());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameter parameter0 = new Parameter();
      int int0 = parameter0.getColumn();
      assertEquals((-1), parameter0.getRow());
      assertEquals((-1), int0);
  }
}
