/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 15:23:44 GMT 2020
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HelpFormatter_ESTest extends HelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 100, "org.apache.commons.cli.OptionGroup");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("+Ef<]h{Gw3{a", "-", options0, "+Ef<]h{Gw3{a", false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("g`9WKdLt6-X}", options0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim(">ilFt''%1%<@{VwX5P");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim("");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter(3);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Options options0 = new Options();
      helpFormatter0.renderOptions(stringBuffer0, 9, options0, 9, 0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultDescPad = (-1);
      helpFormatter0.getDescPadding();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.findWrapPos(">", (-686), 3);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.createPadding(1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.createPadding(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) " ");
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, (-2211), 1684, "org.apache.commons.cli.OptionGroup");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText((StringBuffer) null, 3, 1394, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, 0, (Options) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer("");
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, (-236), (Options) null, (-296), (-236));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-3725), (-329), "[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) null, (-1), 0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) null, (-2185), "+Ef<]h{Gw3{a", options0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0);
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 3338, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((PrintWriter) null, 74, options0, 74, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("]", (Options) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", options0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "", options0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-466), "Gav9Y!E%z?", "<", options0, "Gav9Y!E%z?", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos((String) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.createPadding((-535));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer();
      helpFormatter0.renderWrappedText(stringBuffer0, 867, 867, "\r\n");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("KCKm<z]C1n");
      Options options0 = new Options();
      options0.addOption("", "-", true, "-");
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 4591, "", options0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockFile mockFile0 = new MockFile("cmdLineSyntax not provided");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 74, (String) null, "F", (Options) null, 0, 44, (String) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-");
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-454), ">ilFt''%1%<@{VwX5P", ">ilFt''%1%<@{VwX5P", options0, (-454), 2, "", true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getNewLine();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("S_E^?|");
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 44, "$,X");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getWidth();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLeftPadding();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      Options options0 = new Options();
      helpFormatter0.printOptions(mockPrintWriter0, 0, options0, 1597, 0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLongOptPrefix();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getArgName();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getSyntaxPrefix();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "", options0, "", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("usage: ");
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-2), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getOptPrefix();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getDescPadding();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer();
      helpFormatter0.renderWrappedText(stringBuffer0, 837, 1581, "");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim((String) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.findWrapPos("\r\n", 21, 1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0);
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 1, 0, "org.apache.commons.cli.HelpFormatter$OptionComparator");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = options0.addOption("", "RT2TTO#E|zd]", true, "]f4r6zbuZdqZS3nNp");
      helpFormatter0.setLeftPadding(64);
      helpFormatter0.printHelp(">", options1, true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      options0.addOption("arg", "?%H8Q7Cjl8;Pl3Vn");
      helpFormatter0.setLeftPadding(64);
      helpFormatter0.printHelp(">", options0, true);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = options0.addOption("", true, "a`1tV37vOiz^2UnG");
      helpFormatter0.printHelp(">", options1, true);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      options0.addRequiredOption((String) null, "zE7koI%Z", true, "Y&z=Nk#09NL&");
      helpFormatter0.printHelp(">", options0, true);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(2851, (String) null, "-", options0, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("?l7?x'", "-", options0, "\r\n");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setDescPadding(0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setOptPrefix("=Fw");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setWidth(9);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp(1597, " ", " ", options0, "$6h3}fg]ksnB&Yd", false);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLongOptSeparator();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("=Fw", (Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(0, "", "$,X", (Options) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setSyntaxPrefix("-");
      assertEquals("-", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setArgName("org.apache.commons.cli.HelpFormatter$OptionComparator");
      assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", helpFormatter0.getArgName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setNewLine("-");
      assertEquals("-", helpFormatter0.getNewLine());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("d?Rf55vk=++CQRsA4b");
      assertEquals("d?Rf55vk=++CQRsA4b", helpFormatter0.getLongOptSeparator());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      
      helpFormatter0.setLongOptPrefix((String) null);
      String string0 = helpFormatter0.getLongOptPrefix();
      assertEquals(74, helpFormatter0.defaultWidth);
      assertNull(string0);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = options0.addOption("arg", "?%H8Q7Cjl8;Pl3Vn");
      Options options2 = options1.addOption("", "RT2TTO#E|zd]", true, "]f4r6zbuZdqZS3nNp");
      helpFormatter0.printHelp(">", options2, true);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\r\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, helpFormatter0.defaultDescPad);
  }
}
