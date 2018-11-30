package BioLoesJava.DB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BioLoesCNFReader {
    public BioLoesDBOptions read(String filepath){
        List<String> records = openFile(filepath);


        return null;
    }

    private List<String> openFile(String filepath){
        File file = new File(filepath);
        List<String> records = new ArrayList<String>();
        if(file.exists()){
            try {
                String line;

                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                while ((line = reader.readLine()) != null) {
                    records.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return records;
        } else{
            System.err.println("CNF file that you want to read does not exists" + filepath);
            return null;
        }
    }
}
