
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

    @Test
    public void test2() {
        Utilita grep = new Utilita(true, false, true);
        ArrayList<String> rez = new ArrayList<String>();
        rez.add("Mr Dursley was the director of a firm called Grunnings, which made drills.");
        rez.add("Mrs Dursley was thin and blonde and had nearly twice the usual amount of neck,");
        rez.add("spying on the neighbours. The Dursleys had a small son called Dudley");
        assertEquals(rez, grep.grep("DursleY", "C:\\Users\\1\\IdeaProjects\\untitled3\\.idea\\test\\1.txt"));
    }

    @Test
    public void test3() {
        Utilita grep = new Utilita(true, true, true);
        ArrayList<String> rez = new ArrayList<String>();
        rez.add("He was a big, beefy man with hardly any neck, although he did have a very large moustache.");
        rez.add("which came in very useful as she spent so much of her time craning over garden fences,");
        rez.add("and in their opinion there was no finer boy anywhere.");
        assertEquals(rez, grep.grep("dURSLEY", "C:\\Users\\1\\IdeaProjects\\untitled3\\.idea\\test\\1.txt"));
    }
}