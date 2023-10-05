public class Employee {
    private String fullName;
    private int department;
    private float salary;
    private int id;
    static int counter = 0;

    public static int id() {
        counter++;
        return counter;
    }
    public Employee (String fullName, int department, int salary) {
        this.id = id();
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }
    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return this.id + " ФИО: " + this.fullName + ", отдел: " + this.department + ", зарплата: " +
                this.salary;
    }
}
