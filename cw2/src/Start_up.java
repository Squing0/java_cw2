public class Start_up {
    private String species;

    public Start_up(String name, String species) {
        this.species = species;
    }

    // Removed getName as was not used
    public void setName(String name) {
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
