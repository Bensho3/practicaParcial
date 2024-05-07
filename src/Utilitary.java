public class Utilitary extends Vehicle{
    public Float maxweight;
    public Float height;

    public Float getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(Float maxweight) {
        this.maxweight = maxweight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Utilitary() {
    }

    public Utilitary(String name, Float price, String type, Float maxweight, Float height) {
        super(name, price, type);
        this.maxweight = maxweight;
        this.height = height;
    }

    @Override
    public void showVehicle() {
        System.out.printf("Type of Vehicle:[%s], Model: [%s], Price:[%.2f]\n Max Weight:[%.2f], Height:[%2.f]\n");
    }
}
