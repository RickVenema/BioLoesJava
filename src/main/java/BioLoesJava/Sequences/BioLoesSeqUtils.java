package BioLoesJava.Sequences;

public class BioLoesSeqUtils {

    public float getGCContent(String sequence){
        int counter = 0;
        int total = sequence.length();
        for(char nuc:sequence.toCharArray()){
            switch(nuc){
                case 'C': counter++; break;
                case 'G': counter++; break;
            }
        }
        return (float)counter/ (float)total;
    }
}
