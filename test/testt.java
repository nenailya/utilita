
import grep.Utilita;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



import java.util.ArrayList;
import java.util.List;

public class testt {

    @Test
    public void test1() {
        Utilita grep = new Utilita(false, false, false);
        List<String> rez = new ArrayList<String>();
        rez.add("spying on the neighbours. The Dursleys had a small son called Dudley");
        assertEquals(rez, grep.grep("Dudley", "test\\1.txt"));
    }

    @Test
    public void test2() {
        Utilita grep = new Utilita(false, false, true);
        List<String> rez = new ArrayList<String>();
        rez.add("Mr Dursley was the director of a firm called Grunnings, which made drills.");
        rez.add("Mrs Dursley was thin and blonde and had nearly twice the usual amount of neck,");
        rez.add("spying on the neighbours. The Dursleys had a small son called Dudley");
        assertEquals(rez, grep.grep("DursleY", "test\\1.txt"));
    }

    @Test
    public void test3() {
        Utilita grep = new Utilita(false, true, true);
        List<String> rez = new ArrayList<String>();
        rez.add("He was a big, beefy man with hardly any neck, although he did have a very large moustache.");
        rez.add("which came in very useful as she spent so much of her time craning over garden fences,");
        rez.add("and in their opinion there was no finer boy anywhere.");
        assertEquals(rez, grep.grep("dURSLEY", "test\\1.txt"));
    }

    @Test
    public void test4() {
        Utilita grep = new Utilita(false, true, false );
        List<String> rez = new ArrayList<String>();
        rez.add("Mr Dursley was the director of a firm called Grunnings, which made drills.");
        rez.add("He was a big, beefy man with hardly any neck, although he did have a very large moustache.");
        rez.add("Mrs Dursley was thin and blonde and had nearly twice the usual amount of neck,");
        rez.add("which came in very useful as she spent so much of her time craning over garden fences,");
        rez.add("and in their opinion there was no finer boy anywhere.");
        assertEquals(rez, grep.grep("Dudley", "test\\1.txt"));
    }

    @Test
    public void test5() {
        Utilita grep = new Utilita(true ,false ,false );
        List<String> rez = new ArrayList<String>();
        rez.add("Mr Dursley was the director of a firm called Grunnings, which made drills.");
        rez.add("Mrs Dursley was thin and blonde and had nearly twice the usual amount of neck,");
        rez.add("spying on the neighbours. The Dursleys had a small son called Dudley");
        assertEquals(rez, grep.grep("Dudley|Dursley", "test\\1.txt"));
    }

    @Test
    public void test6() {
        Utilita grep = new Utilita(true ,false ,true );
        List<String> rez = new ArrayList<String>();
        rez.add("Mr Dursley was the director of a firm called Grunnings, which made drills.");
        rez.add("Mrs Dursley was thin and blonde and had nearly twice the usual amount of neck,");
        rez.add("which came in very useful as she spent so much of her time craning over garden fences,");
        rez.add("and in their opinion there was no finer boy anywhere.");
        assertEquals(rez, grep.grep("whiCH|And", "test\\1.txt"));
    }

    @Test
    public void test7() {
        Utilita grep = new Utilita( true, true,false );
        List<String> rez = new ArrayList<String>();
        rez.add("which came in very useful as she spent so much of her time craning over garden fences,");
        assertEquals(rez, grep.grep("Dursley|was", "test\\1.txt"));
    }

    @Test
    public void test8() {
        Utilita grep = new Utilita( true,true ,true );
        List<String> rez = new ArrayList<String>();
        rez.add("which came in very useful as she spent so much of her time craning over garden fences,");
        assertEquals(rez, grep.grep("Dursley|WAS", "test\\1.txt"));
    }




}