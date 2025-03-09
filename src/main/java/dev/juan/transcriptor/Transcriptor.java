package dev.juan.transcriptor;

public class Transcriptor implements TranscriptionStrategy{

    @Override
    public String transcribe(String dna) {
        if(dna.isEmpty()){
            return "";
        }
        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toCharArray()) {
            switch (nucleotide) {
                case 'A': 
                    rna.append('U');
                    break;
                case 'C': 
                    rna.append('G');
                    break;
                case 'G': 
                    rna.append('C');
                    break;
                case 'T': 
                    rna.append('A');
                    break;
                default:
                    throw new IllegalArgumentException("Nucleótido desconocido: " + nucleotide);
            }
        }
        return rna.toString();
    }
}
