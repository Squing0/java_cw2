public class Bunny extends Animal {
    public Bunny() {
        super("Bunny", "Carrots");
//        setFood("Carrots");
    }

    @Override
    public void communicate() {
        System.out.println(getName() + " is thumping its foot...");
        setHappiness(getHappiness() + 5);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " is hopping around...");
        setEnergy(getEnergy() - 10);
        if (getEnergy() < 0) {
            setEnergy(0);
        }
        setHappiness(getHappiness() + 20);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }
}
