package Controlers;

import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import main.students;

public class Controler1 {
    @FXML
    private ComboBox<students> combo1;
    @FXML
    private ListView<students> list1;
    @FXML
    private TableView<students> table1;
    @FXML
    private Button button1;
    @FXML
    private TableColumn<students,String> column1;
    private ObservableList<students> sList;
    public void buttonAction(ActionEvent e){
    sList.add(new students("contoh"));
    }

    public void initialize(){
        // tidak kepake / contoh

       /* ObservableMap<String, students> mapStudent;
        mapStudent = FXCollections.observableHashMap();
        mapStudent.put("student1", new students("amira"));
        mapStudent.put("student2", new students("Hallo"));
        mapStudent.put("student3", new students("Hello"));
        students s = mapStudent.get("student3");
*/


        /*ObservableSet<students> setStudents;
        setStudents = FXCollections.observableSet();
        setStudents.add(new students("satu dua"));
        setStudents.add(new students("satu dua"));

        for (students st : setStudents){
            System.out.println(st.getNama());
        }
*/
        sList = FXCollections.observableArrayList(
                new students("amir"),
                new students("george"),
                new students("samira")
        );

        /*sList.addListener(new ListChangeListener<students>() {
            @Override
            public void onChanged(Change<? extends students> change) {
                System.out.println("data berubah");
            }
        });*/


    sList.add(new students("jet"));
    list1.setItems(sList);
    combo1.setItems(sList);
    combo1.getSelectionModel().select(0);
    table1.setItems(sList);
    column1.setCellValueFactory(new PropertyValueFactory<students,String>("nama"));
    }


}
