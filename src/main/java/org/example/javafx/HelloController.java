package org.example.javafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.javafx.models.Equipo;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TableColumn cDisponibilidad;
    @FXML
    private TableColumn cName;
    @FXML
    private TableColumn cCategoria;
    @FXML
    private TableColumn cID;
    @FXML
    private TableView table;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cID.setCellValueFactory(row -> new SimpleStringProperty(String.valueOf(row.getValue().getId())));
        cName.setCellValueFactory(row -> new SimpleStringProperty(row.getValue().getNombre()));
        cCategory.setCellValueFactory(row -> new SimpleStringProperty(String.valueOf(row.getValue().getCategoria()).toUpperCase()));
        cDisponibilidad.setCellValueFactory(row -> new SimpleStringProperty(row.getValue().getDisponible() ? "disponible" : "no disponible"));

        table.setItems(FXCollections.observableArrayList(Equipo.findAll()));
    }


}
