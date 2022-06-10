package at.seya.schoolcheck.JuraGiga5;

public class Main {
    public static void main(String[] args) {
        WaterTank waterTank = new WaterTank(1000, 1500);
        BeanBin beanBin = new BeanBin(100, 100);
        Controller sc1 = new Controller(beanBin, waterTank);
        Coffeemachine juraGiga5 = new Coffeemachine(sc1);

        juraGiga5.standardProgramm();
    }
}
