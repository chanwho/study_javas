package cases.inheritancevehicles;
public class InheritanceVehicles {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        vehicles.speed(10, 3);
        vehicles.weight(100, 2, 4);
        Vans vans = new Vans();
        vans.speed(100, 23);
        vans.weight(10, 3, 4);
        vans.windows_count(3);
        Cars cars = new Cars();
        cars.speed(20, 4);
        cars.weight(4, 20, 3);
    }
}
