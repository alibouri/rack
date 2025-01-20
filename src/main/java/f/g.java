package f;

import Q4.i;
import java.util.ArrayList;

public final class g extends b {
    public final int a;
    public final h b;
    public final String c;
    public final i d;

    public g(h h0, String s, i i0, int v) {
        this.a = v;
        this.b = h0;
        this.c = s;
        this.d = i0;
        super();
    }

    @Override  // f.b
    public final void a(Object object0) {
        if(this.a != 0) {
            h h0 = this.b;
            String s = this.c;
            Object object1 = h0.b.get(s);
            i i0 = this.d;
            if(object1 != null) {
                int v = ((Number)object1).intValue();
                ArrayList arrayList0 = h0.d;
                arrayList0.add(s);
                try {
                    h0.b(v, i0, object0);
                    return;
                }
                catch(Exception exception0) {
                    arrayList0.remove(s);
                    throw exception0;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + i0 + " and input " + object0 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        h h1 = this.b;
        String s1 = this.c;
        Object object2 = h1.b.get(s1);
        i i1 = this.d;
        if(object2 != null) {
            int v1 = ((Number)object2).intValue();
            ArrayList arrayList1 = h1.d;
            arrayList1.add(s1);
            try {
                h1.b(v1, i1, object0);
                return;
            }
            catch(Exception exception1) {
                arrayList1.remove(s1);
                throw exception1;
            }
        }
        throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + i1 + " and input " + object0 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
    }

    public void b() {
        this.b.f(this.c);
    }
}

