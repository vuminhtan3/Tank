public class OurTank extends Tanks{
    public void numberOfSoldiers(int n){
        System.out.println("Our tank have " + n + "soldier");
    }

    @Override
    public void actionWithBoss() {
        System.out.println("Protect Boss");
    }

}
