public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    int range() {
        return fuelcap * mpg;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
