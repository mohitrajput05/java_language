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
  private static final long serialVersionUID = 6529685098267757690L;

  public void newCustomer() {
    Scanner scan = new Scanner(System.in);
    amount = 0;

	String ifsc = "LDBN000785";
    long min = 100000l;
    long max = 999999l;
    acc = (int) (Math.random() * (max - min + 1) + min);

    System.out.print("Enter Your name             : ");
    name=scan.nextLine();
    
    System.out.print("Enter Your Father Name      : ");
    fname=scan.nextLine();

    System.out.print("Enter Your Age              : ");
    age=scan.nextLine();

    System.out.print("Enter Your Gender           : ");
    gender=scan.nextLine();

    System.out.print("Enter Your Mobile number    : ");
    mobile=scan.nextLine();
    
    System.out.print("Enter Your Address          : ");
    address=scan.nextLine();
    
    System.out.print("Enter Your PIN Code         : ");
    pin=scan.nextLine();
    
    System.out.print("Enter Your Aadhar number    : ");
    aadhar=scan.nextLine();
    
    System.out.print("Enter Your PAN Card Number  : ");
    pan=scan.nextLine();
    
    System.out.print("Enter Your Nationality      : ");
    nationality=scan.nextLine();
      
    System.out.println("\n\nAccount Number              : "+acc);
    System.out.print("Generate your Password      : ");


    Console c = System.console();
    char chr[];
    chr = c.readPassword();
    pass = new String(chr);
    System.out.println("Account Created Successfully......");
  }

  public void readData() {
	String ifsc = "LDBN000785";
    System.out.println("Amount             : " + amount);
    System.out.println("Account Numer      : " + acc);
    System.out.println("Password           : " + pass);
    System.out.println("Name               : " + name);
    System.out.println("Father Name        : " + fname);
    System.out.println("Age                : " + age);
    System.out.println("Gender             : " + gender);
    System.out.println("Mobile Number      : " + mobile);
    System.out.println("Address            : " + address);
    System.out.println("PIN Code           : " + pin);
    System.out.println("Aadhar Number      : " + aadhar);
    System.out.println("PAN Numer          : " + pan);
    System.out.println("Nationality        : " + nationality);
  }

  public long getAcc() {
    return acc;
  }

  /*public void SetAmount(int amount){
    this.amount = amount;
  }*/
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
      System.out.println("Insufficient Balance");
  }
}
class Loan {
	Scanner scan = new Scanner(System.in);
	Detail objofdetail = new Detail();

	public void LoanMenu() throws Exception {

		int choice;

		System.out.println("Enter the Type of Loan ");
		System.out.println("Press 1 for Insecure Loan");
		System.out.println("Press 2 for Secure Loan");
		choice = scan.nextInt();

		switch (choice) {

			case 1:
				System.out.println("You entered For Insecure Loan");
				System.out.println("Press 1 For Personal Loan");
				System.out.println("Press 2 For Educational Loan");
				System.out.println("Press 3 For Vehicle Loan");
				int choice2 = scan.nextInt();

				switch (choice2) {

					case 1:
						System.out.println("You Entered For Personal Loan");
						objofdetail.D1();
						return;
					case 2:
						System.out.println("You Entered For Educational Loan");
						objofdetail.D2();
						return;
					case 3:
						System.out.println("You Entered For Vehicle Loan");
						objofdetail.D3();
						return;
					default:
						System.out.println("Invalid Choice");
						return;

				}
			case 2:
				System.out.println("You entered For secure Loan");
				System.out.println("Press 1 For Home Loan ");
				System.out.println("Press 2 For Small bussiness Loan");
				int choice3 = scan.nextInt();

				switch (choice3) {

					case 1:
						System.out.println("You Entered for Home Loan");
						objofdetail.D4();
						return;

					case 2:
						System.out.println("You Entered For Small Business Loan");
						objofdetail.D5();
						return;
					default:
						System.out.println("Invalid Choice");
						return;
				}
		}

	}

}

class Detail {

	Scanner scan = new Scanner(System.in);

	public void D1() throws Exception {

		System.out.println("Please Enter Your Name ");
		String name = scan.nextLine();
		System.out.println("Enter Father's name");
		String fname = scan.nextLine();
		System.out.println("Enter age");
		int D1age = scan.nextInt();
		System.out.println("Enter Monthly Salary");
		int D1salary = scan.nextInt();

		if (D1age >= 24 && D1age <= 75 && D1salary >= 15000) {
			System.out.println("\t\t\tYOU CAN PROCEED");
			System.out.println();
			System.out.println("Enter DOB");
			String DOB = scan.next();
			System.out.println("Enter mobile 1");
			long mob1 = scan.nextLong();
			System.out.println("Enter mobile 2");
			long mob2 = scan.nextLong();
			System.out.println("Enter email");
			String email = scan.next();
			System.out.println("Enter fax number");
			long fax = scan.nextLong();
			System.out.println("Enter house no.");
			int home = scan.nextInt();
			System.out.println("Enter Pincode");
			int pin = scan.nextInt();
			System.out.println("Enter landmark");
			String landmark = scan.next();
			System.out.println("Enter street");
			int street = scan.nextInt();
			System.out.println("Enter City");
			String city = scan.next();
			System.out.println("Enter Aadhar Card Details");
			long adhar = scan.nextLong();
			System.out.println("Enter your caste - General/OBC/ST/SC");
			String caste = scan.next();
			System.out.println("Enter Religion");
			String religion = scan.next();

			System.out.println("Press 1 for your details");
			System.out.println("Press 2 for Exit");
			int choice4 = scan.nextInt();


			switch (choice4) {

				case 1:
					System.out.println("---------------------------------------------------------");
					System.out.println("                        LOAN DETAIL                      ");
					System.out.println("---------------------------------------------------------");
					System.out.println("\t\tName             : " + name);
					System.out.println("\t\tFather Name      : " + fname);
					System.out.println("\t\tAge              : " + D1age);
					System.out.println("\t\tMonthly Salary   : " + D1salary);
					System.out.println("\t\tDate of Birth    : " + DOB);
					System.out.println("\t\tMobile-1         : " + mob1);
					System.out.println("\t\tMobile-2         : " + mob2);
					System.out.println("\t\tE-mail ID        : " + email);
					System.out.println("\t\tFax Number       : " + fax);
					System.out.println("\t\tHouse Number     : " + home);
					System.out.println("\t\tPincode          : " + pin);
					System.out.println("\t\tLand_Mark        : " + landmark);
					System.out.println("\t\tStreet           : " + street);
					System.out.println("\t\tCity             : " + city);
					System.out.println("\t\tAadhar Number    : " + adhar);
					System.out.println("\t\tCaste            : " + caste);
					System.out.println("\t\tReligion         : " + religion);
					System.out.println("---------------------------------------------------------");
					File f = new File("personal.txt");
					FileWriter fw = new FileWriter(f, true);
					fw.write(name + " ");
					fw.write(fname + " ");
					fw.write(D1age + " ");
					fw.write(D1salary + " ");
					fw.write(DOB + " ");
					fw.write(mob1 + " ");
					fw.write(mob2 + " ");
					fw.write(email + " ");
					fw.write(fax + " ");
					fw.write(home + " ");
					fw.write(pin + " ");
					fw.write(landmark + " ");
					fw.write(street + " ");
					fw.write(city + " ");
					fw.write(adhar + " ");
					fw.write(caste + " ");
					fw.write(religion + "\n");
					fw.close();
					System.out.println("Your Loan is granted");
				case 2:
					return;

				default:
					System.out.println("You Entered Wrong choice");
			}
		} else
			System.out.println("Your Loan is Failed");

	}

	public void D2() throws Exception {

		System.out.print("Please Enter Your Name -");
		String name = scan.nextLine();
		System.out.println("Enter Father's name");
		String fname = scan.nextLine();
		System.out.println("Enter age ");
		int D2age = scan.nextInt();
		System.out.println("Enter DOB");
		String DOB = scan.next();
		System.out.println("Enter Nominee name");
		String Nname = scan.next();
		System.out.println("Enter Nominee's Occupation");
		String Noccup = scan.next();
		System.out.println("Enter Nominee's Salary");
		long D2Nosalary = scan.nextLong();
		System.out.println("Enter Your 12th Percentage");
		Float D2percentage = scan.nextFloat();

		if (D2Nosalary >= 20000 && D2age >= 20 && D2age <= 45 && D2percentage >= 70 && D2percentage <= 100) {
			System.out.println("\t\t\tYou Can Proceed");
			System.out.println();
			System.out.println("Enter Mobile 1");
			long mob1 = scan.nextLong();
			System.out.println("Enter mobile 2");
			long mob2 = scan.nextLong();
			System.out.println("Enter Email");
			String email = scan.next();
			System.out.println("Enter Fax no.");
			long fax = scan.nextLong();
			System.out.println("Enter house no.");
			int home = scan.nextInt();
			System.out.println("Enter Pincode");
			int pin = scan.nextInt();
			System.out.println("Enter Landmark");
			String landmark = scan.next();
			System.out.println("Enter street");
			int street = scan.nextInt();
			System.out.println("Enter City");
			String city = scan.next();
			System.out.println("Enter Aadhar Card Details");
			long adhar = scan.nextLong();
			System.out.println("Enter your caste - General/OBC/ST/SC");
			String caste = scan.next();
			System.out.println("Enter Religeon");
			String religion = scan.next();
			System.out.println("Further Study Details");
			String Study_Detail = scan.next();
								
			System.out.println("Press 1 for your details");
			System.out.println("Press 2 for Exit");
			int choice5 = scan.nextInt();
			switch (choice5) {

				case 1:

					System.out.println("---------------------------------------------------------");
					System.out.println("                        LOAN DETAIL                      ");
					System.out.println("---------------------------------------------------------");
					System.out.println("\t\tName             : " + name);
					System.out.println("\t\tFather Name      : " + fname);
					System.out.println("\t\tAge              : " + D2age);
					System.out.println("\t\tDate of Birth    : " + DOB);
					System.out.println("\t\tNominie Name     : " + Nname);
					System.out.println("\t\tNominieOcupation : " + Noccup);
					System.out.println("\t\tNominie Salary   : " + D2Nosalary);
					System.out.println("\t\t12th Percentage  : " + D2percentage);
					System.out.println("\t\tMobile-1         : " + mob1);
					System.out.println("\t\tMobile-2         : " + mob2);
					System.out.println("\t\tE-mail ID        : " + email);
					System.out.println("\t\tFax Number       : " + fax);
					System.out.println("\t\tHouse Number     : " + home);
					System.out.println("\t\tPincode          : " + pin);
					System.out.println("\t\tLand_Mark        : " + landmark);
					System.out.println("\t\tStreet           : " + street);
					System.out.println("\t\tCity             : " + city);
					System.out.println("\t\tAadhar Number    : " + adhar);
					System.out.println("\t\tCaste            : " + caste);
					System.out.println("\t\tReligion         : " + religion);
					System.out.println("\t\tStudy Detail     : " + Study_Detail);
					System.out.println("---------------------------------------------------------");
					File f = new File("education.txt");
					FileWriter fw = new FileWriter(f, true);
					fw.write(name + " ");
					fw.write(fname + " ");
					fw.write(D2age + " ");
					fw.write(DOB + " ");
					fw.write(Nname + " ");
					fw.write(Noccup + " ");
					fw.write(D2Nosalary + " ");
					fw.write(D2percentage + " ");
					fw.write(mob1 + " ");
					fw.write(mob2 + " ");
					fw.write(email + " ");
					fw.write(fax + " ");
					fw.write(home + " ");
					fw.write(pin + " ");
					fw.write(landmark + " ");
					fw.write(street + " ");
					fw.write(city + " ");
					fw.write(adhar + " ");
					fw.write(caste + " ");
					fw.write(religion + " ");
					fw.write(Study_Detail + "\n");
					fw.close();
					System.out.println("YOUR LOAN IS GRANTED");
					break;
				case 2:
					return;

				default:
					System.out.println("You Entered Wrong choice");
			}

		} else
			System.out.println("YOUR LOAN IS FAILED");

	}

	public void D3() throws Exception {

		System.out.print("Please Enter Your Name ");
		String name = scan.next();
		System.out.print("Enter Father's name");
		String fname = scan.next();
		System.out.print("Enter age");
		int D3age = scan.nextInt();
		System.out.println("Enter Monthly Salary");
		int D3salary = scan.nextInt();
		System.out.println("Vehicle Type");
		int vehicletype = scan.nextInt();
		System.out.println("Vehicle Market Price");
		int D3vehicleprice = scan.nextInt();
		if (D3age > 18 && D3salary >= 20000 && D3vehicleprice >= 250000 && D3vehicleprice <= 1000000) {
			System.out.println("\t\t\tYOU CAN PROCEED");
			System.out.println();
			System.out.println("Enter DOB");
			String DOB = scan.next();
			System.out.println("Enter Mobile 1");
			long mob1 = scan.nextLong();
			System.out.println("Enter Mobile 2");
			long mob2 = scan.nextLong();
			System.out.println("Enter Email");
			String email = scan.next();
			System.out.println("Enter Fax ");
			long fax = scan.nextLong();
			System.out.println("Enter House no.");
			int home = scan.nextInt();
			System.out.println("Enter Pincode");
			int pin = scan.nextInt();
			System.out.println("Enter Landmark");
			String landmark = scan.next();
			System.out.println("Enter street");
			int street = scan.nextInt();
			System.out.println("Enter City");
			String city = scan.next();
			System.out.println("Enter Aadhar Card Details");
			long adhar = scan.nextLong();
			System.out.println("Enter your caste - General/OBC/ST/SC");
			String caste = scan.next();
			System.out.println("Enter Religion");
			String religion = scan.next();
			System.out.println();
			System.out.println("Occupation");
			System.out.println();
			System.out.println("Please Enter Company");
			String company = scan.next();
			System.out.println("Enter Post At Company");
			String post = scan.next();
			System.out.println("Enter Experience");
			String exp = scan.next();

			System.out.println("Press 1 for your details");
			System.out.println("Press 2 for Exit");
			int choice6 = scan.nextInt();
			switch (choice6) {

				case 1:

					System.out.println("---------------------------------------------------------");
					System.out.println("                        LOAN DETAIL                      ");
					System.out.println("---------------------------------------------------------");
					System.out.println("\t\tName             : " + name);
					System.out.println("\t\tFather Name      : " + fname);
					System.out.println("\t\tAge              : " + D3age);
					System.out.println("\t\tMonthly Salary   : " + D3salary);
					System.out.println("\t\tVehicle Type     : " + vehicletype);
					System.out.println("\t\tVehicle Price    : " + D3vehicleprice);
					System.out.println("\t\tDate of Birth    : " + DOB);
					System.out.println("\t\tMobile-1         : " + mob1);
					System.out.println("\t\tMobile-2         : " + mob2);
					System.out.println("\t\tE-mail ID        : " + email);
					System.out.println("\t\tFax Number       : " + fax);
					System.out.println("\t\tHouse Number     : " + home);
					System.out.println("\t\tPincode          : " + pin);
					System.out.println("\t\tLand_Mark        : " + landmark);
					System.out.println("\t\tStreet           : " + street);
					System.out.println("\t\tCity             : " + city);
					System.out.println("\t\tAadhar Number    : " + adhar);
					System.out.println("\t\tCaste            : " + caste);
					System.out.println("\t\tReligion         : " + religion);
					System.out.println("\t\tCompany          : " + company);
					System.out.println("\t\tPost             : " + post);
					System.out.println("\t\tJob Experience   : " + exp);
					System.out.println("---------------------------------------------------------");
					File f = new File("vehicle.txt");
					FileWriter fw = new FileWriter(f, true);
					fw.write(name + " ");
					fw.write(fname + " ");
					fw.write(D3age + " ");
					fw.write(D3salary + " ");
					fw.write(vehicletype + " ");
					fw.write(D3vehicleprice + " ");
					fw.write(DOB + " ");
					fw.write(mob1 + " ");
					fw.write(mob2 + " ");
					fw.write(email + " ");
					fw.write(fax + " ");
					fw.write(home + " ");
					fw.write(pin + " ");
					fw.write(landmark + " ");
					fw.write(street + " ");
					fw.write(city + " ");
					fw.write(adhar + " ");
					fw.write(caste + " ");
					fw.write(religion + " ");
					fw.write(company + " ");
					fw.write(post + " ");
					fw.write(exp + " ");
					fw.close();
					System.out.println("YOUR LOAN IS GRANTED");

					break;
				case 2:
					return;

				default:
					System.out.println("You Entered Wrong choice");
			}

		} else
			System.out.println("YOUR LOAN IS FAILED");

	}

	public void D4() throws Exception {

		System.out.print("Please Enter Your Name ");
		String name = scan.next();
		System.out.println("Enter Father's name");
		String fname = scan.next();
		System.out.println("Enter AGE");
		int D4age = scan.nextInt();
		System.out.println("Enter Salary");
		int D4salary = scan.nextInt();

		if (D4age >= 27 && D4age <= 50 && D4salary >= 30000) {
			System.out.println("\t\t\tYOU CAN PROCEED");
			System.out.println();
			System.out.println("Enter DOB");
			String DOB = scan.next();
			System.out.println("Enter Mobile 1");
			long mob1 = scan.nextLong();
			System.out.println("Enter Mobile 2");
			long mob2 = scan.nextLong();
			System.out.println("Please Enter Your Email Address ");
			String email = scan.next();
			System.out.println("Please Enter Your Fax Number");
			long fax = scan.nextLong();
			System.out.println("Please Enter Your House Number");
			int home = scan.nextInt();
			System.out.println("Please Enter Your Pin Code ");
			int pin = scan.nextInt();
			System.out.println("Please Enter Your Landmark ");
			String landmark = scan.next();
			System.out.println("Please Enter Your Street Number ");
			int street = scan.nextInt();
			System.out.println("Please Enter Your City ");
			String city = scan.next();
			System.out.println("Please Enter Your Adhar Details ");
			long adhar = scan.nextLong();
			System.out.println("Please Enter Your Caste - General/OBC/ST/SC");
			String caste = scan.next();
			System.out.println("Please Enter Your Religion");
			String religion = scan.next();
			System.out.println("Occupation");
			System.out.println("Please Enter Your Company ");
			String company = scan.next();
			System.out.println("Please Enter Your Post ");
			String post = scan.next();
			System.out.println("Please Enter Your Experience ");
			String exp = scan.next();
			System.out.println("Enter the Complete Description of House Property ");
			String homeinfo = scan.next();

			System.out.println("Press 1 for your details");
			System.out.println("Press 2 for Exit");
			int choice7 = scan.nextInt();
			switch (choice7) {

				case 1:

					System.out.println("---------------------------------------------------------");
					System.out.println("                        LOAN DETAIL                      ");
					System.out.println("---------------------------------------------------------");
					System.out.println("\t\tName             : " + name);
					System.out.println("\t\tFather Name      : " + fname);
					System.out.println("\t\tAge              : " + D4age);
					System.out.println("\t\tMonthly Salary   : " + D4salary);
					System.out.println("\t\tDate of Birth    : " + DOB);
					System.out.println("\t\tMobile Number    : " + mob1);
					System.out.println("\t\tMobile Number    : " + mob2);
					System.out.println("\t\tE-mail ID        : " + email);
					System.out.println("\t\tFax Number       : " + fax);
					System.out.println("\t\tHouse Number     : " + home);
					System.out.println("\t\tPincode          : " + pin);
					System.out.println("\t\tLand_Mark        : " + landmark);
					System.out.println("\t\tStreet           : " + street);
					System.out.println("\t\tCity             : " + city);
					System.out.println("\t\tAadhar Number    : " + adhar);
					System.out.println("\t\tCaste            : " + caste);
					System.out.println("\t\tReligion         : " + religion);
					System.out.println("\t\tCompany          : " + company);
					System.out.println("\t\tPost             : " + post);
					System.out.println("\t\tJob Experience   : " + exp);
					System.out.println("\t\tHome Descript.   : " + homeinfo);
					System.out.println("---------------------------------------------------------");

					File f = new File("homeloan.txt");
					FileWriter fw = new FileWriter(f, true);
					fw.write(name + " ");
					fw.write(fname + " ");
					fw.write(D4age + " ");
					fw.write(D4salary + " ");
					fw.write(DOB + " ");
					fw.write(mob1 + " ");
					fw.write(mob2 + " ");
					fw.write(email + " ");
					fw.write(fax + " ");
					fw.write(home + " ");
					fw.write(pin + " ");
					fw.write(landmark + " ");
					fw.write(street + " ");
					fw.write(city + " ");
					fw.write(adhar + " ");
					fw.write(caste + " ");
					fw.write(religion + " ");
					fw.write(company + " ");
					fw.write(post + " ");
					fw.write(exp + " ");
					fw.write(homeinfo + "\n");
					fw.close();
					System.out.println("Your Loan is Granted ");
					break;
				case 2:
					return;
				default:
					System.out.println("You Entered Wrong choice");
					     break;
			}
		} else
			System.out.println("Your are Loan is Failed ");

	}

	public void D5() throws Exception {

		System.out.print("Please Enter Your Name ");
		String name = scan.nextLine();
		System.out.println("Enter Father's name");
		String fname = scan.nextLine();
		System.out.println("Please Enter Your Age ");
		int age = scan.nextInt();
		System.out.println("Assets Income ");
		int assets = scan.nextInt();
		if (age >= 22 && age <= 70 && assets >= 150000) {
			System.out.println("Please Enter Your Current Occupation");
			String c_occu = scan.next();
			System.out.println("Please Enter Your Date of Birth");
			String DOB = scan.next();
			System.out.println("Please Enter Your Mobile NUmber 1");
			long mob1 = scan.nextLong();
			System.out.println(" Please Enter Your Mobile Number 2");
			long mob2 = scan.nextLong();
			System.out.println("Please Enter Your Email Address ");
			String email = scan.next();
			System.out.println("Please Enter Your Fax Number ");
			long fax = scan.nextLong();
			System.out.println("Please Enter Your House Number ");
			int home = scan.nextInt();
			System.out.println("Please Enter Your Pin Code ");
			int pin = scan.nextInt();
			System.out.println("Please Enter Your Landmark ");
			String landmark = scan.next();
			System.out.println("Please Enter Your Street Number ");
			int street = scan.nextInt();
			System.out.println("Please Enter Your City ");
			String city = scan.next();
			System.out.println("Please Enter Your Adhar Details ");
			long adhar = scan.nextLong();
			System.out.println("Please Enter Your Caste - General/OBC/ST/SC");
			String caste = scan.next();
			System.out.println("Please Enter Your Religion ");
			String religion = scan.next();
			System.out.println("Description Of Bussiness ");
			String Business_Info = scan.next();
			System.out.println("Your Loan is Aprroved");

			System.out.println("Press 1 for your details");
			System.out.println("Press 2 for Exit");
			int choice8 = scan.nextInt();
			switch (choice8) {

				case 1:

					System.out.println("---------------------------------------------------------");
					System.out.println("                        LOAN DETAIL                      ");
					System.out.println("---------------------------------------------------------");
					System.out.println("\t\tName             : " + name);
					System.out.println("\t\tFather Name      : " + fname);
					System.out.println("\t\tAge              : " + age);
					System.out.println("\t\tAsset Income     : " + assets);
					System.out.println("\t\tDate of Birth    : " + DOB);
					System.out.println("\t\tMobile Number    : " + mob1);
					System.out.println("\t\tMobile Number    : " + mob2);
					System.out.println("\t\tE-mail ID        : " + email);
					System.out.println("\t\tFax Number       : " + fax);
					System.out.println("\t\tHouse Number     : " + home);
					System.out.println("\t\tPincode          : " + pin);
					System.out.println("\t\tLand_Mark        : " + landmark);
					System.out.println("\t\tStreet           : " + street);
					System.out.println("\t\tCity             : " + city);
					System.out.println("\t\tAadhar Number    : " + adhar);
					System.out.println("\t\tCaste            : " + caste);
					System.out.println("\t\tReligion         : " + religion);
					System.out.println("\t\tCurrent Occp.    : " + c_occu);
					System.out.println("\t\tBusiness Info.   : " + Business_Info);

					System.out.println("---------------------------------------------------------");
					File f = new File("short_business.txt");
					FileWriter fw = new FileWriter(f, true);
					fw.write(name + " ");
					fw.write(fname + " ");
					fw.write(age + " ");
					fw.write(assets + " ");
					fw.write(DOB + " ");
					fw.write(mob1 + " ");
					fw.write(mob2 + " ");
					fw.write(email + " ");
					fw.write(fax + " ");
					fw.write(home + " ");
					fw.write(pin + " ");
					fw.write(landmark + " ");
					fw.write(street + " ");
					fw.write(city + " ");
					fw.write(adhar + " ");
					fw.write(caste + " ");
					fw.write(religion + " ");
					fw.write(c_occu + " ");
					fw.write(Business_Info + " ");
					fw.close();
					break;

				case 2:
					return;

				default:
					System.out.println("You Entered Wrong choice");
			}

		} else {
			System.out.println("Your Loan is Failed ");
		}

	}

}

class Bank {
  public static void main(String args[]){
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
		System.out.println("------------------------------------------------------------------");
    System.out.println("                      WELCOME TO LENA DENA BANK");
    System.out.println("------------------------------------------------------------------");
		do{
   
    System.out.println();
    System.out.println("------------------------------------------------------------------");
    System.out.println("                     Press 1 for login as MANAGER");
    System.out.println("                     Press 2 for login as USER");
    System.out.println("                     Press 3 for EXIT");
    System.out.println("------------------------------------------------------------------\n");
    System.out.print("Enter your choice :");
    Scanner scan = new Scanner(System.in);
    int ch1 = scan.nextInt();

    switch (ch1) {
      case 1:
        System.out.println("------------------------------------------------------------------");
        System.out.print("		   Enter Respected Manager Name : ");
        String user = scan.next();
        char chr[];
        chr = con.readPassword("		   Enter Password               :");
        String pass = new String(chr);
        System.out.println("------------------------------------------------------------------\n");
        if (user.equals("PawanSir") && pass.equals("12345")) {
          System.out.println("Welcome Pawan Sir,\n");
          l1:while(true){
		        System.out.println("------------------------------------------------------------------");
		        System.out.println("                   Press 1 for Create Account");
		        System.out.println("                   Press 2 for Read All Account");
		        System.out.println("                   Press 3 for Read 1 Account");
		        System.out.println("                   Press 4 for Delete Account");
		        System.out.println("                   Press 5 for Apply for Loan");
		        System.out.println("                   Press 6 for Main Menu");
		        System.out.println("                   Press 7 for Exit");
		        System.out.println("------------------------------------------------------------------\n");
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
                      int i=1;
		              f = new File("customer.txt");
		              fis = new FileInputStream(f);
		              ois = null;

		              while (fis.available() > 0) {
                        System.out.println("------------------------------------------------------------------\n");
		                ois = new ObjectInputStream(fis);
		                c = (Customer) ois.readObject();
		                System.out.println();
                        System.out.println(i++ + " Customer : ");
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
		                if (account == c.getAcc()){
                          System.out.println("------------------------------------------------------------------\n");
		                  c.readData();
		                  flag = true;
                          System.out.println("------------------------------------------------------------------\n");
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
		                } 
		                else {
		                  out2 = new ObjectOutputStream(fout2);
		                  out2.writeObject(c);
		                }
		              }
		              f.delete();
		              f2.renameTo(f);
		              if (flag == false) 
		              System.out.println("Invalid Account Number"); 
		              else 
		              System.out.println("Account Deleted Successfully......");
		              break;
		            
		            case 5: flag = false;
							System.out.print("Enter the Account Number : ");
							account = scan.nextLong();
							f = new File("customer.txt");
							fis = new FileInputStream(f);
							ois = null;
							Loan obj = new Loan();
							while (fis.available() > 0) {
								ois = new ObjectInputStream(fis);
								c = (Customer) ois.readObject();
								if (account == c.getAcc()) {
									flag = true;
									if (c.getAmount() > 10000)
										obj.LoanMenu();
									else
										System.out.println("Amount should be greater than 10000");
								}
							} 
							if(flag==false)
							   System.out.println("Invalid Account Number");
							break;
		            
		            case 6: break l1; 
		              
		            case 7: System.out.println("\nThankYou\n");
		              			System.exit(0);
		            default:
		              System.out.println("\nInvalid Choice");
            	}
            } 
          catch (Exception e) {
            System.out.println(e);
          }
          }
        }
        else
          System.out.println("Invalid Username or password");
        break;
       
      case 2:
		      l2 : while(true)
		      {
				    System.out.println("------------------------------------------------------------------");
				    System.out.println("                   Press 1 for Deposit");
				    System.out.println("                   Press 2 for Withdrawl");
				    System.out.println("                   Press 3 for Balance Enquiry");
				    System.out.println("                   Press 4 for Main Menu");
				    System.out.println("                   Press 5 for EXIT");
				    
				    System.out.println("------------------------------------------------------------------\n");
				    System.out.print("Enter your choice : ");
				    int ch3 = scan.nextInt();
				    System.out.print("Enter your Account Number : ");
				    account = scan.nextLong();
				    chr = con.readPassword("Enter Password            :");
				    pass = new String(chr);
					try{
				    switch (ch3){
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
				          if (account == c.getAcc() && pass.equals(c.getPass())){
				            flag = true;
				            out2 = new ObjectOutputStream(fout2);
				            c.deposit();
				            System.out.println("Dear " + c.getName() + " Your Balance is " + c.getAmount());
				            out2.writeObject(c);
				          } 
				          else {
				            out2 = new ObjectOutputStream(fout2);
				            out2.writeObject(c);
				          }
				        }
				        f.delete();
				        f2.renameTo(f);
				        if (flag == false) 
				        System.out.println("Invalid Account Number or Password");
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
				          if (account == c.getAcc() && pass.equals(c.getPass())){
				            flag = true;
				            out2 = new ObjectOutputStream(fout2);
				            c.withdraw();
				            System.out.println("Dear " + c.getName() +  " Your Balance is " + c.getAmount());
				            out2.writeObject(c);
				          } 
				          else {
				            out2 = new ObjectOutputStream(fout2);
				            out2.writeObject(c);
				          }
				        }
				        f.delete();
				        f2.renameTo(f);
				        if (flag == false)
				         System.out.println("Invalid Account Number or Password");
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
				            System.out.println("Dear " + c.getName() + " Your Balance is " + c.getAmount());
				            flag = true;
				            break;
				          }
				        }
				        if (flag == false) 
				        System.out.println("Invalid Account Number or password");
				        ois.close();
				        break;
				      case 4: break l2; 
				      case 5:System.out.println("THANK YOU");System.exit(0);
				      default : System.out.println("Invalid Choice");
				    }
        }
        catch(Exception e){}
        }break;
        case 3: System.out.println("Thank You");System.exit(0);
    }
    }while(true);
  }
}