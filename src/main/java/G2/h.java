package G2;

import R9.k2;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import c2.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s.o;
import v1.r;

public final class h {
    public e a;
    public f b;
    public g c;
    public ViewPager2 d;
    public long e;
    public final i f;

    public h(i i0) {
        this.f = i0;
        this.e = -1L;
    }

    public static ViewPager2 a(RecyclerView recyclerView0) {
        ViewParent viewParent0 = recyclerView0.getParent();
        if(!(viewParent0 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + viewParent0);
        }
        return (ViewPager2)viewParent0;
    }

    public final void b(boolean z) {
        i i0 = this.f;
        if(i0.e.P()) {
            return;
        }
        if(this.d.getScrollState() != 0) {
            return;
        }
        o o0 = i0.f;
        if(!o0.h()) {
            List list0 = k2.a;
            if(list0.size() != 0) {
                int v = this.d.getCurrentItem();
                if(v >= list0.size()) {
                    return;
                }
                if(((long)v) == this.e && !z) {
                    return;
                }
                Fragment fragment0 = (Fragment)o0.e(((long)v));
                if(fragment0 != null && fragment0.u()) {
                    this.e = (long)v;
                    i0.e.getClass();
                    a a0 = new a(i0.e);
                    ArrayList arrayList0 = new ArrayList();
                    Fragment fragment1 = null;
                    for(int v1 = 0; v1 < o0.m(); ++v1) {
                        long v2 = o0.i(v1);
                        Fragment fragment2 = (Fragment)o0.n(v1);
                        if(fragment2.u()) {
                            if(v2 == this.e) {
                                fragment1 = fragment2;
                            }
                            else {
                                a0.k(fragment2, State.b0);
                                i0.j.getClass();
                                ArrayList arrayList1 = new ArrayList();
                                Iterator iterator0 = i0.j.a.iterator();
                                if(iterator0.hasNext()) {
                                    throw r.e(iterator0);
                                }
                                arrayList0.add(arrayList1);
                            }
                            boolean z1 = v2 == this.e;
                            if(fragment2.C0 != z1) {
                                fragment2.C0 = z1;
                            }
                        }
                    }
                    if(fragment1 != null) {
                        a0.k(fragment1, State.c0);
                        i0.j.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator iterator1 = i0.j.a.iterator();
                        if(iterator1.hasNext()) {
                            throw r.e(iterator1);
                        }
                        arrayList0.add(arrayList2);
                    }
                    if(!a0.a.isEmpty()) {
                        a0.g();
                        Collections.reverse(arrayList0);
                        for(Object object0: arrayList0) {
                            i0.j.getClass();
                            d.a(((List)object0));
                        }
                    }
                }
            }
        }
    }
}

