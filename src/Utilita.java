import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class Utilita {
    private String word, inputname;

    Utilita(String word, String inputname) {
        this.word = word;
        this.inputname = inputname;
    }


    public Utilita(boolean regex, boolean invert, boolean ignore) {

    }


    public String getWord() {
        return word;
    }

    public String getInputname() {
        return inputname;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setInputname(String inputname) {
        this.inputname = inputname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilita utilita = (Utilita) o;
        return Objects.equals(word, utilita.word) &&
                Objects.equals(inputname, utilita.inputname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, inputname);
    }

    public int smthsmth(String[] word, String[] inputname) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(inputName)) {
            try (FileOutputStream outputStream = new FileOutputStream(outputName)) {
                return smthsmth(inputStream, outputStream);
            }
        }
    }
   
}