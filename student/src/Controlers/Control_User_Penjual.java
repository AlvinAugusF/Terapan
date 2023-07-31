package Controlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Control_User_Penjual {
    @FXML
    Button Button7;
    @FXML
    TextField Text2;

    // mengambil nama dan password serta pindah ke hal pemilik
    public void buttonAction7(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(main.student.class.getResource("hal pemilik.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        Control_Penjual CP = loader.getController();
        CP.isiLabelAkun(Text2.getText());
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
}
