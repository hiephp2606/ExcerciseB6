import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so nhan vien ban muon nhap: ");
        int n = Integer.parseInt(sc.nextLine());
        int Employees[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap ID: ");
            int ID = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ten nhan vien: ");
            String Name = sc.nextLine();
            System.out.println("Nhap tuoi: ");
            int Age = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap so nam kinh nghiem: ");
            Double Experience = Double.parseDouble(sc.nextLine());
        }

    }
}
