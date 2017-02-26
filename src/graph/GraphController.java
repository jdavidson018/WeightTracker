package graph;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import data.Weight;
import data.readWeights;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;

public class GraphController implements Initializable{

	@FXML
	private CategoryAxis xAxis;
	@FXML
	private NumberAxis yAxis;
	@FXML
	private LineChart<String, Number> graph;
	
	private Series<String, Number> data;
	
	private ArrayList<Weight> weights;
	
	public GraphController(){
		weights = readWeights.readWeightData();
		data = new XYChart.Series<String, Number>();
		data.setName("Your Weight");
		for(Weight w : weights){
			data.getData().add(new XYChart.Data<String, Number>(w.getDate(), w.getWeight()));
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		yAxis.setAutoRanging(false);
		yAxis.setLowerBound(180);
		yAxis.setUpperBound(200);
		yAxis.setTickUnit(5);
		graph.getData().add(data);
	}
	
	public ArrayList<Weight> getWeights(){
		return this.weights;
	}

}
