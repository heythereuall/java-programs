import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
}

class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[5];

        for (int i = 0; i < 5; i++) {
            e[i] = new Employee();
            e[i].id = sc.nextInt();
            e[i].name = sc.next();
            e[i].salary = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(e[i].id + " " + e[i].name + " " + e[i].salary);
        }
    }
}
