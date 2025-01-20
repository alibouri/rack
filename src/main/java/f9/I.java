package f9;

import Aa.s;
import Ab.e;
import Ab.k;
import Ba.l;
import Nb.j;
import kotlin.jvm.functions.Function1;

public final class i implements L {
    public final int a;
    public final String b;
    public final Function1 c;

    public i(M m0, N n0) {
        j.f(m0, "groupSpec");
        s s0;
        super();
        this.a = m0.b;
        this.b = m0.a;
        switch(n0.ordinal()) {
            case 0: {
                s0 = new s(1, v.a, v.class, "clean", "clean(Ljava/lang/String;)Ljava/lang/String;", 0, 26);
                break;
            }
            case 1: {
                s0 = new l(26, this);
                break;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        this.c = s0;
    }

    @Override  // f9.L
    public final String a(String s) {
        j.f(s, "value");
        return (String)this.c.n(s);
    }

    @Override  // f9.L
    public final String b(String s) {
        j.f(s, "value");
        String s1 = this.a(s);
        StringBuilder stringBuilder0 = new StringBuilder();
        char[] arr_c = s1.toCharArray();
        j.e(arr_c, "toCharArray(...)");
        for(int v = 0; v < arr_c.length; ++v) {
            stringBuilder0.append(arr_c[v]);
            boolean z = true;
            boolean z1 = v % this.a == this.a - 1;
            if(v != s1.length() - 1) {
                z = false;
            }
            if(z1 && !z) {
                stringBuilder0.append(this.b);
            }
        }
        String s2 = stringBuilder0.toString();
        j.e(s2, "toString(...)");
        return s2;
    }

    @Override  // f9.L
    public final k c(int v, String s) {
        j.f(s, "value");
        String s1 = s.substring(0, v);
        j.e(s1, "substring(...)");
        int v1 = this.b(s1).length();
        String s2 = this.b(s);
        return new k(s2, Math.min(v + (v1 - s1.length()), s2.length()));
    }
}

