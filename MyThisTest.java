package com.company;

public class MyThisTest {
    private int a;

    public MyThisTest() {
        this(1);
    }

    public MyThisTest(int a) {
        this.a = a;
    }

    public void frobnicate() {
        int a = 1;

        System.out.println(a);
        System.out.println(this.a);
        System.out.println(this);
    }

    public String toString() {
        return "MyThisTestwow a=" + a;
    }

    public static void main(String[] args) {
        MyThisTest myThisTest=new MyThisTest();
        myThisTest.frobnicate();
    }
}

