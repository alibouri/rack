package c2;

import Bb.p;
import M.J;
import Nb.j;
import Y8.o;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.apollographql.apollo.api.b;
import java.util.ArrayList;
import v.h;

public final class X {
    public int a;
    public int b;
    public final Fragment c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final e l;

    public X(int v, int v1, e e0) {
        J.l(v, "finalState");
        J.l(v1, "lifecycleImpact");
        j.f(e0, "fragmentStateManager");
        j.e(e0.c, "fragmentStateManager.fragment");
        J.l(v, "finalState");
        J.l(v1, "lifecycleImpact");
        j.f(e0.c, "fragment");
        super();
        this.a = v;
        this.b = v1;
        this.c = e0.c;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList0 = new ArrayList();
        this.j = arrayList0;
        this.k = arrayList0;
        this.l = e0;
    }

    public final void a(ViewGroup viewGroup0) {
        j.f(viewGroup0, "container");
        this.h = false;
        if(this.e) {
            return;
        }
        this.e = true;
        if(this.j.isEmpty()) {
            this.b();
            return;
        }
        for(Object object0: p.Q0(this.k)) {
            W w0 = (W)object0;
            w0.getClass();
            if(!w0.b) {
                w0.a(viewGroup0);
            }
            w0.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if(!this.f) {
            if(Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            for(Object object0: this.d) {
                ((Runnable)object0).run();
            }
        }
        this.c.k0 = false;
        this.l.k();
    }

    public final void c(W w0) {
        j.f(w0, "effect");
        if(this.j.remove(w0) && this.j.isEmpty()) {
            this.b();
        }
    }

    public final void d(int v, int v1) {
        J.l(v, "finalState");
        J.l(v1, "lifecycleImpact");
        int v2 = h.d(v1);
        Fragment fragment0 = this.c;
        switch(v2) {
            case 0: {
                if(this.a != 1) {
                    if(Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment0 + " mFinalState = " + o.G(this.a) + " -> " + o.G(v) + '.');
                    }
                    this.a = v;
                    return;
                }
                break;
            }
            case 1: {
                if(this.a == 1) {
                    if(Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment0 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + o.F(this.b) + " to ADDING.");
                    }
                    this.a = 2;
                    this.b = 2;
                    this.i = true;
                    return;
                }
                break;
            }
            case 2: {
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment0 + " mFinalState = " + o.G(this.a) + " -> REMOVED. mLifecycleImpact  = " + o.F(this.b) + " to REMOVING.");
                }
                this.a = 1;
                this.b = 3;
                this.i = true;
            }
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = b.s("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        stringBuilder0.append(o.G(this.a));
        stringBuilder0.append(" lifecycleImpact = ");
        stringBuilder0.append(o.F(this.b));
        stringBuilder0.append(" fragment = ");
        stringBuilder0.append(this.c);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

