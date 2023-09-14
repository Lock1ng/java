import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Инициализируем переменные суммы и среднего арифметического и присвоим зна-чение 0
        int summ = 0;
        float sr_ar = 0;
        // Создаем объект Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите данные:");
        for (int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i ++){
            summ = summ + arr[i];
        }
        sr_ar = (float) summ / size;
        System.out.println("Сумма: " + summ);
        System.out.println("Среднее арифметическое: " + sr_ar);
    }
}
