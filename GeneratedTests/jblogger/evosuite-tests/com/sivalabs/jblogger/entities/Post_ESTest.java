/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 22:47:25 GMT 2020
 */

package com.sivalabs.jblogger.entities;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sivalabs.jblogger.entities.Comment;
import com.sivalabs.jblogger.entities.Post;
import com.sivalabs.jblogger.entities.Tag;
import com.sivalabs.jblogger.entities.User;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Post_ESTest extends Post_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Post post0 = new Post();
      post0.setTitle(", users=");
      Post post1 = new Post();
      post1.setTitle("");
      boolean boolean0 = post0.equals(post1);
      assertEquals(0L, (long)post1.getViewCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Post post0 = new Post();
      post0.setViewCount((Long) null);
      Long long0 = post0.getViewCount();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Post post0 = new Post();
      Long long0 = new Long((-25L));
      post0.setViewCount(long0);
      Long long1 = post0.getViewCount();
      assertEquals((-25L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Post post0 = new Post();
      Long long0 = new Long(2147L);
      post0.setViewCount(long0);
      Long long1 = post0.getViewCount();
      assertEquals(2147L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Post post0 = new Post();
      post0.setUrl("Txb");
      post0.getUrl();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Post post0 = new Post();
      post0.setUrl("");
      post0.getUrl();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Post post0 = new Post();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      post0.setUpdatedOn(localDateTime0);
      post0.getUpdatedOn();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Post post0 = new Post();
      post0.setTitle("Post(id=null, title=null, url=null, content=null, shortDescription=null, createdBy=null, createdOn=2014-02-14T20:21:21.320, updatedOn=null, viewCount=0, tags=null, comments=[])");
      post0.getTitle();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Post post0 = new Post();
      post0.setTitle("");
      post0.getTitle();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      post0.getTags();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      Tag tag0 = new Tag();
      linkedHashSet0.add(tag0);
      post0.setTags(linkedHashSet0);
      post0.getTags();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Post post0 = new Post();
      post0.setShortDescription("#W1qnRa)6zUWYa0MFb");
      post0.getShortDescription();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Post post0 = new Post();
      post0.setShortDescription("");
      post0.getShortDescription();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(0);
      post0.setId(integer0);
      post0.getId();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer((-3749));
      post0.setId(integer0);
      post0.getId();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(3756);
      post0.setId(integer0);
      post0.getId();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Post post0 = new Post();
      post0.setCreatedOn((LocalDateTime) null);
      post0.getCreatedOn();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Post post0 = new Post();
      User user0 = new User();
      post0.setCreatedBy(user0);
      post0.getCreatedBy();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Post post0 = new Post();
      post0.setContent("JmpG");
      post0.getContent();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Post post0 = new Post();
      post0.setContent("");
      post0.getContent();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Post post0 = new Post();
      post0.setComments((List<Comment>) null);
      post0.getComments();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Post post0 = new Post();
      LinkedList<Comment> linkedList0 = new LinkedList<Comment>();
      Comment comment0 = new Comment();
      linkedList0.add(comment0);
      post0.setComments(linkedList0);
      post0.getComments();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      linkedHashSet0.add((Tag) null);
      post0.setTags(linkedHashSet0);
      // Undeclared exception!
      try { 
        post0.getTagsAsStringArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sivalabs.jblogger.entities.Post", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      linkedHashSet0.add((Tag) null);
      post0.setTags(linkedHashSet0);
      // Undeclared exception!
      try { 
        post0.getTagsAsString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sivalabs.jblogger.entities.Post", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      linkedHashSet0.add((Tag) null);
      post0.setTags(linkedHashSet0);
      // Undeclared exception!
      try { 
        post0.getTagIdsAsStringArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sivalabs.jblogger.entities.Post", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      linkedHashSet0.add((Tag) null);
      // Undeclared exception!
      try { 
        post0.getTagIdsAsString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sivalabs.jblogger.entities.Post", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Post post0 = new Post();
      post0.getCreatedBy();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Post post0 = new Post();
      post0.getUpdatedOn();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Post post0 = new Post();
      post0.getShortDescription();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Post post0 = new Post();
      post0.getTags();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Post post0 = new Post();
      post0.getUrl();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Post post0 = new Post();
      post0.getContent();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Post post0 = new Post();
      Long long0 = post0.getViewCount();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Post post0 = new Post();
      post0.getTitle();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Post post0 = new Post();
      post0.getId();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      Tag tag0 = new Tag();
      linkedHashSet0.add(tag0);
      post0.setTags(linkedHashSet0);
      String[] stringArray0 = post0.getTagIdsAsStringArray();
      assertEquals(1, stringArray0.length);
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      String[] stringArray0 = post0.getTagIdsAsStringArray();
      assertEquals(0, stringArray0.length);
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Post post0 = new Post();
      String[] stringArray0 = post0.getTagIdsAsStringArray();
      assertEquals(0L, (long)post0.getViewCount());
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      Tag tag0 = new Tag();
      linkedHashSet0.add(tag0);
      String[] stringArray0 = post0.getTagsAsStringArray();
      assertEquals(1, stringArray0.length);
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      String[] stringArray0 = post0.getTagsAsStringArray();
      assertEquals(0, stringArray0.length);
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Post post0 = new Post();
      String[] stringArray0 = post0.getTagsAsStringArray();
      assertEquals(0, stringArray0.length);
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Post post0 = new Post();
      Tag tag0 = new Tag();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      linkedHashSet0.add(tag0);
      post0.setTags(linkedHashSet0);
      String string0 = post0.getTagsAsString();
      assertEquals("null", string0);
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      post0.getTagsAsString();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Post post0 = new Post();
      post0.getTagsAsString();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Post post0 = new Post();
      Tag tag0 = new Tag();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      linkedHashSet0.add(tag0);
      post0.setTags(linkedHashSet0);
      String string0 = post0.getTagIdsAsString();
      assertEquals(0L, (long)post0.getViewCount());
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      post0.getTagIdsAsString();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Post post0 = new Post();
      post0.getTagIdsAsString();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      post1.setTags(linkedHashSet0);
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertEquals(0L, (long)post1.getViewCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Post post0 = new Post();
      assertEquals(0L, (long)post0.getViewCount());
      
      Long long0 = new Long(3297L);
      post0.setViewCount(long0);
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Post post0 = new Post();
      post0.setViewCount((Long) null);
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
      assertEquals(0L, (long)post1.getViewCount());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      Comment comment0 = new Comment();
      LocalDateTime localDateTime0 = comment0.getCreatedOn();
      post1.setUpdatedOn(localDateTime0);
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      post1.setCreatedOn((LocalDateTime) null);
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Post post0 = new Post();
      post0.setCreatedOn((LocalDateTime) null);
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
      assertEquals(0L, (long)post1.getViewCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      User user0 = new User();
      post1.setCreatedBy(user0);
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Post post0 = new Post();
      User user0 = new User();
      post0.setCreatedBy(user0);
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertEquals(0L, (long)post1.getViewCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      post1.setShortDescription("Post(id=null, title=null, url=null, content=null, shortDescription=null, createdBy=null, createdOn=2014-02-14T20:21:21.320, updatedOn=null, viewCount=0, tags=null, comments=[])");
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      post0.setShortDescription("Post(id=null, title=null, url=null, content=null, shortDescription=null, createdBy=null, createdOn=2014-02-14T20:21:21.320, updatedOn=null, viewCount=0, tags=null, comments=[])");
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Post post0 = new Post();
      post0.setContent("Post(id=null, title=null, url=null, content=null, shortDescription=null, createdBy=null, createdOn=2014-02-14T20:21:21.320, updatedOn=null, viewCount=0, tags=null, comments=[])");
      Post post1 = new Post();
      assertFalse(post1.equals((Object)post0));
      
      post1.setContent("Post(id=null, title=null, url=null, content=null, shortDescription=null, createdBy=null, createdOn=2014-02-14T20:21:21.320, updatedOn=null, viewCount=0, tags=null, comments=[])");
      boolean boolean0 = post0.equals(post1);
      assertTrue(post1.equals((Object)post0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      post1.setContent(", name=");
      boolean boolean0 = post0.equals(post1);
      assertFalse(post1.equals((Object)post0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Post post0 = new Post();
      post0.setContent("Post(id=null, title=null, url=null, content=null, shortDescription=null, createdBy=null, createdOn=2014-02-14T20:21:21.320, updatedOn=null, viewCount=0, tags=null, comments=[])");
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertEquals(0L, (long)post1.getViewCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      post1.setUrl("Post(id=null, title=null, url=null, content=null, shortDescription=null, createdBy=null, createdOn=2014-02-14T20:21:21.320, updatedOn=null, viewCount=0, tags=null, comments=[])");
      boolean boolean0 = post0.equals(post1);
      assertFalse(post1.equals((Object)post0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Post post0 = new Post();
      post0.setUrl("J4NlTq0wprdGqLf-");
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
      assertEquals(0L, (long)post1.getViewCount());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      post1.setTitle("");
      boolean boolean0 = post0.equals(post1);
      assertFalse(post1.equals((Object)post0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Post post0 = new Post();
      Post post1 = new Post();
      assertTrue(post1.equals((Object)post0));
      
      Integer integer0 = new Integer((-933));
      post1.setId(integer0);
      boolean boolean0 = post0.equals(post1);
      assertFalse(post1.equals((Object)post0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Post post0 = new Post();
      boolean boolean0 = post0.equals(post0);
      assertEquals(0L, (long)post0.getViewCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Post post0 = new Post();
      Object object0 = new Object();
      boolean boolean0 = post0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Post post0 = new Post();
      post0.setComments((List<Comment>) null);
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Post post0 = new Post();
      LocalDateTime localDateTime0 = post0.getCreatedOn();
      post0.setUpdatedOn(localDateTime0);
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Post post0 = new Post();
      post0.setCreatedOn((LocalDateTime) null);
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Post post0 = new Post();
      User user0 = new User();
      post0.setCreatedBy(user0);
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Post post0 = new Post();
      post0.setShortDescription("A>E8!k'");
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Post post0 = new Post();
      post0.setTitle("");
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(2818);
      post0.setId(integer0);
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Post post0 = new Post();
      LinkedHashSet<Tag> linkedHashSet0 = new LinkedHashSet<Tag>();
      post0.setTags(linkedHashSet0);
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Post post0 = new Post();
      post0.setUrl("C]g,;=9*U/u1!");
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Post post0 = new Post();
      post0.setViewCount((Long) null);
      post0.hashCode();
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Post post0 = new Post();
      post0.setContent("");
      post0.hashCode();
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer((-449));
      post0.setId(integer0);
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertFalse(boolean0);
      assertEquals(0L, (long)post1.getViewCount());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Post post0 = new Post();
      List<Comment> list0 = post0.getComments();
      post0.setComments(list0);
      assertEquals(0L, (long)post0.getViewCount());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Post post0 = new Post();
      Comment comment0 = new Comment();
      LocalDateTime localDateTime0 = comment0.getCreatedOn();
      post0.setUpdatedOn(localDateTime0);
      Post post1 = new Post();
      boolean boolean0 = post0.equals(post1);
      assertEquals(0L, (long)post1.getViewCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.toString();
      assertEquals("Post(id=null, title=null, url=null, content=null, shortDescription=null, createdBy=null, createdOn=2014-02-14T20:21:21.320, updatedOn=null, viewCount=0, tags=null, comments=[])", string0);
  }
}