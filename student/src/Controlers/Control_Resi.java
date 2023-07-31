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
import main.students;

import java.io.IOException;

public class Control_Resi {
    @FXML
    TableView Table1;
    @FXML
    private TableColumn<Nama_Barang,String> C1;
    @FXML
    private TableColumn<Nama_Barang,Integer> C2;
    @FXML
    private TableColumn<Nama_Barang,Integer> C3;
    @FXML
    private TableColumn<Nama_Barang,Integer> C4;

    private ObservableList aList;
    // mengisi isi tabel
    public void initialize(){


        aList = FXCollections.observableArrayList(
                new Nama_Barang("Mouse gt1", 2000000,10 ,0),
                new Nama_Barang("Headphone A12",150000,5,0),
                new Nama_Barang("Keyboard Elgato", 350000, 12,0)

        );

        C1.setCellValueFactory(new PropertyValueFactory<Nama_Barang,String>("Nama"));
        C2.setCellValueFactory(new PropertyValueFactory("Harga"));
        C3.setCellValueFactory(new PropertyValueFactory("Banyak"));
        C4.setCellValueFactory(new PropertyValueFactory("Total"));
        Table1.setItems(aList);
    }
    // pindah ke halaman pembeli
    public void buttonAction17(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(main.student.class.getResource("hal pembeli.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
}
