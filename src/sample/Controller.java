package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Controller {
    @FXML
    private TextField tf_directoryName;

    @FXML
    private Label lbl_outputPath;

    @FXML
    private ListView<String> lv_listOfTypes;

    @FXML
    void submitButtonPressed(ActionEvent event){

        Path path = Paths.get(tf_directoryName.getText());
        final ObservableList<String> listOfTypes = FXCollections.observableArrayList();

        try {
            if (Files.isDirectory(path)){
                lbl_outputPath.setText(path.toString());
                DirectoryStream<Path> stream = Files.newDirectoryStream(path);



                /*for (Path p : stream){
                    String fileName = p.getFileName().toString();
                    listOfTypes.add(getExtensionOfFile(fileName));
                }
                lv_listOfTypes.setItems(listOfTypes);*/

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Get extension from file name
    private String getExtensionOfFile(String s){
        int i = s.lastIndexOf(".");

        if (i > 0){
            return s.substring(i+1);
        }

        return ""; //empty extension
    }




}
