public class VehicleDemo {
    public static void main(String[] args) {
       Vehicle minivan = new Vehicle(7,16,21);
       Vehicle sportcar = new Vehicle(2,14,12);
       int dist = 252;

        System.out.println("Мини-фургон может веревезти " + minivan.passengers + " пассажиров на расстояние " + minivan.range() + " миль. " +
                "Для преодоления "  + dist + " миль минифургону требуется " + minivan.fuelneeded(dist) + " галлонов топлива");
        System.out.println("Спорткар может веревезти " + sportcar.passengers + " пассажиров на расстояние " + sportcar.range() + " миль." +
                "Для преодоления "  + dist + " миль спорткару требуется " + sportcar.fuelneeded(dist) + " галлонов топлива");
    }
}
