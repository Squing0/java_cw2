public class Hamster extends Animal {
    public Hamster() {
        super("Hamster");
        setFood("Seeds");
    }

    @Override
    public void communicate() {
        System.out.println(getName() + " is squeaking...");
        setHappiness(getHappiness() + 5);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " is running on its wheel...");
        setEnergy(getEnergy() - 15);
        if (getEnergy() < 0) {
            setEnergy(0);
        }
        setHappiness(getHappiness() + 15);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }
}
