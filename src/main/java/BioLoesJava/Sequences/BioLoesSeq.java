package BioLoesJava.Sequences;

public abstract class BioLoesSeq implements BioLoesAbstractSeq{
    private String sequence;


    void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public String getSequence() {
        return sequence;
    }
}
