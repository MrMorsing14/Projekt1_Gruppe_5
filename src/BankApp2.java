import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {
        Account a1=new Account( "Joe Pass", 2.5);
        Account a2=new Account( "Jimmy Hendrix", 2.5);

        a1.deposit(200);
        a1.deposit(1000);
        a1.withdraw(400);
//        a1.balance=100000;
        a1.annualInterest();

        a1.printTransactions();
        System.out.println();
        a2.printTransactions();
        System.out.println();
    }
}

class Account {
    private int accountNo;
    private String owner;
    private double balance;         // indestående i kr
    private double intereatRate;    // rentesats i %
    private ArrayList<Transaction> transactions=new ArrayList<>();
    static int noOfAccounts=0;

    Account(String ow, double rate){
        noOfAccounts++;
        accountNo=noOfAccounts;
        owner=ow;
        balance=0;
        intereatRate=rate;
    }

    public void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat", amount, balance));
    }

    public void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new Transaction("Hævet", amount, balance));
    }

    public void annualInterest(){
        double intrest=balance*intereatRate/100;
        balance=balance+intrest;
        transactions.add(new Transaction("Rente", intrest, balance));
    }

    public void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
        for (Transaction t: transactions){
            System.out.println(t);
        }
    }

    public String toString(){
        return "Kontonr "+accountNo+": "+owner+" "+balance;
    }
}

class Transaction{
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    Transaction(String text, double amount, double newBalance){
        this.text=text;
        date=LocalDate.now();
        this.amount=amount;
        this.newBalance=newBalance;
    }

    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }
}


