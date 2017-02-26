package data;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Weight> weights = readWeights.readWeightData();
		for(Weight w : weights){
			System.out.println(w.getWeight() + "   " + w.getDate());
		}
	}
}
