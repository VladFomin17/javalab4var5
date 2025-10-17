import java.util.*;

/**
 * Коллекция HashMap, хранящая объекты класса Product
 */
public class ProductRepository {
    private HashMap<String, Product> _products = new HashMap<>();

    /**
     * Добавляет объект в коллекцию
     *
     * @param product добавляемый объект
     */
    public void add(Product product) {
        _products.put(product.getName(), product);
    }

    /**
     * Выводит пары ключ-значение в консоль
     */
    public void printEntries() {
        System.out.println("entrySet");
        for (Map.Entry<String, Product> entry : _products.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    /**
     * Выводит ключи в консоль
     */
    public void printKeys() {
        System.out.println("keySet");
        for (String key : _products.keySet()) {
            System.out.println(key);
        }
    }

    /**
     * Выводит значения в консоль
     */
    public void printValues() {
        System.out.println("values");
        for (Product value : _products.values()) {
            System.out.println(value);
        }
    }

    /**
     * Возвращает итератор для коллекции
     *
     * @return итератор
     */
    public Iterator<Map.Entry<String, Product>> iterator() {
        return _products.entrySet().iterator();
    }

    /**
     * Возвращает множество пар значений
     * @return множество пар значений
     */
    public Set<Map.Entry<String, Product>> getEntries() {
        return _products.entrySet();
    }

    /**
     * Возвращает множество ключей
     * @return множество ключей
     */
    public Set<String> getKeys() {
        return _products.keySet();
    }

    /**
     * Возвращает множество значений
     * @return множество значений
     */
    public Collection<Product> getValues() {
        return _products.values();
    }
}
