package q2;

import Bb.B;
import Cb.l;
import Nb.j;
import java.util.Set;
import yc.d;

public final class p {
    public final o a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public p(o o0, int[] arr_v, String[] arr_s) {
        this.a = o0;
        this.b = arr_v;
        this.c = arr_s;
        Set set0 = arr_s.length == 0 ? B.X : d.C(arr_s[0]);
        this.d = set0;
        if(arr_v.length != arr_s.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set set0) {
        int v = 0;
        j.f(set0, "invalidatedTablesIds");
        int[] arr_v = this.b;
        Set set1 = B.X;
        if(arr_v.length != 0) {
            if(arr_v.length != 1) {
                l l0 = new l();
                for(int v1 = 0; v < arr_v.length; ++v1) {
                    if(set0.contains(((int)arr_v[v]))) {
                        l0.add(this.c[v1]);
                    }
                    ++v;
                }
                set1 = d.g(l0);
            }
            else if(set0.contains(((int)arr_v[0]))) {
                set1 = this.d;
            }
        }
        if(!set1.isEmpty()) {
            this.a.a(set1);
        }
    }
}

