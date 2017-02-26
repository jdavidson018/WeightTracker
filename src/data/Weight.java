package data;

public class Weight {

	private double _weight;
	private String _date;
	
	public Weight(double weight, String date){
		this._weight = weight;
		this._date = date;
	}
	
	public void setWeight(double weight){
		this._weight = weight;
	}
	
	public double getWeight(){
		return this._weight;
	}
	
	public void setDate(String date){
		this._date = date;
	}
	
	public String getDate(){
		return this._date;
	}
}
