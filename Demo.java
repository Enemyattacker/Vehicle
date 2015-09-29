package ru.stetsenko;

/**Демо класс, предназначенный для демонстрации класса Vehicle
 * 
 * @author Стеценко Алексей
 */
public class Demo {
    public static void main(String[] args) {

        Airplane plane = new Airplane(1000, 10000, 40, 20, 10, 250);
        System.out.println(plane.toString());

        Boat boat = new Boat(250, 20, 10, 10);
        System.out.println(boat.toString());

        Car car = new Car(200, 4, 3, 3, 2);
        System.out.println(car.toString());

        Taxi taxi = new Taxi(3, 4, 3, 3, 2007);
        System.out.println(taxi.toString());

        Truck truck = new Truck (3000, 4, 3, 3, 7000);
        System.out.println(truck.toString());
    }
}
