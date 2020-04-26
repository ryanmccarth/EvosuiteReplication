/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 24 19:46:23 GMT 2020
 */

package net.sf.jniinchi;

import org.junit.Test;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RADICAL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class INCHI_RADICAL_ESTest extends INCHI_RADICAL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      INCHI_RADICAL[] iNCHI_RADICALArray0 = INCHI_RADICAL.values();
      assertEquals(4, iNCHI_RADICALArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.valueOf("NONE");
      assertEquals(INCHI_RADICAL.NONE, iNCHI_RADICAL0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.valueOf("SINGLET");
      assertEquals(1, iNCHI_RADICAL0.getIndx());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.TRIPLET;
      int int0 = iNCHI_RADICAL0.getIndx();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      INCHI_RADICAL.getValue((-287));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(2);
      assertEquals(INCHI_RADICAL.DOUBLET, iNCHI_RADICAL0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(1);
      assertEquals(INCHI_RADICAL.SINGLET, iNCHI_RADICAL0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(3);
      assertEquals(INCHI_RADICAL.TRIPLET, iNCHI_RADICAL0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(0);
      int int0 = iNCHI_RADICAL0.getIndx();
      assertEquals(0, int0);
  }
}