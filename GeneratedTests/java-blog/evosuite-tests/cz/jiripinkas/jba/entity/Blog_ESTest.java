/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 22:16:56 GMT 2020
 */

package cz.jiripinkas.jba.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cz.jiripinkas.jba.entity.Blog;
import cz.jiripinkas.jba.entity.Category;
import cz.jiripinkas.jba.entity.Item;
import cz.jiripinkas.jba.entity.User;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Blog_ESTest extends Blog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Blog blog0 = new Blog();
      User user0 = new User();
      blog0.setUser(user0);
      user0.setEnabled(true);
      User user1 = blog0.getUser();
      assertSame(user1, user0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Blog blog0 = new Blog();
      User user0 = new User();
      user0.setAdmin(true);
      blog0.setUser(user0);
      User user1 = blog0.getUser();
      assertNull(user1.getEmail());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setUrl("3#h'c");
      String string0 = blog0.getUrl();
      assertEquals("3#h'c", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setUrl("");
      String string0 = blog0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setShortName("6c3XKK");
      String string0 = blog0.getShortName();
      assertEquals("6c3XKK", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setShortName("");
      String string0 = blog0.getShortName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer(0);
      blog0.setPopularity(integer0);
      Integer integer1 = blog0.getPopularity();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer((-479));
      blog0.setPopularity(integer0);
      Integer integer1 = blog0.getPopularity();
      assertEquals((-479), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer(2796);
      blog0.setPopularity(integer0);
      Integer integer1 = blog0.getPopularity();
      assertEquals(2796, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setNick(":`I*`Uj^amNKci}");
      String string0 = blog0.getNick();
      assertEquals(":`I*`Uj^amNKci}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setNick("");
      String string0 = blog0.getNick();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setName("3#h'c");
      String string0 = blog0.getName();
      assertEquals("3#h'c", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setName("");
      String string0 = blog0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer(0);
      blog0.setMinRedditUps(integer0);
      Integer integer1 = blog0.getMinRedditUps();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer((byte)6);
      blog0.setMinRedditUps(integer0);
      Integer integer1 = blog0.getMinRedditUps();
      assertEquals(6, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer((-20));
      blog0.setMinRedditUps(integer0);
      Integer integer1 = blog0.getMinRedditUps();
      assertEquals((-20), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Blog blog0 = new Blog();
      MockDate mockDate0 = new MockDate((-958), (-958), 0);
      blog0.setLastIndexedDate(mockDate0);
      Date date0 = blog0.getLastIndexedDate();
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = Boolean.TRUE;
      blog0.setLastCheckStatus(boolean0);
      Boolean boolean1 = blog0.getLastCheckStatus();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = Boolean.valueOf(false);
      blog0.setLastCheckStatus(boolean0);
      Boolean boolean1 = blog0.getLastCheckStatus();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setLastCheckErrorText("");
      String string0 = blog0.getLastCheckErrorText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer(1611);
      blog0.setLastCheckErrorCount(integer0);
      Integer integer1 = blog0.getLastCheckErrorCount();
      assertEquals(1611, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Blog blog0 = new Blog();
      Item item0 = new Item();
      Integer integer0 = item0.getFacebookShareCount();
      blog0.setLastCheckErrorCount(integer0);
      Integer integer1 = blog0.getLastCheckErrorCount();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer((-1960));
      blog0.setLastCheckErrorCount(integer0);
      Integer integer1 = blog0.getLastCheckErrorCount();
      assertEquals((-1960), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer((-1));
      blog0.setLastCheckErrorCount(integer0);
      Integer integer1 = blog0.getLastCheckErrorCount();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Blog blog0 = new Blog();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      blog0.setItems(linkedList0);
      List<Item> list0 = blog0.getItems();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Blog blog0 = new Blog();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      linkedList0.addFirst(item0);
      blog0.setItems(linkedList0);
      List<Item> list0 = blog0.getItems();
      assertTrue(list0.contains(item0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Blog blog0 = new Blog();
      Item item0 = new Item();
      Integer integer0 = item0.getTwitterRetweetCount();
      blog0.setId(integer0);
      Integer integer1 = blog0.getId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer(1);
      blog0.setId(integer0);
      Integer integer1 = blog0.getId();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = new Integer((-1));
      blog0.setId(integer0);
      Integer integer1 = blog0.getId();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Blog blog0 = new Blog();
      byte[] byteArray0 = new byte[2];
      blog0.setIcon(byteArray0);
      byte[] byteArray1 = blog0.getIcon();
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Blog blog0 = new Blog();
      byte[] byteArray0 = new byte[0];
      blog0.setIcon(byteArray0);
      byte[] byteArray1 = blog0.getIcon();
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setHomepageUrl("DD(|&y");
      String string0 = blog0.getHomepageUrl();
      assertEquals("DD(|&y", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setHomepageUrl("");
      String string0 = blog0.getHomepageUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Blog blog0 = new Blog();
      Category category0 = new Category();
      category0.setId((byte)115);
      blog0.setCategory(category0);
      Category category1 = blog0.getCategory();
      assertSame(category1, category0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Blog blog0 = new Blog();
      Category category0 = new Category();
      blog0.setCategory(category0);
      Category category1 = blog0.getCategory();
      assertSame(category1, category0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Blog blog0 = new Blog();
      Category category0 = new Category();
      category0.setBlogCount(1592);
      blog0.setCategory(category0);
      Category category1 = blog0.getCategory();
      assertNull(category1.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Blog blog0 = new Blog();
      Category category0 = new Category();
      category0.setBlogCount((-965));
      blog0.setCategory(category0);
      Category category1 = blog0.getCategory();
      assertNull(category1.getName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = Boolean.TRUE;
      blog0.setArchived(boolean0);
      Boolean boolean1 = blog0.getArchived();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = Boolean.FALSE;
      blog0.setArchived(boolean0);
      Boolean boolean1 = blog0.getArchived();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = Boolean.TRUE;
      blog0.setAggregator(boolean0);
      Boolean boolean1 = blog0.getAggregator();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = Boolean.FALSE;
      blog0.setAggregator(boolean0);
      Boolean boolean1 = blog0.getAggregator();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Blog blog0 = new Blog();
      Date date0 = blog0.getLastIndexedDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Blog blog0 = new Blog();
      String string0 = blog0.getLastCheckErrorText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = blog0.getMinRedditUps();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Blog blog0 = new Blog();
      List<Item> list0 = blog0.getItems();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Blog blog0 = new Blog();
      byte[] byteArray0 = blog0.getIcon();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = blog0.getArchived();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = blog0.getPopularity();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Blog blog0 = new Blog();
      String string0 = blog0.getNick();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = blog0.getLastCheckErrorCount();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = blog0.getAggregator();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Blog blog0 = new Blog();
      String string0 = blog0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Blog blog0 = new Blog();
      String string0 = blog0.getHomepageUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Blog blog0 = new Blog();
      Boolean boolean0 = blog0.getLastCheckStatus();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Blog blog0 = new Blog();
      String string0 = blog0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Blog blog0 = new Blog();
      String string0 = blog0.getShortName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Blog blog0 = new Blog();
      blog0.setLastCheckErrorText("cz.jiripinkas.jba.entity.User");
      String string0 = blog0.getLastCheckErrorText();
      assertEquals("cz.jiripinkas.jba.entity.User", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Blog blog0 = new Blog();
      Category category0 = blog0.getCategory();
      assertNull(category0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Blog blog0 = new Blog();
      // Undeclared exception!
      try { 
        blog0.getPublicName();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // cz/jiripinkas/jba/util/MyUtil
         //
         verifyException("cz.jiripinkas.jba.entity.Blog", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Blog blog0 = new Blog();
      Integer integer0 = blog0.getId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Blog blog0 = new Blog();
      User user0 = blog0.getUser();
      assertNull(user0);
  }
}
