package Tests;

import BioLoesJava.Sequences.BioLoesRNASeq;

public class SequenceTester {
    public static void main(String[] args) {
        BioLoesRNASeq seq = new BioLoesRNASeq("AUG");
        System.out.println(seq.getSequence());
        System.out.println(seq.getComplement());

        System.out.println(seq.getGCContent());

    }
}
