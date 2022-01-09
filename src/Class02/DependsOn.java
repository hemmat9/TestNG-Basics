package Class02;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
       /* System.out.println("I am login Test");*/
        System.out.println(10/0);//if one case fails it will scape another case which depends on it
    }
    @Test (dependsOnMethods = "login")
    public void verificationOfDashboard(){
        System.out.println("I am dependent scenario");
    }
}
