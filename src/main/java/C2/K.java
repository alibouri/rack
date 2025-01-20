package c2;

import Bb.F;
import Bb.p;
import Bb.v;
import M.J;
import Nb.j;
import Y8.o;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import io.sentry.internal.debugmeta.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class k {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public k(ViewGroup viewGroup0) {
        j.f(viewGroup0, "container");
        super();
        this.a = viewGroup0;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(X x0) {
        j.f(x0, "operation");
        if(x0.i) {
            o.k(x0.a, x0.c.Q(), this.a);
            x0.i = false;
        }
    }

    public final void b(ArrayList arrayList0, boolean z) {
        Object object1;
        Object object0;
        Iterator iterator0 = arrayList0.iterator();
        do {
            object0 = null;
            if(!iterator0.hasNext()) {
                goto label_8;
            }
            object1 = iterator0.next();
            View view0 = ((X)object1).c.F0;
            j.e(view0, "operation.fragment.mView");
        }
        while(F.j(view0) != 2 || ((X)object1).a == 2);
        goto label_9;
    label_8:
        object1 = null;
    label_9:
        ListIterator listIterator0 = arrayList0.listIterator(arrayList0.size());
        while(listIterator0.hasPrevious()) {
            Object object2 = listIterator0.previous();
            View view1 = ((X)object2).c.F0;
            j.e(view1, "operation.fragment.mView");
            if(F.j(view1) != 2 && ((X)object2).a == 2) {
                object0 = object2;
                break;
            }
            if(false) {
                break;
            }
        }
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + ((X)object1) + " to " + ((X)object0));
        }
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Fragment fragment0 = ((X)p.w0(arrayList0)).c;
        for(Object object3: arrayList0) {
            t t0 = ((X)object3).c.I0;
            t0.b = fragment0.I0.b;
            t0.c = fragment0.I0.c;
            t0.d = fragment0.I0.d;
            t0.e = fragment0.I0.e;
        }
        Iterator iterator2 = arrayList0.iterator();
        while(true) {
            boolean z1 = false;
            if(!iterator2.hasNext()) {
                break;
            }
            Object object4 = iterator2.next();
            X x0 = (X)object4;
            arrayList1.add(new e(x0, z));
            if(!z) {
                if(x0 == ((X)object0)) {
                    z1 = true;
                }
            }
            else if(x0 == ((X)object1)) {
                z1 = true;
            }
            c2.j j0 = new c2.j(x0);  // initializer: LO3/j;-><init>(Lc2/X;)V
            Fragment fragment1 = x0.c;
            if(x0.a != 2) {
                if(!z) {
                    fragment1.getClass();
                }
            }
            else if(!z) {
                fragment1.getClass();
            }
            if(z1 && !z) {
                fragment1.getClass();
            }
            arrayList2.add(j0);
            b b0 = new b(this, x0, 0);
            x0.d.add(b0);
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object5: arrayList2) {
            if(!((c2.j)object5).m()) {
                arrayList3.add(object5);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object6: arrayList3) {
            ((c2.j)object6).getClass();
        }
        for(Object object7: arrayList4) {
            ((c2.j)object7).getClass();
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for(Object object8: arrayList1) {
            v.f0(arrayList6, ((X)((e)object8).Y).k);
        }
        boolean z2 = arrayList6.isEmpty();
        boolean z3 = false;
        for(Object object9: arrayList1) {
            e e0 = (e)object9;
            Context context0 = this.a.getContext();
            X x1 = (X)e0.Y;
            j.e(context0, "context");
            c c0 = e0.r(context0);
            if(c0 == null) {
            }
            else if(((AnimatorSet)c0.Z) == null) {
                arrayList5.add(e0);
            }
            else {
                Fragment fragment2 = x1.c;
                if(x1.k.isEmpty()) {
                    if(x1.a == 3) {
                        x1.i = false;
                    }
                    g g0 = new g(e0);
                    x1.j.add(g0);
                    z3 = true;
                }
                else {
                    if(!Log.isLoggable("FragmentManager", 2)) {
                        continue;
                    }
                    Log.v("FragmentManager", "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                }
            }
        }
        for(Object object10: arrayList5) {
            e e1 = (e)object10;
            X x2 = (X)e1.Y;
            Fragment fragment3 = x2.c;
            if(!z2) {
                if(!Log.isLoggable("FragmentManager", 2)) {
                    continue;
                }
                Log.v("FragmentManager", "Ignoring Animation set on " + fragment3 + " as Animations cannot run alongside Transitions.");
            }
            else if(!z3) {
                d d0 = new d(e1);
                x2.j.add(d0);
            }
            else if(Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + fragment3 + " as Animations cannot run alongside Animators.");
            }
        }
    }

    public final void c(ArrayList arrayList0) {
        j.f(arrayList0, "operations");
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            v.f0(arrayList1, ((X)object0).k);
        }
        List list0 = p.Q0(p.U0(arrayList1));
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((W)list0.get(v2)).b(this.a);
        }
        int v3 = arrayList0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            this.a(((X)arrayList0.get(v4)));
        }
        List list1 = p.Q0(arrayList0);
        int v5 = list1.size();
        for(int v1 = 0; v1 < v5; ++v1) {
            X x0 = (X)list1.get(v1);
            if(x0.k.isEmpty()) {
                x0.b();
            }
        }
    }

    public final void d(int v, int v1, androidx.fragment.app.e e0) {
        synchronized(this.b) {
            j.e(e0.c, "fragmentStateManager.fragment");
            X x0 = this.g(e0.c);
            if(x0 == null) {
                x0 = e0.c.k0 ? this.h(e0.c) : null;
            }
            if(x0 != null) {
                x0.d(v, v1);
                return;
            }
            goto label_10;
        }
        return;
    label_10:
        X x1 = new X(v, v1, e0);
        this.b.add(x1);
        b b0 = new b(this, x1, 1);
        x1.d.add(b0);
        b b1 = new b(this, x1, 2);
        x1.d.add(b1);
    }

    public final void e(int v, androidx.fragment.app.e e0) {
        J.l(v, "finalState");
        j.f(e0, "fragmentStateManager");
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + e0.c);
        }
        this.d(v, 2, e0);
    }

    public final void f() {
        boolean z;
        if(this.f) {
            return;
        }
        if(!this.a.isAttachedToWindow()) {
            this.i();
            this.e = false;
            return;
        }
        ArrayList arrayList0 = this.b;
        __monitor_enter(arrayList0);
        try {
            ArrayList arrayList1 = p.R0(this.c);
            this.c.clear();
            Iterator iterator0 = arrayList1.iterator();
            while(true) {
                z = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                if(this.b.isEmpty() || !((X)object0).c.k0) {
                    z = false;
                }
                ((X)object0).g = z;
            }
            for(Object object1: arrayList1) {
                X x0 = (X)object1;
                if(this.d) {
                    if(Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + x0);
                    }
                    x0.b();
                }
                else {
                    if(Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + x0);
                    }
                    x0.a(this.a);
                }
                this.d = false;
                if(!x0.f) {
                    this.c.add(x0);
                }
            }
            if(!this.b.isEmpty()) {
                this.m();
                ArrayList arrayList2 = p.R0(this.b);
                if(arrayList2.isEmpty()) {
                    goto label_75;
                }
                this.b.clear();
                this.c.addAll(arrayList2);
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                this.b(arrayList2, this.e);
                boolean z1 = k.k(arrayList2);
                boolean z2 = true;
                for(Object object2: arrayList2) {
                    if(!((X)object2).c.k0) {
                        z2 = false;
                    }
                }
                if(!z2 || z1) {
                    z = false;
                }
                this.d = z;
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z1 + " \ntransition = " + z2);
                }
                if(!z2) {
                    this.l(arrayList2);
                    this.c(arrayList2);
                }
                else if(z1) {
                    this.l(arrayList2);
                    int v = arrayList2.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        this.a(((X)arrayList2.get(v1)));
                    }
                }
                this.e = false;
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
            goto label_77;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(arrayList0);
        throw throwable0;
    label_75:
        __monitor_exit(arrayList0);
        return;
    label_77:
        __monitor_exit(arrayList0);
    }

    public final X g(Fragment fragment0) {
        for(Object object0: this.b) {
            if(j.a(((X)object0).c, fragment0) && !((X)object0).e) {
                return (X)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final X h(Fragment fragment0) {
        for(Object object0: this.c) {
            if(j.a(((X)object0).c, fragment0) && !((X)object0).e) {
                return (X)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void i() {
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean z = this.a.isAttachedToWindow();
        synchronized(this.b) {
            this.m();
            this.l(this.b);
            ArrayList arrayList1 = p.R0(this.c);
            for(Object object0: arrayList1) {
                ((X)object0).g = false;
            }
            for(Object object1: arrayList1) {
                X x0 = (X)object1;
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (z ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + x0);
                }
                x0.a(this.a);
            }
            ArrayList arrayList2 = p.R0(this.b);
            for(Object object2: arrayList2) {
                ((X)object2).g = false;
            }
            for(Object object3: arrayList2) {
                X x1 = (X)object3;
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (z ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + x1);
                }
                x1.a(this.a);
            }
        }
    }

    public static final k j(ViewGroup viewGroup0, androidx.fragment.app.d d0) {
        j.f(viewGroup0, "container");
        j.f(d0, "fragmentManager");
        j.e(d0.J(), "fragmentManager.specialEffectsControllerFactory");
        Object object0 = viewGroup0.getTag(0x7F0A02BD);  // id:special_effects_controller_view_tag
        if(object0 instanceof k) {
            return (k)object0;
        }
        k k0 = new k(viewGroup0);
        viewGroup0.setTag(0x7F0A02BD, k0);  // id:special_effects_controller_view_tag
        return k0;
    }

    public static boolean k(ArrayList arrayList0) {
        Iterator iterator1;
        ArrayList arrayList1;
        boolean z;
        Iterator iterator0 = arrayList0.iterator();
        do {
            do {
                z = true;
            label_2:
                if(!iterator0.hasNext()) {
                    goto label_15;
                }
                Object object0 = iterator0.next();
                X x0 = (X)object0;
                if(x0.k.isEmpty()) {
                    z = false;
                    goto label_2;
                }
                arrayList1 = x0.k;
            }
            while(arrayList1 instanceof Collection && arrayList1.isEmpty());
            iterator1 = arrayList1.iterator();
        label_9:
        }
        while(!iterator1.hasNext());
        Object object1 = iterator1.next();
        ((W)object1).getClass();
        if(((W)object1) instanceof g) {
            goto label_9;
        }
        z = false;
        goto label_2;
    label_15:
        if(z) {
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: arrayList0) {
                v.f0(arrayList2, ((X)object2).k);
            }
            return !arrayList2.isEmpty();
        }
        return false;
    }

    public final void l(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            X x0 = (X)arrayList0.get(v2);
            if(!x0.h) {
                x0.h = true;
                int v3 = x0.b;
                androidx.fragment.app.e e0 = x0.l;
                if(v3 == 2) {
                    Fragment fragment0 = e0.c;
                    j.e(fragment0, "fragmentStateManager.fragment");
                    View view0 = fragment0.F0.findFocus();
                    if(view0 != null) {
                        fragment0.i().k = view0;
                        if(Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + view0 + " for Fragment " + fragment0);
                        }
                    }
                    View view1 = x0.c.Q();
                    if(view1.getParent() == null) {
                        e0.b();
                        view1.setAlpha(0.0f);
                    }
                    if(view1.getAlpha() == 0.0f && view1.getVisibility() == 0) {
                        view1.setVisibility(4);
                    }
                    view1.setAlpha((fragment0.I0 == null ? 1.0f : fragment0.I0.j));
                }
                else if(v3 == 3) {
                    Fragment fragment1 = e0.c;
                    j.e(fragment1, "fragmentStateManager.fragment");
                    View view2 = fragment1.Q();
                    if(Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Clearing focus " + view2.findFocus() + " on view " + view2 + " for Fragment " + fragment1);
                    }
                    view2.clearFocus();
                }
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            v.f0(arrayList1, ((X)object0).k);
        }
        List list0 = p.Q0(p.U0(arrayList1));
        int v4 = list0.size();
        for(int v1 = 0; v1 < v4; ++v1) {
            W w0 = (W)list0.get(v1);
            w0.getClass();
            ViewGroup viewGroup0 = this.a;
            j.f(viewGroup0, "container");
            if(!w0.a) {
                w0.d(viewGroup0);
            }
            w0.a = true;
        }
    }

    public final void m() {
        for(Object object0: this.b) {
            X x0 = (X)object0;
            int v = 2;
            if(x0.b == 2) {
                int v1 = x0.c.Q().getVisibility();
                switch(v1) {
                    case 0: {
                        break;
                    }
                    case 4: {
                        v = 4;
                        break;
                    }
                    case 8: {
                        v = 3;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown visibility " + v1);
                    }
                }
                x0.d(v, 1);
            }
        }
    }
}

