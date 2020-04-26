/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 22:45:14 GMT 2020
 */

package com.sivalabs.jblogger.config;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sivalabs.jblogger.config.JBloggerConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JBloggerConfig_ESTest extends JBloggerConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setPostsPerPage((-1));
      jBloggerConfig0.hashCode();
      assertEquals((-1), jBloggerConfig0.getPostsPerPage());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setPostsPerPage((-1));
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertEquals((-1), jBloggerConfig0.getPostsPerPage());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setTwitterShareUrl("VB");
      String string0 = jBloggerConfig0.getTwitterShareUrl();
      assertEquals("VB", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setTwitterShareUrl("");
      String string0 = jBloggerConfig0.getTwitterShareUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setSupportEmail("Kr*Upy");
      String string0 = jBloggerConfig0.getSupportEmail();
      assertEquals("Kr*Upy", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setSupportEmail("");
      String string0 = jBloggerConfig0.getSupportEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setPostsPerPage(59);
      int int0 = jBloggerConfig0.getPostsPerPage();
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setPostsPerPage((-943));
      int int0 = jBloggerConfig0.getPostsPerPage();
      assertEquals((-943), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setLinkedinShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      String string0 = jBloggerConfig0.getLinkedinShareUrl();
      assertEquals("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setLinkedinShareUrl("");
      String string0 = jBloggerConfig0.getLinkedinShareUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setFacebookShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=, twitterShareUrl=, facebookShareUrl=, linkedinShareUrl=)");
      String string0 = jBloggerConfig0.getFacebookShareUrl();
      assertEquals("JBloggerConfig(postsPerPage=0, supportEmail=, twitterShareUrl=, facebookShareUrl=, linkedinShareUrl=)", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setFacebookShareUrl("");
      String string0 = jBloggerConfig0.getFacebookShareUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.canEqual(jBloggerConfig0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.canEqual("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      String string0 = jBloggerConfig0.getSupportEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      String string0 = jBloggerConfig0.getTwitterShareUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      String string0 = jBloggerConfig0.getLinkedinShareUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      int int0 = jBloggerConfig0.getPostsPerPage();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      String string0 = jBloggerConfig0.getFacebookShareUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      jBloggerConfig0.setLinkedinShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      assertFalse(jBloggerConfig0.equals((Object)jBloggerConfig1));
      
      jBloggerConfig1.setLinkedinShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertTrue(jBloggerConfig0.equals((Object)jBloggerConfig1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      assertTrue(jBloggerConfig1.equals((Object)jBloggerConfig0));
      
      jBloggerConfig0.setLinkedinShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      boolean boolean0 = jBloggerConfig1.equals(jBloggerConfig0);
      assertFalse(jBloggerConfig1.equals((Object)jBloggerConfig0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      assertTrue(jBloggerConfig1.equals((Object)jBloggerConfig0));
      
      jBloggerConfig0.setLinkedinShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertFalse(jBloggerConfig1.equals((Object)jBloggerConfig0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      jBloggerConfig1.setFacebookShareUrl("OK(");
      assertFalse(jBloggerConfig1.equals((Object)jBloggerConfig0));
      
      jBloggerConfig0.setFacebookShareUrl("OK(");
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertTrue(jBloggerConfig0.equals((Object)jBloggerConfig1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      assertTrue(jBloggerConfig1.equals((Object)jBloggerConfig0));
      
      jBloggerConfig1.setFacebookShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertFalse(jBloggerConfig1.equals((Object)jBloggerConfig0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setTwitterShareUrl("b2Wd`ptzm)V-Z=r'\"E:");
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      assertFalse(jBloggerConfig1.equals((Object)jBloggerConfig0));
      
      jBloggerConfig1.setTwitterShareUrl("b2Wd`ptzm)V-Z=r'\"E:");
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertTrue(jBloggerConfig1.equals((Object)jBloggerConfig0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      assertTrue(jBloggerConfig1.equals((Object)jBloggerConfig0));
      
      jBloggerConfig1.setTwitterShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertFalse(jBloggerConfig1.equals((Object)jBloggerConfig0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setTwitterShareUrl("b2Wd`ptzm)V-Z=r'\"E:");
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertFalse(boolean0);
      assertEquals(0, jBloggerConfig1.getPostsPerPage());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      assertTrue(jBloggerConfig1.equals((Object)jBloggerConfig0));
      
      jBloggerConfig1.setSupportEmail("w'}iP,B&d#ljN?924J");
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertFalse(jBloggerConfig1.equals((Object)jBloggerConfig0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setSupportEmail("");
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertEquals(0, jBloggerConfig1.getPostsPerPage());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setPostsPerPage(1080);
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertEquals(1080, jBloggerConfig0.getPostsPerPage());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.equals("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setFacebookShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertEquals(0, jBloggerConfig1.getPostsPerPage());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setFacebookShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      jBloggerConfig0.hashCode();
      assertEquals(0, jBloggerConfig0.getPostsPerPage());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setTwitterShareUrl("b2Wd`ptzm)V-Z=r'\"E:");
      jBloggerConfig0.hashCode();
      assertEquals(0, jBloggerConfig0.getPostsPerPage());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setSupportEmail("");
      jBloggerConfig0.hashCode();
      assertEquals(0, jBloggerConfig0.getPostsPerPage());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setSupportEmail("qCBUN QW9y:");
      JBloggerConfig jBloggerConfig1 = new JBloggerConfig();
      assertFalse(jBloggerConfig1.equals((Object)jBloggerConfig0));
      
      jBloggerConfig1.setSupportEmail("qCBUN QW9y:");
      boolean boolean0 = jBloggerConfig0.equals(jBloggerConfig1);
      assertTrue(jBloggerConfig1.equals((Object)jBloggerConfig0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      String string0 = jBloggerConfig0.toString();
      assertEquals("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JBloggerConfig jBloggerConfig0 = new JBloggerConfig();
      jBloggerConfig0.setLinkedinShareUrl("JBloggerConfig(postsPerPage=0, supportEmail=null, twitterShareUrl=null, facebookShareUrl=null, linkedinShareUrl=null)");
      jBloggerConfig0.hashCode();
      assertEquals(0, jBloggerConfig0.getPostsPerPage());
  }
}
