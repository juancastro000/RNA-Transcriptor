package dev.juan.transcriptor;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

public class TranscriptorTest {

    @Test
    public void testTranscribeEmptyString() {
        TranscriptionStrategy transcription = new Transcriptor();
        assertThat(transcription.transcribe(""), equalTo(""));
    }

    

}
