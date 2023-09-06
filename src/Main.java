import transport.*;

import java.sql.DriverAction;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Водитель кат.В № " + i,
                    true,
                    5 + i);
            Car car = new Car(
                    "Автомобиль " + i,
                    "№" + i,
                    1.8,
                    driverB);

            DriverD driverD = new DriverD("Водитель кат.D № " + i,
                    true,
                    7 + i);
            Bus bus = new Bus(
                    "Автобус марка " + i,
                    "№" + i,
                    3.0,
                    driverD);

            DriverС driverC = new DriverС("Водитель кат.C № " + i,
                    true,
                    5 + i);
            Truck truck = new Truck(
                    "Грузовик марка " + i,
                    "№" + i,
                    4.0,
                    driverC);

            printInfo(car);
            printInfo(bus);
            printInfo(truck);
        }
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getModel() + " и будет участвовать в заезде");
    }
}