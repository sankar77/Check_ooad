package patterns;

import classes.Car;

public class Decorator extends Car{
    public int price;
    //public int num_days;
    public Car car;
   // String name;

    public Decorator(int num_days,Car car,String name,int price){
        this.price = price;
        this.num_days = num_days;
        this.car = car;
        this.name = name;
    }

    public int quotePrice(){
        return this.price+car.quotePrice();
    }

    
	@Override
	public void onReturn() {
		// TODO Auto-generated method stub
		
	}
}