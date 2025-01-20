package b4;

import java.util.ArrayList;
import v.h;

public final class o {
    public final int a;
    public final String b;
    public ArrayList c;
    public ArrayList d;

    public o(int v, String s) {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        if(v == 0) {
            v = 1;
        }
        this.a = v;
        this.b = s;
    }

    public final void a(int v, String s, String s1) {
        if(this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new b(s, v, s1));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.a;
        if(v == 2) {
            stringBuilder0.append("> ");
        }
        else if(v == 3) {
            stringBuilder0.append("+ ");
        }
        stringBuilder0.append((this.b == null ? "*" : this.b));
        ArrayList arrayList0 = this.c;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                stringBuilder0.append('[');
                stringBuilder0.append(((b)object0).a);
                int v1 = h.d(((b)object0).b);
                String s = ((b)object0).c;
                switch(v1) {
                    case 1: {
                        stringBuilder0.append('=');
                        stringBuilder0.append(s);
                        break;
                    }
                    case 2: {
                        stringBuilder0.append("~=");
                        stringBuilder0.append(s);
                        break;
                    }
                    case 3: {
                        stringBuilder0.append("|=");
                        stringBuilder0.append(s);
                    }
                }
                stringBuilder0.append(']');
            }
        }
        ArrayList arrayList1 = this.d;
        if(arrayList1 != null) {
            for(Object object1: arrayList1) {
                stringBuilder0.append(':');
                stringBuilder0.append(((e)object1));
            }
        }
        return stringBuilder0.toString();
    }
}

