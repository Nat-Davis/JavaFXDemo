package application;

import java.net.*;
import java.util.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class FXMLController implements Initializable {
    @FXML
    Button myButton;

    @FXML
    Label myLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myButton.setText("I AM A BUTTON!");
        myLabel.setText("YO!");
    }

}
