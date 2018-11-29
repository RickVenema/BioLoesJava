package BioLoesJava.Sequences;

public class BioLoesDNASeq extends BioLoesSeq{

    public BioLoesDNASeq(String sequence) {
        this.setSequence(sequence);
    }

    @Override
    public String getComplement() {
        return null;
    }
}

