public class VendingItem {
    private String name;
    private double price;
    private String type;

    VendingItem(String name, String type, double price){
        this.name= name;
        this.type= type;
        this.price=price;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return  name + ": "+price;
    }
}
