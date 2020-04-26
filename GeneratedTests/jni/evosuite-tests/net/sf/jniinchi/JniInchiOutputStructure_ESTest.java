/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 24 19:38:31 GMT 2020
 */

package net.sf.jniinchi;

import org.junit.Test;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RET;
import net.sf.jniinchi.JniInchiOutputStructure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JniInchiOutputStructure_ESTest extends JniInchiOutputStructure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.UNKNOWN;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      jniInchiOutputStructure0.setWarningFlags(0L, 0L, (-2931L), (-2931L));
      assertEquals(0, jniInchiOutputStructure0.getNumStereo0D());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.SKIP;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      jniInchiOutputStructure0.setWarningFlags((long[][]) null);
      long[][] longArray0 = jniInchiOutputStructure0.getWarningFlags();
      assertNull(longArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.OKAY;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      long[][] longArray0 = new long[0][5];
      jniInchiOutputStructure0.setWarningFlags(longArray0);
      long[][] longArray1 = jniInchiOutputStructure0.getWarningFlags();
      assertEquals(0, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure((-1466), "Gq)V>oE7&(Y>_h", "ALLENE", (-1466), (-1466), (-1466), (-1968L));
      jniInchiOutputStructure0.getReturnStatus();
      assertEquals("Gq)V>oE7&(Y>_h", jniInchiOutputStructure0.getMessage());
      assertEquals("ALLENE", jniInchiOutputStructure0.getLog());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(0, "", "net.sf.jniinchi.JniInchiOutputStructure", 861L, 1L, 0, 861L);
      jniInchiOutputStructure0.getReturnStatus();
      assertEquals("net.sf.jniinchi.JniInchiOutputStructure", jniInchiOutputStructure0.getLog());
      assertEquals("", jniInchiOutputStructure0.getMessage());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure((-1), "", "", (-1), (-86L), (-86L), (-1));
      INCHI_RET iNCHI_RET0 = jniInchiOutputStructure0.getReturnStatus();
      assertEquals((-1), iNCHI_RET0.getIndx());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure((-1), "", "", (-1), (-86L), (-86L), (-1));
      jniInchiOutputStructure0.setMessage("(VMGw@<os#}D.J");
      String string0 = jniInchiOutputStructure0.getMessage();
      assertEquals("(VMGw@<os#}D.J", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure((-1145), "", "", (-1145), (-1145), 1120L, (-1145));
      String string0 = jniInchiOutputStructure0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(2475, "d$K7BzF0", "W,w4'(ZB?SMC#F:y:.}", 2475, 2475, 2475, 2475);
      String string0 = jniInchiOutputStructure0.getLog();
      assertEquals("d$K7BzF0", jniInchiOutputStructure0.getMessage());
      assertEquals("W,w4'(ZB?SMC#F:y:.}", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.FATAL;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      jniInchiOutputStructure0.setLog("");
      String string0 = jniInchiOutputStructure0.getLog();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.UNKNOWN;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      long[][] longArray0 = jniInchiOutputStructure0.getWarningFlags();
      assertEquals(2, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.UNKNOWN;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      String string0 = jniInchiOutputStructure0.getLog();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.UNKNOWN;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      String string0 = jniInchiOutputStructure0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.UNKNOWN;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      INCHI_RET iNCHI_RET1 = jniInchiOutputStructure0.getReturnStatus();
      assertEquals(INCHI_RET.UNKNOWN, iNCHI_RET1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(2220, "", "", (-1L), 2220, 2220, (-1L));
      INCHI_RET iNCHI_RET0 = INCHI_RET.UNKNOWN;
      jniInchiOutputStructure0.setRetStatus(iNCHI_RET0);
      assertEquals("", jniInchiOutputStructure0.getMessage());
  }
}