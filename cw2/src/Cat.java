public class Cat extends Animal {
    public Cat() {
        super("Cat", "Meat");
    }

    @Override
    public void communicate() {
        System.out.println(getName() + " is meowing...");
        setHappiness(getHappiness() + 10);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with a ball of yarn...");
        setEnergy(getEnergy() - 20);
        if (getEnergy() < 0) {
            setEnergy(0);
        }
        setHappiness(getHappiness() + 30);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }
}
