package classes;

import patterns.Decorator;

public class ChildSeat extends Decorator{
    public static int price = 20;
    public ChildSeat(int num_days,Car car,String name){
        super(num_days,car,name,price);
    }

}