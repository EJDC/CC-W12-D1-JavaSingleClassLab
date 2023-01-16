public class Runner {
    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 908973);
        planet.setName("Mars");
        planet.setSize(908973);
        System.out.printf("%s is %d%n", planet.getName(), planet.getSize());
        planet.explode();
    }
}
