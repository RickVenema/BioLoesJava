package BioLoesJava.Sequences;

public class BioLoesRNASeq extends BioLoesSeq{

    public BioLoesRNASeq(String sequence) {
        this.setSequence(sequence);
    }

    @Override
    public String getComplement() {
        return null;
    }
}
