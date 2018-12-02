package BioLoesJava.Sequences;

public class BioLoesRNASeq extends BioLoesSeq{

    public BioLoesRNASeq(String sequence) {
        this.setSequence(sequence.toUpperCase());
    }

    @Override
    public String getComplement() {
        String outcome = "";
        String sequence = getSequence();

        for(char nuc:sequence.toCharArray()){
            switch(nuc){
                case 'A': outcome = outcome.concat("U"); break;
                case 'U': outcome = outcome.concat("A"); break;
                case 'C': outcome = outcome.concat("G"); break;
                case 'G': outcome = outcome.concat("C"); break;
            }
        }
        return outcome;
    }
    public float getGCContent(){
        int counter = 0;
        int total = getSequence().length();

        for(char nuc:getSequence().toCharArray()){
            switch(nuc){
                case 'C': counter++; break;
                case 'G': counter++; break;
            }
        }

        return (float)counter/ (float)total;
    }
}
