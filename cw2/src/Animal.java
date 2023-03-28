public abstract class Animal {
    private String name;
    private String species;
    private String food;
    private int hunger;
    private int happiness;
    private int energy;
    private Start_up start_up;
    
    public Animal(String name, String species, String food, int hunger, int happiness, int energy) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.hunger = hunger;
        this.happiness = happiness;
        this.energy = energy;
    }
    
    public Animal(String s) {
        this.name = "";
        this.species = s;
        this.food = "";
        this.hunger = 50;
        this.happiness = 50;
        this.energy = 50;
    }
    
    public void sleep() {
        setEnergy(getEnergy() + 30);
        setHunger(getHunger() + 10);
        setHappiness(getHappiness() + 5);
        System.out.println(getName() + " is sleeping.");
    }

    public void eat() {
        setEnergy(getEnergy() + 5);
        setHunger(getHunger() + 30);
        setHappiness(getHappiness() + 5);
        System.out.println(getName() + " is eating " + getFood() + ".");
    }

    abstract void communicate();  

    abstract void play();

    public void displayStats() {
        System.out.println("Hunger: " + getHunger());
        System.out.println("Happiness: " + getHappiness());
        System.out.println("Energy: " + getEnergy());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Start_up getStart_up() {
        return start_up;
    }

    public void setStart_up(Start_up start_up) {
        this.start_up = start_up;
    }
}
