public class VendingMachine {
    private static double totalSales ;
    private int totalItems;
    private VendingItem[] shelf;

    public VendingMachine() {
         shelf = new VendingItem[10];
        totalItems= 10;
         totalSales= 0;
        restock();
    }

    public void stock(VendingItem item) {
     if(totalItems == shelf.length){
         System.out.println("Error");
     }
     else{
         shelf[totalItems-1]=item;
         totalItems++;
         System.out.println("Items Added: " +item);
     }
    }

    public void stock(VendingItem[] item) {
        if(totalItems == shelf.length){
            System.out.println("Full");

        }
        else{
            System.out.println("Item Added: ");

            for(int i =0; i<item.length;i++ ){
                if(totalItems != shelf.length){
                    shelf[totalItems -1] = item[i];
                    totalItems++;
                }
                System.out.println( item[i]+ ", ");

            }
            System.out.println();
        }


    }

    public VendingItem vend(int code) {
        if (code > shelf.length ) {
            return null;
        }
        else if( code < 0 ){
            return null;
        }
        else if( code > totalItems){
            return null;
        }
        else {
            VendingItem item = shelf[code];
            totalSales += item.getPrice();
            for (int i = code; i < totalItems - 1; i++) {
                shelf[i] = shelf[i + 1];
                shelf[i + 1] = null;
            }
            totalItems--;
            return item;
        }
    }
    public void restock() {
        shelf[0] = new VendingItem("Lays", "c", 1.50);
        shelf[1] = new VendingItem("Doritos", "c", 1.50);
        shelf[2] = new VendingItem("Coke", "d", 2.50);
        shelf[3] = new VendingItem("Rubiks Cube", "s", 30);
        shelf[4] = new VendingItem("Pie", "p", 3.14);
        shelf[5] = new VendingItem("Clicker", "s", 55.55);
        shelf[6] = new VendingItem("Cheetos", "c", 1.25);
        shelf[7] = new VendingItem("Cold Pizza", "p", 0.99);
        shelf[8] = new VendingItem("Graphing Calculator", "s", 120);
        shelf[9] = new VendingItem("Ramen", "n", 3.15);
    }

    public static double getTotalSales() {
        return totalSales;
    }

    public int getTotalItems() {
        return totalItems;
    }
    public double getTotalValue() {
       double totalValue = 0;
       for(int i = 0; i< totalItems; i++ ){
           if(shelf[i] !=null){
               totalValue +=shelf[i].getPrice();
           }
       }
       return totalValue;
    }

    public String getItems(int val) {
        String item = new String();

        for (int i = 0; i < totalItems; i++) {
            if (shelf[i] != null && shelf[i].getPrice() < val) {

                item += shelf[i].getName();

            }
        }
             return item.toString();
            }


    public String getItems(String t) {
      String item = new String();

      for(int i=0; i<totalItems;i++){
          if(shelf[i] != null && shelf[i].getType()==t){

              item += shelf[i].getName();

          }
      }
       return item.toString();
    }



    public VendingItem getCheapestItems(String t) {
     VendingItem cheapestItem= shelf[0];

     for(int i= 0; i<totalItems; i++){
         if(shelf[i] !=null && shelf[i].getPrice() < cheapestItem.getPrice() && shelf[i].getType()==t){
             cheapestItem = shelf[i];
         }
     }
        return cheapestItem;
    }

    public String toString() {
        String item = new String();
         String tem= " ";
        for(int i = 0; i<totalItems;i++){
            if(shelf[i]!=null){
                item +=tem;
                item += shelf[i].getName();
                tem=",";
            }
        }
         return item.toString();
    }

}
