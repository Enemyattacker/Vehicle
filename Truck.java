package ru.stetsenko;

/**
 * Класс демонстрирующий грузовики
 * Является подклассом класса Car
 *
 * @author Стеценко Алексей
 */
public class Truck extends Car {

    private int weight;
    private int distance;

    /**
     * Метод инициализирует объект класса Truck
     *
     * @param weight грузоподъёмность
     * @param length длина
     * @param width  ширина
     * @param height высота
     * @param distance пробег машины
     */
    public Truck (int weight, int length, int width, int height, int distance){
        super(170, 6, length, width, height);
        this.weight=weight;
        this.distance=distance;
    }

    public String toString() {
        return "Грузовой автомобиль: " + super.toString() + ", грузоподъёмность: " + this.weight + ", пробег: " + this.distance;
    }
}
