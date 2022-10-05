package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class HookClass {

//    @BeforeAll
//    public static void beforeAll() {
//        System.out.println("setup database");
//    }
//
//    @AfterAll
//    public static void afterAll() {
//        System.out.println("close database");
//    }

    @Before("@staging")
    public void setUp2(){
        System.out.println("Setup second browser");
    }

    @Before(order =0)
    public void setUp() {
        System.out.println("setup browser");
    }

    @After(order =1)
    public void tearDown() {
        System.out.println("exit browser");
    }
    @After("@staging")
    public void tearDown2() {
        System.out.println("exit 2nd browser");
    }
}
