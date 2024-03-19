import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DescriptiveFinalESC {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int[] EmployeeNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34};
            String[] EmployeeLastName = {"Garcia", "Lim", "Aquino", "Reyes", "Hernandez", "Villanueva", "San Jose", "Romualdez", "Atienza", "Alvaro", "Salcedo", "Lopez", "Farala", "Martinez", "Romualdez", "Mata", "De Leon", "San Jose", "Rosario", "Bautista", "Lazaro", "Delos Santos", "Santos", "Del Rosario", "Tolentino", "Gutierrez", "Manalaysay", "Villegas", "Ramos", "Maceda", "Aguilar", "Castro", "Martinez", "Santos"};
            String[] EmployeeFirstName = {"Manuel III", "Antonio", "Bianca Sofia", "Isabella", "Eduard", "Andrea Mae", "Brad", "Alice", "Rosie", "Roderick", "Anthony", "Josie", "Martha", "Leila", "Fredrick", "Christian", "Selena", "Allison", "Cydney", "Mark", "Darlene", "Kolby", "Vella", "Tomas", "Jacklyn", "Percival", "Garfield", "Lizeth", "Carol", "Emelia", "Delia", "John Rafael", "Carlos Ian", "Beatriz"};
            String[] EmployeeBirthDate = {"10/11/1983", "06/19/1988", "08/04/1989", "06/16/1994", "09/23/1989", "02/14/1988", "03/15/1996", "05/14/1992", "09/24/1948", "03/30/1988", "09/14/1993", "01/14/1987", "01/11/1942", "07/11/1970", "03/10/1985", "10/21/1987", "02/20/1975", "06/24/1986", "10/06/1996", "02/12/1991", "11/25/1985", "02/26/1980", "12/31/1983", "12/18/1978", "05/19/1984", "12/18/1970", "08/28/1986", "12/12/1981", "08/20/1978", "04/14/1973", "01/27/1989", "02/09/1992", "11/16/1990", "08/07/1990"};
            String[] Positions = {"Chief Executive Officer", "Chief Operating Officer", "Chief Finance Officer", "Chief Marketing Officer", "IT Operations and Systems", "HR Manager", "HR Team Leader", "HR Rank and File", "HR Rank and File", "Accounting Head", "Payroll Manager", "Payroll Team Leader", "Payroll Rank and File", "Payroll Rank and File", "Account Manager", "Account Team Leader", "Account Team Leader", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File", "Sales & Marketing", "Supply Chain and Logistics", "Customer Service and Relations"};
            int[] MonthlySalary = {90000, 60000, 60000, 60000, 52670, 52670, 42975, 22500, 22500, 52670, 50825, 38475, 24000, 24000, 53500, 42975, 41850, 22500, 22500, 23250, 23250, 24000, 22500, 22500, 24000, 24750, 24750, 24000, 22500, 22500, 22500, 52670, 52670, 52670};
            double[] HourlyRate = {535.71, 357.14, 357.14, 357.14, 313.51, 313.51, 255.80, 133.93, 133.93, 313.51, 302.53, 229.02, 142.86, 142.86, 318.45, 255.80, 249.11, 133.93, 133.93, 138.39, 138.39, 142.86, 133.93, 133.93, 142.86, 147.32, 147.32, 142.86, 133.93, 133.93, 133.93, 313.51, 313.51, 313.51};

            System.out.print("Enter Employee Number [ 1 - 34 ]: ");
            int EnterEmployeeNumber = 0;
            try {
                EnterEmployeeNumber = scan.nextInt();
                scan.nextLine(); // Clear the buffer
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine(); // Clear the buffer
                continue;
            }

            boolean found = false;
            for (int i = 0; i < EmployeeNumber.length; i++) {
                if (EmployeeNumber[i] == EnterEmployeeNumber) {
                    System.out.println("Employee Name: " + EmployeeLastName[i] + ", " + EmployeeFirstName[i]);
                    System.out.println("Birth Date: " + EmployeeBirthDate[i]);
                    System.out.println("Position: " + Positions[i]);
                    System.out.println("Monthly Salary: " + MonthlySalary[i]);
                    System.out.println("Hourly Rate: " + HourlyRate[i]);
                    System.out.println("--------------------------------------------");

                    String[] WeekDays = {"FRIDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY"};
                    double[] TimeLogIn = {8.82, 8, 7, 6, 5, 4, 3, 2, 1, 0};
                    double[] PerHour = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

                    double TotalDeduction = 0;
                    double TotalSalary = 0;
                    System.out.print("Enter the Number of Day/s the Employee LogIns/LogOuts: ");
                    int days = 0;
                    try {
                        days = scan.nextInt();
                        scan.nextLine(); // Clear the buffer
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scan.nextLine(); // Clear the buffer
                        continue;
                    }

                    System.out.println("--------------------------------------------");

                    for (int day = 1; day <= days; day++) {
                        System.out.println("Day " + day + " (" + WeekDays[day % 5] + ")" + ": ");

                        String FirstLogInTime = "";
                        String FirstLogOutTime = "";

                        boolean validFormat = false;
                        while (!validFormat) {
                            try {
                                System.out.print("Enter Log In Time in 24H Format [ hh:mm ]: ");
                                FirstLogInTime = scan.next();
                                System.out.print("Enter Log Out Time in 24H Format [ hh:mm ]: ");
                                FirstLogOutTime = scan.next();

                                DateFormat df = new SimpleDateFormat("HH:mm");
                                df.setLenient(false);

                                df.parse(FirstLogInTime);
                                df.parse(FirstLogOutTime);

                                validFormat = true;
                            } catch (ParseException e) {
                                System.out.println("Error: Please enter time in HH:mm format.");
                            }
                        }

                        DateFormat df = new SimpleDateFormat("HH:mm");
                        Date LogIn = df.parse(FirstLogInTime);
                        Date LogOut = df.parse(FirstLogOutTime);

                        System.out.println("Log In Time: " + df.format(LogIn));
                        System.out.println("Log Out Time: " + df.format(LogOut));

                        // remaining code for calculations...
                    }

                    // remaining code for calculations...

                    found = true;
                    break; // exit the loop once employee info is found
                }
            }

            if (!found) {
                System.out.println("Employee not found. Please enter a valid Employee Number.");
                continue;
            }

            System.out.print("Do You Want to Make Another Computation? (yes/no)? ");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("--------------------------------------------");
                System.out.println("Thank You!");
                System.out.println();
                break;
            } else if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Invalid input. Exiting...");
                break;
            }

            System.out.println("--------------------------------------------");
        }
        scan.close();
    }
}
