package transport;

public abstract class Driver {
    private String fullName;
    private boolean hasDriverLicense;
    private int experienceInYears;

    public Driver(String fullName,
                  boolean hasDriverLicense,
                  int experienceInYears) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.experienceInYears = experienceInYears;
    }
    public abstract void startMov();

    public abstract void finishMov();
    public abstract void refuelCar();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}