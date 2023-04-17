public class MyProgram {

    public static void main(String[] args){
        Product phone1 = new Product("iPhone X", 100.00, 10, true);
        Product phone2 = new Product("Samsung Galaxy S22", 100.00, 20, true);
        Product phone3 = new Product("Nokia Brick", 20.00, 100, true);
        Product phone4 = new Product();

        //Setting up Default Constructor
        phone4.setProductName("Xiaomi");
        phone4.setProductAmount(4);
        phone4.setProductPrice(50);
        phone4.setProductisSold(false); //I think I can set up a loop with If test to check whether device is sold or not, then decide whether to calculate or just return a message saying device is not sold at this store. Ran out of time so I could not implement it


        //Output here
       System.out.println(phone1.getProductName() + " sold " + phone1.getProductAmount() + " pieces for a total of $" + phone1.getProductAmount()*phone1.getProductPrice());
       System.out.println(phone2.getProductName() + " sold " + phone2.getProductAmount() + " pieces for a total of $" + phone2.getProductAmount()*phone2.getProductPrice());
       System.out.println(phone3.getProductName() + " sold " + phone3.getProductAmount() + " pieces for a total of $" + phone3.getProductAmount()*phone3.getProductPrice());
       System.out.println(phone4.getProductName() + " sold " + phone3.getProductAmount() + " pieces for a total of $" + phone3.getProductAmount()*phone3.getProductPrice());

    }
}
