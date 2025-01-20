package j6;

import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.x0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import s.b;
import s.e;

public final class t1 {
    public final String a;
    public final boolean b;
    public final l1 c;
    public final BitSet d;
    public final BitSet e;
    public final e f;
    public final e g;
    public final s1 h;

    public t1(s1 s10, String s) {
        this.h = s10;
        this.a = s;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new e(0);  // initializer: Ls/J;-><init>(I)V
        this.g = new e(0);  // initializer: Ls/J;-><init>(I)V
    }

    public t1(s1 s10, String s, l1 l10, BitSet bitSet0, BitSet bitSet1, e e0, e e1) {
        this.h = s10;
        this.a = s;
        this.d = bitSet0;
        this.e = bitSet1;
        this.f = e0;
        this.g = new e(0);  // initializer: Ls/J;-><init>(I)V
        for(Object object0: ((b)e1.keySet())) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(((Long)e1.get(((Integer)object0))));
            this.g.put(((Integer)object0), arrayList0);
        }
        this.b = false;
        this.c = l10;
    }

    public final void a(v1 v10) {
        int v = v10.e == 0 ? ((r0)v10.f).s() : ((x0)v10.f).o();
        Boolean boolean0 = v10.a;
        if(boolean0 != null) {
            this.e.set(v, boolean0.booleanValue());
        }
        Boolean boolean1 = v10.b;
        if(boolean1 != null) {
            this.d.set(v, boolean1.booleanValue());
        }
        if(v10.c != null) {
            e e0 = this.f;
            Long long0 = (Long)e0.get(v);
            long v1 = (long)v10.c;
            if(long0 == null || v1 / 1000L > ((long)long0)) {
                e0.put(v, ((long)(v1 / 1000L)));
            }
        }
        if(v10.d != null) {
            e e1 = this.g;
            List list0 = (List)e1.get(v);
            if(list0 == null) {
                list0 = new ArrayList();
                e1.put(v, list0);
            }
            if(v10.e != 0) {
                list0.clear();
            }
            s1 s10 = this.h;
            A a0 = s.p0;
            String s = this.a;
            if(((d0)s10.Y).e0.B(s, a0) && (v10.e == 0 ? ((r0)v10.f).A() : false)) {
                list0.clear();
            }
            if(((d0)s10.Y).e0.B(s, a0)) {
                long v2 = (long)v10.d;
                if(!list0.contains(((long)(v2 / 1000L)))) {
                    list0.add(((long)(v2 / 1000L)));
                }
                return;
            }
            list0.add(((long)(((long)v10.d) / 1000L)));
        }
    }
}

