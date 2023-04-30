// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

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
        printSpisok(spisok);
        //b.Посчитать сумму затрат на зарплаты в месяц.
        System.out.println("B. Сумма затрат на зарплаты в месяц составляет " + summaSalary(spisok) + " рублей.");
        //c. Найти сотрудника с минимальной зарплатой.
        System.out.println("C. Сотрудник с минимальной зарплатой это " + getMinSalary(spisok));

    }


    public static void printSpisok(Employee[] spisok1) {
        for (Employee employee : spisok1) {
            System.out.println(employee);
        }
    }

    //b.Посчитать сумму затрат на зарплаты в месяц.
    public static float summaSalary(Employee[] spisok1) {
        float summ = 0.0f;
        for (Employee employee : spisok1) {
            summ += employee.getSalary();
        }
        return summ;
    }
    // Найти сотрудника с минимальной зарплатой.

    public static Employee getMinSalary(Employee[] spisok1) {
        float minSalary = Integer.MAX_VALUE;
        int n = 0;
        for (int i = 0; i < spisok1.length; i++) {
            if (spisok1[i].getSalary() < minSalary) {
                minSalary = spisok1[i].getSalary();
                n = i;
            }
        }
        return spisok1[n];
    }


    //      System.out.println("С.Сотрудник с минимальной зарплатой " + minSalary + " рублей, его ФИО: " + spisok[n].fio);
    // n = 0;
    //  float maxSalary = Integer.MIN_VALUE;
    //    for (int i = 0; i < spisok.length; i++) {
    //   if (spisok[i].salary > maxSalary) {
    //      maxSalary = spisok[i].salary;
    //     n = i;
    //   }
    //  }
    //   System.out.println("D. Максимальная зарплата среди данных сотрудников составляет " + maxSalary + " рублей, получатель: " + spisok[n].fio);
}
