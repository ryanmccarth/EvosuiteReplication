/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 24 19:42:16 GMT 2020
 */

package net.sf.jniinchi;

import org.junit.Test;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RET;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class INCHI_RET_ESTest extends INCHI_RET_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      INCHI_RET[] iNCHI_RETArray0 = INCHI_RET.values();
      assertEquals(8, iNCHI_RETArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.valueOf("OKAY");
      assertEquals(0, iNCHI_RET0.getIndx());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.valueOf("WARNING");
      assertEquals(INCHI_RET.WARNING, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.valueOf("EOF");
      assertEquals(INCHI_RET.EOF, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.EOF;
      int int0 = iNCHI_RET0.getIndx();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      INCHI_RET.getValue((-530));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(5);
      assertEquals(INCHI_RET.BUSY, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(4);
      assertEquals(INCHI_RET.UNKNOWN, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(3);
      assertEquals(INCHI_RET.FATAL, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(1);
      assertEquals(INCHI_RET.WARNING, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(0);
      int int0 = iNCHI_RET0.getIndx();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue((-1));
      assertEquals(INCHI_RET.EOF, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(2);
      assertEquals(INCHI_RET.ERROR, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue((-2));
      assertEquals(INCHI_RET.SKIP, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.ERROR;
      int int0 = iNCHI_RET0.getIndx();
      assertEquals(2, int0);
  }
}