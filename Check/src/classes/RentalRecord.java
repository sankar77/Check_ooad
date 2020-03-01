package classes;

import java.util.ArrayList;
import java.util.List;

import patterns.Decorator;

public class RentalRecord {
    public int dayofBuying;
    boolean status;
    public RentalRecord(int buyDay){
        this.dayofBuying=buyDay;
        this.status=true;
    }
    public List<Decorator> decoratorOptions=new ArrayList<Decorator>();

    public List<Decorator> getDecoratorOptions() {
        return decoratorOptions;
    }

    public void addDecoratorOptions(Decorator decoratorOption){
        decoratorOptions.add(decoratorOption);
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status=status;
    }

    public int getTotalPrice(){
        int total=0;
        for (int i=0;i<decoratorOptions.size();i++){
            total=total+decoratorOptions.get(i).quotePrice();
        }
        return total;
    }

    public void returnCar(Customer cus){
        for(int i=0;i<decoratorOptions.size();i++){
            Decorator dec=decoratorOptions.get(i);
            while (!dec.getClass().getSimpleName().equals("Economy") && !dec.getClass().getSimpleName().equals("SUV") && 
                    !dec.getClass().getSimpleName().equals("MiniVan") && !dec.getClass().getSimpleName().equals("Luxury") &&
                    !dec.getClass().getSimpleName().equals("GPS")) {
                        if(dec.car instanceof Decorator) {
                            dec=(Decorator) dec.car;
                        }
                        else {
                            break;
                        }
            dec.car.onReturn();
            System.out.println(dec.car.name+"returned by customer"+ cus.name);
                    }
        }
        
    }
}