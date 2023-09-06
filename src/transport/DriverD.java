package transport;

public class DriverD extends Driver{
    public DriverD(String fullName,
                   boolean hasDriverLicense,
                   int experienceInYears) {
        super(fullName, hasDriverLicense, experienceInYears);
    }

    @Override
    public void startMov() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение");
    }
    @Override
    public void finishMov() {
        System.out.println("Водитель категории D " + getFullName() + " закончил движение");
    }
    @Override
    public void refuelCar() {
        System.out.println("Водитель категории D " + getFullName() + " заправил авто");
    }
}