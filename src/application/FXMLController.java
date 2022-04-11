package application;

import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.*;

public class FXMLController implements Initializable {
    @FXML
    Button myButton;

    @FXML
    Label myLabel;

    private int count = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        myButton.setText("Count");
        myLabel.setText(String.valueOf(count));
        myButton.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent e) {
                count += 1;
                myLabel.setText(String.valueOf(count));
            }

        });
    }
}
