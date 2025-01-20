package p2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class k extends L {
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public static TimeInterpolator s;

    // Deobfuscation rating: LOW(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public final boolean g(I i0, List list0) {
        return !list0.isEmpty() || this.f(i0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public final void i(I i0) {
        View view0 = i0.a;
        view0.animate().cancel();
        ArrayList arrayList0 = this.j;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            if(((j)arrayList0.get(v)).a == i0) {
                view0.setTranslationY(0.0f);
                view0.setTranslationX(0.0f);
                this.h(i0);
                arrayList0.remove(v);
            }
        }
        this.p(this.k, i0);
        if(this.h.remove(i0)) {
            view0.setAlpha(1.0f);
            this.h(i0);
        }
        if(this.i.remove(i0)) {
            view0.setAlpha(1.0f);
            this.h(i0);
        }
        ArrayList arrayList1 = this.n;
        for(int v1 = arrayList1.size() - 1; v1 >= 0; --v1) {
            ArrayList arrayList2 = (ArrayList)arrayList1.get(v1);
            this.p(arrayList2, i0);
            if(arrayList2.isEmpty()) {
                arrayList1.remove(v1);
            }
        }
        ArrayList arrayList3 = this.m;
        for(int v2 = arrayList3.size() - 1; v2 >= 0; --v2) {
            ArrayList arrayList4 = (ArrayList)arrayList3.get(v2);
            for(int v3 = arrayList4.size() - 1; v3 >= 0; --v3) {
                if(((j)arrayList4.get(v3)).a == i0) {
                    view0.setTranslationY(0.0f);
                    view0.setTranslationX(0.0f);
                    this.h(i0);
                    arrayList4.remove(v3);
                    if(arrayList4.isEmpty()) {
                        arrayList3.remove(v2);
                    }
                    break;
                }
            }
        }
        ArrayList arrayList5 = this.l;
        for(int v4 = arrayList5.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList6 = (ArrayList)arrayList5.get(v4);
            if(arrayList6.remove(i0)) {
                view0.setAlpha(1.0f);
                this.h(i0);
                if(arrayList6.isEmpty()) {
                    arrayList5.remove(v4);
                }
            }
        }
        this.q.remove(i0);
        this.o.remove(i0);
        this.r.remove(i0);
        this.p.remove(i0);
        this.o();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public final void j() {
        ArrayList arrayList0 = this.j;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            j j0 = (j)arrayList0.get(v);
            View view0 = j0.a.a;
            view0.setTranslationY(0.0f);
            view0.setTranslationX(0.0f);
            this.h(j0.a);
            arrayList0.remove(v);
        }
        ArrayList arrayList1 = this.h;
        for(int v1 = arrayList1.size() - 1; v1 >= 0; --v1) {
            this.h(((I)arrayList1.get(v1)));
            arrayList1.remove(v1);
        }
        ArrayList arrayList2 = this.i;
        for(int v2 = arrayList2.size() - 1; v2 >= 0; --v2) {
            I i0 = (I)arrayList2.get(v2);
            i0.a.setAlpha(1.0f);
            this.h(i0);
            arrayList2.remove(v2);
        }
        ArrayList arrayList3 = this.k;
        for(int v3 = arrayList3.size() - 1; v3 >= 0; --v3) {
            i i1 = (i)arrayList3.get(v3);
            I i2 = i1.a;
            if(i2 != null) {
                this.q(i1, i2);
            }
            I i3 = i1.b;
            if(i3 != null) {
                this.q(i1, i3);
            }
        }
        arrayList3.clear();
        if(!this.k()) {
            return;
        }
        ArrayList arrayList4 = this.m;
        for(int v4 = arrayList4.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList5 = (ArrayList)arrayList4.get(v4);
            for(int v5 = arrayList5.size() - 1; v5 >= 0; --v5) {
                j j1 = (j)arrayList5.get(v5);
                View view1 = j1.a.a;
                view1.setTranslationY(0.0f);
                view1.setTranslationX(0.0f);
                this.h(j1.a);
                arrayList5.remove(v5);
                if(arrayList5.isEmpty()) {
                    arrayList4.remove(arrayList5);
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for(int v6 = arrayList6.size() - 1; v6 >= 0; --v6) {
            ArrayList arrayList7 = (ArrayList)arrayList6.get(v6);
            for(int v7 = arrayList7.size() - 1; v7 >= 0; --v7) {
                I i4 = (I)arrayList7.get(v7);
                i4.a.setAlpha(1.0f);
                this.h(i4);
                arrayList7.remove(v7);
                if(arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.n;
        for(int v8 = arrayList8.size() - 1; v8 >= 0; --v8) {
            ArrayList arrayList9 = (ArrayList)arrayList8.get(v8);
            for(int v9 = arrayList9.size() - 1; v9 >= 0; --v9) {
                i i5 = (i)arrayList9.get(v9);
                I i6 = i5.a;
                if(i6 != null) {
                    this.q(i5, i6);
                }
                I i7 = i5.b;
                if(i7 != null) {
                    this.q(i5, i7);
                }
                if(arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
            }
        }
        k.n(this.q);
        k.n(this.p);
        k.n(this.o);
        k.n(this.r);
        ArrayList arrayList10 = this.b;
        if(arrayList10.size() <= 0) {
            arrayList10.clear();
            return;
        }
        arrayList10.get(0).getClass();
        throw new ClassCastException();
    }

    // Deobfuscation rating: MEDIUM(110)
    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public final boolean k() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public final void l() {
        long v;
        ArrayList arrayList0 = this.h;
        boolean z = arrayList0.isEmpty();
        ArrayList arrayList1 = this.j;
        boolean z1 = arrayList1.isEmpty();
        ArrayList arrayList2 = this.k;
        boolean z2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.i;
        boolean z3 = arrayList3.isEmpty();
        if(z && z1 && z3 && z2) {
            return;
        }
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            boolean z4 = iterator0.hasNext();
            v = this.d;
            if(!z4) {
                break;
            }
            Object object0 = iterator0.next();
            ViewPropertyAnimator viewPropertyAnimator0 = ((I)object0).a.animate();
            this.q.add(((I)object0));
            viewPropertyAnimator0.setDuration(v).alpha(0.0f).setListener(new f(this, ((I)object0), viewPropertyAnimator0, ((I)object0).a)).start();
        }
        arrayList0.clear();
        if(!z1) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList1);
            this.m.add(arrayList4);
            arrayList1.clear();
            e e0 = new e(this, arrayList4, 0);
            if(z) {
                e0.run();
            }
            else {
                ((j)arrayList4.get(0)).a.a.postOnAnimationDelayed(e0, v);
            }
        }
        if(!z2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.n.add(arrayList5);
            arrayList2.clear();
            e e1 = new e(this, arrayList5, 1);
            if(z) {
                e1.run();
            }
            else {
                ((i)arrayList5.get(0)).a.a.postOnAnimationDelayed(e1, v);
            }
        }
        if(!z3) {
            long v1 = 0L;
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.l.add(arrayList6);
            arrayList3.clear();
            e e2 = new e(this, arrayList6, 2);
            if(z && z1 && z2) {
                e2.run();
                return;
            }
            if(z) {
                v = 0L;
            }
            long v2 = z1 ? 0L : this.e;
            if(!z2) {
                v1 = this.f;
            }
            ((I)arrayList6.get(0)).a.postOnAnimationDelayed(e2, Math.max(v2, v1) + v);
        }
    }

    @Override  // androidx.recyclerview.widget.L
    public final boolean m(I i0, int v, int v1, int v2, int v3) {
        View view0 = i0.a;
        int v4 = v + ((int)view0.getTranslationX());
        int v5 = v1 + ((int)i0.a.getTranslationY());
        this.r(i0);
        int v6 = v2 - v4;
        int v7 = v3 - v5;
        if(v6 == 0 && v7 == 0) {
            this.h(i0);
            return false;
        }
        if(v6 != 0) {
            view0.setTranslationX(((float)(-v6)));
        }
        if(v7 != 0) {
            view0.setTranslationY(((float)(-v7)));
        }
        ArrayList arrayList0 = this.j;
        j j0 = new j();  // initializer: Ljava/lang/Object;-><init>()V
        j0.a = i0;
        j0.b = v4;
        j0.c = v5;
        j0.d = v2;
        j0.e = v3;
        arrayList0.add(j0);
        return true;
    }

    public static void n(ArrayList arrayList0) {
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            ((I)arrayList0.get(v)).a.animate().cancel();
        }
    }

    public final void o() {
        if(!this.k()) {
            ArrayList arrayList0 = this.b;
            if(arrayList0.size() <= 0) {
                arrayList0.clear();
                return;
            }
            arrayList0.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void p(ArrayList arrayList0, I i0) {
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            i i1 = (i)arrayList0.get(v);
            if(this.q(i1, i0) && i1.a == null && i1.b == null) {
                arrayList0.remove(i1);
            }
        }
    }

    public final boolean q(i i0, I i1) {
        if(i0.b == i1) {
            i0.b = null;
        }
        else if(i0.a == i1) {
            i0.a = null;
        }
        else {
            return false;
        }
        i1.a.setAlpha(1.0f);
        i1.a.setTranslationX(0.0f);
        i1.a.setTranslationY(0.0f);
        this.h(i1);
        return true;
    }

    public final void r(I i0) {
        if(k.s == null) {
            k.s = new ValueAnimator().getInterpolator();
        }
        i0.a.animate().setInterpolator(k.s);
        this.i(i0);
    }
}

