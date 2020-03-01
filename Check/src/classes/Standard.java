package classes;
public class Standard extends Car{
    public static int price = 7;

    public static int count = 6;

    public String id;
    private Standard(String name,int num_days,String id){
        this.name = name;
        this.num_days = num_days;
        this.id = id;
    }
    public static Standard createInstance(String name,int num_days,String id){
        if(count>=1){
            count = count-1;
            return new Standard(name,num_days,id);
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