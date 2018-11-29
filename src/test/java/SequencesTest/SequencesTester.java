package SequencesTest;

import BioLoesJava.Sequences.BioLoesDNASeq;
import BioLoesJava.Sequences.BioLoesRNASeq;
import BioLoesJava.Sequences.BioLoesSeq;

public class SequencesTester {
    public static void main(String[] args) {
        BioLoesDNASeq bioLoesDNASeq = new BioLoesDNASeq("ATG");
        BioLoesSeq bioLoesSeq = new BioLoesRNASeq("ATG");
    }
}
