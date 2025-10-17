import java.io.IOException;
import java.util.Scanner;

/**
 * Пользовательский интерфейс в консоли
 */
public class UserInterface {
    private final Scanner _in = new Scanner(System.in);
    private final ProductRepository _repository = new ProductRepository();
    private final ProductFileWriter _fileWriter = new ProductFileWriter();

    /**
     * Запускает работу интерфейса
     */
    public void run() {
        printLabInfo();
        addProducts();
        printRepository();
        saveReposToFile();
    }

    /**
     * Выводит информацию о лабораторной работе
     */
    public void printLabInfo() {
        System.out.println("Лабораторная работа 4");
        System.out.println("Выполнили студенты гр. 24ВП1: Фомин В.Д., Песков Р.С.");
        System.out.println("Задание:");
        System.out.println("Создать HashMap, содержащий пары значений - имя игрушки и объект\n" +
                "игрушки (класс Product). Перебрать и распечатать пары значений -\n" +
                "entrySet(). Перебрать и распечатать набор из имен продуктов - keySet().\n" +
                "Перебрать и распечатать значения продуктов - values(). Для каждого\n" +
                "перебора создать свой метод. Результаты сохранить в файл. Создать\n" +
                "итератор для коллекции.\n");
    }

    /**
     * Добавляет товары в коллекцию
     */
    public void addProducts() {
        _repository.add(new Product("Кукла", 550.0));
        _repository.add(new Product("Мяч", 300.0));
        _repository.add(new Product("Машинка", 420.0));
    }

    /**
     * Показывает содержимое коллекции, ключи и значения
     */
    public void printRepository() {
        _repository.printEntries();
        _repository.printKeys();
        _repository.printValues();
    }

    /**
     * Сохраняет содержимое в файл
     */
    public void saveReposToFile() {
        boolean isNameCorrect = false;

        while (!isNameCorrect) {
            try {
                System.out.println("Введите имя файла для сохранения: ");
                String filename = _in.nextLine() + ".txt";
                _fileWriter.saveToFile(filename, _repository);
                isNameCorrect = true;
                System.out.println("Данные успешно записаны в файл " + filename);
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл: " + e.getMessage());
            }
        }
    }
}
