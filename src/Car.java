public class Car extends Vehicle{

    public Integer airbags;

    public Car() {
    }

    public Car(String name, Float price, String type, Integer airbags) {
        super(name, price, type);
        this.airbags = airbags;
    }

    public Integer getAirbags() {
        return airbags;
    }

    public void setAirbags(Integer airbags) {
        this.airbags = airbags;
    }
}
