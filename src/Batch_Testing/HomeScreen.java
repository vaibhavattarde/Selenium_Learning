package Batch_Testing;

import org.testng.annotations.Test;

public class HomeScreen {
    @Test
    public void LaunchApplication()
    {
        System.out.println("LAUNCH APPLICATION SUCCESSFULLY");
    }
    @Test
    public void VerifyLogo()
    {
        System.out.println("LOGO VERIFIED SUCCESSFULLY");
    }
    @Test
    public void VerifyTitle()
    {
        System.out.println("TITLE VERIFIED SUCCESSFULLY");
    }
}
