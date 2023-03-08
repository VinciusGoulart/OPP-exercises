package org.example.exercise13;

public class ScientificCalc extends Calc{


    public ScientificCalc(double x, double y){
        super(x, y);
    }

    public static void play(){

        Calc calc = new Calc(25,4);

        System.out.println(calc.sum(calc.getX(), calc.getY()));
        System.out.println(calc.sub(calc.getX(), calc.getY()));
        System.out.println(calc.times(calc.getX(), calc.getY()));
        System.out.println(calc.div(calc.getX(), calc.getY()));

        ScientificCalc  scalc = new ScientificCalc(calc.getX(), calc.getY());

        System.out.println(scalc.pow(calc.getX(), calc.getY()));
        scalc.sqrd(scalc.getX(), scalc.getY());
    }

    public double pow(double x, double y) {
//        this.x =x;
//        this.y = y;
        return Math.pow(x,y);
    }
    public void sqrd(double x,double y){
//        this.x = x;
//        this.y = y;

        System.out.printf("x= %.2f   y= %.2f%n",Math.sqrt(x) ,Math.sqrt(y));;
    }
}
