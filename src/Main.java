import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
    List<Vehicle> Carshop = new ArrayList<>();

    Motorcycle H2R = new Motorcycle("H2R", 55000F, "Motorcylce",998F);
    Utilitary Sprinter = new Utilitary("Sprinter", 15000F, "Utilitary",  3500F,  4.2F);
    StreetCar Yaris = new StreetCar("Yaris", 17000F,  "Street Car",  2, 5);
    RacingCar Valkiriye = new RacingCar("Valkiriye", 3000000F,"Racing Car",0,370F);

    Carshop.add(Sprinter);
    Carshop.add(Yaris);
    Carshop.add(Valkiriye);
    Carshop.add(H2R);

    for (int i = 0; i<4; i++)
    {
        Carshop.get(i).showVehicle();
    }

    Float percentage = 5F;

    for (int i = 0; i<4; i++)
    {
        System.out.printf("Old price of the vehicle: [%.2f]\n",Carshop.get(i).getPrice());
        Carshop.get(i).increaseCarValue(percentage);
        System.out.printf("New price of the vehicle: [%.2f]\n\n", Carshop.get(i).getPrice());
        percentage = percentage + 5F;
    }

    }
}
