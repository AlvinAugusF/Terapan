package Controlers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class Control_Inventory {
    @FXML
    TableView Table2;
    @FXML
    private TableColumn<Nama_Barang, String> B1;
    @FXML
    private TableColumn<Nama_Barang, Integer> B2;

    private ObservableList bList;

    public void initialize() {


        bList = FXCollections.observableArrayList(
                new Nama_Inventory("Mouse gt1", 20),
                new Nama_Inventory("Headphone A12", 20),
                new Nama_Inventory("Keyboard Elgato", 20)

        );

        B1.setCellValueFactory(new PropertyValueFactory<Nama_Barang, String>("Nama"));
        B2.setCellValueFactory(new PropertyValueFactory("Banyak"));

        Table2.setItems(bList);
    }
// pindah ke hal pemilik
    public void buttonAction16(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(main.student.class.getResource("hal pemilik.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
}}
