/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 22:13:02 GMT 2020
 */

package cz.jiripinkas.jba.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cz.jiripinkas.jba.entity.User;
import cz.jiripinkas.jba.service.UserService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserService_ESTest extends UserService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.save((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.count();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // cz/jiripinkas/jba/repository/UserRepository
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      User user0 = new User();
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.saveAdmin(user0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/security/crypto/bcrypt/BCryptPasswordEncoder
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.findAll();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // cz/jiripinkas/jba/repository/UserRepository
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.delete((-1));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // cz/jiripinkas/jba/repository/UserRepository
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.findAdmin();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // cz/jiripinkas/jba/repository/UserRepository
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UserService userService0 = new UserService();
      User user0 = new User();
      // Undeclared exception!
      try { 
        userService0.save(user0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/security/crypto/bcrypt/BCryptPasswordEncoder
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.findOneWithBlogs("cz.jiripinkas.jba.entity.User");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // cz/jiripinkas/jba/repository/UserRepository
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.findOneWithBlogs(1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // cz/jiripinkas/jba/repository/UserRepository
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      UserService userService0 = new UserService();
      // Undeclared exception!
      try { 
        userService0.findOne(";");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // cz/jiripinkas/jba/repository/UserRepository
         //
         verifyException("cz.jiripinkas.jba.service.UserService", e);
      }
  }
}
