package sample;

import javafx.fxml.FXML;

import javax.swing.table.TableColumn;
import java.awt.*;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Controller {
    @FXML
    private TextField tf_fileDirectoryName;

    @FXML
    private Button btn_submit;

    @FXML
    private Label lbl_outputPath;

    @FXML
    private TableColumn tbc_fileType;

    @FXML
    private TableColumn tbc_amount;



}
