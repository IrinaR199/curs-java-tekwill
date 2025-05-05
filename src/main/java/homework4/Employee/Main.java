package homework4.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Julia", 30, "HR");

        System.out.println("Employee 1:");
        System.out.println("Имя: " + emp.getName());
        System.out.println("Возраст: " + emp.getAge());
        System.out.println("Отдел: " + emp.getDepartment());

        emp.setName("Bob");
        emp.setAge(35);
        emp.setDepartment("Finance");

        System.out.println("\nEmployee 2:");
        System.out.println("Имя: " + emp.getName());
        System.out.println("Возраст: " + emp.getAge());
        System.out.println("Отдел: " + emp.getDepartment());
    }
}
