package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.retryanalysis.IRetryAnalyserExample;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin() {
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }

    @Test
    public void verifyLogin2() {
        Assert.assertTrue(false);
        System.out.println("Verify Login 2");
    }

    @Test
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyFundsTransfer() {
        System.out.println("Verify Funds Transfer");
    }

    @Test
    public void verifyMyCashBackOffer() {
        System.out.println("Verify my cashback offer");
    }

}
