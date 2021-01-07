public class VehicleDemo {
    public static void main(String[] args) {
       Vehicle car1 = new Vehicle();
       Vehicle car2 = new Vehicle();
       car2 = car1;
       car1.mpg = 26;
        System.out.println(car1.mpg);
        System.out.println(car2.mpg);
        Vehicle car3 = new Vehicle();
        car2 = car3;
        car3.mpg = 30;
        System.out.println("_____________");
        System.out.println(car1.mpg);
        System.out.println(car2.mpg);
        System.out.println(car3.mpg);
    }
}
