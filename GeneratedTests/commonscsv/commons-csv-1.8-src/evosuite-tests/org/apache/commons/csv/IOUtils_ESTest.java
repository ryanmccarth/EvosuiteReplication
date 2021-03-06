/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 21 14:29:20 GMT 2020
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.csv.IOUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      long long0 = IOUtils.copyLarge(stringReader0, (Writer) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("KF<");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      long long0 = IOUtils.copyLarge(stringReader0, mockPrintWriter0);
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Xd/!86*LFpAB|9m");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("{m");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(objectOutputStream0, true);
      long long0 = IOUtils.copy(stringReader0, mockPrintStream0);
      assertEquals(15L, long0);
      
      long long1 = IOUtils.copy(stringReader0, mockPrintStream0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      char[] charArray0 = new char[6];
      try { 
        IOUtils.copyLarge(pipedReader0, mockPrintWriter0, charArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "7<I=yX?__");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "7<I=yX?__", 0, 0);
      // Undeclared exception!
      try { 
        IOUtils.copy((Reader) null, mockPrintStream0, charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, true);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      try { 
        IOUtils.copy(pipedReader0, mockPrintWriter0, charBuffer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      pipedWriter0.append('m');
      // Undeclared exception!
      IOUtils.copy(pipedReader0, pipedWriter0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      StringWriter stringWriter0 = new StringWriter(0);
      try { 
        IOUtils.copy(pipedReader0, stringWriter0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.csv.IOUtils");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.commons.csv.IOUtils");
      char[] charArray0 = new char[7];
      long long0 = IOUtils.copyLarge(stringReader0, mockPrintWriter0, charArray0);
      assertEquals(30L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.csv.IOUtils");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.commons.csv.IOUtils");
      long long0 = IOUtils.copy(stringReader0, mockPrintWriter0);
      assertEquals(30L, long0);
      
      char[] charArray0 = new char[7];
      long long1 = IOUtils.copyLarge(stringReader0, mockPrintWriter0, charArray0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("HeV![qN>6D[h8");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      try { 
        IOUtils.copyLarge(pipedReader0, mockPrintWriter0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("7i/", "7i/");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      // Undeclared exception!
      try { 
        IOUtils.copy((Reader) null, mockPrintStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
