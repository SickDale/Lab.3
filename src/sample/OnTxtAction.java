package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class OnTxtAction {
    public TextField txtLicznik1;
    public TextField txtLicznik2;
    public TextField txtLicznik3;
    public TextField txtWagaNormalnej;
    public TextField txtWagaNierdzewnej;
    public TextField txtCenaNormalnej;
    public TextField txtCenaNierdzewnej;

    public void OnTxtAction(ActionEvent actionEvent) {
        double gestoscStali = 7700;  //uśredniona wartosc ,bo gestosc zwykłej stali to 7500-7900 w kg/m³
        double gestoscStaliNierdzewnej = 7860;

        double cenaStali = 0;
        double cenaStaliNierdzewnej = 0;

        assert false;
        float r = Float.parseFloat(txtLicznik1.getText()); //promień
        float h = Float.parseFloat(txtLicznik2.getText()); //wysokość
        float gruboscBlachy = Float.parseFloat(txtLicznik3.getText());

        double PcWalca = 2 * Math.PI * (r * r) + 2 * Math.PI * r * h;

        double dlugosciBokowBlachy = Math.sqrt(PcWalca);

        double objetoscBlachy = dlugosciBokowBlachy * dlugosciBokowBlachy * gruboscBlachy;

        double wagaBlachyZeStali = objetoscBlachy * gestoscStali;
        double wagaBlachyZeStaliNierdzewnej = objetoscBlachy * gestoscStaliNierdzewnej;

        cenaStali = wagaBlachyZeStali * 3.10;
        cenaStaliNierdzewnej = wagaBlachyZeStaliNierdzewnej * 6.20;

        wagaBlachyZeStali = wagaBlachyZeStali / 1000;
        wagaBlachyZeStaliNierdzewnej = wagaBlachyZeStaliNierdzewnej / 1000;

        txtWagaNormalnej.setText(String.valueOf(wagaBlachyZeStali));
        txtWagaNierdzewnej.setText(String.valueOf(wagaBlachyZeStaliNierdzewnej));

        txtCenaNormalnej.setText(String.valueOf(cenaStali));
        txtCenaNierdzewnej.setText(String.valueOf(cenaStaliNierdzewnej));

    }public double zaokraglanieDouble(double val) {
        double ileLiczbPoPrzecinku = 2;
        long factor = (long) Math.pow(10, ileLiczbPoPrzecinku);
        val = val * factor;
        long tmp = Math.round(val);
        return (double) tmp / factor;
    }
}
