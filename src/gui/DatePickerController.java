package gui;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class DatePickerController implements Initializable {

	@FXML
	private DatePicker DPDate;

	@FXML
	private Button btOk;

	@FXML
	private Label lbToSee;

	@FXML
	private Label lbError;

	@FXML
	public void onBtOkAction(ActionEvent event) {
		String display = DPDate.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		lbToSee.setText(display);
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}
}
