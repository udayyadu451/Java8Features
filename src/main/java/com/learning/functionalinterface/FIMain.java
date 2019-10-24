package com.learning.functionalinterface;

public class FIMain {

    public static void main(String [] args){

        FIDemo fid = new FIDemo() {
            @Override
            public void greet(String name) {
                System.out.println("Hello" + name);
            }
        };

        fid.greet("uday");

        //Lambdas makes implement above code easily
        //with variable , variable type, no args

        FIDemo fid1 = (String name)  -> {
            System.out.println("Hello" + name);
        };

        fid1.greet("uday");
        FIDemo fid2 = (name)  -> {
            System.out.println("Hello" + name);
        };

        fid2.greet("uday");


    }
}
