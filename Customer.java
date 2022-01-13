public class Customer extends Person{
    private String address;
    private String TelNo;
    private String Budget;
    private String Purches;

    public Customer(){

    }
    public Customer(String address,String TelNo, String Budget, String Purches){
        this.address=address;
        this.TelNo = TelNo;
        this.Budget= Budget;
        this.Purches = Purches;
    }
    public Customer(String address,String TelNo, String Budget, String Purches, String Name,
    boolean color,int Age){
        this.address=address;
        this.TelNo = TelNo;
        this.Budget= Budget;
        this.Purches = Purches;
        Name = Name;
        Age = Age;
        color = color;

    }
    public String getAddress(){
        return address;
    }
    public String getTelNo(){
        return TelNo;
    }
    public String getBudget(){
        return Budget;
    }
    public String getPurches(){
        return Purches;
    }
     public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public boolean isColor(){
        return true;
    }

}