public class Main {

    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        //вывод списка сотрудников
        for (int i = 0; i < book.getEmployees().length; i++) {
            System.out.println(book.getEmployees()[i].toString());
        }

        //добавление нового сотрудника
        Employee newEmployee = new Employee("Иванов Иван Иванович", 2, 50000);
        book.newEmployee(newEmployee, book.getEmployees());
        for (int i = 0; i < book.getEmployees().length; i++) {
            System.out.println(book.getEmployees()[i].toString());
        }

        //удаление сотрудника
        book.deleteEmployee("Щукина Тамара Яковлевна", book.getEmployees());
        for (int i = 0; i < book.getEmployees().length; i++) {
            System.out.println(book.getEmployees()[i].toString());
        }

        //изменение зарплаты
        book.changeSalaryEmployee("Комиссаров Абрам Ростиславович", 70000, book.getEmployees());
        for (int i = 0; i < book.getEmployees().length; i++) {
            System.out.println(book.getEmployees()[i].toString());
        }

        //изменение отдела
        book.changeDepartmentEmployee("Николаев Адриан Миронович", 4, book.getEmployees());
        for (int i = 0; i < book.getEmployees().length; i++) {
            System.out.println(book.getEmployees()[i].toString());
        }

        //вывод сотрудников определенного отдела
        book.allEmployeeDepartment(1, book.getEmployees());
    }
}
