package controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class RestaurantController {

    @FXML
    ImageView chowkingImg, jollibeeImg, kfcImg, mcdonaldsImg, pizzahutImg;

    @FXML
    Button chowkingBtn, jollibeeBtn, kfcBtn, mcdonaldsBtn, pizzahutBtn;

    Chowking chowking = new Chowking();
    Jollibee jollibee = new Jollibee();
    KFC kfc = new KFC();
    McDonalds mcdonalds = new McDonalds();
    PizzaHut pizzaHut = new PizzaHut();


    public void initialize() {

        chowking.setRatings("3 stars");
        chowking.setPrice("affordable");

        jollibee.setRatings("5 stars");
        jollibee.setPrice("affordable");

        kfc.setRatings("4 stars");
        kfc.setPrice("affordable");

        mcdonalds.setRatings("5 stars");
        mcdonalds.setPrice("affordable");

        pizzaHut.setRatings("4 stars");
        pizzaHut.setPrice("expensive");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(chowkingBtn)) {
            alert.setContentText("Chowking is a " + chowking.getRatings() + " restaurant and their price is " + chowking.getPrice());
        }

        if (sourceButton.equals(jollibeeBtn)) {
            alert.setContentText("Jollibee is a " + jollibee.getRatings() + " restaurant and their price is " + jollibee.getPrice());
        }

        if (sourceButton.equals(kfcBtn)) {
            alert.setContentText("KFC is a " + kfc.getRatings() + " restaurant and their price is " + kfc.getPrice());
        }

        if (sourceButton.equals(mcdonaldsBtn)) {
            alert.setContentText("McDonald's is a " + mcdonalds.getRatings() + " restaurant and their price is " + mcdonalds.getPrice());
        }

        if (sourceButton.equals(pizzahutBtn)) {
            alert.setContentText("PizzaHut is a " + pizzaHut.getRatings() + " restaurant and their price is " + pizzaHut.getPrice());
        }

        alert.showAndWait();

    }
}