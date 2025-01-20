package r8;

import java.util.EnumMap;

public final class m {
    public final String a;
    public final byte[] b;
    public o[] c;
    public final a d;
    public EnumMap e;

    public m(String s, byte[] arr_b, o[] arr_o, a a0) {
        this(s, arr_b, arr_o, a0, 0);
    }

    public m(String s, byte[] arr_b, o[] arr_o, a a0, int v) {
        this.a = s;
        this.b = arr_b;
        this.c = arr_o;
        this.d = a0;
        this.e = null;
    }

    public final void a(EnumMap enumMap0) {
        if(enumMap0 != null) {
            EnumMap enumMap1 = this.e;
            if(enumMap1 == null) {
                this.e = enumMap0;
                return;
            }
            enumMap1.putAll(enumMap0);
        }
    }

    public final void b(n n0, Object object0) {
        if(this.e == null) {
            this.e = new EnumMap(n.class);
        }
        this.e.put(n0, object0);
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

