public interface Explorer {

    void visit(Mars mars);
    void visit(Mercury mercury);
    void visit(Saturn saturn);
    void visit(Uranus uranus);
    void visit(Venus venus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}