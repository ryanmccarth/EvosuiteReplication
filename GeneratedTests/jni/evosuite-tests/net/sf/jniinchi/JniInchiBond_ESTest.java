/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 24 19:35:13 GMT 2020
 */

package net.sf.jniinchi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.jniinchi.INCHI_BOND_STEREO;
import net.sf.jniinchi.INCHI_BOND_TYPE;
import net.sf.jniinchi.INCHI_RADICAL;
import net.sf.jniinchi.JniInchiAtom;
import net.sf.jniinchi.JniInchiBond;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JniInchiBond_ESTest extends JniInchiBond_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2UP;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      JniInchiAtom jniInchiAtom0 = jniInchiBond0.getTargetAtom();
      assertNull(jniInchiAtom0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-1624.2034958671538), (-1624.2034958671538), (-1624.2034958671538), "W{!");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals((-1), jniInchiAtom1.getImplicitH());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("-");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      jniInchiAtom0.setIsotopicMass(1);
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(0, jniInchiAtom1.getImplicitProtium());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("OIu<_rh#w<\"GFC$");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      jniInchiAtom0.setIsotopicMass((-982));
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(INCHI_RADICAL.NONE, jniInchiAtom1.getRadical());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(1.0, 1.0, 1.0, " D:");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2UP;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      jniInchiAtom0.setImplicitTritium(381);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(0, jniInchiAtom1.getImplicitProtium());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("~>KLH,7");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, (-2262), (-2262));
      jniInchiAtom0.setImplicitTritium((-2262));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(0.0, jniInchiAtom1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      jniInchiAtom0.setImplicitProtium(153);
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, 153, 153);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals((-1), jniInchiAtom1.getImplicitH());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("] Charge:");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2DOWN;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      jniInchiAtom0.setImplicitProtium((-1459));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(0, jniInchiAtom1.getImplicitDeuterium());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      jniInchiAtom0.setImplicitH(0);
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, 153, 153);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(0.0, jniInchiAtom1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("-");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      jniInchiAtom0.setImplicitH(1);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(0, jniInchiAtom1.getIsotopicMass());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("-");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      jniInchiAtom0.setImplicitDeuterium(1);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(0.0, jniInchiAtom1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("~>KLH,7");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, (-2262), (-2262));
      jniInchiAtom0.setImplicitDeuterium((-2262));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(INCHI_RADICAL.NONE, jniInchiAtom1.getRadical());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("6TnCO@M! z&U}");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      jniInchiAtom0.setCharge(2);
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.DOUBLE_EITHER;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals(0.0, jniInchiAtom1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("OIu<_rh#w<\"GFC$");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      jniInchiAtom0.setCharge((-982));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertEquals((-1), jniInchiAtom1.getImplicitH());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0);
      JniInchiAtom jniInchiAtom0 = jniInchiBond0.getOriginAtom();
      assertNull(jniInchiAtom0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("-");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      jniInchiAtom0.setIsotopicMass(1);
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals(0.0, jniInchiAtom1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("OIu<_rh#w<\"GFC$");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      jniInchiAtom0.setIsotopicMass((-982));
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals(0, jniInchiAtom1.getImplicitTritium());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(1.0, 1.0, 1.0, " D:");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2UP;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      jniInchiAtom0.setImplicitTritium(381);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals((-1), jniInchiAtom1.getImplicitH());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("~>KLH,7");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, (-2262), (-2262));
      jniInchiAtom0.setImplicitTritium((-2262));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals((-1), jniInchiAtom1.getImplicitH());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("Jq{E)W");
      jniInchiAtom0.setImplicitProtium(3);
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, (-6), (-6));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals(0, jniInchiAtom1.getCharge());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("] Charge:");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2DOWN;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      jniInchiAtom0.setImplicitProtium((-1459));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals("] Charge:", jniInchiAtom1.getElementType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-2835.34965), (-2835.34965), (-2835.34965), "DOUBLET");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      jniInchiAtom0.setImplicitH(0);
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals((-2835.34965), jniInchiAtom1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("-");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      jniInchiAtom0.setImplicitH(1);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals(0, jniInchiAtom1.getCharge());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(0.0, (-1634.9306379044), 0.0, "BA[");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.ALTERN;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_1UP;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      jniInchiAtom0.setImplicitDeuterium(3611);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals(0.0, jniInchiAtom1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("~>KLH,7");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, (-2262), (-2262));
      jniInchiAtom0.setImplicitDeuterium((-2262));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertSame(jniInchiAtom0, jniInchiAtom1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("6TnCO@M! z&U}");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      jniInchiAtom0.setCharge(2);
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.DOUBLE_EITHER;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertSame(jniInchiAtom0, jniInchiAtom1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("OIu<_rh#w<\"GFC$");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      jniInchiAtom0.setCharge((-982));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertSame(jniInchiAtom0, jniInchiAtom1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-2835.34965), (-2835.34965), (-2835.34965), "DOUBLET");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      int int0 = jniInchiBond0.getInchiBondType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("OIu<_rh#w<\"GFC$");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      int int0 = jniInchiBond0.getInchiBondType();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("-");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.DOUBLE_EITHER;
      jniInchiBond0.setStereoDefinition(iNCHI_BOND_STEREO0);
      int int0 = jniInchiBond0.getInchiBondStereo();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(1.0, 1.0, 1.0, " D:");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2UP;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      int int0 = jniInchiBond0.getInchiBondStereo();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, 153, 153);
      jniInchiBond0.getBondType();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("uMz-^z82ptxK*Y:a");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2UP;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      INCHI_BOND_TYPE iNCHI_BOND_TYPE1 = jniInchiBond0.getBondType();
      assertSame(iNCHI_BOND_TYPE0, iNCHI_BOND_TYPE1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(";=.yQ~I.q='");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, (-2581), (-1094));
      jniInchiBond0.getBondStereo();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(0.0, 0.0, 0.0, "a;Ji/Mw @2/");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, 1, 1);
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = jniInchiBond0.getBondStereo();
      assertEquals(INCHI_BOND_STEREO.SINGLE_1UP, iNCHI_BOND_STEREO0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("] Charge:");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2DOWN;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      INCHI_BOND_STEREO iNCHI_BOND_STEREO1 = jniInchiBond0.getBondStereo();
      assertSame(iNCHI_BOND_STEREO0, iNCHI_BOND_STEREO1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(0.0, (-1132.9130292772772), (-1132.9130292772772), "]R*XoA08");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, 1415, 474);
      // Undeclared exception!
      try { 
        jniInchiBond0.getInchiBondStereo();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.jniinchi.JniInchiBond", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, 10000, 10000);
      // Undeclared exception!
      try { 
        jniInchiBond0.getDebugString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.jniinchi.JniInchiBond", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_2UP;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      // Undeclared exception!
      try { 
        jniInchiBond0.debug();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.jniinchi.JniInchiBond", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-2835.34965), (-2835.34965), (-2835.34965), "DOUBLET");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      String string0 = jniInchiBond0.getDebugString();
      assertEquals("InChI Bond: DOUBLET-DOUBLET // Type: NONE // Stereo: NONE", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("Q*{");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      int int0 = jniInchiBond0.getInchiBondStereo();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("Q*{");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      jniInchiBond0.debug();
      assertEquals(INCHI_BOND_TYPE.NONE, jniInchiBond0.getBondType());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("Q*{");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      INCHI_BOND_TYPE iNCHI_BOND_TYPE1 = jniInchiBond0.getBondType();
      assertEquals(INCHI_BOND_TYPE.NONE, iNCHI_BOND_TYPE1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("Q*{");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = jniInchiBond0.getBondStereo();
      assertEquals(0, iNCHI_BOND_STEREO0.getIndx());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, 153, 153);
      // Undeclared exception!
      try { 
        jniInchiBond0.getInchiBondType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.jniinchi.JniInchiBond", e);
      }
  }
}
