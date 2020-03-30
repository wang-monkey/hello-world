import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("卧槽:" + name);
        System.out.println("卧槽:" + age);
        System.out.println("卧槽:" + designation);
        System.out.println("卧槽:" + salary);
    }
}
