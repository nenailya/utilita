
import grep.Utilita;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class testt {

    @Test
    public void test1() {
        Utilita grep = new Utilita(true, false, false);
        ArrayList<String> rez = new ArrayList<String>();
        rez.add("spying on the neighbours. The Dursleys had a small son called Dudley");
        assertEquals(rez, grep.grep("Dudley", "C:\\Users\\1\\IdeaProjects\\untitled3\\.idea\\test\\1.txt"));
    }
}