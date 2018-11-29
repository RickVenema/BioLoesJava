package BioLoesJava.Sequences;

public abstract class BioLoesSeq implements BioLoesAbstractSeq{
    private String sequence;


    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public String getSequence() {
        return sequence;
    }
}
