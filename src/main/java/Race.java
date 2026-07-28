import java.util.ArrayList;

public class Race {
    String name="";
    int lider=0;
    final int t=24;

    public void race(ArrayList<Car> listCar){
        for (Car car:listCar){
            int dist=car.getSpeed()*t;

            if(dist>lider){
                lider=dist;
                name=car.getName();



            }

        }
        System.out.println("Самая быстрая машина:" + name);

    }

}
