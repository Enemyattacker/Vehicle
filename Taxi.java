package ru.stetsenko;

/**
 * Класс демонстрирующий такси
 * Является подклассом класса Car
 *
 * @author Стеценко Алексей
 */
public class Taxi extends Car {

    private int passengers;
    private int releaseDate;

    /**
     * Метод инициализирует объект класса Taxi
     *
     * @param passengers вместимость
     * @param length длина
     * @param width ширина
     * @param height высота
     * @param releaseDate год выпуска машины
     */
    public Taxi(int passengers, int length, int width, int height, int releaseDate) {
        super(200, 4, length, width, height);
        this.passengers = passengers;
        this.releaseDate = releaseDate;
    }

    public String toString() {
        return "Такси: " + super.toString() + ", вместимость: " + this.passengers + ", год выпуска: " + this.releaseDate;
    }
}
