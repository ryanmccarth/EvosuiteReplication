/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 15:52:44 GMT 2020
 */

package net.gpedro.integrations.slack;

import org.junit.Test;
import static org.junit.Assert.*;
import net.gpedro.integrations.slack.SlackActionType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlackActionType_ESTest extends SlackActionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SlackActionType[] slackActionTypeArray0 = SlackActionType.values();
      assertEquals(2, slackActionTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SlackActionType slackActionType0 = SlackActionType.valueOf("SELECT");
      assertEquals(SlackActionType.SELECT, slackActionType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SlackActionType slackActionType0 = SlackActionType.SELECT;
      String string0 = slackActionType0.getCode();
      assertEquals("select", string0);
  }
}
