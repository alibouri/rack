package J2;

import Aa.n;
import I2.A;
import I2.B;
import I2.J;
import I2.o;
import Nb.j;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class p extends w {
    public final u a;
    public final String b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public boolean g;
    public o h;
    public static final String i;

    static {
        p.i = A.g("WorkContinuationImpl");
    }

    public p(u u0, String s, int v, List list0) {
        this.a = u0;
        this.b = s;
        this.c = v;
        this.d = list0;
        this.e = new ArrayList(list0.size());
        this.f = new ArrayList();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if(v == 1 && ((B)list0.get(v1)).b.u != 0x7FFFFFFFFFFFFFFFL) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String s1 = ((B)list0.get(v1)).a.toString();
            j.e(s1, "id.toString()");
            this.e.add(s1);
            this.f.add(s1);
        }
    }

    public final o V() {
        String s;
        if(!this.g) {
            u u0 = this.a;
            o o0 = u0.b.n;
            switch(this.c) {
                case 1: {
                    s = "REPLACE";
                    break;
                }
                case 2: {
                    s = "KEEP";
                    break;
                }
                case 3: {
                    s = "APPEND";
                    break;
                }
                case 4: {
                    s = "APPEND_OR_REPLACE";
                    break;
                }
                default: {
                    throw null;
                }
            }
            n n0 = new n(7, this);
            this.h = J.H(o0, "EnqueueRunnable_" + s, u0.d.a, n0);
            return this.h;
        }
        A.e().h(p.i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        return this.h;
    }

    public static HashSet W(p p0) {
        HashSet hashSet0 = new HashSet();
        p0.getClass();
        return hashSet0;
    }
}

