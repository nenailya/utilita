
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
        rez.add("������ ������� ������� Eclipse");
        rez.add("��� ������ � ��������� Eclipse ����� ������������ ������ ������� �������� Eclipse");
        rez.add("��� �������� �������� NetBeans �� �������� ������� ������� Eclipse � ������� ����� � ������� � ������");
        rez.add("���������� �������. ��� ������������� ������� ������� �������� Eclipse �������� � ��������� ������� NetBeans �");
        rez.add("������ �� ���������. �������� ������ �������, ������ \"����\" > \"������������� ������\" > \"������ Eclipse\".");
        rez.add("Eclipse � NetBeans ��. � ������� ������ �������� Eclipse � IDE NetBeans.");
        assertEquals(rez, grep.grep("Eclipse", "C:\\Users\\1\\IdeaProjects\\untitled3\\.idea\\test\\1.txt"));
    }
}