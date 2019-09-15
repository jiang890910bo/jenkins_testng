package com.demo.testng.demo_testng;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = DemoTestngApplication.class)
public class FirstTest extends AbstractTestNGSpringContextTests {

    @Test
    public void plusAddTest(){
        Assert.assertEquals(2, 1+1);
    }

    @Test
    public void minusAddTest(){
        Assert.assertEquals(0, 1-1);
    }

    @Test
    public void exceptionTest(){
        Assert.assertEquals(0, 1/0);
    }
}
