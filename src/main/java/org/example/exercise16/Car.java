package org.example.exercise16;

public class Car {

    private double tank;
    private final double consume = 15;

    public Car() {

    }

    public Car(double tank) {
        this.tank = tank;

    }
    public static void play(){


        Car car1 = new Car();
        Car car2 = new Car();

        car1.fill(-1);
        car2.fill(30);

        car1.ride(200);
        car2.ride(400);
    }

    public void fill(double gas) {
        if (gas < 50 && tank < 50) {
            this.tank = gas;
        }else tank = 50;
        if (gas < 0 ){
                tank = 0;
        }

    }

    public void ride(double distance) {
        double calc = ((tank * consume) - distance) / consume;
        if (tank * 15   > distance) {
            System.out.printf("You drive %.0fkm and you have %.2fl%n", distance ,calc);
        }else System.out.println("You drive " + (tank * 15) + "km and you are out of gas");
    }



    public void setTank(double tank) {
        if (tank < 0) {
            this.tank = 0;
        } else this.tank = tank;

    }


    public double getTank() {
        return tank;
    }

    public double getConsume() {
        return consume;
    }
}
