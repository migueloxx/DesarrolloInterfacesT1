package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MiControlador implements Initializable {

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {

		}

		@FXML
		private Button btnCambiar;

		@FXML
		 private Label lblTexto;

		// Cuando clickemos en al boton se modificara el texto de la etiqueta.
		public void cambiarTexto(ActionEvent event) throws Exception{
			System.out.println("Estoy clickando");
			lblTexto.setText("Estamos cambiando el texto");
			
			Parent parent = FXMLLoader.load(getClass().getResource("/application/Secundaria.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Ventana Principal");
			stage.show();
		}
}
