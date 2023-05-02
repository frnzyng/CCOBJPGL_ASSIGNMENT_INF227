public class App {
    public static void main(String[] args) throws Exception {
        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        Planet mars = new Mars();
        Planet mercury = new Mercury();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet venus = new Venus();

        mars.accept(astronaut);
        mars.accept(rover);

        mercury.accept(astronaut);
        mercury.accept(rover);

        saturn.accept(astronaut);
        saturn.accept(rover);

        uranus.accept(astronaut);
        uranus.accept(rover);

        venus.accept(astronaut);
        venus.accept(rover);

    }
}
