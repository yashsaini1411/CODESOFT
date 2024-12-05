import java.util.Scanner;
class Atmmachine{
    private BanckAccount acc;
    private int pin;
    public Atmmachine(BanckAccount acc ,int pin){
        this.acc = acc;
        this.pin = pin;
    }
    public void menu(){
        System.out.println("Welcome.........");
        System.out.println("1. Check Balance.");
        System.out.println("2. Deposit Balance.");
        System.out.println("3. Withdraw Balance.");
        System.out.println("4. Exit.");
    }
    public boolean verify_pin(int entered_pin){
        return this.pin == entered_pin;
    }

    public void banckInterface(){
        Scanner sc = new Scanner(System.in);
        int entered_pin;
        System.out.println("Enter your pin : ");
        entered_pin = sc.nextInt();
        if(verify_pin(entered_pin)){
            int choose = 0;
            while(choose != 4){
              menu();
              System.out.println("Enter your Choice: ");
              choose = sc.nextInt();
              switch(choose){
                case 1:
                 System.out.println("Remaining balance : "+acc.getBalance());
                 break;
                
                case 2:
                  System.out.println("Enter amount to deposit: ");
                  double deposit_amount = sc.nextDouble();
                  acc.deposit(deposit_amount);
                  break;

                case 3:
                 System.out.println("Enter amoutn to withdraw: ");
                 double withdraw_amount = sc.nextDouble();
                 acc.withdraw(withdraw_amount);
                 break;

                case 4:
                 System.out.println("Thankyou for coming.");
                 break;

                default:
                  System.out.println("you have entered wrong choice, Please choose valid option. ");
              }
            }  
        }else{
            System.out.println("ivalid pin");
        }
        sc.close();
    }
}
class BanckAccount{
  private double bal;
  public BanckAccount(double initial_balance){
    this.bal = initial_balance;
  }
  public double getBalance(){
    return bal;
  }
  public void deposit(double amount){
    if(amount>0){
        bal+=amount;
        System.out.println("The amount "+amount+" deposited successfully.");
    }
    else{
        System.out.println("you can't deposit amount less then 0.");
    }
  }
  public void withdraw(double amount){
    if(amount>0 && bal>=amount){
        bal-=amount;
        System.out.println("Successfully withdraw "+amount+" from your account.");
    }
    else{
        System.out.println("!sorry insufficient balance.");
    }
  }
}
public class Atm {
  public static void main(String[] args) {
    BanckAccount User_account= new BanckAccount(10000);
    int actual_pin = 300;
    Atmmachine atm = new Atmmachine(User_account,actual_pin);
    atm.banckInterface();  
  }  
}
