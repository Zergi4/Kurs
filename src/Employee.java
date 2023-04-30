import org.w3c.dom.ls.LSOutput;

public class Employee {
private final String fio;
private int department;
private float salary;
private static int counter;
private final int id;

//Конструктор
public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = ++counter;
        }

//Геттеры
public String getFio() {
        return fio;
        }

public int getDepartment() {
        return department;
        }

public float getSalary() {
        return salary;
        }

//Сетттеры
public void setSalary(float salary) {
        this.salary = salary;
        }

public void setDepartment(int department) {
        this.department = department;
        }


@Override
public String toString() {
        return "" +
        "id = " + id +
        " ФИО = '" + fio + '\'' +
        ", Отдел = " + department +
        ", Зарплата = " + salary +
        '}';
        }

public static void main(String[] args) {


        }
        }
