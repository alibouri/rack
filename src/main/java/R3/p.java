package r3;

import Bb.r;
import F3.a;
import Nb.j;
import android.app.Activity;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import pc.w;
import u3.b;

public class p implements b {
    @Override  // u3.b
    public float a() {
        return 1.0f;
    }

    @Override  // u3.b
    public boolean b(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override  // u3.b
    public float c() {
        return 0.0f;
    }

    @Override  // u3.b
    public a d() {
        throw new IllegalStateException("not implemented");
    }

    @Override  // u3.b
    public boolean e(float f) {
        return false;
    }

    public void f(Activity activity0) {
    }

    public static ArrayList g(List list0) {
        j.f(list0, "protocols");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(((w)object0) != w.Y) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(r.b0(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((w)object1).X);
        }
        return arrayList1;
    }

    public static byte[] h(List list0) {
        j.f(list0, "protocols");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        for(Object object0: p.g(list0)) {
            j0.h0(((String)object0).length());
            j0.m0(((String)object0));
        }
        return j0.L(j0.Y);
    }

    public SparseIntArray[] i() {
        return null;
    }

    @Override  // u3.b
    public boolean isEmpty() {
        return true;
    }

    public static boolean j() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public SparseIntArray[] k(Activity activity0) {
        return null;
    }

    public SparseIntArray[] l() {
        return null;
    }

    public SparseIntArray[] m() {
        return null;
    }
}

