import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook();

        //добавление новых сотрудников
        book.newEmployee(new Employee("Сидоров Алексей Александрович", 5, 12365));

        book.newEmployee(new Employee("Петров Петр Петрович", 5, 45612));

        book.newEmployee(new Employee("Иванов Иван Иванович", 2, 50000));


        //вывод всех сотрудников
        book.printAllEmployees();

        System.out.println("Сумма зарплат за месяц: " + book.countAllSalary());

        System.out.println("Минимальная зарплата: " + book.minimumSalary());

        System.out.println("Мaксимальная зарплата: " + book.maximumSalary());

        System.out.println("Средняя зарплата: " + book.averageSalary());

        //вывод всех ФИО
        book.printAllFIO();

        book.indexSalary(1.07f);//увеличение зарплаты

        System.out.println("Минимальная зарплата в 5 отделе: " + book.minimumSalaryDepartment(5));

        System.out.println("Максимальная зарплата в 5 отделе: " + book.maximumSalaryDepartment(5));

        System.out.println("Сумма зарплат за месяц по отделу: " + book.countAllSalaryDepartment(5));

        System.out.println("Средняя зарплата по отделу: " + book.averageSalaryDepartment(5));

        book.indexSalaryDepartment(5,1.07f);//увеличение зарплаты в отделе

        System.out.println("Сотрудники 5го отдела:");
        book.printEmployeesDepartment(5);

        //зарплата меньше числа
        book.lessNumber(20000);

        //зарплата больше числа
        book.moreNumber(20000);

        //удаление сотрудника
        book.deleteEmployee(1,"Сидоров Алексей Александрович");

        //изменение зарплаты
        book.changeSalaryEmployee("Петров Петр Петрович", 70000);

        //изменение отдела
        book.changeDepartmentEmployee("Петров Петр Петрович", 3);

        //вывод сотрудников отделов
        System.out.println("Вывод сотрудников по отделам:");
        System.out.println("1 отдел");
        book.printAllEmployeeDepartment(1);
        System.out.println("2 отдел");
        book.printAllEmployeeDepartment(2);
        System.out.println("3 отдел");
        book.printAllEmployeeDepartment(3);
        System.out.println("4 отдел");
        book.printAllEmployeeDepartment(4);
        System.out.println("5 отдел");
        book.printAllEmployeeDepartment(5);

    }
}
