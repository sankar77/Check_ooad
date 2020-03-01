package patterns;

import classes.Car;
import classes.ChildSeat;
import classes.Economy;
import classes.GPS;
import classes.Luxury;
import classes.MiniVan;
import classes.SUV;
import classes.SatelliteRadio;
import classes.Standard;

public class CategoryFactory{
    public static Car getCar(String type, String name,int num_days,String id) {
            if(type.equals("Economy"))
                return Economy.createInstance(name,num_days,id);
            else if(type.equals("Standard"))
                return Standard.createInstance(name,num_days,id);
            else if(type.equals("Luxury"))
                return Luxury.createInstance(name,num_days,id);
            else if(type.equals("SUV"))
                return SUV.createInstance(name,num_days,id);
            else if(type.equals("MiniVan"))
                return MiniVan.createInstance(name,num_days,id);
            else
            return null;

        
    }
    public static Car addonoption(String type,String name,Car car,int numDays){
        if(type.equals("ChildSeat"))
            return new ChildSeat(numDays,car,name);
        else if(type.equals("GPS"))
            return new GPS(numDays,car,name);
        else if(type.equals("SatelliteRadio"))
            return new SatelliteRadio(numDays,car,name);
        else
		return null;
    }
}