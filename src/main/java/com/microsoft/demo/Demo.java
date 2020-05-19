package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }

    public void doSomethingElse(String test) {
        if(test.equals("Hello")) {
            System.out.println("Hello");
            return;
        }

        System.out.println("Ciao");
    }
}