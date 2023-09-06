package transport;

public class Car extends Transport<DriverB> {

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начал движение (марки " + getBrand() +
                " модели " + getModel() +
                " с объемом двигателя " + getEngineVolume() + ")");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль закончил движение (марки " + getBrand() +
                " модели " + getModel() +
                " с объемом двигателя " + getEngineVolume() + ")");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minTime = 3;
        int maxTime = 40;
        int bestLapTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга у автомобиля = " + bestLapTime + " мин");
    }

    @Override
    public void maxSpeed() {
        int minSp = 40;
        int maxSp = 210;
        int maxSpeed = (int) (minSp + (maxSp - minSp) * Math.random());
        System.out.println("Максимальная скорость для автомобиля = " + maxSpeed + " км/ч");
    }
}