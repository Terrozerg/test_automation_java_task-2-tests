package com.epam.test.automation.java.practice2;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int value) {
        int result = 0;
        while(value>0){
            int temp = value%10;

            if((temp&1)!=0){
                result+=temp;
            }
            value=value/10;
        }
        return result;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int value) {
        int result=0;
        while(value>0){
            int temp = value%2;

            if(temp==1){
               result++;
            }
            value=value/2;
        }
        return result;
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {
        if(value>45){
            System.out.println("Integer overflow for value: "+value+", put value < 46.");
            return -1;
        }
        int result = 0;
        int last = 0;
        int curr = 1;
        while(value>0){
            int temp = curr;
            result+=last;

            curr=curr+last;
            last=temp;

            value--;
        }
        return result;
    }
}
