package classes;
import java.util.ArrayList;
import java.util.List;
public class Economy extends Car{

    public static int count = 5;

    public static int price = 10;
    
    public static List<String> ids = new ArrayList<String>(count);

    private Economy(String name,int num_days,String id){
        this.name = name;
        this.num_days = num_days;
        this.ids.add(id);

    }
    public static Economy createInstance(String name,int num_days,String id){
            if(count>=1){
                count = count-1;
                return new Economy(name,num_days,id);
                
            }
            else{
                return null;
            }
    }

    public int quotePrice(){
        return price*(this.num_days);
    }

    public int getCount(){
        return count;
    }
    public void onReturn(){
        if(count<6)
            count = count+1;
    }
}