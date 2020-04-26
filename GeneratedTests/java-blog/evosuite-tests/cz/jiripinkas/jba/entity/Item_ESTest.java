/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 22:13:48 GMT 2020
 */

package cz.jiripinkas.jba.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import cz.jiripinkas.jba.entity.Blog;
import cz.jiripinkas.jba.entity.Item;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Item_ESTest extends Item_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item item0 = new Item();
      assertTrue(item0.isEnabled());
      
      item0.setEnabled(false);
      boolean boolean0 = item0.isEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      
      item0.setTwitterRetweetCount((Integer) null);
      item0.getTwitterRetweetCount();
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      
      Integer integer0 = new Integer((-3551));
      item0.setTwitterRetweetCount(integer0);
      item0.getTwitterRetweetCount();
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      
      Integer integer0 = new Integer(1);
      item0.setTwitterRetweetCount(integer0);
      item0.getTwitterRetweetCount();
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      
      Integer integer0 = new Integer(412);
      item0.setTwitterRetweetCount(integer0);
      item0.getTwitterRetweetCount();
      assertEquals(0, (int)item0.getLikeCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Item item0 = new Item();
      item0.setTitle("Q");
      item0.getTitle();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item item0 = new Item();
      MockDate mockDate0 = new MockDate(690, 690, 690);
      item0.setSavedDate(mockDate0);
      item0.getSavedDate();
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item item0 = new Item();
      Instant instant0 = MockInstant.ofEpochSecond(3437L, 0L);
      Date date0 = Date.from(instant0);
      item0.setPublishedDate(date0);
      item0.getPublishedDate();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      
      Integer integer0 = new Integer(1);
      item0.setLinkedinShareCount(integer0);
      item0.getLinkedinShareCount();
      assertEquals(0, (int)item0.getFacebookShareCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      
      Integer integer0 = new Integer((-26));
      item0.setLinkedinShareCount(integer0);
      item0.getLinkedinShareCount();
      assertEquals(0, (int)item0.getClickCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item item0 = new Item();
      item0.setLink("SMtI&Y");
      item0.getLink();
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item item0 = new Item();
      item0.setLink("");
      item0.getLink();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getLikeCount());
      
      Integer integer0 = new Integer((-866));
      item0.setLikeCount(integer0);
      item0.getLikeCount();
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getLikeCount());
      
      Integer integer0 = new Integer(1);
      item0.setLikeCount(integer0);
      item0.getLikeCount();
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = new Integer(1);
      item0.setId(integer0);
      item0.getId();
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLikeCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = new Integer((-1195));
      item0.setId(integer0);
      item0.getId();
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = new Integer((-885));
      item0.setId(integer0);
      item0.getId();
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getFacebookShareCount());
      
      item0.setFacebookShareCount((Integer) null);
      item0.getFacebookShareCount();
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getFacebookShareCount());
      
      Integer integer0 = new Integer(1);
      item0.setFacebookShareCount(integer0);
      item0.getFacebookShareCount();
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getFacebookShareCount());
      
      Integer integer0 = new Integer((-1195));
      item0.setFacebookShareCount(integer0);
      item0.getFacebookShareCount();
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getFacebookShareCount());
      
      Integer integer0 = new Integer((-1));
      item0.setFacebookShareCount(integer0);
      item0.getFacebookShareCount();
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Item item0 = new Item();
      item0.setError("cz.jiripinkas.jba.entity.Item");
      item0.getError();
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getDislikeCount());
      
      Integer integer0 = new Integer((-1195));
      item0.setDislikeCount(integer0);
      item0.getDislikeCount();
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getDislikeCount());
      
      Integer integer0 = new Integer(1980);
      item0.setDislikeCount(integer0);
      item0.getDislikeCount();
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Item item0 = new Item();
      item0.setDescription("SMtI&Y");
      item0.getDescription();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLikeCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Item item0 = new Item();
      item0.setDescription("");
      item0.getDescription();
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getClickCount());
      
      Integer integer0 = new Integer((-1470));
      item0.setClickCount(integer0);
      item0.getClickCount();
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getClickCount());
      
      Integer integer0 = new Integer(2231);
      item0.setClickCount(integer0);
      item0.getClickCount();
      assertEquals(0, (int)item0.getLikeCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getDislikeCount());
      
      item0.setDislikeCount((Integer) null);
      item0.getDislikeCount();
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getClickCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getLikeCount());
      
      item0.setLikeCount((Integer) null);
      item0.getLikeCount();
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getClickCount());
      
      item0.setClickCount((Integer) null);
      item0.getClickCount();
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Item item0 = new Item();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      
      item0.setLinkedinShareCount((Integer) null);
      item0.getLinkedinShareCount();
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = item0.getLikeCount();
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)integer0);
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = item0.getFacebookShareCount();
      item0.setId(integer0);
      Integer integer1 = item0.getId();
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)integer1);
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Item item0 = new Item();
      item0.getPublishedDate();
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = item0.getClickCount();
      item0.setTwitterRetweetCount(integer0);
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Item item0 = new Item();
      item0.getId();
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = item0.getDislikeCount();
      item0.setFacebookShareCount(integer0);
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Item item0 = new Item();
      item0.getTitle();
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Item item0 = new Item();
      item0.getError();
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Item item0 = new Item();
      item0.setError("");
      item0.getError();
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = item0.getTwitterRetweetCount();
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)integer0);
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getClickCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Item item0 = new Item();
      item0.getLink();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Item item0 = new Item();
      item0.getBlog();
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Item item0 = new Item();
      item0.getSavedDate();
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Item item0 = new Item();
      item0.setTitle("");
      item0.getTitle();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Item item0 = new Item();
      boolean boolean0 = item0.isEnabled();
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertTrue(boolean0);
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Item item0 = new Item();
      item0.getDescription();
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertTrue(item0.isEnabled());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Item item0 = new Item();
      Blog blog0 = new Blog();
      item0.setBlog(blog0);
      item0.getBlog();
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)item0.getClickCount());
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLinkedinShareCount());
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertTrue(item0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Item item0 = new Item();
      Integer integer0 = item0.getLinkedinShareCount();
      assertEquals(0, (int)item0.getTwitterRetweetCount());
      assertEquals(0, (int)item0.getDislikeCount());
      assertEquals(0, (int)item0.getLikeCount());
      assertEquals(0, (int)integer0);
      assertEquals(0, (int)item0.getFacebookShareCount());
      assertEquals(0, (int)item0.getClickCount());
      assertTrue(item0.isEnabled());
  }
}