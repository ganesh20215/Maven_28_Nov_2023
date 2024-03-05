package testng.annotations;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 1000, invocationTimeOut = 1)
    public void iCountExample(){
        System.out.println("I count Method");
    }
}
