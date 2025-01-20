package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import s.K;
import s.o;
import s.p;
import t.a;

public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public o I;
    public K J;
    public final e a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public b(b b0, e e0, Resources resources0) {
        Resources resources1;
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = e0;
        if(resources0 == null) {
            resources1 = b0 == null ? null : b0.b;
        }
        else {
            resources1 = resources0;
        }
        this.b = resources1;
        int v = b0 == null ? 0 : b0.c;
        if(resources0 != null) {
            v = resources0.getDisplayMetrics().densityDpi;
        }
        if(v == 0) {
            v = 0xA0;
        }
        this.c = v;
        if(b0 == null) {
            this.g = new Drawable[10];
            this.h = 0;
        }
        else {
            this.d = b0.d;
            this.e = b0.e;
            this.u = true;
            this.v = true;
            this.i = b0.i;
            this.l = b0.l;
            this.w = b0.w;
            this.x = b0.x;
            this.y = b0.y;
            this.z = b0.z;
            this.A = b0.A;
            this.B = b0.B;
            this.C = b0.C;
            this.D = b0.D;
            this.E = b0.E;
            this.F = b0.F;
            this.G = b0.G;
            if(b0.c == v) {
                if(b0.j) {
                    this.k = b0.k == null ? null : new Rect(b0.k);
                    this.j = true;
                }
                if(b0.m) {
                    this.n = b0.n;
                    this.o = b0.o;
                    this.p = b0.p;
                    this.q = b0.q;
                    this.m = true;
                }
            }
            if(b0.r) {
                this.s = b0.s;
                this.r = true;
            }
            if(b0.t) {
                this.t = true;
            }
            Drawable[] arr_drawable = b0.g;
            this.g = new Drawable[arr_drawable.length];
            this.h = b0.h;
            SparseArray sparseArray0 = b0.f;
            this.f = sparseArray0 == null ? new SparseArray(this.h) : sparseArray0.clone();
            int v1 = this.h;
            for(int v2 = 0; v2 < v1; ++v2) {
                Drawable drawable0 = arr_drawable[v2];
                if(drawable0 != null) {
                    Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                    if(drawable$ConstantState0 == null) {
                        this.g[v2] = arr_drawable[v2];
                    }
                    else {
                        this.f.put(v2, drawable$ConstantState0);
                    }
                }
            }
        }
        this.H = b0 == null ? new int[this.g.length][] : b0.H;
        if(b0 != null) {
            this.I = b0.I;
            this.J = b0.J;
            return;
        }
        this.I = new o(null);
        this.J = new K(0);
    }

    public final int a(Drawable drawable0) {
        int v = this.h;
        if(v >= this.g.length) {
            Drawable[] arr_drawable = new Drawable[v + 10];
            Drawable[] arr_drawable1 = this.g;
            if(arr_drawable1 != null) {
                System.arraycopy(arr_drawable1, 0, arr_drawable, 0, v);
            }
            this.g = arr_drawable;
            int[][] arr2_v = new int[v + 10][];
            System.arraycopy(this.H, 0, arr2_v, 0, v);
            this.H = arr2_v;
        }
        drawable0.mutate();
        drawable0.setVisible(false, true);
        drawable0.setCallback(this.a);
        this.g[v] = drawable0;
        ++this.h;
        int v1 = this.e;
        this.e = drawable0.getChangingConfigurations() | v1;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return v;
    }

    public final void b() {
        this.m = true;
        this.c();
        int v = this.h;
        Drawable[] arr_drawable = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Drawable drawable0 = arr_drawable[v1];
            int v2 = drawable0.getIntrinsicWidth();
            if(v2 > this.n) {
                this.n = v2;
            }
            int v3 = drawable0.getIntrinsicHeight();
            if(v3 > this.o) {
                this.o = v3;
            }
            int v4 = drawable0.getMinimumWidth();
            if(v4 > this.p) {
                this.p = v4;
            }
            int v5 = drawable0.getMinimumHeight();
            if(v5 > this.q) {
                this.q = v5;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray0 = this.f;
        if(sparseArray0 != null) {
            int v = sparseArray0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = this.f.keyAt(v1);
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.f.valueAt(v1);
                Drawable[] arr_drawable = this.g;
                Drawable drawable0 = drawable$ConstantState0.newDrawable(this.b);
                drawable0.setLayoutDirection(this.x);
                Drawable drawable1 = drawable0.mutate();
                drawable1.setCallback(this.a);
                arr_drawable[v2] = drawable1;
            }
            this.f = null;
        }
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final boolean canApplyTheme() {
        int v = this.h;
        Drawable[] arr_drawable = this.g;
        for(int v1 = 0; v1 < v; ++v1) {
            Drawable drawable0 = arr_drawable[v1];
            if(drawable0 == null) {
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.f.get(v1);
                if(drawable$ConstantState0 != null && drawable$ConstantState0.canApplyTheme()) {
                    return true;
                }
            }
            else if(drawable0.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int v) {
        Drawable drawable0 = this.g[v];
        if(drawable0 != null) {
            return drawable0;
        }
        SparseArray sparseArray0 = this.f;
        if(sparseArray0 != null) {
            int v1 = sparseArray0.indexOfKey(v);
            if(v1 >= 0) {
                Drawable drawable1 = ((Drawable.ConstantState)this.f.valueAt(v1)).newDrawable(this.b);
                drawable1.setLayoutDirection(this.x);
                Drawable drawable2 = drawable1.mutate();
                drawable2.setCallback(this.a);
                this.g[v] = drawable2;
                this.f.removeAt(v1);
                if(this.f.size() == 0) {
                    this.f = null;
                }
                return drawable2;
            }
        }
        return null;
    }

    public final int e(int v) {
        if(v >= 0) {
            K k0 = this.J;
            Object object0 = 0;
            int v1 = a.a(k0.Z, v, k0.X);
            if(v1 >= 0) {
                Object object1 = k0.Y[v1];
                if(object1 != p.c) {
                    object0 = object1;
                }
            }
            return (int)(((Integer)object0));
        }
        return 0;
    }

    public final int f(int[] arr_v) {
        int[][] arr2_v = this.H;
        int v = this.h;
        for(int v1 = 0; v1 < v; ++v1) {
            if(StateSet.stateSetMatches(arr2_v[v1], arr_v)) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        return new e(this, resources0);
    }
}

