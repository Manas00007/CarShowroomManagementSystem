import javax.xml.transform.Source;
import java.util.Scanner;

public class ShowRoom implements utility{

    String showRoomName;
    String showRoomAddress;
    int totalEmployees;
    int totalCarInStock=0;
    String managerName;



    public void getDetails()
    {
        System.out.println("Showroom Name: "+showRoomName);
        System.out.println("Showroom Address: "+showRoomAddress);
        System.out.println("Manager Name: "+managerName);
        System.out.println("Total Employees: "+totalEmployees);
        System.out.println("Total Car In Stock: "+totalCarInStock);


    }

    public void setDetails()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("-------------------Enter Showroom Details---------------");
        System.out.print("SHOWROOM NAME: ");
        showRoomName=sc.nextLine();
        System.out.print("SHOWROOM ADDRESS: ");
        showRoomAddress=sc.nextLine();
        System.out.println("MANAGER NAME: ");
        managerName=sc.nextLine();
        System.out.print("TOTAL EMPLOYEES: ");
        totalEmployees=sc.nextInt();
        System.out.print("TOTAL CAR IN STOCK: ");
        totalCarInStock=sc.nextInt();


    }
}
