package g3;

import A0.b;
import N5.r;
import Nb.j;
import android.text.TextUtils;
import coil.memory.MemoryCache.Key;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.w;
import i.J;
import io.sentry.g1;
import j6.Y;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import p2.L;
import q8.c;

public final class e extends L {
    public final int h;
    public final Object i;

    public e(int v, g1 g10) {
        this.h = 0;
        this.i = g10;
        super(v);
    }

    public e(Y y0) {
        this.h = 1;
        this.i = y0;
        super(20);
    }

    @Override  // p2.L
    public Object c(Object object0) {
        LinkedHashMap linkedHashMap0;
        if(this.h != 1) {
            return super.c(object0);
        }
        r.f(((String)object0));
        Y y0 = (Y)this.i;
        y0.u();
        r.f(((String)object0));
        if(!TextUtils.isEmpty(((String)object0))) {
            I0 i00 = (I0)y0.g0.get(((String)object0));
            if(i00 != null && i00.o() != 0) {
                if(!y0.g0.containsKey(((String)object0)) || y0.g0.get(((String)object0)) == null) {
                    y0.O(((String)object0));
                }
                else {
                    y0.D(((String)object0), ((I0)y0.g0.get(((String)object0))));
                }
                synchronized(((c)y0.i0.g)) {
                    Set set0 = ((LinkedHashMap)((J)y0.i0.f).Y).entrySet();
                    j.e(set0, "map.entries");
                    linkedHashMap0 = new LinkedHashMap(set0.size());
                    Set set1 = ((LinkedHashMap)((J)y0.i0.f).Y).entrySet();
                    j.e(set1, "map.entries");
                    for(Object object1: set1) {
                        linkedHashMap0.put(((Map.Entry)object1).getKey(), ((Map.Entry)object1).getValue());
                    }
                }
                return (w)linkedHashMap0.get(((String)object0));
            }
        }
        return null;
    }

    @Override  // p2.L
    public void d(Object object0, Object object1, Object object2) {
        if(this.h != 0) {
            super.d(object0, object1, object2);
            return;
        }
        d d0 = (d)object2;
        ((b)((g1)this.i).Y).l(((MemoryCache.Key)object0), ((d)object1).a, ((d)object1).b, ((d)object1).c);
    }

    @Override  // p2.L
    public int o(Object object0, Object object1) {
        if(this.h != 0) {
            return super.o(object0, object1);
        }
        MemoryCache.Key memoryCache$Key0 = (MemoryCache.Key)object0;
        return ((d)object1).c;
    }
}

