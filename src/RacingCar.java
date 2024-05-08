public class RacingCar extends Car implements Deportive{

    public Float maxspeed;

    public Float getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(Float maxspeed) {
        this.maxspeed = maxspeed;
    }

    public RacingCar() {
    }

    public RacingCar(String name, Float price, String type, Integer airbags, Float maxspeed) {
        super(name, price, type, airbags);
        this.maxspeed = maxspeed;
    }

    @Override

    public String TrackAvalible()
    {
        return "This car is avalible for track days and circuits";
    }

    @Override
    public void showVehicle() {
        System.out.printf("Type of Vehicle:[%s], Model: [%s], Price:[%.2f]\n Airbags:[%d], Max Speed:[%.2f]\n\n\n", type,name,price,airbags,maxspeed);

    }


}
