package Controlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Control_Akun_penjual {
    @FXML
    Button Button6;
    private String password_saya;

// belum digunakan
    public void password(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(main.student.class.getResource("password_penjual.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        Control_Pass_penjual CP = loader.getController();
        CP.isiLabelPass(password_saya);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    public void logOut(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(main.student.class.getResource("Login awal.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    public void Password(String Pass) {
        password_saya = Pass;
    }
}
