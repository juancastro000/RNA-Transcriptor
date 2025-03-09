package dev.juan.transcriptor;

public class Transcriptor implements TranscriptionStrategy{

    @Override
    public String transcribe(String dna) {
        if(dna.isEmpty()){
            return "";
        }
        return null;
    }
}
