public class Contact {
    protected String name;
    protected String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() { // Переопределяем метод получения строки из класса для удобочитаемого вида
        return this.name + ": " + this.phone; // Иванов: +71234567890
    }
}
