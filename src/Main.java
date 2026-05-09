import java.sql.SQLOutput;
import java.util.Scanner;

interface utility
{
    public void getDetails();
    public void setDetails();
}

public class Main {

    static void MainMenu()
    {
        System.out.println("=====================WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM==================");
        System.out.println();
        System.out.println("====================ENTER YOUR CHOICE==================");
        System.out.println();
        System.out.println("1). ADD SHOWROOM");
        System.out.println("2). ADD EMPLOYEE");
        System.out.println("3). ADD CARS");
        System.out.println("4). GET SHOWROOM");
        System.out.println("5). GET EMPLOYEE");
        System.out.println("6). GET CARS");
        System.out.println("0). EXIT");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShowRoom showroom[]= new ShowRoom[5];
        Employees employees[]=new Employees[5];
        Cars cars[]=new Cars[5];
        int carCounter=0;
        int empCounter=0;
        int showroomCounter=0;

        int choice=100;


        while(choice!=0){
            MainMenu();
            choice=sc.nextInt();

            while(choice!=9 && choice!=0) {
                switch (choice) {
                    case 1:
                        showroom[showroomCounter] = new ShowRoom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println("1). ADD NEW SHOWROOM");
                        System.out.println("9). GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employees[empCounter] = new Employees();
                        employees[empCounter].setDetails();
                        empCounter++;
                        System.out.println("1). ADD NEW EMPLOYEE");
                        System.out.println("9). GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        cars[carCounter] = new Cars();
                        cars[carCounter].setDetails();
                        carCounter++;
                        System.out.println("1). ADD NEW CARS");
                        System.out.println("9). GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        for(int i=0;i<showroom.length;i++){
                            showroom[i].getDetails();
                            System.out.println();

                        }
                        System.out.println();
                        System.out.println("9). GO BACK TO MAIN MENU");
                        System.out.println("0). EXIT");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for(int i=0;i<empCounter;i++){
                            employees[i].getDetails();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). GO BACK TO MAIN MENU");
                        System.out.println("0). EXIT");
                        choice = sc.nextInt();
                        break;

                    case 6:
                       for(int i=0;i<carCounter;i++){
                           cars[i].getDetails();
                           System.out.println();

                       }
                       System.out.println();
                       System.out.println("9). GO BACK TO MAIN MENU");
                       System.out.println("0). EXIT");
                       choice = sc.nextInt();
                       break;

                   default:
                       System.out.println("Invalid choice");
                       break;
                }
            }
        }


    }


}