public class Fish extends Animal {
    public Fish() {
        super("Fish");
        setFood("flakes");
    }
    
    public void communicate() {
        System.out.println(getName() + " is swimming...");
    }
    
    public void play() {
        System.out.println(getName() + " is swimming...");
        setHunger(getHunger() + 5);
        if (getHunger() > 100) {
            setHunger(100);
        }
        setHappiness(getHappiness() + 10);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }
}
