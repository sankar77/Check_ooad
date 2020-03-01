package classes;

public class Luxury extends Car{
    public static int price = 10;

    public static int count = 2;
    
    public String id;

    private Luxury(String name,int num_days,String id){
        this.name = name;
        this.num_days = num_days;
        this.id = id;
    }
    public static Luxury createInstance(String name,int num_days,String id){
        if(count>=1){
            count = count-1;
            return new Luxury(name,num_days,id);
        }
        else{
            return null;
        }

    }
    public int quotePrice(){
        return price*num_days;
    }
    
    public void onReturn(){
        if(count<5)
            count = count+1;
    }
}