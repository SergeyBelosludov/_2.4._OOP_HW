package transport;

public class DriverB extends Driver{
    public DriverB(String fullName,
                   boolean hasDriverLicense,
                   int experienceInYears) {
        super(fullName, hasDriverLicense, experienceInYears);
    }

    @Override
    public void startMov() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");
    }
    @Override
    public void finishMov() {
        System.out.println("Водитель категории В " + getFullName() + " закончил движение");
    }
    @Override
    public void refuelCar() {
        System.out.println("Водитель категории В " + getFullName() + " заправил авто");
    }
}
