public class ChooseDino {
    private String species;
    private int age;
    private String color;
    private String habitat;
    private String temperament;
    private String trained;
    private String gender;

    private ChooseDino(Builder builder){
        this.species = builder.species;
        this.age = builder.age;
        this.color = builder.color;
        this.habitat = builder.habitat;
        this.temperament = builder.temperament;
        this.trained = builder.trained;
        this.gender = builder.gender;
    }

    public String getSpecies() {
        return species;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public String getHabitat() {
        return habitat;
    }
    public String getTemperament() {
        return temperament;
    }
    public String getTrained() {
        return trained;
    }
    public String getGender() {
        return gender;
    }

    public static class Builder {
        private String species;
        private int age;
        private String color;
        private String habitat;
        private String temperament;
        private String trained;
        private String gender;

        public Builder setSpecies(String species) {
            this.species = species;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }
        public Builder setHabitat(String habitat) {
            this.habitat = habitat;
            return this;
        }
        public Builder setTemperament(String temperament) {
            this.temperament = temperament;
            return this;
        }
        public Builder setTrained(String trained) {
            this.trained = trained;
            return this;
        }
        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public ChooseDino build(){
            return new ChooseDino(this);
        }
    }
}
