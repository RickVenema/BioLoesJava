package BioLoesJava.DB;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BioLoesCNFReader {

    public BioLoesDBOptions read(String filepath){
        if( checkcnffile(filepath)){
            List<String> records = openFile(filepath);
            Map<String, String> parsed_cnf = new HashMap<>();
            for(String record: records){
                System.out.println("record = " + record);
                if(record.startsWith("user=")){
                    String[] tmp = record.split("user=");
                    parsed_cnf.put("user", tmp[1]);
                } else if(record.startsWith("password=")){
                    String[] tmp = record.split("password=");
                    parsed_cnf.put("password", tmp[1]);
                }else if(record.startsWith("database=")){
                    String[] tmp = record.split("database=");
                    parsed_cnf.put("database", tmp[1]);
                }else if(record.startsWith("host=")){
                    String[] tmp = record.split("host=");
                    parsed_cnf.put("host", tmp[1]);
                }
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
                System.err.println("The file that was given, is not a valid .cnf file " +  filepath);
                return false;
            }
        } else{
            System.err.println("The file that you want to read does not exists " + filepath);
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
