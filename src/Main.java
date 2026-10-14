public class Main {
    public static void main(String[] args) {
        Person[] danhSach = new Person[4];

        danhSach[0] = new Employee("Nguyen Van A", 1995, "Ha Noi", "0901234567",
                "NV01", "Hanh chinh", 8000000, 2020);

        danhSach[1] = new Developer("Tran Thi B", 1998, "Da Nang", "0912345678",
                "DEV01", "IT", 12000000, 2021,
                "Java", 15.5, 150000);

        danhSach[2] = new Manager("Le Van C", 1988, "TP.HCM", "0987654321",
                "MNG01", "Quan ly du an", 20000000, 2018,
                8, 500000);

        danhSach[3] = new Developer("Pham Van D", 2000, "Hai Phong", "0933445566",
                "DEV02", "IT", 10000000, 2023,
                "Python", 10, 120000);

        System.out.println("========== DANH SACH NHAN SU ==========");
        for (int i = 0; i < danhSach.length; i++) {
            System.out.println("\n--- Thong tin nguoi thu " + (i + 1) + " ---");
            danhSach[i].showInfo();
        }

        double tongLuong = 0;
        for (int i = 0; i < danhSach.length; i++) {
            if (danhSach[i] instanceof Employee) {
                Employee emp = (Employee) danhSach[i];
                tongLuong += emp.calculateSalary();
            }
        }
        System.out.println("\n=======================================");
        System.out.println("Tong luong phai tra cho nhan vien: " + tongLuong + " VND");

        int countDev = 0;
        int countManager = 0;

        for (int i = 0; i < danhSach.length; i++) {
            if (danhSach[i] instanceof Developer) {
                countDev++;
            } else if (danhSach[i] instanceof Manager) {
                countManager++;
            }
        }

        System.out.println("So luong Developer: " + countDev);
        System.out.println("So luong Manager: " + countManager);
        System.out.println("=======================================");
    }
}