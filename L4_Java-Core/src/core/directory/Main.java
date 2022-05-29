import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] {
                "Роман",
                "Полина",
                "Александр",
                "Полина",
                "Андрей",
                "Григорий",
                "Оксана",
                "Роман",
                "Полина",
                "Андрей",
                "Лидия",
                "Карина",
                "Оксана",
                "Дмитрий",
                "Александр"
        };

        Set<String> unique_names = new HashSet<>(Arrays.asList(names)); // Получаем из массива список уникальных имен посредством HashSet
        System.out.println("Уникальные имена: " + unique_names);

        Map<String, Integer> names_count = new HashMap<>(); // Создаем словарь имён с количеством их появлений в массиве
        for(String name: names) {
            if (names_count.containsKey(name)) { // Если имя уже есть в словаре
                int count = names_count.get(name); // Получаем текущее значение количества из словаря
                names_count.put(name, count + 1); // Увеличиваем его на 1 и записываем обратно
            } else {
                names_count.put(name, 1); // Если имени ещё нет, записываем его с единичным появлением
            }
        }
        System.out.println("Количество появлений каждого имени в массиве: ");
        for(String name: names_count.keySet()) {
            int occurrence = names_count.get(name);
            System.out.println(name + ": " + occurrence);
        }

        System.out.println("\n===\n");
        PhoneBook book = new PhoneBook();
        book.add("Фролов", "+79991232312");
        book.add("Максимова", "+7932327654");
        book.add("Александров", "+79135642352");
        book.add("Фролов", "+18003123412");
        book.add("Иванова", "+36463246231");

        List<Contact> res1 = book.get("Максимова");
        List<Contact> res2 = book.get("Фролов");
        System.out.println("Результаты поиска контактов по фамилии Максимова: " + res1);
        System.out.println("Результаты поиска контактов по фамилии Фролов: " + res2);

    }
}
