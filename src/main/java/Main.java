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
                System.out.println("Ошибка!");
                System.out.println("Введите названия машины №" + i);
                name = scanner.nextLine();
            }
            System.out.println("Введите скорость машины №" + i);

            int speed = scanner.nextInt();
            while (speed <= 0 || speed > 250) {
                System.out.println("Введите скорость машины №" + i);
                speed = scanner.nextInt();
            }
            scanner.nextLine();
            Car car = new Car(name, speed);
            listCar.add(car);

        }

        Race t = new Race();
        t.race(listCar);


    }
}


