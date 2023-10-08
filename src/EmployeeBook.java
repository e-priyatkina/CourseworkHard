public class EmployeeBook {

    private final Employee[] employees = new Employee[10];

    public void printAllEmployees() { //вывод списка всех сотрудников
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public float countAllSalary() { //сумма затрат на зарплаты
        float allSalary = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            } else {
                allSalary = allSalary + employee.getSalary();
            }
        }
        return allSalary;
    }

    public Employee minimumSalary() { //минимальная зарплата
        float min = Float.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value == null) {
                continue;
            } else if (value.getSalary() < min) {
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
            if (value == null) {
                continue;
            } else if (value.getSalary() > max) {
                max = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public float averageSalary() { //средняя зарплата
        int k = 0; //кол-во сотрудников
        for (Employee employee : employees) {
            if (employee != null) {
                k++;
            }
        }
        return countAllSalary() / k;
    }

    public void printAllFIO() { //вывод всех ФИО
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            } else {
                System.out.println(employee.getFullName());
            }
        }
    }

    public Employee[] indexSalary(float index) { //увеличение зарплаты на %
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            } else {
                employee.setSalary(employee.getSalary() * index);
            }
        }
        return employees;
    }

    public Employee minimumSalaryDepartment (int department) { //минимальная зарплата по отделу
        float min = Float.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employees) {
            if (value == null) {
                continue;
            } else if (value.getSalary() < min && value.getDepartment() == department) {
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
            if (value == null) {
                continue;
            } else if (value.getSalary() > max && value.getDepartment() == department) {
                max = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public float countAllSalaryDepartment(int department) { //общая зарплата по отделу
        float allSalary = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            } else if (employee.getDepartment() == department) {
                allSalary = allSalary + employee.getSalary();
            }
        }
        return allSalary;
    }

    public float averageSalaryDepartment(int department) { //средняя зарплата по отделу
        float average = 0;
        int k = 0; //количество сотрудников
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            } else if (employee.getDepartment() == department) {
                average = countAllSalaryDepartment(department);
                k++;
            }
        }
        average = average / k;
        return average;
    }

    public Employee[] indexSalaryDepartment(int department, float index) { //увеличение зарплаты в отделе

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            } else if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * index);
            }
        }
        return employees;
    }

    public void printEmployeesDepartment(int department) { //вывод списка сотрудников отдела
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            } else if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

    public void lessNumber(int number) { //зарплата меньше числа
        for (Employee value : employees) {
            if (value == null) {
                continue;
            } else if (value.getSalary() < number) {
                System.out.println(value.getId() + " " + value.getFullName() + " " + value.getSalary());
            }
        }
    }

    public void moreNumber(int number) { //зарплата больше числа
        for (Employee value : employees) {
            if (value == null) {
                continue;
            } else if (value.getSalary() >= number) {
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
    public void deleteEmployee (int deleteId, String deleteEmployee)  {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(deleteEmployee) &&
                    employees[i].getId() == deleteId) {
                employees[i] = null;
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

    //вывод сотрудников определенного отдела
    public void printAllEmployeeDepartment(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            } else if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName());
            }
        }
    }
}

