package N4;

import Bb.p;
import Nb.j;
import f5.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public final class s implements Serializable {
    public final HashMap X;

    public s() {
        this.X = new HashMap();
    }

    public s(HashMap hashMap0) {
        j.f(hashMap0, "appEventMap");
        super();
        HashMap hashMap1 = new HashMap();
        this.X = hashMap1;
        hashMap1.putAll(hashMap0);
    }

    public final void a(b b0, List list0) {
        if(a.b(this)) {
            return;
        }
        try {
            j.f(list0, "appEvents");
            HashMap hashMap0 = this.X;
            if(!hashMap0.containsKey(b0)) {
                hashMap0.put(b0, p.R0(list0));
                return;
            }
            List list1 = (List)hashMap0.get(b0);
            if(list1 != null) {
                list1.addAll(list0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }

    private final Object writeReplace() {
        if(a.b(this)) {
            return null;
        }
        try {
            return new r(this.X);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }
}

