import java.util.Calendar;

public class Person {
    protected String name;
    protected int birthYear;
    protected String address;
    protected String phone;

    public Person() {
    }

    public Person(String name, int birthYear, String address, String phone) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.phone = phone;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }

    public void showInfo() {
        System.out.println("Ho ten: " + name);
        System.out.println("Nam sinh: " + birthYear + " (Tuoi: " + getAge() + ")");
        System.out.println("Dia chi: " + address);
        System.out.println("So dien thoai: " + phone);
    }
}