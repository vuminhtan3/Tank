public class Main {
    public static void main(String[] args) {
        Bullets ourTankBullet = new Bullets();
        ourTankBullet.damage = 300;
        ourTankBullet.speed = 1700;

        OurTank ourTank1 = new OurTank();
        ourTank1.bullet = ourTankBullet;
        ourTank1.bullet.move("Our Tank");
        ourTank1.bullet.explode("Our Tank");
        ourTank1.actionWithBoss();

        System.out.println("---------------");
        Bullets enemyTankBullet = new Bullets();
        enemyTankBullet.damage = 350;
        enemyTankBullet.speed = 1500;

        EnemyTank enemyTank1 = new EnemyTank();
        enemyTank1.bullet = enemyTankBullet;
        enemyTank1.bullet.move("Enemy Tank");
        enemyTank1.bullet.explode("Enemy Tank");
        enemyTank1.actionWithBoss();

    }
}