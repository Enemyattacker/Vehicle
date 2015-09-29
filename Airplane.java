package ru.stetsenko;

/**
 * Класс демонстрирующий вид транспорта самолет
 *
 * @author Стеценко Алексей
 */
public class Airplane extends Vehicle {

    private int maxHeight;
    private int passengers;

    /**
     * Метод инициализирует объект класса Airplane
     *
     * @param maxSpeed максимальная скорость
     * @param maxHeight максимальная высота полёта
     * @param length длина самолёта
     * @param width ширина самолёта
     * @param height высота самолёта
     * @param passengers количество посадочных мест
     */
    public Airplane(int maxSpeed, int maxHeight, int length, int width, int height, int passengers) {
        super(3, maxSpeed, length, width, height);
        this.maxHeight = maxHeight;
        this.passengers= passengers;
    }

    public String toString() {
        return "Самолёт: " + super.toString() + ", максимальная высота: " + this.maxHeight + ", количество посадочных мест: " + this.passengers;
    }

}
