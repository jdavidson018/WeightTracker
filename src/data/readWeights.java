package data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class readWeights {
	private String _csvFile = "/weights.csv";
	private InputStream _is;
	private  InputStreamReader _fr;
	private BufferedReader _br;
	ArrayList<Weight> _weights;

	public readWeights(){
		_weights = new ArrayList<Weight>();
		readWeightData();
	}
	
	public void readWeightData(){
		
        String line = "";
        String cvsSplitBy = ",";
        try {
        	_is = this.getClass().getClass().getResourceAsStream(_csvFile);
    		_fr = new InputStreamReader(_is);
    		_br = new BufferedReader(_fr);
	        while ((line = _br.readLine()) != null) {

                // use comma as separator
                String[] currLine = line.split(cvsSplitBy);
                Weight weight = new Weight(Double.parseDouble(currLine[1]), currLine[0]);
                
                _weights.add(weight);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
            if (_br != null) {
                try {
                    _br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
	public ArrayList<Weight> getWeights(){
		return _weights;
	}
	
}
