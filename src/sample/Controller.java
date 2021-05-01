package sample;
//kontroler zawierający logikę(deklaracje,metody) , które obsługują GUI

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    public Button btnMain;
    int clickCounter = 0;

    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr " + ++clickCounter);
        if (clickCounter == 1)
            btnMain.setText("I jeszcze raz");
    }
}
