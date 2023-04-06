public class Parrot extends Animal {
    public Parrot() {
        super("Parrot", "Seeds");
    }
    
    public void communicate() {
        System.out.println(getName() + " is talking...");
    }
    
    public void play() {
        System.out.println(getName() + " is playing with its toys...");
        setEnergy(getEnergy() - 20);
        if (getEnergy() < 0) {
            setEnergy(0);
        }
        setHunger(getHunger() + 10);
        if (getHunger() > 100) {
            setHunger(100);
        }
        setHappiness(getHappiness() + 20);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }
}
