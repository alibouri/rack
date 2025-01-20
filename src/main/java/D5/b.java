package d5;

import M4.p;
import M4.w;
import Nb.j;
import c5.c;
import f5.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

public final class b implements p {
    public final int a;
    public final List b;

    public b(int v, List list0) {
        this.a = v;
        this.b = list0;
        super();
    }

    @Override  // M4.p
    public final void a(w w0) {
        if(this.a != 0) {
            try {
                List list0 = this.b;
                if(w0.c == null && j.a((w0.d == null ? null : Boolean.valueOf(w0.d.getBoolean("success"))), Boolean.TRUE)) {
                    for(Object object0: list0) {
                        J2.w.x(((c)object0).a);
                    }
                }
            }
            catch(JSONException unused_ex) {
            }
            return;
        }
        List list1 = this.b;
        Class class0 = d5.c.class;
        if(!a.b(class0)) {
            try {
                if(w0.c == null && j.a((w0.d == null ? null : Boolean.valueOf(w0.d.getBoolean("success"))), Boolean.TRUE)) {
                    Iterator iterator1 = list1.iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object1 = iterator1.next();
                        J2.w.x(((c)object1).a);
                    }
                }
                return;
            }
            catch(JSONException unused_ex) {
                return;
            }
            catch(Throwable throwable0) {
            }
            a.a(throwable0, class0);
        }
    }
}

