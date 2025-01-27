package Inheritence;


class Employee {
    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int employeeId, int teamSize) {
        super(name, employeeId);
        this.teamSize = teamSize;
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting with " + teamSize + " team members.");
    }
}


class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}


public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 10);
        Developer developer = new Developer("Bob", 102, "Java");

        manager.work();  
        manager.conductMeeting();  

        developer.work();  
        developer.writeCode();  
    }
}
