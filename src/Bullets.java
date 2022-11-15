public class Bullets {
    int damage;
    int speed;

    public void move(String name){
        System.out.println(name + " is shooting with bullet speed is " + speed + " km/h.");
    }

    public void explode(String name){
        System.out.println(name + " bullet was explode!!!");
    }
}
