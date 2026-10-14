import java.util.Calendar;

public class Employee extends Person {
    protected String id;
    protected String department;
    protected double baseSalary;
    protected int startYear;

    public Employee() {
    }

    public Employee(String name, int birthYear, String address, String phone,
                    String id, String department, double baseSalary, int startYear) {
        super(name, birthYear, address, phone);
        this.id = id;
        this.department = department;
        this.baseSalary = baseSalary;
        this.startYear = startYear;
    }

    public String getRole() {
        return "Nhan vien";
    }

    public double calculateSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsOfWork = currentYear - startYear;
        if (yearsOfWork < 0) {
            yearsOfWork = 0;
        }
        return baseSalary + (yearsOfWork * 200000.0);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Chuc vu: " + getRole());
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Phong ban: " + department);
        System.out.println("Nam vao lam: " + startYear);
        System.out.println("Luong: " + calculateSalary() + " VND");
    }
}