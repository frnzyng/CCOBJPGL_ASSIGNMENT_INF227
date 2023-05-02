public class App {
    public static void main(String[] args) throws Exception {
        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        Planet mars = new Mars();
        Planet mercury = new Mercury();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet venus = new Venus();

        System.out.println("\nAstronaut:");
        mars.accept(astronaut);
        mercury.accept(astronaut);
        saturn.accept(astronaut);
        uranus.accept(astronaut);
        venus.accept(astronaut);

        System.out.println("\nRover:");
        mars.accept(rover);
        mercury.accept(rover);
        saturn.accept(rover);  
        uranus.accept(rover);       
        venus.accept(rover);
    }
}
