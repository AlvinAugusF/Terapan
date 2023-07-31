package Controlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Control_user {
    @FXML
    Button button3;
    @FXML
    TextField Text1;
    @FXML
    PasswordField pass1;

    // mengambil nama dan password serta pindah ke hal pembeli
    public void buttonAction2(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(main.student.class.getResource("hal pembeli.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        Control_Pembeli CP = loader.getController();
        CP.isiLabelAkun(Text1.getText());
        CP.Password(pass1.getText());
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
}
