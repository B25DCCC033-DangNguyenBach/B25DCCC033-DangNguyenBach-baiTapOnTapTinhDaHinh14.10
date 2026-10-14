public class Developer extends Employee {
    private String language;
    private double overtimeHours;
    private double overtimeRate;

    public Developer(String name, int birthYear, String address, String phone,
                     String id, String department, double baseSalary, int startYear,
                     String language, double overtimeHours, double overtimeRate) {
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.language = language;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (overtimeHours * overtimeRate);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ngon ngu lap trinh: " + language);
        System.out.println("So gio OT: " + overtimeHours + " | Don gia OT: " + overtimeRate);
    }
}