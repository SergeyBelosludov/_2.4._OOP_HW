package transport;

public class Car extends Transport {

    private final String carCase;
    private final int numberOfSeats;
    private double engineVolume;
    private String transmission;
    private String registrationNumber;
    private boolean summerTires;
    private Key key;

    //-----------------------------------------------------------------------------------------------------

    public String getCarCase() {
        return carCase;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    //-----------------------------------------------------------------------------------------------------

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validOrDefault(transmission, "по умолчанию МТ");
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validOrDefault(registrationNumber, "по умолчанию хх000х000");
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;

    }
    //-----------------------------------------------------------------------------------------------------

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String carCase, int numberOfSeats, String transmission,
               String registrationNumber, boolean summerTires, Key key, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.carCase = validOrDefault(carCase, "по умолчанию Седан");
        this.numberOfSeats = validOrDefault2(numberOfSeats, 0);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setEngineVolume(engineVolume);
        this.summerTires = summerTires;
        setKey(key);
    }

    private static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    private int validOrDefault2(int value2, int defaultValue2) {
        return value2 > 0 ? value2 : defaultValue2;
    }

    //-----------------------------------------------------------------------------------------------------

    public void changeTiresSeasonal(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) ;
        {
            summerTires = false;
        }
        if (month >= 5 && month <= 10) ;
        {
            summerTires = true;
        }
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "с удаленным запуском двидателя" : "без удаленного запуска двигателя") +
                    ", " + (keylessAccess ? "с бесключевым доступом" : "без бесключевого доступа");
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    //-----------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return super.toString() + ", объем двигателя " + engineVolume + " л., кузов " + carCase + ", "
                + numberOfSeats + " мест, " + transmission + " коробка передач, на " +
                (summerTires ? "летней" : "зимней") + " резине, гос.номер " + registrationNumber + ", авто " + key;
    }
}