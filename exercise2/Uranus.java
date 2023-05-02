public class Uranus implements Planet{
    public void accept(Explorer explorer){
        explorer.visit(this);
    }
}
