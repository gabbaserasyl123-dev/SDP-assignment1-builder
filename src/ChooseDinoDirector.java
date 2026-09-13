public class ChooseDinoDirector {
    public ChooseDino egg (ChooseDino.Builder builder) {
        builder.setAge(0);
        return builder.build();
    }
    public ChooseDino oldCalm (ChooseDino.Builder builder) {
        builder.setAge(40);
        builder.setTemperament("calm");
        return builder.build();
    }
}
