package transport;

public abstract class Transport<T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {

        if (brand == null || brand.isBlank()) {
            brand = "defaul";
        }
        this.brand = brand;

        if (model == null || model.isBlank()) {
            model = "defaul";
        }
        this.model = model;

        setEngineVolume(engineVolume);
        setDriver(driver);
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <=0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }
    public void setDriver(T driver) {
        this.driver = driver;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public abstract void startMoving();

    public abstract void finishMoving();
    @Override
    public String toString() {
        return "Марка " + brand +
                ", модель " + model +
                ", объем двигателя " + engineVolume;
    }
}