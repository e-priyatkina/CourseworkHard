public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public EmployeeBook() {
        int i = 0;
        employees[i] = new Employee("Комиссаров Абрам Ростиславович", 3, 64000);
        i++;
        employees[i] = new Employee("Николаев Адриан Миронович", 1, 51000);
        i++;
        employees[i] = new Employee(null, 0, 0);//new Employee("Воронова Мила Семёновна", 2, 72000);
        i++;
        employees[i] = new Employee("Щукина Тамара Яковлевна", 5, 95000);
        i++;
        employees[i] = new Employee(null, 0, 0);//new Employee("Казаков Виссарион Германович", 4, 78000);
        i++;
        employees[i] = new Employee("Евдокимова Нонна Альбертовна", 4, 67000);
        i++;
        employees[i] = new Employee("Титов Виссарион Глебович", 1, 63000);;
        i++;
        employees[i] = new Employee("Силина Иветта Даниловна", 3, 75000);
        i++;
        employees[i] = new Employee("Зыкова Эдуарда Аркадьевна", 2, 83000);
        i++;
        employees[i] = new Employee("Шаров Петр Христофорович", 5, 91000);
    }

    public Employee[] getEmployees() {
        return this.employees;
    }

    //добавление сотрудника
    public Employee[] newEmployee (Employee newEmployee, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName() == null) {
                employees[i] = newEmployee;
                break;
            }
        }
        return employees;
    }

    //удаление сотрудника
    public Employee[] deleteEmployee (String deleteEmployee, Employee[] employees)  {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName() == null) {
                continue;
            } else if (employees[i].getFullName().equals(deleteEmployee)) {
                    employees[i].setFullName(null);
                    employees[i].setSalary(0);
                    employees[i].setDepartment(0);
            }
        }
        return employees;
    }

    //изменение зарплаты
    public Employee[] changeSalaryEmployee(String fullNameEmployee, float salary, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName() == null) {
                continue;
            } else if (employees[i].getFullName().equals(fullNameEmployee)) {
                employees[i].setSalary(salary);
            }
        }
        return employees;
    }

    //изменение отдела
    public Employee[] changeDepartmentEmployee(String fullNameEmployee, int department, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName() == null) {
                continue;
            } else if (employees[i].getFullName().equals(fullNameEmployee)) {
                employees[i].setDepartment(department);
            }
        }
        return employees;
    }

    //вывод сотрудников определенного отдела
    public void allEmployeeDepartment(int department, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].toString());
            }
        }
    }
}

