/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Apr 21 14:41:04 GMT 2020
 */

package org.apache.commons.csv;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CSVPrinter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.csv.CSVPrinter"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\ryanm\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\ryanm\\OneDrive\\desktop\\cs520\\EvosuiteReplication\\ReplicationProjects\\commonscsv\\commons-csv-1.8-src"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\ryanm"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ryanm"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CSVPrinter_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.csv.CSVParser$CSVRecordIterator",
      "org.apache.commons.csv.Token",
      "org.apache.commons.csv.Constants",
      "org.apache.commons.csv.CSVRecord",
      "org.apache.commons.csv.Assertions",
      "org.apache.commons.csv.QuoteMode",
      "org.apache.commons.csv.CSVFormat",
      "org.apache.commons.csv.Lexer",
      "org.apache.commons.csv.CSVParser",
      "org.apache.commons.csv.Token$Type",
      "org.apache.commons.csv.CSVFormat$Predefined",
      "org.apache.commons.csv.CSVParser$Headers",
      "org.apache.commons.csv.CSVFormat$1",
      "org.apache.commons.csv.CSVPrinter",
      "org.apache.commons.csv.ExtendedBufferedReader"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.ResultSet", false, CSVPrinter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.sql.ResultSetMetaData", false, CSVPrinter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CSVPrinter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.csv.CSVPrinter",
      "org.apache.commons.csv.Constants",
      "org.apache.commons.csv.CSVFormat",
      "org.apache.commons.csv.Assertions",
      "org.apache.commons.csv.CSVFormat$1",
      "org.apache.commons.csv.CSVParser",
      "org.apache.commons.csv.Token",
      "org.apache.commons.csv.Token$Type",
      "org.apache.commons.csv.Lexer",
      "org.apache.commons.csv.ExtendedBufferedReader",
      "org.apache.commons.csv.CSVParser$CSVRecordIterator",
      "org.apache.commons.csv.CSVParser$Headers",
      "org.apache.commons.csv.CSVFormat$Predefined",
      "org.apache.commons.csv.QuoteMode"
    );
  }
}
