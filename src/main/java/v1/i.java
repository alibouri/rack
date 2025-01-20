package v1;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import r3.p;

public final class i extends p {
    public final int a;
    public SparseIntArray[] b;
    public final ArrayList c;
    public final h d;
    public static HandlerThread e;
    public static Handler f;

    public i(int v) {
        this.b = new SparseIntArray[9];
        this.c = new ArrayList();
        this.d = new h(this);
        this.a = v;
    }

    @Override  // r3.p
    public final void f(Activity activity0) {
        if(i.e == null) {
            HandlerThread handlerThread0 = new HandlerThread("FrameMetricsAggregator");
            i.e = handlerThread0;
            handlerThread0.start();
            i.f = new Handler(i.e.getLooper());
        }
        for(int v = 0; v <= 8; ++v) {
            SparseIntArray[] arr_sparseIntArray = this.b;
            if(arr_sparseIntArray[v] == null && (this.a & 1 << v) != 0) {
                arr_sparseIntArray[v] = new SparseIntArray();
            }
        }
        activity0.getWindow().addOnFrameMetricsAvailableListener(this.d, i.f);
        WeakReference weakReference0 = new WeakReference(activity0);
        this.c.add(weakReference0);
    }

    @Override  // r3.p
    public final SparseIntArray[] i() {
        return this.b;
    }

    @Override  // r3.p
    public final SparseIntArray[] k(Activity activity0) {
        ArrayList arrayList0 = this.c;
        for(Object object0: arrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0.get() == activity0) {
                arrayList0.remove(weakReference0);
                break;
            }
            if(false) {
                break;
            }
        }
        activity0.getWindow().removeOnFrameMetricsAvailableListener(this.d);
        return this.b;
    }

    @Override  // r3.p
    public final SparseIntArray[] l() {
        SparseIntArray[] arr_sparseIntArray = this.b;
        this.b = new SparseIntArray[9];
        return arr_sparseIntArray;
    }

    @Override  // r3.p
    public final SparseIntArray[] m() {
        ArrayList arrayList0 = this.c;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            WeakReference weakReference0 = (WeakReference)arrayList0.get(v);
            Activity activity0 = (Activity)weakReference0.get();
            if(weakReference0.get() != null) {
                activity0.getWindow().removeOnFrameMetricsAvailableListener(this.d);
                arrayList0.remove(v);
            }
        }
        return this.b;
    }

    public static void n(SparseIntArray sparseIntArray0, long v) {
        if(sparseIntArray0 != null) {
            int v1 = (int)((500000L + v) / 1000000L);
            if(v >= 0L) {
                sparseIntArray0.put(v1, sparseIntArray0.get(v1) + 1);
            }
        }
    }
}

