package Bb;

import Nb.j;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class u extends t {
    public static void d0(List list0) {
        if(list0.size() > 1) {
            Collections.sort(list0);
        }
    }

    public static void e0(List list0, Comparator comparator0) {
        j.f(list0, "<this>");
        if(list0.size() > 1) {
            Collections.sort(list0, comparator0);
        }
    }
}

