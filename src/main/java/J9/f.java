package J9;

import B3.c;
import M5.l;
import N5.r;
import Vb.j;
import Vb.q;
import com.google.android.gms.common.Feature;
import com.sendwave.util.Country;

public final class f {
    public boolean a;
    public int b;
    public Object c;
    public Object d;

    public String a(String s, char c) {
        c c1 = (c)this.c;
        String s1 = ((Country)c1.Y).c0;
        if(!j.c0(((String)this.d)) && q.O(s, ((String)this.d), false)) {
            s = s.substring(((String)this.d).length());
            Nb.j.e(s, "substring(...)");
        }
        String s2 = c1.m(s1 + s + c, !j.c0(((String)this.d)));
        if(this.a) {
            this.b = s2.length();
        }
        return s2;
    }

    public f b() {
        r.a("execute parameter required", ((l)this.c) != null);
        Feature[] arr_feature = (Feature[])this.d;
        boolean z = this.a;
        int v = this.b;
        f f0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f0.d = this;
        f0.c = arr_feature;
        f0.a = arr_feature != null && z;
        f0.b = v;
        return f0;
    }

    public static f c() {
        f f0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f0.a = true;
        f0.b = 0;
        return f0;
    }
}

