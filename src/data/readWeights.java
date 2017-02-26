package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readWeights {

	public static ArrayList<Weight> readWeightData(){
		ArrayList<Weight> weights = new ArrayList<Weight>();
		
        String csvFile = "data/weights.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] currLine = line.split(cvsSplitBy);
                Weight weight = new Weight(Double.parseDouble(currLine[1]), currLine[0]);
                
                weights.add(weight);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return weights;
	}
	
}
