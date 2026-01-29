//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2_1();
        task2_2();
        task3_1();
        task3_2();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int firstFriday = 4;
        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0)
                System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет");
        }
    }

    public static void task2_1() {
        System.out.println("Задача 2.1");
        int distance = 42195;
        int checkpoint = 500;
        int distanceTraveled = 0;
        do {
            System.out.println("Держитесь! Осталось " + distance + " метров");
            distance = distance - (distanceTraveled + checkpoint);
        } while (distance >= 0);
    }

    public static void task2_2() {
        System.out.println("Задача 2.2");
        int distance = 42195;
        int distanceTraveled = 0;
        for (; distanceTraveled <= distance; distanceTraveled += 500) {
            int passed = distance - distanceTraveled;
            System.out.println("Держитесь! Осталось " + passed + " метров");
        }

    }

    public static void task3_1() {
        System.out.println("задача 3.1");
        int payOfParking = 1000;
        int day = 0;
        while (payOfParking > 0) {
            day++;
            if (day % 5 == 0) {
                System.out.println("Бесплатный день- " + day + " бюджет- " + payOfParking);
                continue;
            }
            payOfParking = payOfParking - 100;
            System.out.println(" День- " + day + " бюджет- " + payOfParking);
        }

    }

    public static void task3_2() {
        System.out.println("задача 3.2");
        int payOfParking = 1000;
        int day = 0;
        for (; payOfParking > 0; ) {
            day++;
            if (day % 5 == 0) {
                System.out.println("Бесплатный день- " + day + " бюджет- " + payOfParking);
                continue;
            }
            payOfParking -= 100;
            System.out.println("День- " + day + " бюджет- " + payOfParking);

        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int mounth = 0;
        int total = 0;
        while (total < 12_000_000) {
            mounth++;
            total = total + 15_000;
            if (mounth % 6 == 0) {
                total *= 1.07;
                if (total == 12_000_000)
                    break;
            }
            System.out.println("Месяц- " + mounth + " накоплений- " + total);
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int charge = 20;
        int minutes = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minutes++;
            charge += 2;
            if (minutes % 10 == 0) {
                overheats++;
                minutes+=2;
            System.out.println("Сучился перегрев. Текущий заряд: " + charge + "%");
                continue;
            }
            if (overheats == 3) {
                break;
            }
            System.out.println("Время зарядки составило " + minutes + " минут. Уровень заряда составляет "+charge+"%");
        }
    }
}