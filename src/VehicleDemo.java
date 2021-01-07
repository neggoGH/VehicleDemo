public class VehicleDemo {
    public static void main(String[] args) {
       Vehicle minivan = new Vehicle();
       Vehicle sportcar = new Vehicle();
       int dist = 252;

       minivan.passengers = 7;
       minivan.fuelcap = 16;
       minivan.mpg = 21;

       sportcar.passengers = 2;
       sportcar.fuelcap = 14;
       sportcar.mpg = 12;

        System.out.println("Мини-фургон может веревезти " + minivan.passengers + " пассажиров на расстояние " + minivan.range() + " миль. " +
                "Для преодоления "  + dist + " миль минифургону требуется " + minivan.fuelneeded(dist) + " галлонов топлива");
        System.out.println("Спорткар может веревезти " + sportcar.passengers + " пассажиров на расстояние " + sportcar.range() + " миль." +
                "Для преодоления "  + dist + " миль спорткару требуется " + sportcar.fuelneeded(dist) + " галлонов топлива");
    }
}
