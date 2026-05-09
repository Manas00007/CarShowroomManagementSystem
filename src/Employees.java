import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.UUID;

public class Employees extends ShowRoom implements utility{

    String empId;
    String empName;
    int empAge;
    String EmpDepartment;






    public void getDetials()
    {

        System.out.println("ID: "+empId);
        System.out.println("NAME: "+empName);
        System.out.println("AGE: "+empAge);
        System.out.println("DEPARTMENT: "+EmpDepartment);
        System.out.println("Showroom Name: "+showRoomName);

    }

    public void setDetials()
    {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        empId = String.valueOf(uuid);
        System.out.println("=============================ENTER EMPLOYE DETAILS=============================");
        System.out.println("EMPLOYEE NAME: ");
        empName = sc.nextLine();
        System.out.println("EMPLOYEE AGE: ");
        empAge = sc.nextInt();
        System.out.println("EMPLOYEE DEPARTMENT: ");
        EmpDepartment = sc.nextLine();
        System.out.println("Showroom Name: ");
        showRoomName = sc.nextLine();


    }
}
