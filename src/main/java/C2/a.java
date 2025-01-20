package c2;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle.State;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class a extends T implements K {
    public final d r;
    public boolean s;
    public int t;

    public a(d d0) {
        d0.I();
        w w0 = d0.w;
        if(w0 != null) {
            w0.Y.getClassLoader();
        }
        super();
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
        this.t = -1;
        this.r = d0;
    }

    @Override  // c2.K
    public final boolean a(ArrayList arrayList0, ArrayList arrayList1) {
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList0.add(this);
        arrayList1.add(Boolean.FALSE);
        if(this.g) {
            this.r.d.add(this);
        }
        return true;
    }

    public final void c(int v) {
        if(!this.g) {
            return;
        }
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + v);
        }
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            S s0 = (S)arrayList0.get(v2);
            Fragment fragment0 = s0.b;
            if(fragment0 != null) {
                fragment0.q0 += v;
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Bump nesting of " + s0.b + " to " + s0.b.q0);
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList0 = this.a;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            S s0 = (S)arrayList0.get(v);
            if(s0.c) {
                if(s0.a == 8) {
                    s0.c = false;
                    arrayList0.remove(v - 1);
                    --v;
                }
                else {
                    int v1 = s0.b.w0;
                    s0.a = 2;
                    s0.c = false;
                    for(int v2 = v - 1; v2 >= 0; --v2) {
                        S s1 = (S)arrayList0.get(v2);
                        if(s1.c && s1.b.w0 == v1) {
                            arrayList0.remove(v2);
                            --v;
                        }
                    }
                }
            }
        }
    }

    public final int e() {
        return this.f(false, true);
    }

    public final int f(boolean z, boolean z1) {
        if(this.s) {
            throw new IllegalStateException("commit already called");
        }
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter0 = new PrintWriter(new V());
            this.i("  ", printWriter0, true);
            printWriter0.close();
        }
        this.s = true;
        d d0 = this.r;
        this.t = this.g ? d0.k.getAndIncrement() : -1;
        if(z1) {
            d0.y(this, z);
        }
        return this.t;
    }

    public final void g() {
        if(this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.h = false;
        this.r.B(this, false);
    }

    public final void h(int v, Fragment fragment0, String s, int v1) {
        String s1 = fragment0.M0;
        if(s1 != null) {
            d2.d.c(fragment0, s1);
        }
        Class class0 = fragment0.getClass();
        int v2 = class0.getModifiers();
        if(class0.isAnonymousClass() || !Modifier.isPublic(v2) || class0.isMemberClass() && !Modifier.isStatic(v2)) {
            throw new IllegalStateException("Fragment " + class0.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if(s != null) {
            if(fragment0.x0 != null && !s.equals(fragment0.x0)) {
                throw new IllegalStateException("Can\'t change tag of fragment " + fragment0 + ": was " + fragment0.x0 + " now " + s);
            }
            fragment0.x0 = s;
        }
        switch(v) {
            case -1: {
                throw new IllegalArgumentException("Can\'t add fragment " + fragment0 + " with tag " + s + " to container view with no id");
            label_13:
                if(fragment0.v0 != 0 && fragment0.v0 != v) {
                    throw new IllegalStateException("Can\'t change container ID of fragment " + fragment0 + ": was " + fragment0.v0 + " now " + v);
                }
                fragment0.v0 = v;
                fragment0.w0 = v;
                break;
            }
            case 0: {
                break;
            }
            default: {
                goto label_13;
            }
        }
        this.b(new S(v1, fragment0));
        fragment0.r0 = this.r;
    }

    public final void i(String s, PrintWriter printWriter0, boolean z) {
        String s2;
        if(z) {
            printWriter0.print(s);
            printWriter0.print("mName=");
            printWriter0.print(this.i);
            printWriter0.print(" mIndex=");
            printWriter0.print(this.t);
            printWriter0.print(" mCommitted=");
            printWriter0.println(this.s);
            if(this.f != 0) {
                printWriter0.print(s);
                printWriter0.print("mTransition=#");
                printWriter0.print(Integer.toHexString(this.f));
            }
            if(this.b != 0 || this.c != 0) {
                printWriter0.print(s);
                printWriter0.print("mEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.b));
                printWriter0.print(" mExitAnim=#");
                printWriter0.println(Integer.toHexString(this.c));
            }
            if(this.d != 0 || this.e != 0) {
                printWriter0.print(s);
                printWriter0.print("mPopEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.d));
                printWriter0.print(" mPopExitAnim=#");
                printWriter0.println(Integer.toHexString(this.e));
            }
            if(this.j != 0 || this.k != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbTitleRes=#");
                printWriter0.print(Integer.toHexString(this.j));
                printWriter0.print(" mBreadCrumbTitleText=");
                printWriter0.println(this.k);
            }
            if(this.l != 0 || this.m != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbShortTitleRes=#");
                printWriter0.print(Integer.toHexString(this.l));
                printWriter0.print(" mBreadCrumbShortTitleText=");
                printWriter0.println(this.m);
            }
        }
        ArrayList arrayList0 = this.a;
        if(!arrayList0.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Operations:");
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                S s1 = (S)arrayList0.get(v1);
                switch(s1.a) {
                    case 0: {
                        s2 = "NULL";
                        break;
                    }
                    case 1: {
                        s2 = "ADD";
                        break;
                    }
                    case 2: {
                        s2 = "REPLACE";
                        break;
                    }
                    case 3: {
                        s2 = "REMOVE";
                        break;
                    }
                    case 4: {
                        s2 = "HIDE";
                        break;
                    }
                    case 5: {
                        s2 = "SHOW";
                        break;
                    }
                    case 6: {
                        s2 = "DETACH";
                        break;
                    }
                    case 7: {
                        s2 = "ATTACH";
                        break;
                    }
                    case 8: {
                        s2 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 9: {
                        s2 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 10: {
                        s2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    default: {
                        s2 = "cmd=" + s1.a;
                    }
                }
                printWriter0.print(s);
                printWriter0.print("  Op #");
                printWriter0.print(v1);
                printWriter0.print(": ");
                printWriter0.print(s2);
                printWriter0.print(" ");
                printWriter0.println(s1.b);
                if(z) {
                    if(s1.d != 0 || s1.e != 0) {
                        printWriter0.print(s);
                        printWriter0.print("enterAnim=#");
                        printWriter0.print(Integer.toHexString(s1.d));
                        printWriter0.print(" exitAnim=#");
                        printWriter0.println(Integer.toHexString(s1.e));
                    }
                    if(s1.f != 0 || s1.g != 0) {
                        printWriter0.print(s);
                        printWriter0.print("popEnterAnim=#");
                        printWriter0.print(Integer.toHexString(s1.f));
                        printWriter0.print(" popExitAnim=#");
                        printWriter0.println(Integer.toHexString(s1.g));
                    }
                }
            }
        }
    }

    public final a j(Fragment fragment0) {
        if(fragment0.r0 != null && fragment0.r0 != this.r) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        this.b(new S(3, fragment0));
        return this;
    }

    public final a k(Fragment fragment0, State lifecycle$State0) {
        d d0 = this.r;
        if(fragment0.r0 != d0) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + d0);
        }
        if(lifecycle$State0 == State.Y && fragment0.X > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + lifecycle$State0 + " after the Fragment has been created");
        }
        if(lifecycle$State0 == State.X) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + lifecycle$State0 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        S s0 = new S();  // initializer: Ljava/lang/Object;-><init>()V
        s0.a = 10;
        s0.b = fragment0;
        s0.c = false;
        s0.h = fragment0.N0;
        s0.i = lifecycle$State0;
        this.b(s0);
        return this;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("BackStackEntry{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        if(this.t >= 0) {
            stringBuilder0.append(" #");
            stringBuilder0.append(this.t);
        }
        if(this.i != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.i);
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

