package classes;

import patterns.Decorator;

public class GPS extends Decorator{
    public static int price = 25;
    public GPS(int num_days,Car car,String name){
    	super(num_days,car,name,price);
    }
}
