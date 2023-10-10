public class EmployeeBook {

    private final Employee[] employees = new Employee[10];

    public void printAllEmployees() { //вывод списка всех сотрудников
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public float countAllSalary() { //сумма затрат на зарплаты
        float allSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                allSalary = allSalary + employee.getSalary();
            }
        }
        return allSalary;
    }

    public Employee minimumSalary() { //минимальная зарплата
        float min = Float.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value != null && value.getSalary() < min) {
                min = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public Employee maximumSalary() { //максимальная зарплата
        float max = Float.MIN_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value != null && value.getSalary() > max) {
                max = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public float averageSalary() { //средняя зарплата
        float average;
        int k = 0; //кол-во сотрудников
        for (Employee employee : employees) {
            if (employee != null) {
                k++;
            }
        }
        if (k == 0) {
            average = 0;
        } else {
            average = countAllSalary() / k;
        }
        return average;
    }

    public void printAllFIO() { //вывод всех ФИО
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void indexSalary(float index) { //увеличение зарплаты на %
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * index);
            }
        }
    }

    public Employee minimumSalaryDepartment (int department) { //минимальная зарплата по отделу
        float min = Float.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value != null && value.getSalary() < min && value.getDepartment() == department) {
                min = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public Employee maximumSalaryDepartment(int department) { //максимальная зарплата по отделу
        float max = Float.MIN_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value != null && value.getSalary() > max && value.getDepartment() == department) {
                max = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public float countAllSalaryDepartment(int department) { //общая зарплата по отделу
        float allSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                allSalary = allSalary + employee.getSalary();
            }
        }
        return allSalary;
    }

    public float averageSalaryDepartment(int department) { //средняя зарплата по отделу
        float average;
        int k = 0; //количество сотрудников
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                k++;
            }
        }
        if (k == 0) {
            average = 0;
        } else {
            average = countAllSalaryDepartment(department) / k;
        }
        return average;
    }

    public void indexSalaryDepartment(int department, float index) { //увеличение зарплаты в отделе

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * index);
            }
        }
    }

    public void printEmployeesDepartment(int department) { //вывод списка сотрудников отдела
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

    public void lessNumber(int number) { //зарплата меньше числа
        for (Employee value : employees) {
            if (value != null && value.getSalary() < number) {
                System.out.println(value.getId() + " " + value.getFullName() + " " + value.getSalary());
            }
        }
    }

    public void moreNumber(int number) { //зарплата больше числа
        for (Employee value : employees) {
            if (value != null && value.getSalary() >= number) {
                System.out.println(value.getId() + " " + value.getFullName() + " " + value.getSalary());
            }
        }
    }

    //добавление сотрудника
    public void newEmployee (Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                break;
            }
        }
    }

    //удаление сотрудника
    public void deleteEmployeeId (int deleteId)  {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == deleteId) {
                employees[i] = null;
                break;
            }
        }
    }

    public void deleteEmployeeFIO (String deleteFullName)  {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(deleteFullName)) {
                employees[i] = null;
                break;
            }
        }
    }

    //изменение зарплаты
    public void changeSalaryEmployee(String fullName, float salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
            }
        }
    }

    //изменение отдела
    public void changeDepartmentEmployee(String fullName, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFullName().equals(fullName)) {
                employee.setDepartment(department);
            }
        }
    }

    //вывод сотрудников по отделам
    public void printEmployeesByDepartment() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сотрудники " + i + "-го отдела");
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment() == i) {
                    System.out.println(employee.getFullName());
                }
            }
        }
    }
}

