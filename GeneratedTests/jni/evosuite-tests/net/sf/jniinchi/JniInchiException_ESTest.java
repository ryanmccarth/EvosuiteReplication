/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 24 19:52:20 GMT 2020
 */

package net.sf.jniinchi;

import org.junit.Test;
import static org.junit.Assert.*;
import net.sf.jniinchi.JniInchiException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JniInchiException_ESTest extends JniInchiException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      JniInchiException jniInchiException0 = new JniInchiException(mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JniInchiException jniInchiException0 = new JniInchiException("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JniInchiException jniInchiException0 = new JniInchiException();
  }
}