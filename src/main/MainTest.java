package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainTest extends Application {

	private Stage theStage;
	private Scene scene1, scene2;

	@FXML
	private Button button1, button2;

	@FXML
	private AnchorPane GuiAnchor, AsdasdAnchor;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		this.theStage = stage;
		
		Parent root = FXMLLoader.load(getClass().getResource("Gui_test.fxml"));
		Parent secroot = FXMLLoader.load(getClass().getResource("Asdasd.fxml"));
		scene1 = new Scene(root, 1366, 768);
		scene2 = new Scene(secroot, 1366, 768);

		//button1 = new Button("Scene 1");
		//button2 = new Button("Scene 2");
		//button1.setOnAction(e -> ButtonClicked(e));
		//button2.setOnAction(e -> ButtonClicked(e));

		System.out.println("asd"); // I NEED FOR BECAUSE OF REASONS FFS THIS
									// DOESNT MAKE ANY SENSE // readTestText();
									// stage.setTitle("FXML Welcome");
		stage.setScene(scene1);
		stage.setResizable(false);
		stage.show();

	}

	@FXML
	public void ButtonClicked(ActionEvent e) throws Exception{
		if (e.getSource() == button1) {
			System.out.print("1st ");
			Parent secroot = FXMLLoader.load(getClass().getResource("Asdasd.fxml"));
			scene2 = new Scene(secroot, 1366, 768);
			Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			
			app_stage.setScene(scene2);
		} else {
			System.out.print("2nd ");
			Parent secroot = FXMLLoader.load(getClass().getResource("Gui_test.fxml"));
			scene1 = new Scene(secroot, 1366, 768);
			Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			
			app_stage.setScene(scene1);
		}
	}

	/*
	 * @FXML Button button1, button2; Label lblscene1, lblscene2; FlowPane
	 * pane1, pane2; Scene scene1, scene2; Stage thestage;
	 * 
	 * @Override public void start(Stage primaryStage) {
	 * 
	 * thestage = primaryStage;
	 * 
	 * button1 = new Button("Click to go to Other Scene"); button2 = new Button(
	 * "Click to go back to First Scene"); button1.setOnAction(e ->
	 * ButtonClicked(e)); button2.setOnAction(e -> ButtonClicked(e)); // make 2
	 * Panes pane1 = new FlowPane(); pane2 = new FlowPane(); pane1.setVgap(10);
	 * pane2.setVgap(10);
	 * 
	 * pane1.setStyle("-fx-background-color: tan;-fx-padding: 10px;");
	 * pane2.setStyle("-fx-background-color: red;-fx-padding: 10px;");
	 * 
	 * pane1.getChildren().addAll(button1); pane2.getChildren().addAll(button2);
	 * 
	 * scene1 = new Scene(pane1, 200, 100); scene2 = new Scene(pane2, 200, 100);
	 * 
	 * primaryStage.setTitle("Hello World!"); primaryStage.setScene(scene1);
	 * primaryStage.show(); }
	 * 
	 * public void ButtonClicked(ActionEvent e) { if (e.getSource() == button1)
	 * thestage.setScene(scene2); else thestage.setScene(scene1); }
	 */
}
