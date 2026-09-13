public class Main {
    public static void main(String[] args){
        ChooseDino choice = new ChooseDino.Builder()
                .setSpecies("theropod")
                .setAge(1)
                .setGender("Male")
                .setHabitat("Forest")
                .setColor("dark")
                .setTemperament("calm")
                .setTrained("yes")
                .build();
        System.out.println(choice);

        ChooseDino.Builder builder =  new ChooseDino.Builder();
        ChooseDinoDirector director = new ChooseDinoDirector();
        ChooseDino egg = director.egg(builder);
        ChooseDino oldAndCalm = director.oldCalm(builder);
        System.out.println(egg);
        System.out.println(oldAndCalm);

    }


}
