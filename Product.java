class Product {
    


    //Declaring variables 
    private String productName;
    private double productPrice;
    private int productAmount;
    private boolean productisSold;

    //Default Constructor
    public Product(){
    }

    //Parameterized Constructor
    public Product (String name, double price, int amount, boolean isSold){
        productName = name;
        productPrice = price;
        productAmount = amount;
        productisSold = isSold;
    }


    //Getters and Setters
    public String getProductName (){
        return productName;
    }

    public void setProductName (String newName){
        productName = newName;
    }

    public double getProductPrice (){
        return productPrice;
    }

    public void setProductPrice (double newPrice){
        productPrice = newPrice;
    }

    public int getProductAmount (){
        return productAmount;
    }

    public void setProductAmount (int newAmount){
        productAmount = newAmount;
    }

    public boolean getProductisSold (){
        return productisSold;
    }

    public void setProductisSold (boolean newisSold){
        productisSold = newisSold;
    }
}
