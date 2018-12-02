package BioLoesJava.Sequences;

public class BioLoesDNASeq extends BioLoesSeq{

    public BioLoesDNASeq(String sequence) {
        this.setSequence(sequence);
    }

    @Override
    public String getComplement() {
        String outcome = "";
        String sequence = getSequence();

        for(char nuc:sequence.toCharArray()){
            switch(nuc){
                case 'A': outcome = outcome.concat("T"); break;
                case 'T': outcome = outcome.concat("A"); break;
                case 'C': outcome = outcome.concat("G"); break;
                case 'G': outcome = outcome.concat("C"); break;
            }
        }
        return outcome;
    }

    public float getGCContent(){
        BioLoesSeqUtils utils = new BioLoesSeqUtils();
        return utils.getGCContent(getSequence());
    }

    public String getReversedComplement(){
        return new StringBuilder(getComplement()).reverse().toString();
    }

    public BioLoesRNASeq convertToRNA(){
        return new BioLoesRNASeq(getComplement());
    }
}

