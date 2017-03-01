package graph;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import data.Weight;
import data.readWeights;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

public class TableController implements Initializable{

	@FXML
	private TableView<Weight> table;
	
	private ArrayList<Weight> weights;
	
	public TableController(){
		readWeights rw = new readWeights();
		weights = rw.getWeights();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		ObservableList<Weight> data = table.getItems();
		for(Weight w : weights){
			data.add(w);
		}
		
	}
	
	public ArrayList<Weight> getWeights(){
		return this.weights;
	}

}
