package Class02;

import org.testng.annotations.Test;

public class EnableAndDisable {
    @Test(enabled = true)
    public void firstTest(){
        System.out.println("I am the first");
    }
    @Test(enabled = false)//it will not execute the test because we set the attribute to false we do it if there is a bug or issue in the test and we don't want it to be executed
    public void secondTest(){
        System.out.println("I am the second");
    }
    @Test(enabled = true)
    public void thirdTest(){
        System.out.println("I am the third");
    }
}
