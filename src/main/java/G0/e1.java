package G0;

import Ab.t;
import T8.m;
import Zb.i;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.A1;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e1 extends ContentObserver {
    public final int a;
    public final Object b;

    public e1(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super(null);
    }

    public e1(i i0, Handler handler0) {
        this.a = 0;
        this.b = i0;
        super(handler0);
    }

    @Override  // android.database.ContentObserver
    public void onChange(boolean z) {
        switch(this.a) {
            case 1: {
                ((AtomicBoolean)((m)this.b).c).set(true);
                return;
            }
            case 2: {
                A1 a10 = (A1)this.b;
                synchronized(a10.c0) {
                    a10.d0 = null;
                    a10.Z.run();
                }
                synchronized(a10) {
                    Iterator iterator0 = a10.e0.iterator();
                    if(!iterator0.hasNext()) {
                        return;
                    }
                    Object object0 = iterator0.next();
                    if(object0 == null) {
                        throw null;
                    }
                }
                throw new ClassCastException();
            }
            default: {
                super.onChange(z);
            }
        }
    }

    @Override  // android.database.ContentObserver
    public void onChange(boolean z, Uri uri0) {
        if(this.a != 0) {
            super.onChange(z, uri0);
            return;
        }
        ((i)this.b).s(t.a);
    }
}

