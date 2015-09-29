package ru.stetsenko;

/**
 * Класс демонстрирующий вид транспорта корабль
 *
 * @author Стеценко Алексей
 */
public class Boat extends Vehicle {

    /**
     * Метод инициализирует объект класса Boat
     *
     * @param maxSpeed максимальная скорость
     * @param length длина корабля
     * @param width ширина корабля
     * @param height высота корабля
     */
    public Boat(int maxSpeed, int length, int width, int height) {
        super(2, maxSpeed, length, width, height);
    }

    public String toString() {
        return "Корабль: " + super.toString();
    }
}
