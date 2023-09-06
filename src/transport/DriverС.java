package transport;

public class DriverС extends Driver{
    public DriverС(String fullName,
                   boolean hasDriverLicense,
                   int experienceInYears) {
        super(fullName, hasDriverLicense, experienceInYears);
    }

    @Override
    public void startMov() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение");
    }
    @Override
    public void finishMov() {
        System.out.println("Водитель категории C " + getFullName() + " закончил движение");
    }
    @Override
    public void refuelCar() {
        System.out.println("Водитель категории C " + getFullName() + " заправил авто");
    }
}
