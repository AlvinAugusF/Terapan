package Controlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Control_Pass {
    @FXML
    Button cancel;
    @FXML
    Button confirm;
    @FXML
    TextField passed;
    @FXML
    Label old_pass;
// belum beres


    public void buttonAction10(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(main.student.class.getResource("Akun_Pembeli.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    public void buttonAction11(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(main.student.class.getResource("Password.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        Control_Pass CP = loader.getController();
        CP.isiLabelPass(passed.getText());
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    public void isiLabelPass(String pass) throws IOException {
        old_pass.setText("password anda =  " + pass);}
}
