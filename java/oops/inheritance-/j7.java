public class j7 {
    public static void main(String[] args) {
        Person person = new Person("Civillian", "Guy");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());

        System.out.println();

        Employee employee = new Employee("Chilly", "Mate", 68);
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getEmployeeId());

    }
    
}

class Person {
    String firstName, lastName;

    Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }
}

class Employee extends Person {
    int id;
    Employee(String fName, String lName, int id) {
        super(fName, lName);
        this.id = id;
    }

    @Override String getLastName() {
        return "Sr. " + this.lastName;
    }

    int getEmployeeId() {
        return this.id;
    }
}