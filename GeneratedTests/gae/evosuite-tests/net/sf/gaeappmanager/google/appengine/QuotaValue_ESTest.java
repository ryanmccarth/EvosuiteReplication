/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 24 19:21:46 GMT 2020
 */

package net.sf.gaeappmanager.google.appengine;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import net.sf.gaeappmanager.google.appengine.Quota;
import net.sf.gaeappmanager.google.appengine.QuotaValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuotaValue_ESTest extends QuotaValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      assertFalse(quotaValue0.isOkay());
      
      quotaValue0.setOkay(true);
      boolean boolean0 = quotaValue0.isOkay();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.setValue((BigDecimal) null);
      quotaValue0.getValue();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      BigDecimal bigDecimal0 = new BigDecimal((-4080L));
      quotaValue0.setValue(bigDecimal0);
      quotaValue0.getValue();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)1;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      quotaValue0.setValue(bigDecimal0);
      quotaValue0.getValue();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.setUnit((String) null);
      quotaValue0.getUnit();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.setUnit("t8~|^_SL:XHm<`E>}N");
      quotaValue0.getUnit();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      Quota quota0 = Quota.MAIL_ADMINS_EMAILED;
      quotaValue0.setQuota(quota0);
      quotaValue0.getQuota();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.setPercent((BigDecimal) null);
      quotaValue0.getPercent();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      BigDecimal bigDecimal0 = new BigDecimal((-1507L));
      quotaValue0.setPercent(bigDecimal0);
      quotaValue0.getPercent();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)1;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      quotaValue0.setPercent(bigDecimal0);
      quotaValue0.getPercent();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.setLimit((BigDecimal) null);
      quotaValue0.getLimit();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      BigDecimal bigDecimal0 = new BigDecimal((-688));
      quotaValue0.setLimit(bigDecimal0);
      quotaValue0.getLimit();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      BigDecimal bigDecimal0 = new BigDecimal(1546L);
      quotaValue0.setLimit(bigDecimal0);
      quotaValue0.getLimit();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.getQuota();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      BigDecimal bigDecimal0 = new BigDecimal(246);
      quotaValue0.setPercent(bigDecimal0);
      quotaValue0.getPercent();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      BigDecimal bigDecimal0 = new BigDecimal(246);
      quotaValue0.setValue(bigDecimal0);
      quotaValue0.getValue();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.getLimit();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      BigDecimal bigDecimal0 = new BigDecimal(246);
      quotaValue0.setLimit(bigDecimal0);
      quotaValue0.getLimit();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.getPercent();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      boolean boolean0 = quotaValue0.isOkay();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.getValue();
      assertFalse(quotaValue0.isOkay());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QuotaValue quotaValue0 = new QuotaValue();
      quotaValue0.getUnit();
      assertFalse(quotaValue0.isOkay());
  }
}