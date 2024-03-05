package testng.annotations;

import org.testng.annotations.*;

public class AfterClassBeforeClassAnnotation {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void method1(){
        System.out.println("Before Method 1");
    }

    @Test
    public void testCase1(){
        System.out.println("test Case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("test Case 2");
    }

    @AfterMethod
    public void afterMethod1(){
        System.out.println("After Method 1");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }

}
