public class VendingWorld {
    public static void main(String[] args) {
        VendingMachine cseVendingMachine = new VendingMachine();
        VendingMachine eeeVendingMachine = new VendingMachine();
        System.out.println();
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
        VendingItem boughtItem = cseVendingMachine.vend(0);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
        boughtItem = cseVendingMachine.vend(3);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
        boughtItem = cseVendingMachine.vend(6);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        boughtItem = cseVendingMachine.vend(9);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        boughtItem = cseVendingMachine.vend(20);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println("null");

        boughtItem = eeeVendingMachine.vend(0);
        System.out.println(boughtItem);
        System.out.println(eeeVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(eeeVendingMachine.getTotalItems());
        System.out.println(eeeVendingMachine.getTotalValue());
        System.out.println();

        VendingItem item1 = new VendingItem("Pepsi", "d", 1.5);
        cseVendingMachine.stock(item1);
        System.out.println(cseVendingMachine);
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

        VendingItem item2 = new VendingItem("Fanta", "d", 1.15);
        VendingItem item3 = new VendingItem("Cadbery", "p", 0.46);
        VendingItem item4 = new VendingItem("Bournville", "p", 0.65);
        VendingItem[] items = {item2, item3, item4};
        cseVendingMachine.stock(items);
        System.out.println(cseVendingMachine);
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();

     String items2=cseVendingMachine.getItems(1);
        System.out.println(items2);

       String Items3= cseVendingMachine.getItems("d");
        System.out.println(Items3);

        VendingItem cheapesItem = cseVendingMachine.getCheapestItems("d");
        System.out.println(cheapesItem);
    }
    }
