import java.sql.SQLOutput;
import java.util.Scanner;

public class Cars extends ShowRoom implements utility {

    String carName;
    String carColor;
    String carFuleType;
    int carPrince;
    String carType;
    String carTransmission;


    public void getDetails()
    {
        System.out.println("NAME: "+carName);
        System.out.println("COLOR: "+carColor);
        System.out.println("FULE TYPE: "+carFuleType);
        System.out.println("PRINCE: "+carPrince);
        System.out.println("CAR TYPE: "+carType);
        System.out.println("TRANSMISSION: "+carTransmission);



    }

    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================ENTER CAR DETAILS=======================");
        System.out.println("CAR NAME: ");
        carName = sc.nextLine();
        System.out.println("CAR COLOR: ");
        carColor = sc.nextLine();
        System.out.println("CAR FULE TYPE(PETROL/DIESEL): ");
        carFuleType = sc.nextLine();
        System.out.println("CAR PRINCE: ");
        carPrince = sc.nextInt();
        System.out.println("CAR TYPE(SEDAN/SUV/HATCHABCK): ");
        carType = sc.nextLine();
        System.out.println("CAR TRANSMISSION(AUTOMATIC/MANUAL): ");
        carTransmission = sc.nextLine();
        totalCarInStock++;



    }
}
