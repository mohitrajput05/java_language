import java.util.Scanner;

class Bank {
	private String accno;
    private String name;
	private String fname;
	private String dob;
	private String age;
	private String adharcard;
	private String pencard;
	private String gender;
	private String mobileno;
    private long balance;
    Scanner KB = new Scanner(System.in);

    //method to open an account
    void openAccount() {
		System.out.print("Enter account number: ");
        accno = KB.next();
        System.out.print("Enter Name: ");
        name = KB.next();
		System.out.print("Enter Father Name: ");
        fname = KB.next();
		System.out.print("Enter Date of birth: ");
        dob = KB.next();
		System.out.print("Enter Age: ");
        age = KB.next();
		System.out.print("Enter Gender: ");
        gender = KB.next();
		System.out.print("Enter Mobile Number: ");
        mobileno = KB.next();
		System.out.print("Enter Adharcard Number: ");
        adharcard = KB.next();
		System.out.print("Enter Pen Card Number: ");
        pencard = KB.next();
        System.out.print("Enter Balance: ");
        balance = KB.nextLong();
    }

    //method to display account details
    void showAccount() {
        System.out.println(accno +"," + name + "," + fname +"," + dob + "," + age +","+ adharcard +"," + pencard + "," +gender +"," +mobileno + "," + balance);
    }

    //method to deposit money
    void deposit() {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt = KB.nextLong();
        balance = balance + amt;
    }

    //method to withdraw money
    void withdrawal() {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = KB.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

    //method to search an account number
    boolean search(String acn) {
        if (accno.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}

class ExBank {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);
 
        //create initial accounts
        System.out.print("Create a new account : ");
        int n = KB.nextInt();
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Bank();
            C[i].openAccount();
        }

        //run loop until menu 5 is not pressed
        int ch;
        do {
            System.out.println("Main Menu\n1. Details of customer \n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n 5.Exit ");
                System.out.println("Enter the Choice you want to perform :"); ch = KB.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].showAccount();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Account No U Want to Search...: ");
                        String acn = KB.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 5:
                        System.out.println("Good Bye..");
                        break;
                }
            }
            while (ch != 5);
        }
    }