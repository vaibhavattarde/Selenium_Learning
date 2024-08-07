package TestNg;

import org.testng.annotations.Test;

public class GROUP_BY {
    @Test(groups = "software criteria")
    public void WIPRO()
    {
        System.out.println("WIPRO SW CMPNY");
    }
    @Test(groups = "software criteria")
    public void TCS()
    {
        System.out.println("TCS SW CMPNY");
    }
    @Test(groups = "Automobile criteria")
    public void HONDA()
    {
        System.out.println("HONDA  CMPNY");
    }
    @Test(groups = "Automobile criteria")
    public void HERO()
    {
        System.out.println("HERO  CMPNY");
    }
}
