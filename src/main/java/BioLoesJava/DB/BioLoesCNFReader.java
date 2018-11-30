package BioLoesJava.DB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BioLoesCNFReader {

    public BioLoesDBOptions read(String filepath){
        if( checkcnffile(filepath)){
            List<String> records = openFile(filepath);
            for(String record: records){
                System.out.println("record = " + record);

            }
        } else{
            System.err.println("Something went wrong, please read error log for more information");
        }

        return null;
    }


    private boolean checkcnffile(String filepath) {
        File file = new File(filepath);
        if(file.exists()){
            if(filepath.endsWith(".cnf")){
                return true;
            } else{
                System.err.println("The file that was given, is not a valid .cnf file" +  filepath);
                return false;
            }
        } else{
            System.err.println("The file that you want to read does not exists" + filepath);
            return false;
        }
    }

    private List<String> openFile(String filepath){
        File file = new File(filepath);
        List<String> records = new ArrayList<>();

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

    }
}
