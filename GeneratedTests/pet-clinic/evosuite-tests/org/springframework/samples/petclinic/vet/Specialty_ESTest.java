/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 26 22:29:12 GMT 2020
 */

package org.springframework.samples.petclinic.vet;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.vet.Specialty;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Specialty_ESTest extends Specialty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Specialty specialty0 = new Specialty();
      assertNull(specialty0.getName());
  }
}
