import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/**
 * Класс, отвечающий за запись данных в файл
 */
public class ProductFileWriter {

    /**
     * Записывает данные коллекции в файл
     *
     * @param fileName имя файла
     * @param repository коллекция
     * @throws IOException исключение при создании файла
     */
    public void saveToFile(String fileName, ProductRepository repository) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(fileName));
        try {
            Iterator<Map.Entry<String, Product>> iterator = repository.iterator();
            writer.println("entrySet");
            while (iterator.hasNext()) {
                Map.Entry<String, Product> entry = iterator.next();
                writer.println(entry.getKey() + " = " + entry.getValue());
            }
            writer.println();

            writer.println("keySet");
            for (String key : repository.getKeys()) {
                writer.println(key);
            }
            writer.println();

            writer.println("values");
            for (Product value : repository.getValues()) {
                writer.println(value);
            }
        } finally {
            writer.close();
        }
    }
}
