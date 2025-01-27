package Polymorphism;
class Employee {
    public void calculateBonus() {
        System.out.println("Calculating a generic employee bonus.");
    }
}

class FullTimeEmployee extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Calculating full-time employee bonus.");
    }
}

class PartTimeEmployee extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Calculating part-time employee bonus.");
    }
}

class ContractEmployee extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Calculating contract employee bonus.");
    }
}

public class CompanybonusSystem {
    public static void main(String[] args) {
        Employee employee;

        employee = new FullTimeEmployee();
        employee.calculateBonus();

        employee = new PartTimeEmployee();
        employee.calculateBonus();

        employee = new ContractEmployee();
        employee.calculateBonus();
    }
}
