package com.epam.test.automation.java.practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void task1PositiveIntegerTest(){
        Assert.assertEquals(4,Main.task1(1234));
        Assert.assertEquals(0,Main.task1(246));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void task1NegativeIntegerTest(){
        int res = Main.task1(-1);
    }

    @Test
    public void task1BordersTest(){
        Assert.assertEquals(18,Main.task1(Integer.MAX_VALUE));
    }

    @Test
    public void task2PositiveIntegerTest(){
        Assert.assertEquals(3,Main.task2(14));
        Assert.assertEquals(1,Main.task2(128));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void task2NegativeIntegerTest(){
        int res = Main.task2(-1);
    }

    @Test
    public void task2BordersTest(){
        Assert.assertEquals(31,Main.task2(Integer.MAX_VALUE));
    }

    @Test
    public void task3PositiveIntegerTest(){
        Assert.assertEquals(33,Main.task3(8));
        Assert.assertEquals(143,Main.task3(11));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void task3NegativeIntegerTest(){
        Main.task3(-1);
    }

    @Test
    public void task3BordersTest(){
        Assert.assertEquals(0,Main.task3(1));
        Assert.assertEquals(1836311902,Main.task3(45));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void task3IntegerOverflowTest(){
        Main.task3(66);

    }
}
