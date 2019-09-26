/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 26 00:16:26 GMT 2019
 */

package com.kechen.IdClasses;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.kechen.IdClasses.UPId;
import com.kechen.domain.Problem;
import com.kechen.domain.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UPId_ESTest extends UPId_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UPId uPId0 = new UPId();
      User user0 = uPId0.getUser();
      assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UPId uPId0 = new UPId();
      UPId uPId1 = new UPId();
      assertTrue(uPId1.equals((Object)uPId0));
      
      Problem problem0 = mock(Problem.class, new ViolatedAssumptionAnswer());
      uPId0.setProblem(problem0);
      boolean boolean0 = uPId0.equals(uPId1);
      assertFalse(uPId1.equals((Object)uPId0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UPId uPId0 = new UPId();
      UPId uPId1 = new UPId();
      boolean boolean0 = uPId0.equals(uPId1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UPId uPId0 = new UPId();
      boolean boolean0 = uPId0.equals(uPId0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UPId uPId0 = new UPId();
      boolean boolean0 = uPId0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UPId uPId0 = new UPId();
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      uPId0.setUser(user0);
      UPId uPId1 = new UPId();
      boolean boolean0 = uPId0.equals(uPId1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UPId uPId0 = new UPId();
      Problem problem0 = uPId0.getProblem();
      assertNull(problem0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UPId uPId0 = new UPId();
      uPId0.hashCode();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(user0).toString();
      Problem problem0 = mock(Problem.class, new ViolatedAssumptionAnswer());
      UPId uPId0 = new UPId(user0, problem0);
      User user1 = uPId0.getUser();
      assertEquals(0, user1.getIsAdmin());
  }
}