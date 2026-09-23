package dyyy.src.main.java.com.dyyy;

enum Acct{
    checking, saving;
}

public class DyvvyFunds{
    
    public double bal;
    public String acctName;
    public Acct acctType;
    

    //If necessary may add seperate constructors for account types later
    //Checking could include Overdraft limits while Savings could include Interest Rates| This isn't bank app though, so for now it'll be kept simple.
    public DyvvyFunds(double bal, String acctName, Acct acctType){
        this.bal = bal;
        this.acctName = acctName;
        this.acctType = acctType;
    }

    public double getBal(){
        return bal;
    }

    public String getAcctName(){
        return acctName;
    }

    public Acct getAcctType(){
        return acctType;
    }

    public void setBal(double bal){
        this.bal = bal;
    }

    public void setAcctName(String acctName){
        this.acctName = acctName;
    }

    public void setAcctType(Acct acctType){
        this.acctType = acctType;
    }

}