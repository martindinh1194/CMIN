public class Employee2 {
    
    /*
     * Create a class with at least 4 attributes
     * with the appropriate getters & setters.
     * 
     * Also, include 1 default constructor and 
     * 1 parameterized constructor.
     */

    private String lastName;
    private double hourlyWage;
    private double weeklyPayRate;
    private String productName;
    private double productPrice;
    private Integer productAmount;

    public main Product(){
        productName = "";
        productPrice = 100.00;
        productAmount = 20;    
    }

    public Product(String name){
        productName = name;
        productPrice = 100.00;
        productAmount = 20;
    }

    public String getProductName (){
        return productName;
    }

    public String setProductName (String pName){
        productName = name;
    }
/* 
    public Employee(){
        lastName = "Default";
        hourlyWage = 7.25;
        weeklyPayrate = calculateWeeklyPay();
    }

    public Employee(String name) {
        lastName = name;
        hourlyWage = 7.25;
        weeklyPayRate = calculateWeeklyPay();
    }

    public void setLastName (String name) {
        lastName = Name;
    }

    public String getLastName () {
        return lastName;
    }
    */
}
