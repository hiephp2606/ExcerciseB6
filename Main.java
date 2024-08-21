import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhap so nhan vien ban muon nhap: ");
            int n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                System.out.println("So vua nhap khong hop le, xin hay nhap lai (lon hon 0)");
            }
            else {
                Employee Employees[] = new Employee[n];

//      Nhap thong tin nhan vien
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin nhan vien thu " + (i+1));
                    System.out.printf("Nhap ID: ");
                    int ID = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap ten nhan vien: ");
                    String Name = sc.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int Age = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap so nam kinh nghiem: ");
                    double Experience = Double.parseDouble(sc.nextLine());
                    Employee person = new Employee(ID, Name, Age, Experience);
                    Employees[i] = person;
                    }
//      In ra danh sach nhan vien
                System.out.println("Danh sach nhan vien: ");
                for (int i = 0; i < n; i++) {
                    System.out.println(Employees[i]);
                }
                System.exit(0);
            }
        }
    }
}
