package classes;

import patterns.Decorator;

public class SatelliteRadio extends Decorator{
    public static int price = 22;
    public SatelliteRadio(int num_days,Car car,String name){
    	super(num_days,car,name,price);
    }
}