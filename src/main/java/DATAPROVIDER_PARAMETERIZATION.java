package main.java;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATAPROVIDER_PARAMETERIZATION {
    @Test(dataProvider = "getdata")
    public void data(String Username,String Password)
    {
        System.out.println("YOU HAVE TO RUN THIS TEST CASES THIRD TIME");
    }
@DataProvider
    public Object[][] getdata()
    {
        Object[][] data =new Object[3][2];
      //1st set
        data[0][0]="newloginid";
        data[0][1]="newpassword";
        //2nd set
        data[1][0]="newloginid--2";
        data[1][1]="newpassword--2";
        //3rd set
        data[2][0]="newloginid--3";
        data[2][1]="newpassword--3";
        return data;
    }
}
