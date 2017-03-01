package data;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args)  {
		readWeights rw = new readWeights();
		ArrayList<Weight> weights = rw.getWeights();
		for(Weight w : weights){
			System.out.println(w.getWeight() + "   " + w.getDate());
		}
		 Application.launch(Main.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		  Parent root = FXMLLoader.load(getClass().getResource("/graph/WeightGraph.fxml"));
	        
	        stage.setTitle("FXML Welcome");
	        stage.setScene(new Scene(root, 800, 600));
	        stage.show();
		
	}
}
