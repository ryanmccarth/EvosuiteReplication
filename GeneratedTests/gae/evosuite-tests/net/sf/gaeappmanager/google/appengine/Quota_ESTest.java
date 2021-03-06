/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 24 19:25:28 GMT 2020
 */

package net.sf.gaeappmanager.google.appengine;

import org.junit.Test;
import static org.junit.Assert.*;
import net.sf.gaeappmanager.google.appengine.Quota;
import net.sf.gaeappmanager.google.appengine.QuotaGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Quota_ESTest extends Quota_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Quota[] quotaArray0 = Quota.values();
      assertEquals(36, quotaArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Quota quota0 = Quota.valueOf("STORAGE_TOTAL_STORED_DATA");
      assertEquals(Quota.STORAGE_TOTAL_STORED_DATA, quota0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Quota quota0 = Quota.STORAGE_DATA_RECEIVED_FROM_DATASTORE_API;
      QuotaGroup quotaGroup0 = quota0.getQuotaGroup();
      assertEquals(QuotaGroup.STORAGE, quotaGroup0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Quota quota0 = Quota.STORAGE_DATASTORE_CPU_TIME;
      String string0 = quota0.getQuotaName();
      assertEquals("Datastore CPU Time", string0);
  }
}
