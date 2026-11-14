public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("=== Задание 1 ===");
        int firstFriday = 3; // Любое значение от 1 до 7
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        // Задание 2
        System.out.println("\n=== Задание 2 (do-while) ===");
        int totalDistance = 42_195;
        int currentDistance = 0;
        do {
            System.out.println("Держитесь! Осталось " + (totalDistance - currentDistance) + " метров");
            currentDistance += 500;
        } while (currentDistance < totalDistance);

        System.out.println("\n=== Задание 2 (for) ===");
        for (int distance = 0; distance < totalDistance; distance += 500) {
            System.out.println("Держитесь! Осталось " + (totalDistance - distance) + " метров");
        }

        // Задание 3
        System.out.println("\n=== Задание 3 (while) ===");
        int budgetWhile = 1000;
        int dayWhile = 0;
        while (budgetWhile > 0) {
            dayWhile++;
            if (dayWhile % 5 == 0) {
                continue;
            }
            if (budgetWhile < 100) {
                dayWhile--;
                break;
            }
            budgetWhile -= 100;
        }
        System.out.println("Бюджета хватит на " + dayWhile + " дней");

        System.out.println("\n=== Задание 3 (for) ===");
        int budgetFor = 1000;
        int dayFor = 0;
        for (; budgetFor > 0; ) {
            dayFor++;
            if (dayFor % 5 == 0) {
                continue;
            }
            if (budgetFor < 100) {
                dayFor--;
                break;
            }
            budgetFor -= 100;
        }
        System.out.println("Бюджета хватит на " + dayFor + " дней");

        // Задание 4
        System.out.println("\n=== Задание 4 ===");
        int month = 0;
        double total = 0;
        while (true) {
            month++;
            total += 15_000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.printf("Месяц %d, сумма накоплений: %.2f ₽%n", month, total);
            if (total >= 12_000_000) {
                break;
            }
        }

        // Задание 5
        System.out.println("\n=== Задание 5 ===");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                if (overheats > 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                System.out.println("Перегрев! Зарядка приостановлена на 2 минуты");
                minute += 2;
                continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}
