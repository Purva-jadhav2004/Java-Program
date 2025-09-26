package LabAss1;

public class Account {
	  
    int accno;
    String accname;
    float balance;

    public Account(int ano, String a_name, float a_balance) {
        this.accno = ano;
        this.accname = a_name;
        this.balance = a_balance;
    }
    public void display() {
        System.out.println("Account No: " + accno + ", Name: " + accname + ", Balance: " + balance);
    }

    public static void sortAccount(Account[] accounts) {
        int n = accounts.length;
       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (accounts[j].balance > accounts[j + 1].balance) {
                  
                    Account temp = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = temp;
                }
            }
        }
    }

  
    public static void main(String[] args) {
        Account[] a = new Account[5];
        a[0] = new Account(1, "Shubhangi", 15000);
        a[1] = new Account(2, "Shruti", 25000);
        a[2] = new Account(3, "Purva", 27000);
        a[3] = new Account(4, "Nikita", 20000);
        a[4] = new Account(5, "Vaishanvi", 30000);

        sortAccount(a);

        System.out.println("Accounts sorted by balance:");
        for (Account acc : a) {
            acc.display();
        }
    }
}