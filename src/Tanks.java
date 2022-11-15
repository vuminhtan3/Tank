public abstract class Tanks {
    Bullets bullet;
    int speed;

    public void move(){
        System.out.println("Tank is moving...");
    }

    public void shoot(){
        System.out.println("Tank is shooting");
    }

    public boolean checkHit(){
        return true;
    }

    public abstract void actionWithBoss();

    public Bullets getBullet() {
        return bullet;
    }

    public void setBullet(Bullets bullet) {
        this.bullet = bullet;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
