
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
        rez.add("Импорт рабочей области Eclipse");
        rez.add("При работе с проектами Eclipse можно использовать мастер импорта проектов Eclipse");
        rez.add("для создания проектов NetBeans из проектов рабочей области Eclipse и импорта путей к классам и других");
        rez.add("параметров проекта. При использовании мастера импорта проектов Eclipse создание и настройка проекта NetBeans в");
        rez.add("ручную не требуется. Откройте мастер импорта, выбрав \"Файл\" > \"Импортировать проект\" > \"Проект Eclipse\".");
        rez.add("Eclipse и NetBeans см. в разделе Импорт проектов Eclipse в IDE NetBeans.");
        assertEquals(rez, grep.grep("Eclipse", "C:\\Users\\1\\IdeaProjects\\untitled3\\.idea\\test\\1.txt"));
    }
}