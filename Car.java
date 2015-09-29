package ru.stetsenko;

/**
 * Класс демонстрирующий вид транспорта автомобиль
 *
 * @author Стеценко Алексей
 */
public class Car extends Vehicle {

    private int wheels;

    /**
     * Метод инициализирует объект класса Car
     *
     * @param maxSpeed максимальная скорость
     * @param wheels количество колёс
     * @param length длина
     * @param width ширина
     * @param height высота
     */
    public Car(int maxSpeed, int wheels, int length, int width, int height) {
        super(1, maxSpeed, length, width, height);
        this.wheels = wheels;
    }

    public String toString() {
        return "Машина: " + super.toString() + ", колёс: " + this.wheels;
    }
}
