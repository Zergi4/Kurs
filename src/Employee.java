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
        //хранилище данных о сотрудниках
        Employee[] spisok = new Employee[10];
        spisok[0] = new Employee("Family1 Name1 Patronymic1", 1, 40300f);
        spisok[1] = new Employee("Family2 Name2 Patronymic2", 2, 140300f);
        spisok[2] = new Employee("Family3 Name3 Patronymic3", 3, 42300f);
        spisok[3] = new Employee("Family4 Name4 Patronymic4", 4, 40400f);
        spisok[4] = new Employee("Family5 Name5 Patronymic5", 5, 40350f);
        spisok[5] = new Employee("Family6 Name6 Patronymic6", 1, 40306f);
        spisok[6] = new Employee("Family7 Name7 Patronymic7", 2, 140300f);
        spisok[7] = new Employee("Family8 Name8 Patronymic8", 3, 420300f);
        spisok[8] = new Employee("Family9 Name9 Patronymic9", 4, 40300f);
        spisok[9] = new Employee("Family10 Name10 Patronymic10", 5, 40220f);
        //a.Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        System.out.println("A.");
        for (Employee employee : spisok) {
            System.out.println(employee);
        }
//b.Посчитать сумму затрат на зарплаты в месяц.
        float summ = 0.0f;
        for (Employee employee : spisok) {
            summ += employee.salary;
        }
        System.out.println("Б. Сумма затрат на зарплаты в месяц составляет " + summ + " рублей.");
        // Найти сотрудника с минимальной зарплатой.
        float minSalary = Integer.MAX_VALUE;
        int n = 0;
        for (int i = 0; i < spisok.length; i++) {
            if (spisok[i].getSalary() < minSalary) {
                minSalary = spisok[i].getSalary();
                n = i;
            }
        }
        System.out.println("С.Сотрудник с минимальной зарплатой " + minSalary + " рублей, его ФИО: " + spisok[n].fio);
        n = 0;
        float maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < spisok.length; i++) {
            if (spisok[i].salary > maxSalary) {
                maxSalary = spisok[i].salary;
                n = i;
            }
        }
        System.out.println("D. Максимальная зарплата среди данных сотрудников составляет " + maxSalary + " рублей, получатель: " + spisok[n].fio);
        //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        System.out.println("E.Средняя зарплата составляет " + summ / spisok.length + "рублей");
      //Получить Ф. И. О. всех сотрудников (вывести в консоль).
        System.out.println("F. ФИО всех сотрудников: ");
        for (Employee employee : spisok) System.out.println(employee.fio);

    }
}
