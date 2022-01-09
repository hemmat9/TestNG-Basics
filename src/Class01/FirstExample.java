package Class01;


import org.testng.annotations.Test;

public class FirstExample {//if we execute from class leve it will execute all the tests

    @Test
    public void firstTest(){
       // System.out.println(10/0); faliur test case
        System.out.println("I am first test");

    }
    @Test
    public void secondTest(){
        System.out.println("I am second test");
    }
    @Test //if we don't have the annotation then it is not considered as a test.
    public void thirdTest(){
        System.out.println("I am third test");//it excecutes the test in Alphabetical order
    }

}
