public class Main {
    public static void main(String[] args) {
        //TASK 1
        double[] salary = {72240, 65550, 88408, 92065, 72180};
        double sumOfSalaries = 0;
        for (double v : salary) {
            sumOfSalaries += v;
        }
        System.out.printf("Сумма трат за месяц составила %.2f рублей. \n", sumOfSalaries);

        //TASK 2
        double[] expenses = {7240, 6550, 8408, 9065, 7280};
        double minExpenses = expenses[0];
        double maxExpenses = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %.2f рублей. \n", minExpenses);
        System.out.printf("Максимальная сумма трат за неделю составила %.2f рублей. \n", maxExpenses);

        //TASK 3
        double sumOfExpenses = 0;
        double averageExpenses;
        for (double expens : expenses) {
            sumOfExpenses += expens;
        }
        averageExpenses = sumOfExpenses / expenses.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", averageExpenses);

        //TASK 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int leftIndex = 0;
        int rightIndex = reverseFullName.length - 1;
        while (leftIndex < rightIndex) {
            char temp = reverseFullName[leftIndex];
            reverseFullName[leftIndex] = reverseFullName[rightIndex];
            reverseFullName[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        System.out.println(reverseFullName);
    }
}