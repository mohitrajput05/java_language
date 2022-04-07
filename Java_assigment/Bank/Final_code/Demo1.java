import java.io.*;
import java.util.*;

class Customer implements Serializable {

	private int amount;
	private long acc;
	private String pass;
	private String name;
	private String fname;
	private String age;
	private String gender;
	private String mobile;
	private String address;
	private String pin;
	private String aadhar;
	private String pan;
	private String nationality;
	private static final long serialVersionUID = 6987825072423796153L;

	public void newCustomer() {
		Scanner scan = new Scanner(System.in);
		amount = 0;
		String ifsc = "LDBN000785";
		long min = 100000l;
		long max = 999999l;
		acc = (int) (Math.random() * (max - min + 1) + min);

		System.out.print("Enter Your name : ");
		name = scan.nextLine();

		System.out.print("Enter Your Father Name : ");
		fname = scan.nextLine();

		System.out.print("Enter Your Age : ");
		age = scan.nextLine();

		System.out.print("Enter Your Gender : ");
		gender = scan.nextLine();

		System.out.print("Enter Your Mobile number : ");
		mobile = scan.nextLine();

		System.out.print("Enter Your Address : ");
		address = scan.nextLine();

		System.out.print("Enter Your PIN Code : ");
		pin = scan.nextLine();

		System.out.print("Enter Your Aadhar number : ");
		aadhar = scan.nextLine();

		System.out.print("Enter Your PAN Card Number : ");
		pan = scan.nextLine();

		System.out.print("Enter Your Nationality : ");
		nationality = scan.nextLine();

		System.out.println("Account Number : " + acc);
		System.out.println("IFSC Code : " + ifsc);
		System.out.print("Generate your Password : ");

		Console c = System.console();
		char chr[];
		chr = c.readPassword();
		pass = new String(chr);
		System.out.println("Account Created Successfully......");
	}

	public void readData() {
		String ifsc = "LDBN000785";
		System.out.println("Amount : " + amount);
		System.out.println("IFSC :" + ifsc);

		System.out.println("Account Numer : " + acc);
		System.out.println("Password : " + pass);
		System.out.println("Name : " + name);
		System.out.println("Father Name : " + fname);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Mobile Number : " + mobile);
		System.out.println("Address : " + address);
		System.out.println("PIN Code : " + pin);
		System.out.println("Aadhar Number : " + aadhar);
		System.out.println("PAN Numer : " + pan);
		System.out.println("Nationality : " + nationality);
	}

	public long getAcc() {
		return acc;
	}

	/*
	 * public void SetAmount(int amount){
	 * this.amount = amount;
	 * }
	 */
	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public void deposit() {
		Scanner scan = new Scanner(System.in);
		int amt;
		System.out.print("Enter the amount to be deposited : ");
		amt = scan.nextInt();
		amount += amt;
	}

	public void withdraw() {
		Scanner scan = new Scanner(System.in);
		int amt;
		System.out.print("Enter the amount to be withdrawl : ");
		amt = scan.nextInt();
		if (amount > amt)
			amount -= amt;
		else
			System.out.println(
					"Insufficient Balance");
	}
}

class Hello {

	public static void main(String args[]) throws Exception {
		long account;
		boolean flag = false;
		File f;
		FileOutputStream fout;
		ObjectOutputStream out;
		Customer c;
		FileInputStream fis;
		ObjectInputStream ois;
		File f2;
		FileOutputStream fout2;
		ObjectOutputStream out2;
		Console con = System.console();

		System.out.println(
				"------------------------------------------------------------------");
		System.out.println("                      WELCOME TO LENA DENA BANK");
		System.out.println(
				"------------------------------------------------------------------");
		System.out.println();
		System.out.println(
				"------------------------------------------------------------------");
		System.out.println("                     Press 1 for login as MANAGER");
		System.out.println("                     Press 2 for login as USER");
		System.out.println(
				"------------------------------------------------------------------\n");
		System.out.print("Enter your choice :");
		Scanner scan = new Scanner(System.in);
		int ch1 = scan.nextInt();

		switch (ch1) {
			case 1:
				System.out.println(
						"------------------------------------------------------------------");
				System.out.print("		   Enter Respected Manager Name : ");
				String user = scan.next();
				char chr[];
				chr = con.readPassword("		   Enter Password               :");
				String pass = new String(chr);
				System.out.println(
						"------------------------------------------------------------------\n");
				if (user.equals("PawanSir") && pass.equals("12345")) {
					System.out.println("Welcome Pawan Sir,\n");
					System.out.println(
							"------------------------------------------------------------------");
					System.out.println("                   Press 1 for Create Account");
					System.out.println("                   Press 2 for Read All Account");
					System.out.println("                   Press 3 for Read 1 Account");
					System.out.println("                   Press 4 for Delete Account");
					System.out.println("                   Press 5 for Apply for Loan");
					System.out.println("                   Press 6 for Exit");
					System.out.println(
							"------------------------------------------------------------------\n");
					System.out.print("Enter your choice : ");
					int ch2 = scan.nextInt();
					try {
						switch (ch2) {
							case 1:
								f = new File("customer.txt");
								fout = new FileOutputStream(f, true);
								out = new ObjectOutputStream(fout);
								c = new Customer();
								c.newCustomer();
								out.writeObject(c);
								out.close();
								break;
							case 2:
								f = new File("customer.txt");
								fis = new FileInputStream(f);
								ois = null;
								while (fis.available() > 0) {
									ois = new ObjectInputStream(fis);
									c = (Customer) ois.readObject();
									System.out.println();
									c.readData();
								}
								ois.close();
								break;
							case 3:
								flag = false;
								System.out.print("Enter the Account Number : ");
								account = scan.nextLong();
								System.out.println();
								f = new File("customer.txt");
								fis = new FileInputStream(f);
								ois = null;
								System.out.println();
								while (fis.available() > 0) {
									ois = new ObjectInputStream(fis);
									c = (Customer) ois.readObject();
									if (account == c.getAcc()) {
										c.readData();
										flag = true;
										break;
									}
								}
								if (flag == false)
									System.out.println("Invalid Account Number");
								ois.close();
								break;
							case 4:
								flag = false;
								System.out.print("Enter the Account Number : ");
								account = scan.nextLong();
								f = new File("customer.txt");
								fis = new FileInputStream(f);
								ois = null;
								f2 = new File("customer2.txt");
								fout2 = new FileOutputStream(f2);
								while (fis.available() > 0) {
									ois = new ObjectInputStream(fis);
									c = (Customer) ois.readObject();
									if (account == c.getAcc()) {
										flag = true;
									} else {
										out2 = new ObjectOutputStream(fout2);
										out2.writeObject(c);
									}
								}
								f.delete();
								f2.renameTo(f);
								if (flag == false)
									System.out.println(
											"Invalid Account Number");
								else
									System.out.println(
											"Account Deleted Successfully......");
								break;
							case 5:
								break;
							case 6:
								System.out.println("\nThankYou\n");
								System.exit(0);
							default:
								System.out.println("\nInvalid Choice");
						}
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				break;
			case 2:
				System.out.println(
						"------------------------------------------------------------------");
				System.out.println("                   Press 1 for Deposit");
				System.out.println("                   Press 2 for Withdrawl");
				System.out.println("                   Press 3 for Balance Enquiry");
				System.out.println(
						"------------------------------------------------------------------\n");
				System.out.print("Enter your choice : ");
				int ch3 = scan.nextInt();
				System.out.println("Enter your Account Number : ");
				account = scan.nextLong();
				chr = con.readPassword("Enter Password :");
				pass = new String(chr);

				switch (ch3) {
					case 1:
						flag = false;
						f = new File("customer.txt");
						fis = new FileInputStream(f);
						ois = null;
						f2 = new File("customer2.txt");
						fout2 = new FileOutputStream(f2);
						while (fis.available() > 0) {
							ois = new ObjectInputStream(fis);
							c = (Customer) ois.readObject();
							if (account == c.getAcc() && pass.equals(c.getPass())) {
								flag = true;
								out2 = new ObjectOutputStream(fout2);
								c.deposit();
								System.out.println(
										"Dear " + c.getName() + "Your Balance is " + c.getAmount());
								out2.writeObject(c);
							} 
							else 
							{
								out2 = new ObjectOutputStream(fout2);
								out2.writeObject(c);
							}
						}
						f.delete();
						f2.renameTo(f);
						if (flag == false)
							System.out.println(
									"Invalid Account Number or Password");
						break;
					case 2:
						flag = false;
						f = new File("customer.txt");
						fis = new FileInputStream(f);
						ois = null;
						f2 = new File("customer2.txt");
						fout2 = new FileOutputStream(f2);
						while (fis.available() > 0) {
							ois = new ObjectInputStream(fis);
							c = (Customer) ois.readObject();
							if (account == c.getAcc() && pass.equals(c.getPass())) {
								flag = true;
								out2 = new ObjectOutputStream(fout2);
								c.withdraw();
								System.out.println(
										"Dear " + c.getName() + "Your Balance is " + c.getAmount());
								out2.writeObject(c);
							} else {
								out2 = new ObjectOutputStream(fout2);
								out2.writeObject(c);
							}
						}
						f.delete();
						f2.renameTo(f);
						if (flag == false)
							System.out.println(
									"Invalid Account Number or Password");
					case 3:
						flag = false;
						f = new File("customer.txt");
						fis = new FileInputStream(f);
						ois = null;
						System.out.println();
						while (fis.available() > 0) {
							ois = new ObjectInputStream(fis);
							c = (Customer) ois.readObject();
							if (account == c.getAcc() && pass.equals(c.getPass())) {
								System.out.println(
										"Dear " + c.getName() + "Your Balance is " + c.getAmount());
								flag = true;
								break;
							}
						}
						if (flag == false)
							System.out.println(
									"Invalid Account Number or password");
						ois.close();
						break;
				}
		}
	}
}
