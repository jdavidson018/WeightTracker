package graph;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

public class WeightGraphController implements Initializable{

	@FXML
	private GridPane tablePane;
	private TableController _tabController;
	
	@FXML
	private GridPane graphPane;
	private GraphController _graphController;
	
	public WeightGraphController() throws IOException{
		_tabController = new TableController();
		_graphController = new GraphController();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tablePane.getChildren().clear();
		graphPane.getChildren().clear();
		try {
			setTablePane();
			setGraphPane();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private void setTablePane() throws IOException{	
		FXMLLoader table = new FXMLLoader(getClass().getResource("/graph/Table.fxml"));
		table.setController(_tabController);
		tablePane.getChildren().clear();
		tablePane.getChildren().add(table.load());
	}
	
	private void setGraphPane() throws IOException{
		FXMLLoader graph = new FXMLLoader(getClass().getResource("/graph/Graph.fxml"));
		graph.setController(_graphController);
		graphPane.getChildren().clear();
		graphPane.getChildren().add(graph.load());
	}

}
