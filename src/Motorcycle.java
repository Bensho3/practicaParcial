public class Motorcycle extends Vehicle implements Deportive{

    public Float displacement;

    public Float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Float displacement) {
        this.displacement = displacement;
    }

    public Motorcycle() {
    }

    public Motorcycle(String name, Float price, String type, Float displacement) {
        super(name, price, type);
        this.displacement = displacement;
    }

    @Override

    public String TrackAvalible()
    {
        return "This motorcycle is avalible for track days and circuits";
    }

    @Override
    public void showVehicle() {
        System.out.printf("Type of Vehicle:[%s], Model: [%s], Price:[%.2f]\n Displacement: [%.2f cc]\n\n\n", type,name,price,displacement);
    }


}