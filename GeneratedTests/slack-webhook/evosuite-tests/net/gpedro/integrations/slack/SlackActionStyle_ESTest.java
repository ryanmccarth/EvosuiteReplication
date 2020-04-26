/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 15:51:02 GMT 2020
 */

package net.gpedro.integrations.slack;

import org.junit.Test;
import static org.junit.Assert.*;
import net.gpedro.integrations.slack.SlackActionStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlackActionStyle_ESTest extends SlackActionStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SlackActionStyle[] slackActionStyleArray0 = SlackActionStyle.values();
      assertEquals(3, slackActionStyleArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SlackActionStyle slackActionStyle0 = SlackActionStyle.valueOf("DANGER");
      assertEquals("danger", slackActionStyle0.getCode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SlackActionStyle slackActionStyle0 = SlackActionStyle.PRIMARY;
      String string0 = slackActionStyle0.getCode();
      assertEquals("primary", string0);
  }
}
