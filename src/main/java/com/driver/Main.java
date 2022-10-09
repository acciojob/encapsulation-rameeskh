package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw=new RWOnly();

//        System.out.println(rw.name);
        //java: name has private access in com.driver.RWOnly

//        System.out.println(rw.getName());

        rw.setName("Ricardo Kaka");
        System.out.println(rw.getName());
    }
}