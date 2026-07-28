import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> listCar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Введите название машины №" + i);
            String name = scanner.nextLine();

            while (name.isEmpty()) {
                System.out.println("Ошибка! Введите названия машины №" + i);
                name = scanner.nextLine();
            }
            int speed;
            while (true) {
                System.out.println("Введите скорость машины №" + i);

                if (!scanner.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число.");
                    scanner.next();
                    continue;
                }
                speed = scanner.nextInt();
                if (speed > 0 && speed <= 250) {
                    scanner.nextLine();
                    break;
                }
                scanner.nextLine();
                System.out.println("Ошибка! Скорость должна быть от 1 до 250.");
            }
            Car car = new Car(name, speed);
            listCar.add(car);
            }
        Race t = new Race();
        t.race(listCar);
        }
    }



