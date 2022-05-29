import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void add(String name, String phone) {
        contacts.add(new Contact(name, phone));
    }

    public List<Contact> get(String name) {
        List<Contact> results = new ArrayList<>();  // Создаем список результатов
        for (Contact contact: contacts) {           // Проходим по списку контактов
            if(contact.name == name) {              // Ищем все контакты с нужным именем
                results.add(contact);               // Добавляем их в результаты
            }
        }
        return results;
    }
}
