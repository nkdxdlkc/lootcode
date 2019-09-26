/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 26 00:19:54 GMT 2019
 */

package com.kechen;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.kechen.MainApplication;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MainApplication_ESTest extends MainApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "com.kechen.MainApplication";
      stringArray0[3] = "";
      stringArray0[4] = "spring.boot.enableautoconfiguration";
      stringArray0[5] = "";
      stringArray0[6] = " `$4<Tfey%|ew";
      stringArray0[7] = "";
      // Undeclared exception!
      MainApplication.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        MainApplication.main((String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Args must not be null
         //
         verifyException("org.springframework.util.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        MainApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.core.env.SimpleCommandLineArgsParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MainApplication mainApplication0 = new MainApplication();
  }
}