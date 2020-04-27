/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 23:15:50 GMT 2020
 */

package property.maven.plugin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import property.maven.plugin.CheckBlock;
import property.maven.plugin.PropertyChecker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyChecker_ESTest extends PropertyChecker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertyChecker propertyChecker0 = new PropertyChecker();
      propertyChecker0.setModelEncoding((String) null);
      String string0 = propertyChecker0.getModelEncoding();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PropertyChecker propertyChecker0 = new PropertyChecker();
      propertyChecker0.setModelEncoding("");
      String string0 = propertyChecker0.getModelEncoding();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PropertyChecker propertyChecker0 = new PropertyChecker();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
      List<Object> list0 = linkedList0.subList(1, 1);
      linkedList0.removeFirst();
      propertyChecker0.setCheckBlock(list0);
      // Undeclared exception!
      try { 
        propertyChecker0.addCheckBlock((CheckBlock) null);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertyChecker propertyChecker0 = new PropertyChecker();
      propertyChecker0.getCheckBlock();
      propertyChecker0.getCheckBlock();
      assertEquals("UTF-8", propertyChecker0.getModelEncoding());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PropertyChecker propertyChecker0 = new PropertyChecker();
      CheckBlock checkBlock0 = new CheckBlock();
      propertyChecker0.removeCheckBlock(checkBlock0);
      propertyChecker0.addCheckBlock(checkBlock0);
      assertEquals("UTF-8", propertyChecker0.getModelEncoding());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PropertyChecker propertyChecker0 = new PropertyChecker();
      CheckBlock checkBlock0 = new CheckBlock();
      propertyChecker0.addCheckBlock(checkBlock0);
      propertyChecker0.getCheckBlock();
      assertEquals("UTF-8", propertyChecker0.getModelEncoding());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PropertyChecker propertyChecker0 = new PropertyChecker();
      String string0 = propertyChecker0.getModelEncoding();
      assertEquals("UTF-8", string0);
  }
}