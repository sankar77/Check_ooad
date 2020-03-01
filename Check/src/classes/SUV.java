package classes;

public class SUV extends Car{
    public static int price = 9;

    public static int count = 5;
    
    public String id;

    private SUV(String name,int num_days,String id){
        this.name = name;
        this.num_days = num_days;
        this.id = id;
    }
    public static SUV createInstance(String name,int num_days,String id){
        if(count>=1){
            count = count-1;
            return new SUV(name,num_days,id);
        }
        else{
            return null;
        }

    }
    public int quotePrice(){
        return price*num_days;
    }
    public int getCount(){
        return count;
    }
    public void onReturn(){
        if(count<5)
            count = count+1;
    }
}