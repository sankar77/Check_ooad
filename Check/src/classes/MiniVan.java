package classes;

public class MiniVan extends Car{
    public static int price = 8;

    public static int count = 6;
    
    public String id;

    private MiniVan(String name,int num_days,String id){
        this.name = name;
        this.num_days = num_days;
        this.id = id;
    }
    public static MiniVan createInstance(String name,int num_days,String id){
        if(count>=1){
            count = count-1;
            return new MiniVan(name,num_days,id);
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