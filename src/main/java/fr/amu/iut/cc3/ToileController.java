package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    private TextField comp1;
    @FXML
    private TextField comp2;
    @FXML
    private TextField comp3;
    @FXML
    private TextField comp4;
    @FXML
    private TextField comp5;
    @FXML
    private TextField comp6;
    @FXML
    private Pane pane;
    @FXML
    private Label E1;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }


    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    public void changerPosCercle(ActionEvent actionEvent) {
        if ((Double.parseDouble(comp1.getText())>=0) && (Double.parseDouble(comp1.getText())<=20)){
            E1.setVisible(false);
            Circle cercle = new Circle();
            cercle.setRadius(5);
            cercle.setStroke(Color.BLACK);
            cercle.setCenterY(getYRadarChart(Double.parseDouble(comp1.getText()), 1));
            cercle.setCenterX(getXRadarChart(Double.parseDouble(comp1.getText()), 1));
            pane.getChildren().add(cercle);

        }
        else {
            E1.setVisible(true);
        }
    }

    public void changerPosCercle6(ActionEvent actionEvent) {
        if ((Double.parseDouble(comp6.getText())>=0) && (Double.parseDouble(comp6.getText())<=20)){
            E1.setVisible(false);
            Circle cercle = new Circle();
            cercle.setRadius(5);
            cercle.setStroke(Color.BLACK);
            cercle.setCenterY(getYRadarChart(Double.parseDouble(comp6.getText()), 6));
            cercle.setCenterX(getXRadarChart(Double.parseDouble(comp6.getText()), 6));
            pane.getChildren().add(cercle);

        }
        else {
            E1.setVisible(true);
        }
    }

    public void changerPosCercle5(ActionEvent actionEvent) {
        if ((Double.parseDouble(comp5.getText())>=0) && (Double.parseDouble(comp5.getText())<=20)){
            E1.setVisible(false);
            Circle cercle = new Circle();
            cercle.setRadius(5);
            cercle.setStroke(Color.BLACK);
            cercle.setCenterY(getYRadarChart(Double.parseDouble(comp5.getText()), 5));
            cercle.setCenterX(getXRadarChart(Double.parseDouble(comp5.getText()), 5));
            pane.getChildren().add(cercle);

        }
        else {
            E1.setVisible(true);
        }
    }

    public void changerPosCercle4(ActionEvent actionEvent) {
        if ((Double.parseDouble(comp4.getText())>=0) && (Double.parseDouble(comp4.getText())<=20)){
            E1.setVisible(false);
            Circle cercle = new Circle();
            cercle.setRadius(5);
            cercle.setStroke(Color.BLACK);
            cercle.setCenterY(getYRadarChart(Double.parseDouble(comp4.getText()), 4));
            cercle.setCenterX(getXRadarChart(Double.parseDouble(comp4.getText()), 4));
            pane.getChildren().add(cercle);

        }
        else {
            E1.setVisible(true);
        }
    }

    public void changerPosCercle3(ActionEvent actionEvent) {
        if ((Double.parseDouble(comp3.getText())>=0) && (Double.parseDouble(comp3.getText())<=20)){
            E1.setVisible(false);
            Circle cercle = new Circle();
            cercle.setRadius(5);
            cercle.setStroke(Color.BLACK);
            cercle.setCenterY(getYRadarChart(Double.parseDouble(comp3.getText()), 3));
            cercle.setCenterX(getXRadarChart(Double.parseDouble(comp3.getText()), 3));
            pane.getChildren().add(cercle);

        }
        else {
            E1.setVisible(true);
        }
    }

    public void changerPosCercle2(ActionEvent actionEvent) {
        if ((Double.parseDouble(comp2.getText())>=0) && (Double.parseDouble(comp2.getText())<=20)){
            E1.setVisible(false);
            Circle cercle = new Circle();
            cercle.setRadius(5);
            cercle.setStroke(Color.BLACK);
            cercle.setCenterY(getYRadarChart(Double.parseDouble(comp2.getText()), 2));
            cercle.setCenterX(getXRadarChart(Double.parseDouble(comp2.getText()), 2));
            pane.getChildren().add(cercle);

        }
        else {
            E1.setVisible(true);
        }
    }
}
