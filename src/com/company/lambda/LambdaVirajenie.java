package com.company.lambda;

public class LambdaVirajenie {

    public static void main(String[] args) {
      /*  Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        Runnable runnable1 = ()->System.out.println("Hello");*/
        IMath iMath = new IMath() {
            @Override
            public double summ(double a, double b) {
                return a + b;
            }
        };
        System.out.println(iMath.summ(5,7));
        IMath iMath1 = (el1, el2) ->el1 + el2;
        System.out.println(iMath1.summ(6,7));
    }
}

