/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 24 19:39:46 GMT 2020
 */

package net.sf.jniinchi;

import org.junit.Test;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_PARITY;
import net.sf.jniinchi.INCHI_RET;
import net.sf.jniinchi.JniInchiAtom;
import net.sf.jniinchi.JniInchiBond;
import net.sf.jniinchi.JniInchiInput;
import net.sf.jniinchi.JniInchiInputData;
import net.sf.jniinchi.JniInchiStereo0D;
import net.sf.jniinchi.JniInchiStructure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JniInchiInputData_ESTest extends JniInchiInputData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(0, (JniInchiInput) null, 0, "Au^g\"gJxDA.*e};");
      INCHI_RET iNCHI_RET0 = jniInchiInputData0.getReturnValue();
      assertEquals(INCHI_RET.OKAY, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JniInchiStructure jniInchiStructure0 = new JniInchiStructure();
      JniInchiInput jniInchiInput0 = new JniInchiInput(jniInchiStructure0);
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(1, jniInchiInput0, 368, "-");
      INCHI_RET iNCHI_RET0 = jniInchiInputData0.getReturnValue();
      assertEquals(INCHI_RET.WARNING, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JniInchiInput jniInchiInput0 = new JniInchiInput();
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData((-1), jniInchiInput0, 0, "SKIP");
      INCHI_RET iNCHI_RET0 = jniInchiInputData0.getReturnValue();
      assertEquals(INCHI_RET.EOF, iNCHI_RET0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData((-761), (JniInchiInput) null, (-761), "");
      JniInchiInput jniInchiInput0 = jniInchiInputData0.getInput();
      assertNull(jniInchiInput0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JniInchiInput jniInchiInput0 = new JniInchiInput();
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(728, jniInchiInput0, 2066, "z8P=Fza>");
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("z8P=Fza>");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.NONE;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      jniInchiInput0.addStereo0D(jniInchiStereo0D0);
      JniInchiInput jniInchiInput1 = jniInchiInputData0.getInput();
      assertSame(jniInchiInput1, jniInchiInput0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JniInchiStructure jniInchiStructure0 = new JniInchiStructure();
      JniInchiInput jniInchiInput0 = new JniInchiInput(jniInchiStructure0);
      JniInchiBond[] jniInchiBondArray0 = new JniInchiBond[1];
      jniInchiStructure0.addBonds(jniInchiBondArray0);
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(0, jniInchiInput0, 0, "");
      jniInchiInputData0.getInput();
      assertEquals(INCHI_RET.OKAY, jniInchiInputData0.getReturnValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JniInchiInput jniInchiInput0 = new JniInchiInput();
      JniInchiAtom[] jniInchiAtomArray0 = new JniInchiAtom[1];
      jniInchiInput0.addAtoms(jniInchiAtomArray0);
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData((-1), jniInchiInput0, 0, "SKIP");
      jniInchiInputData0.getInput();
      assertEquals(INCHI_RET.EOF, jniInchiInputData0.getReturnValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JniInchiInput jniInchiInput0 = new JniInchiInput((String) null);
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData((-895), jniInchiInput0, 7, (String) null);
      String string0 = jniInchiInputData0.getErrorMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JniInchiStructure jniInchiStructure0 = new JniInchiStructure();
      JniInchiInput jniInchiInput0 = new JniInchiInput(jniInchiStructure0);
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(0, jniInchiInput0, 0, "");
      jniInchiInputData0.getErrorMessage();
      assertEquals(INCHI_RET.OKAY, jniInchiInputData0.getReturnValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JniInchiInput jniInchiInput0 = new JniInchiInput();
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData((-618), jniInchiInput0, (-618), "net.sf.jniinchi.JniInchiException");
      String string0 = jniInchiInputData0.getErrorMessage();
      assertEquals("net.sf.jniinchi.JniInchiException", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData((-1903), (JniInchiInput) null, (-1903), (String) null);
      jniInchiInputData0.getReturnValue();
  }
}
