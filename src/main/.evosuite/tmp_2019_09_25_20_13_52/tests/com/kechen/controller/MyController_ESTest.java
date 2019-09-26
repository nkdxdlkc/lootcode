/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 26 00:18:41 GMT 2019
 */

package com.kechen.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.kechen.controller.MyController;
import com.kechen.domain.Company;
import com.kechen.domain.Problem;
import com.kechen.domain.User;
import com.kechen.repository.CodeRepository;
import com.kechen.repository.CompanyRepository;
import com.kechen.repository.NoteRepository;
import com.kechen.repository.ProblemRepository;
import com.kechen.repository.UserRepository;
import com.kechen.service.ProblemService;
import com.kechen.service.UserService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyController_ESTest extends MyController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      doReturn((List<Problem>) null).when(problemService0).getProblemByTag(anyString());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      ResponseEntity<Iterable<Problem>> responseEntity0 = (ResponseEntity<Iterable<Problem>>)myController0.listByTag("password");
      assertFalse(responseEntity0.hasBody());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.updateCode((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.signup((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.login((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository1 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      doReturn((Company) null).when(companyRepository1).findByCompanyName(anyString());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository1);
      ProblemRepository problemRepository1 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository1);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = new UserService();
      UserRepository userRepository1 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(userService0, (Class<?>) UserService.class, "userRepository", (Object) userRepository1);
      Injector.validateBean(userService0, (Class<?>) UserService.class);
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.listByCompany(" AS FUNCTION_TYPE, ROUTINE_NAME AS SPECIFIC_NAME FROM INFORMATION_SCHEMA.ROUTINES ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.service.ProblemService", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      doReturn((List<Problem>) null).when(problemService0).getAllProblems();
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.list();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.insertProblem((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.getOneProblem((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.delete((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      Problem problem0 = mock(Problem.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null).when(problem0).getPcodeSet();
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      doReturn(problem0).when(problemRepository0).findByProblemId(anyInt());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.deleteProblem((-3772));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(problemService0).getAllProblems();
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.list();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = mock(ProblemService.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemService", (Object) problemService0);
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "userRepository", (Object) userRepository0);
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null).when(user0).getPcSet();
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      doReturn(user0).when(userService0).findById(anyInt());
      Injector.inject(myController0, (Class<?>) MyController.class, "userService", (Object) userService0);
      Injector.validateBean(myController0, (Class<?>) MyController.class);
      // Undeclared exception!
      try { 
        myController0.getOneProblemq((-789), 404);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MyController myController0 = new MyController();
      CodeRepository codeRepository0 = mock(CodeRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "codeRepository", (Object) codeRepository0);
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "companyRepository", (Object) companyRepository0);
      NoteRepository noteRepository0 = mock(NoteRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "noteRepository", (Object) noteRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(myController0, (Class<?>) MyController.class, "problemRepository", (Object) problemRepository0);
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository1 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        myController0.listByTag("%s28eK");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.controller.MyController", e);
      }
  }
}