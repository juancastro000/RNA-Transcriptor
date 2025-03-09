package dev.juan.transcriptor;

public class Transcriptor implements TranscriptionStrategy{

    @Override
    public String transcribe(String dna) {
        if(dna.isEmpty()){
            return "";
        }
        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toCharArray()) {
            if (nucleotide == 'A') {
                rna.append('U');
            } else {
                throw new IllegalArgumentException("Unknow nucleotide: " + nucleotide);
            }
        }
        return rna.toString();
    }
}
