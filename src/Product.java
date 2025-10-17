/**
 * Товар
 */
public class Product {
    private String _name;
    private double _price;

    /**
     * Конструктор класса
     *
     * @param name
     * @param price
     */
    public Product(String name, double price) {
        this._name = name;
        this._price = price;
    }

    /**
     * Возвращает имя товара
     *
     * @return имя товара
     */
    public String getName() {
        return _name;
    }

    /**
     * Переопределяет метод toString для объектов класса
     *
     * @return строка с информацией о товаре
     */
    @Override
    public String toString() {
        return String.format("%s (%.2f руб.)", _name, _price);
    }

}
