class Employee {
    private int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Sit on desk");
    }

    void getSalary() {
        System.out.println("Salary is "+ this.salary);
    }
}

class HRManager extends Employee {

    HRManager(int salary) {
        super(salary);
    }

    @Override void work() {
        System.out.println("Handle problems");
    }
}



public class j4 {
    public static void main(String[] args) {
        Employee manan = new Employee(69);
        manan.work();
        manan.getSalary();

        HRManager a = new HRManager(72);
        a.work();
        a.getSalary();
    }
}
