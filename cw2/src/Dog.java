public class Dog extends Animal {
    public Dog() {
        super("Dog");
        setFood("bones");
    }
    
    public void communicate() {
        System.out.println(getName() + " is barking...");
    }
    
    public void play() {
        System.out.println(getName() + " is playing fetch...");
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
