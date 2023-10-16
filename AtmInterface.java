import java.util.Scanner;
                                             
class BankAccount 
{
    private double balance;  

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Total Balance : Rs" + balance);
        } 
        else
        {
            System.out.println("Enter valid amount");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0)
        {
            if (amount <= balance) 
            {
                balance -= amount;
                System.out.println("Money successfully withdrawn");
                System.out.println("Remaining Balance : Rs." + balance);
            }
            else 
            {
                System.out.println("Insufficient Balance");
            }
        }
        else
        {
            System.out.println("Enter valid amount");
        }
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() 
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Current balance: Rs" + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: Rs");
                    double depositAmount = sc.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: Rs");
                    double withdrawalAmount = sc.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Please select valid choice.");
            }
            sc.close();
        }
        
    }
}

public class AtmInterface
{
    public static void main(String[] args)
    {
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance is $1000
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}