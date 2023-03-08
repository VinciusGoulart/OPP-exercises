package org.example.exercise13;

public class Calc {

    private  double x;
    private double y;

    private Calc() {

    }

    public Calc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double sum(double x,double y){
        this.x = x;
        this.y = y;

        return this.x + this.y;
    }

    public double sub(double x,double y){
        this.x = x;
        this.y = y;

        return this.x - this.y;
    }

    public double times(double x,double y){
        this.x = x;
        this.y = y;

        return this.x * this.y;
    }

    public double div(double x,double y){
        this.x = x;
        this.y = y;

        return this.x / this.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
