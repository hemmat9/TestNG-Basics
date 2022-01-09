package Class01.Practice;
import org.testng.annotations.*;
/*
* What is TestNg? TestNg is a unit testing tool, it is a unit test framework designed for testing needs, it is desigened to cover
* all categoris of tests like unit, funtional, and integration tests.
* what is a unit test? it is the smallest tastalbe part of a software.
* what is a functional test? Functional testing is a quality assurance testing, and it is a kind of black-box testing,
* it is used to verify the functionality of a software.
* what is integration testing; while a new feature is added to the existing program or software, then we proform integration test to make sure
* that the new feature is not effecting the software, and they can cope with eachother.
*
* why do we need TestNG ?
*
* generates Reports of tests
* can preform Parrellal testing
* Annotation based execution made it easy for testers
* test cases can be Grouped and prioritized for executoin
* data driven testing can be performed
* we have multiple options for execution
* it can easily be integrated with different tools like Selenium, Maven , cocumber etc...
*
* @(Annotaions in testNG)
* to execute our testng scripts we don't need separate classe or Main method, because we are not runing our test useing JVM.
* we simply use annotation which are represented with @ symble.
* the most important annotation is @Test in testng, @Test annotation makes a method to run as the base for testng annotations
* */

public class Practice01 {
    @Test
    public void test1(){
        System.out.println("I am test one");
    }
    @Test
    public void test2(){
        System.out.println("I am test two");
    }
    @BeforeMethod //it is also called precondition if we have any methods that we need to execute before every test we have to specify it inside the @BeforMethod annotaion like url, maximizing, implicit wait
    public void beforTheMethod(){
        System.out.println("I am before the method");
    }
    @AfterMethod//it is also called postcondition if we have any methods to be executed after each test then we specify it inside the @AfterMethod annotaion like closing the browswer, taking screenshots
    public void afterTheMethod(){
        System.out.println("I am after the method");
    }
    @BeforeClass
    public void beforTheClass(){
        System.out.println("I am before the class method");
    }
    @AfterClass
    public void afterTheClass(){
        System.out.println("I am after the Class method");
    }
}
