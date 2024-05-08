public class StreetCar extends Car{
    public Integer passengers;

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    public StreetCar(String name, Float price, String type, Integer airbags, Integer passengers) {
        super(name, price, type, airbags);
        this.passengers = passengers;
    }

    public StreetCar() {
    }

    @Override
    public void showVehicle() {
        System.out.printf("Type of Vehicle:[%s], Model: [%s], Price:[%.2f]\n Airbags:[%d], Passengers:[%d]\n\n\n", type,name,price,airbags,passengers);
    }

}

