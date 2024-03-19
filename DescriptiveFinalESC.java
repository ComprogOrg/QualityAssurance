import java.text.DateFormat; //imports the class DateFormat for date/time formatting.
import java.text.ParseException; //signals an unexpected error while parsing an input.
import java.text.SimpleDateFormat; //imports the class SimpleDateFormat for date/time parsing.
import java.util.Date; //imports the class Date for representing time/date objects.
import java.util.Scanner; //imports the Scanner class to get user input.

//declares a public class.
public class DescriptiveFinalESC {
    //main method where execution starts. the 'throws ParseException' warns that some code might throw a parse exception when handling dates.
    public static void main(String[] args) throws ParseException {
        //creates a scanner object to read user input.
        Scanner scan = new Scanner(System.in);

        //condition that is always true.
        while (true) {
            //arrays store the employee data in a collection/set.
            int[] EmployeeNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34};
            String[] EmployeeLastName = {"Garcia", "Lim", "Aquino", "Reyes", "Hernandez", "Villanueva", "San Jose", "Romualdez", "Atienza", "Alvaro", "Salcedo", "Lopez", "Farala", "Martinez", "Romualdez", "Mata", "De Leon", "San Jose", "Rosario", "Bautista", "Lazaro", "Delos Santos", "Santos", "Del Rosario", "Tolentino", "Gutierrez", "Manalaysay", "Villegas", "Ramos", "Maceda", "Aguilar", "Castro", "Martinez", "Santos"};
            String[] EmployeeFirstName = {"Manuel III", "Antonio", "Bianca Sofia", "Isabella", "Eduard", "Andrea Mae", "Brad", "Alice", "Rosie", "Roderick", "Anthony", "Josie", "Martha", "Leila", "Fredrick", "Christian", "Selena", "Allison", "Cydney", "Mark", "Darlene", "Kolby", "Vella", "Tomas", "Jacklyn", "Percival", "Garfield", "Lizeth", "Carol", "Emelia", "Delia", "John Rafael", "Carlos Ian", "Beatriz"};
            String[] EmployeeBirthDate = {"10/11/1983", "06/19/1988", "08/04/1989", "06/16/1994", "09/23/1989", "02/14/1988", "03/15/1996", "05/14/1992", "09/24/1948", "03/30/1988", "09/14/1993", "01/14/1987", "01/11/1942", "07/11/1970", "03/10/1985", "10/21/1987", "02/20/1975", "06/24/1986", "10/06/1996", "02/12/1991", "11/25/1985", "02/26/1980", "12/31/1983", "12/18/1978", "05/19/1984", "12/18/1970", "08/28/1986", "12/12/1981", "08/20/1978", "04/14/1973", "01/27/1989", "02/09/1992", "11/16/1990", "08/07/1990"};
            String[] Positions = {"Chief Executive Officer", "Chief Operating Officer", "Chief Finance Officer", "Chief Marketing Officer", "IT Operations and Systems", "HR Manager", "HR Team Leader", "HR Rank and File", "HR Rank and File", "Accounting Head", "Payroll Manager", "Payroll Team Leader", "Payroll Rank and File", "Payroll Rank and File", "Account Manager", "Account Team Leader", "Account Team Leader", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Sales & Marketing", "Supply Chain and Logistics", "Customer Service and Relations"};
            int[] MonthlySalary = {90000, 60000, 60000, 60000, 52670, 52670, 42975, 22500, 22500, 52670, 50825, 38475, 24000, 24000, 53500, 42975, 41850, 22500, 22500, 23250, 23250, 24000, 22500, 22500, 24000, 24750, 24750, 24000, 22500, 22500, 22500, 52670, 52670, 52670};
            double[] HourlyRate = {535.71, 357.14, 357.14, 357.14, 313.51, 313.51, 255.80, 133.93, 133.93, 313.51, 302.53, 229.02, 142.86, 142.86, 318.45, 255.80, 249.11, 133.93, 133.93, 138.39, 138.39, 142.86, 133.93, 133.93, 142.86, 147.32, 147.32, 142.86, 133.93, 133.93, 133.93, 313.51, 313.51, 313.51};

            //prompts user to input an employee number.
            System.out.print("Enter Employee Number [ 1 - 34 ]: ");
            //scans for integer user input for employee number.
            int EnterEmployeeNumber = scan.nextInt();

            //for loop iterates over every employee record in the arrays to find user == input.
            for (int i = 0; i < EmployeeNumber.length; i++) {
                //if input is found in the array, if block will execute, displaying employee info.
                if (EmployeeNumber[i] == EnterEmployeeNumber) {

                    //prints out the selected employee information according to array location.
                    System.out.println("Employee Name: " + EmployeeLastName[i] + ", " + EmployeeFirstName[i]);
                    System.out.println("Birth Date: " + EmployeeBirthDate[i]);
                    System.out.println("Position: " + Positions[i]);
                    System.out.println("Monthly Salary: " + MonthlySalary[i]);
                    System.out.println("Hourly Rate: " + HourlyRate[i]);
                    System.out.println("--------------------------------------------"); //visual separator.

                    //array declarations for weekdays, hours worked required for salary calculation, and deductions per hour.
                    String[] WeekDays = {"FRIDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY"}; //weekdays. friday is index 0, monday 1, so on.
                    double[] TimeLogIn = {8.82, 8, 7, 6, 5, 4, 3, 2, 1, 0}; //hours required worked for salary deduction.
                    double[] PerHour = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //hourly salary * deduction/s per hour.

                    // declarations of variables for calculation + user prompt for login and logout.
                    double TotalDeduction = 0;
                    double TotalSalary = 0;
                    System.out.print("Enter the Number of Day/s the Employee LogIns/LogOuts: ");
                    int days = scan.nextInt();

                    System.out.println("--------------------------------------------");


                    //for loop iterates over every weekday in  the weekdays array. it starts from 1 up to 'days'.
                    for (int day = 1; day <= days; day++) {
                        /* retrieves the weekday name from the WeekDays array. by using day % 5 as the index, the code
                        ensures it stays within the valid range of the array (0 to 4). */
                        System.out.println("Day " + day + " (" + WeekDays[day % 5] + ")" + ": ");
                        /* prompts the user to enter the log in and log out time in 24h format,
                        then stores the scanned inputs in Strings. */
                        System.out.print("Enter Log In Time in 24H Format [ hh:mm ]: ");
                        String FirstLogInTime = scan.next();
                        System.out.print("Enter Log Out Time in 24H Format [ hh:mm ]: ");
                        String FirstLogOutTime = scan.next();
                        System.out.println();

                        //creates a df(date format) object to parse time string inputs.
                        //parsing in java is known as converting data in the String format into an object.
                        DateFormat df = new SimpleDateFormat("HH:mm");
                        //enters the input time into date objects.
                        Date LogIn = df.parse(FirstLogInTime);
                        Date LogOut = df.parse(FirstLogOutTime);

                        //time print out + formatting, conversion and calculation.
                        System.out.println("Log In Time: " + df.format(LogIn));
                        System.out.println("Log Out Time: " + df.format(LogOut));

                        float HoursWorked = 0;
                        double DeductedHoursWorked;


                        //checks if login is before logout, then calculates the hours worked.
                        if (LogIn.before(LogOut)) {
                            // calculates the difference in milliseconds between LogOut and LogIn.
                            float diffMs = LogOut.getTime() - LogIn.getTime();
                            //converts the diffMs to seconds by dividing by 1000.
                            float diffSec = diffMs / 1000;
                            //converts the diffSec to minutes by dividing by 60.
                            float min = diffSec / 60;
                            //calculates the total hours worked by dividing the min by 60.
                            HoursWorked = min / 60;

                            /* statement executes only if the employee worked less than to or equal 4 hours—
                            the ! (logical not) negates the >= condition. */
                            if (HoursWorked <= 4) {
                                System.out.printf("You worked %.2f", HoursWorked);
                                System.out.print(" hours.");
                                System.out.println();
                            } else {
                                //the -1 makes sure that the output does not count the unpaid lunch time.
                                System.out.printf("You worked %.2f", HoursWorked - 1);
                                System.out.print(" hours.");
                                System.out.println();
                            }
                        }


                        //checks if login is equal logout, then outputs some text.
                        if (LogIn.equals(LogOut)) {
                            System.out.println("You didn't work!");
                        }
                        System.out.println();

                         /* if the employee only worked 4h, that means they didn't come in for lunch,
                        and was only present either just morning or afternoon, so they do not get the
                        -1 lunch hour deduction. this if else statement does that. */
                        if (HoursWorked <= 4) {
                            DeductedHoursWorked = HoursWorked;
                        } else {
                            DeductedHoursWorked = HoursWorked - 1;
                        }
                        //gabriel

                        //stores deductions based on late arrival statements.
                        double DeductionPerHour = 0;
                        //iterates through the TimeLogIn array, which contains thresholds for late deductions (7.83 to 1)
                        for (int Hour = 0; Hour < TimeLogIn.length; Hour++) {
                            //checks if the HoursWorked is less than or equal to the current threshold in TimeLogIn[Hour].
                            if (DeductedHoursWorked <= TimeLogIn[Hour]) {
                                /* calculates the deduction/hour by multiplying the corresponding entry in the PerHour array
                                (deduction amount) with the employee's hourly rate (HourlyRate[i]). */
                                DeductionPerHour = PerHour[Hour] * HourlyRate[i];
                            }
                        }

                        System.out.printf("Deduction Late / Hour: %.2f ", DeductionPerHour);
                        System.out.println();
                        //addition assignment operator: TotalDeduction = TotalDeduction + DeductionPerHour.
                        TotalDeduction += DeductionPerHour;

                        //DailySalary computation.
                        double DailySalary = (8 * HourlyRate[i]) - DeductionPerHour;
                        System.out.printf("Daily Salary: %.2f ", DailySalary);
                        System.out.println();
                        System.out.println("--------------------------------------------");
                        //TotalSalary = TotalSalary + DailySalary;
                        TotalSalary += DailySalary;

                    }
                    System.out.printf("Total Salary: %.2f ", TotalSalary);
                    System.out.println();
                    System.out.printf("Total Deduction : %.2f ", TotalDeduction);
                    System.out.println();

                    double Salary = MonthlySalary[i] - TotalDeduction;
                    System.out.printf("Estimated Salary Per Month: %.2f", Salary);
                    System.out.println();
                    System.out.println("--------------------------------------------");

                    //variable declarations for taxes.
                    double[] CompensationRange = {3250, 3750, 4250, 4750, 5250, 5750, 6250, 6750, 7250, 7750, 8250, 8750, 9250, 9750, 10250, 10750, 11250, 11750, 12250, 12750, 13250, 13750, 14250, 14750, 15250, 15750, 16250, 16750, 17250, 17750, 18250, 18750, 19250, 19750, 20250, 20750, 21250, 21750, 22250, 22750, 23250, 23750, 24250, 24750, Double.POSITIVE_INFINITY};
                    double[] Contribution = {135.00, 157.50, 180.00, 202.50, 225.00, 247.50, 270.00, 292.50, 315.00, 337.50, 360.00, 382.50, 405.00, 427.50, 450.00, 472.50, 495.00, 517.50, 540.00, 562.50, 585.00, 607.50, 630.00, 652.50, 675.00, 697.50, 720.00, 742.50, 765.00, 787.50, 810.00, 832.50, 855.00, 877.50, 900.00, 922.50, 945.00, 967.50, 990.00, 1012.50, 1035.00, 1057.50, 1080.00, 1102.50, 1125.00};
                    double SSSContribution = 0;

                    /* this for loop iterates through the compensation ranges one by one to check if the Salary
                    is less than or equal to the current range in the list (CompensationRange[y]).
                    if the salary falls within the current range, the code finds the corresponding SSS contribution
                    amount from the Contribution list at the same position.*/
                    for (int y = 0; y < CompensationRange.length; y++) {
                        if (Salary <= CompensationRange[y]) {
                            SSSContribution = Contribution[y];
                            break;
                        }
                    }
                    System.out.printf("SSS Deduction: %.2f", SSSContribution);
                    System.out.println();


                    double PhilHealth;
                    double EmployeeShare;
                    // if Salary is less than 0, there is no deductions. otherwise, there is a 3% and a 5% deduction.
                    if (Salary < 0) {
                        PhilHealth = 0;
                        EmployeeShare = 0;
                    } else {
                        PhilHealth = Salary * 0.03;
                        EmployeeShare = PhilHealth * 0.5;
                    }
                    System.out.print("PhilHealth: ");
                    System.out.printf("%.2f", PhilHealth);
                    System.out.println();
                    System.out.print("PhilHealth Deduction: ");
                    System.out.printf("%.2f", EmployeeShare);
                    System.out.println();


                    double PagIbig;
                    /* if Salary < 1000, there is a 3% deduction. if < 1500, 4%.
                    if higher, 100 due to it being the max contribution amount. */
                    if (Salary < 1000) {
                        PagIbig = Salary * 0.03;
                    } else if (Salary < 1500) {
                        PagIbig = Salary * 0.04;
                    } else {
                        PagIbig = 100;
                    }


                    //tax printouts.
                    System.out.printf("Pag-Ibig Deduction: %.2f", PagIbig);
                    System.out.println();

                    double TotalDeductions = EmployeeShare + SSSContribution + PagIbig;
                    System.out.printf("Total Deduction: %.2f", TotalDeductions);
                    System.out.println();
                    System.out.println();

                    double TaxableIncome = Salary - TotalDeductions;
                    System.out.printf("Taxable Income: %.2f", TaxableIncome);
                    System.out.println();
                    System.out.println();

                    //variable declarations for withholding tax rates.
                    double[] MonthlyRate = {20832, 33333, 66667, 166667, 666667, Double.POSITIVE_INFINITY};
                    double[] TaxRate = {0, 0.2, 0.25, 0.3, 0.32, 0.35};
                    double[] Plus = {0, 0, 2500, 10833, 40833.33, 200833.33};
                    double[] Minus = {0, 20833, 33333, 66667, 166667, 666667};
                    double TaxCalculation = 0;

                    /* the for loop iterates through the MonthlyRate array to find the bracket where the income falls
                    with what threshold. then, it calculates the tax. */
                    for (int Tax = 0; Tax < MonthlyRate.length; Tax++) {
                        if (TaxableIncome <= MonthlyRate[Tax]) {
                            TaxCalculation = ((TaxableIncome - Minus[Tax]) * TaxRate[Tax]) + Plus[Tax];
                            break;
                        }
                    }
                    System.out.printf("Withholding Tax Calculation: %.2f", TaxCalculation);
                    System.out.println();
                    System.out.println("--------------------------------------------");

                }
            }
            System.out.print("Do You Want to Make Another Computation? (yes/no)? ");
            String answer = scan.next();

            if (answer.equals("YES") || answer.equals("yes") || answer.equals("Yes") || answer.equals("Y") || answer.equals("y")) {
                System.out.println("--------------------------------------------");

            } else if (answer.equals("NO") || answer.equals("no") || answer.equals("No") || answer.equals("N")  || answer.equals("n")){
                System.out.println("--------------------------------------------");
                System.out.println("Thank You!");
                System.out.println();
                break;
            }

        }
        scan.close();
    }
}

/* MO-IT101 Computer Programming 1
Term II Section H1102 - Group II

Balansag. Genesis John
Basabe. Justin
Gomez, Zhajani
Libo-on, Dan Sheen
Portillo, JR Gabriel
Rementas. El Jean
Samaniego, Maja Ysabelle
Tugade, Mayumi
Vergara, Charley

 */
