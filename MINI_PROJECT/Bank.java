public class Bank {
    String name, log = "";
    int accNo, bal, limit, used = 0;

    // a. Create an account
    Bank(int a, String n, int b, int l) {
        accNo = a; name = n; bal = b; limit = l;
        log += "Opened: " + b + "\n";
    }

    // b. Deposit money
    void deposit(int amt) {
        bal += amt; log += "Deposited: " + amt + "\n";
    }

    // c & d. Withdraw money & Honor daily limit
    void withdraw(int amt) {
        if (amt > bal || used + amt > limit)
            System.out.println("Withdrawal Failed!");
        else {
            bal -= amt; used += amt; log += "Withdrawn: " + amt + "\n";
        }
    }

    // e, f, g. Check balance, Display info, Passbook Print
    void checkBal() { System.out.println("Balance: " + bal); }
    void info() { System.out.println("Acc: " + accNo + " | Name: " + name); }
    void passbook() { System.out.print("--- Passbook ---\n" + log); }

    public static void main(String[] args) {
        Bank b = new Bank(101, "Raj", 2000, 1000);
        b.deposit(500);
        b.withdraw(800);
        b.withdraw(500);
        b.info();
        b.checkBal();
        b.passbook();
    }
}
