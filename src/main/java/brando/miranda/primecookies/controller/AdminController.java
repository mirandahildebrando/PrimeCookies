package brando.miranda.primecookies.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {

    @FXML
    private Button bt_delete;

    @FXML
    private Button bt_edit;

    @FXML
    private Button bt_save;

    @FXML
    private Spinner sp_price;

    @FXML
    private TableView tb_admin;

    @FXML
    private TableColumn tc_id;

    @FXML
    private TableColumn tc_price;

    @FXML
    private TableColumn tc_product;

    @FXML
    private TableColumn tc_quantity;

    @FXML
    private TextField tf_product;

    @FXML
    private TextField tf_quantity;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void showProduct(ActionEvent event) {

        String name = tf_product.getText().toString();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Teste do sistema");

        alert.setHeaderText("Parabens funcionou");

        alert.setContentText(name);

        alert.show();

    }



}
