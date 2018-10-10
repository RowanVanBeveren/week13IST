import java.util.Scanner;

public class week13IST {

    public static void main(String[] args) {
        whichProgram();

    }

    private static void whichProgram() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Which program would you like to run? \n 1 = newSalaryInputProgram \n 2 = userIdCreationProgram \n 3 = salaryIncreaseProgram \n 4 = calculateAverageProgram \n 5 = tableOfSquaresAndCubes \n 6 = whatIsThePercentage \n 7 = reverseNumbers \n 8 = convertingNumbers (Hard coded) \n 9 = convertingNumbers ");
        int number = scan.nextInt();
        if (number == 1) {
            newSalaryInputProgram();
        } else if (number == 2) {
            userIdCreationProgram();
        } else if (number == 3) {
            generatePhoneNumProgram();
        } else if (number == 4) {
            multiTempConversionProgram();
        } else if (number == 5) {
            unitsAndGrades();
        } else if (number == 6) {

        } else if (number == 7) {

        }


        else{
                System.out.println("The number you have given is not an option please choose from the options given");
                whichProgram();
            }


        }


    public static void newSalaryInputProgram() {              //Task 1

        int currentSalary = 23000;
        int newSalary;

        Scanner input = new Scanner(System.in);


        System.out.println("Is it time to pay the employees. Yes or No?");
        String answer = input.nextLine();
        input.close();


        if (answer.equals("yes")) {
            System.out.println("How much would you like to increase the employees salary by?");
            int increase = input.nextInt();
            newSalary = currentSalary + increase;
            System.out.println("The new salary of the employee is " + newSalary);
        } else if (answer.equals("no")) {
            System.out.println("The employees were not given a raise their salary is still " + currentSalary + " be careful of a revolution");

        }

        rerun();
    }




    public static void userIdCreationProgram(){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String fName = input.nextLine();
        System.out.println("What is you last name?");
        String lName = input.nextLine();
        String nSLName = lName.replaceAll("\\s", "");
        String bId = nSLName.substring(0,5);
        String userName =  fName.charAt(0) + bId;
        String lUserName = userName.toLowerCase();
        System.out.println("Your ID is " + lUserName);

    }

    public static void generatePhoneNumProgram(){


    }

    public static void multiTempConversionProgram(){

    }

    public static void unitsAndGrades(){

        Scanner input = new Scanner(System.in);

        String[] units;
        units = new String[] {"CF","DaD","PoP","N&CS","SAD","APP"};

        int[] grades;







    }










    public static void rerun(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to run another program? Yes or No?");
        String ans = input.nextLine();
        ans.toLowerCase();
        if (ans.equals("yes")){
            whichProgram();
        }
        else if (ans.equals("no")){
            System.out.println("Bye bye");
        }
    }

}
