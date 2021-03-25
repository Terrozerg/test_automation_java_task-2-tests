package com.epam.test.automation.java.practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void task1PassTest(){
        Assert.assertEquals(4,Main.task1(1234));
        Assert.assertEquals(0,Main.task1(246));
    }

    @Test
    public void task1BordersTest(){
        Assert.assertEquals(0,Main.task1(0));
        Assert.assertEquals(0,Main.task1(-1));
        Assert.assertEquals(18,Main.task1(Integer.MAX_VALUE));
    }

    @Test
    public void task2PassTest(){
        Assert.assertEquals(3,Main.task2(14));
        Assert.assertEquals(1,Main.task2(128));
    }

    @Test
    public void task2BordersTest(){
        Assert.assertEquals(0,Main.task2(0));
        Assert.assertEquals(0,Main.task2(-1));
        Assert.assertEquals(31,Main.task2(Integer.MAX_VALUE));
    }

    @Test
    public void task3PassTest(){
        Assert.assertEquals(33,Main.task3(8));
        Assert.assertEquals(143,Main.task3(11));
    }

    @Test
    public void task3BordersTest(){
        Assert.assertEquals(0,Main.task3(0));
        Assert.assertEquals(0,Main.task3(1));
        Assert.assertEquals(1836311902,Main.task3(45));
    }

    @Test
    public void task3FailTest(){
        Assert.assertEquals(-1,Main.task3(66));
    }
}
