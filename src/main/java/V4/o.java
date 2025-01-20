package V4;

import Bb.F;
import I1.c;
import I3.n;
import J1.E;
import J1.N;
import M4.l;
import N5.A;
import Nb.j;
import a8.Q;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.u;
import com.google.android.material.shape.ShapeAppearanceModel;
import g.a;
import java.util.ArrayList;
import java.util.UUID;
import o.Y;
import o.p;

public final class o {
    public int a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public o(ColorStateList colorStateList0, ColorStateList colorStateList1, ColorStateList colorStateList2, int v, ShapeAppearanceModel shapeAppearanceModel0, Rect rect0) {
        F.m(rect0.left);
        F.m(rect0.top);
        F.m(rect0.right);
        F.m(rect0.bottom);
        this.b = rect0;
        this.c = colorStateList1;
        this.d = colorStateList0;
        this.e = colorStateList2;
        this.a = v;
        this.f = shapeAppearanceModel0;
    }

    public o(View view0) {
        this.a = -1;
        this.b = view0;
        this.c = p.a();
    }

    public o(u u0) {
        this.b = new c(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = u0;
        this.f = new a(19, this);
    }

    public o(Long long0, Long long1) {
        UUID uUID0 = UUID.randomUUID();
        j.e(uUID0, "randomUUID()");
        super();
        this.b = long0;
        this.c = long1;
        this.e = uUID0;
    }

    public void a() {
        View view0 = (View)this.b;
        Drawable drawable0 = view0.getBackground();
        if(drawable0 != null) {
            if(((n)this.d) != null) {
                if(((n)this.f) == null) {
                    this.f = new n();  // initializer: Ljava/lang/Object;-><init>()V
                }
                n n0 = (n)this.f;
                n0.Z = null;
                n0.Y = false;
                n0.b0 = null;
                n0.X = false;
                ColorStateList colorStateList0 = E.c(view0);
                if(colorStateList0 != null) {
                    n0.Y = true;
                    n0.Z = colorStateList0;
                }
                PorterDuff.Mode porterDuff$Mode0 = E.d(view0);
                if(porterDuff$Mode0 != null) {
                    n0.X = true;
                    n0.b0 = porterDuff$Mode0;
                }
                if(n0.Y || n0.X) {
                    p.e(drawable0, n0, view0.getDrawableState());
                    return;
                }
            }
            n n1 = (n)this.e;
            if(n1 != null) {
                p.e(drawable0, n1, view0.getDrawableState());
                return;
            }
            n n2 = (n)this.d;
            if(n2 != null) {
                p.e(drawable0, n2, view0.getDrawableState());
            }
        }
    }

    public boolean b(int v) {
        ArrayList arrayList0 = (ArrayList)this.d;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            p2.a a0 = (p2.a)arrayList0.get(v2);
            int v3 = a0.a;
            if(v3 == 8) {
                if(this.h(a0.d, v2 + 1) == v) {
                    return true;
                }
            }
            else if(v3 == 1) {
                int v4 = a0.b;
                int v5 = a0.d + v4;
                while(v4 < v5) {
                    if(this.h(v4, v2 + 1) == v) {
                        return true;
                    }
                    ++v4;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList0 = (ArrayList)this.d;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            p2.a a0 = (p2.a)arrayList0.get(v1);
            ((u)this.e).a(a0);
        }
        this.r(arrayList0);
        this.a = 0;
    }

    public void d() {
        this.c();
        ArrayList arrayList0 = (ArrayList)this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            p2.a a0 = (p2.a)arrayList0.get(v1);
            int v2 = a0.a;
            u u0 = (u)this.e;
            switch(v2) {
                case 1: {
                    u0.a(a0);
                    u0.d(a0.b, a0.d);
                    break;
                }
                case 2: {
                    u0.a(a0);
                    int v3 = a0.d;
                    u0.a.S(a0.b, v3, true);
                    u0.a.j1 = true;
                    u0.a.g1.c += v3;
                    break;
                }
                case 4: {
                    u0.a(a0);
                    u0.c(a0.b, a0.d, a0.c);
                    break;
                }
                case 8: {
                    u0.a(a0);
                    u0.e(a0.b, a0.d);
                }
            }
        }
        this.r(arrayList0);
        this.a = 0;
    }

    public static o e(Context context0, int v) {
        F.l("Cannot create a CalendarItemStyle with a styleResId of 0", v != 0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, p6.a.r);
        Rect rect0 = new Rect(typedArray0.getDimensionPixelOffset(0, 0), typedArray0.getDimensionPixelOffset(2, 0), typedArray0.getDimensionPixelOffset(1, 0), typedArray0.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateList0 = F.w(context0, typedArray0, 4);
        ColorStateList colorStateList1 = F.w(context0, typedArray0, 9);
        ColorStateList colorStateList2 = F.w(context0, typedArray0, 7);
        int v1 = typedArray0.getDimensionPixelSize(8, 0);
        ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.a(context0, typedArray0.getResourceId(5, 0), typedArray0.getResourceId(6, 0), new H6.a(0.0f)).a();
        typedArray0.recycle();
        return new o(colorStateList0, colorStateList1, colorStateList2, v1, shapeAppearanceModel0, rect0);
    }

    public void f(p2.a a0) {
        c c0;
        int v3;
        int v = a0.a;
        if(v == 1 || v == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v1 = this.v(a0.b, v);
        int v2 = a0.b;
        switch(a0.a) {
            case 2: {
                v3 = 0;
                break;
            }
            case 4: {
                v3 = 1;
                break;
            }
            default: {
                throw new IllegalArgumentException("op should be remove or update." + a0);
            }
        }
        int v5 = 1;
        for(int v4 = 1; true; ++v4) {
            int v6 = a0.d;
            c0 = (c)this.b;
            if(v4 >= v6) {
                break;
            }
            int v7 = this.v(v3 * v4 + a0.b, a0.a);
            int v8 = a0.a;
            switch(v8) {
                case 2: {
                    if(v7 == v1) {
                        ++v5;
                        continue;
                    }
                    break;
                }
                case 4: {
                    if(v7 == v1 + 1) {
                        ++v5;
                        continue;
                    }
                }
            }
            p2.a a1 = this.m(a0.c, v8, v1, v5);
            this.g(a1, v2);
            a1.c = null;
            c0.c(a1);
            if(a0.a == 4) {
                v2 += v5;
            }
            v5 = 1;
            v1 = v7;
        }
        Object object0 = a0.c;
        a0.c = null;
        c0.c(a0);
        if(v5 > 0) {
            p2.a a2 = this.m(object0, a0.a, v1, v5);
            this.g(a2, v2);
            a2.c = null;
            c0.c(a2);
        }
    }

    public void g(p2.a a0, int v) {
        u u0 = (u)this.e;
        u0.a(a0);
        switch(a0.a) {
            case 2: {
                int v1 = a0.d;
                u0.a.S(v, v1, true);
                u0.a.j1 = true;
                u0.a.g1.c += v1;
                return;
            }
            case 4: {
                u0.c(v, a0.d, a0.c);
                return;
            }
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
        }
    }

    public int h(int v, int v1) {
        ArrayList arrayList0 = (ArrayList)this.d;
        int v2 = arrayList0.size();
        while(v1 < v2) {
            p2.a a0 = (p2.a)arrayList0.get(v1);
            int v3 = a0.a;
            if(v3 == 8) {
                int v4 = a0.b;
                if(v4 == v) {
                    v = a0.d;
                }
                else {
                    if(v4 < v) {
                        --v;
                    }
                    if(a0.d <= v) {
                        ++v;
                    }
                }
            }
            else {
                int v5 = a0.b;
                if(v5 <= v) {
                    switch(v3) {
                        case 1: {
                            v += a0.d;
                            break;
                        }
                        case 2: {
                            int v6 = a0.d;
                            if(v < v5 + v6) {
                                return -1;
                            }
                            v -= v6;
                        }
                    }
                }
            }
            ++v1;
        }
        return v;
    }

    public ColorStateList i() {
        n n0 = (n)this.e;
        return n0 == null ? null : ((ColorStateList)n0.Z);
    }

    public PorterDuff.Mode j() {
        n n0 = (n)this.e;
        return n0 == null ? null : ((PorterDuff.Mode)n0.b0);
    }

    public boolean k() {
        return ((ArrayList)this.c).size() > 0;
    }

    public void l(AttributeSet attributeSet0, int v) {
        ColorStateList colorStateList0;
        View view0 = (View)this.b;
        Q q0 = Q.G(view0.getContext(), attributeSet0, h.a.z, v);
        TypedArray typedArray0 = (TypedArray)q0.Z;
        Context context0 = ((View)this.b).getContext();
        N.j(((View)this.b), context0, h.a.z, attributeSet0, ((TypedArray)q0.Z), v);
        try {
            if(typedArray0.hasValue(0)) {
                this.a = typedArray0.getResourceId(0, -1);
                p p0 = (p)this.c;
                Context context1 = view0.getContext();
                synchronized(p0) {
                    colorStateList0 = p0.a.i(context1, this.a);
                }
                if(colorStateList0 != null) {
                    this.s(colorStateList0);
                }
            }
            if(typedArray0.hasValue(1)) {
                E.h(view0, q0.p(1));
            }
            if(typedArray0.hasValue(2)) {
                E.i(view0, Y.c(typedArray0.getInt(2, -1), null));
            }
        }
        finally {
            q0.I();
        }
    }

    public p2.a m(Object object0, int v, int v1, int v2) {
        p2.a a0 = (p2.a)((c)this.b).a();
        if(a0 == null) {
            a0 = new p2.a();  // initializer: Ljava/lang/Object;-><init>()V
            a0.a = v;
            a0.b = v1;
            a0.d = v2;
            a0.c = object0;
            return a0;
        }
        a0.a = v;
        a0.b = v1;
        a0.d = v2;
        a0.c = object0;
        return a0;
    }

    public void n() {
        this.a = -1;
        this.s(null);
        this.a();
    }

    public void o(int v) {
        ColorStateList colorStateList0;
        this.a = v;
        p p0 = (p)this.c;
        if(p0 == null) {
            colorStateList0 = null;
        }
        else {
            Context context0 = ((View)this.b).getContext();
            synchronized(p0) {
                colorStateList0 = p0.a.i(context0, v);
            }
        }
        this.s(colorStateList0);
        this.a();
    }

    public void p(p2.a a0) {
        ((ArrayList)this.d).add(a0);
        int v = a0.a;
        u u0 = (u)this.e;
        switch(v) {
            case 1: {
                u0.d(a0.b, a0.d);
                return;
            }
            case 2: {
                u0.a.S(a0.b, a0.d, false);
                u0.a.j1 = true;
                return;
            }
            case 4: {
                u0.c(a0.b, a0.d, a0.c);
                return;
            }
            case 8: {
                u0.e(a0.b, a0.d);
                return;
            }
            default: {
                throw new IllegalArgumentException("Unknown update op type for " + a0);
            }
        }
    }

    // This method was un-flattened
    public void q() {
        int v37;
        p2.a a5;
        p2.a a4;
        p2.a a3;
        boolean z2;
        boolean z1;
        ArrayList arrayList0 = (ArrayList)this.c;
        a a0 = (a)this.f;
        a0.getClass();
        while(true) {
            int v = arrayList0.size() - 1;
            boolean z = false;
            while(true) {
                if(v < 0) {
                    v = -1;
                    break;
                }
                if(((p2.a)arrayList0.get(v)).a != 8) {
                    z = true;
                }
                else if(z) {
                    break;
                }
                --v;
            }
            if(v == -1) {
                break;
            }
            p2.a a1 = (p2.a)arrayList0.get(v);
            p2.a a2 = (p2.a)arrayList0.get(v + 1);
            int v1 = a2.a;
            if(v1 == 1) {
                int v24 = a1.d;
                int v25 = a2.b;
                int v26 = v24 >= v25 ? 0 : -1;
                int v27 = a1.b;
                if(v27 < v25) {
                    ++v26;
                }
                if(v25 <= v27) {
                    a1.b = v27 + a2.d;
                }
                int v28 = a2.b;
                if(v28 <= v24) {
                    a1.d = v24 + a2.d;
                }
                a2.b = v28 + v26;
                arrayList0.set(v, a2);
                arrayList0.set(v + 1, a1);
                continue;
            }
            else {
                o o0 = (o)a0.Y;
                switch(v1) {
                    case 2: {
                        int v2 = a1.b;
                        int v3 = a1.d;
                        if(v2 < v3) {
                            z1 = a2.b == v2 && a2.d == v3 - v2;
                            z2 = false;
                        }
                        else if(a2.b != v3 + 1 || a2.d != v2 - v3) {
                            z2 = true;
                            z1 = false;
                        }
                        else {
                            z1 = true;
                            z2 = true;
                        }
                        int v4 = a2.b;
                        if(v3 < v4) {
                            a2.b = v4 - 1;
                        }
                        else {
                            int v5 = a2.d;
                            if(v3 < v4 + v5) {
                                a2.d = v5 - 1;
                                a1.a = 2;
                                a1.d = 1;
                                if(a2.d != 0) {
                                    continue;
                                }
                                arrayList0.remove(v + 1);
                                o0.getClass();
                                a2.c = null;
                                ((c)o0.b).c(a2);
                                continue;
                            }
                        }
                        int v6 = a1.b;
                        int v7 = a2.b;
                        if(v6 <= v7) {
                            a2.b = v7 + 1;
                        }
                        else {
                            int v8 = v7 + a2.d;
                            if(v6 < v8) {
                                a3 = o0.m(null, 2, v6 + 1, v8 - v6);
                                a2.d = a1.b - a2.b;
                                goto label_60;
                            }
                        }
                        a3 = null;
                    label_60:
                        if(z1) {
                            arrayList0.set(v, a2);
                            arrayList0.remove(v + 1);
                            o0.getClass();
                            a1.c = null;
                            ((c)o0.b).c(a1);
                        }
                        else {
                            if(z2) {
                                if(a3 != null) {
                                    int v9 = a1.b;
                                    if(v9 > a3.b) {
                                        a1.b = v9 - a3.d;
                                    }
                                    int v10 = a1.d;
                                    if(v10 > a3.b) {
                                        a1.d = v10 - a3.d;
                                    }
                                }
                                int v11 = a1.b;
                                if(v11 > a2.b) {
                                    a1.b = v11 - a2.d;
                                }
                                int v12 = a1.d;
                                if(v12 > a2.b) {
                                    a1.d = v12 - a2.d;
                                }
                            }
                            else {
                                if(a3 != null) {
                                    int v13 = a1.b;
                                    if(v13 >= a3.b) {
                                        a1.b = v13 - a3.d;
                                    }
                                    int v14 = a1.d;
                                    if(v14 >= a3.b) {
                                        a1.d = v14 - a3.d;
                                    }
                                }
                                int v15 = a1.b;
                                if(v15 >= a2.b) {
                                    a1.b = v15 - a2.d;
                                }
                                int v16 = a1.d;
                                if(v16 >= a2.b) {
                                    a1.d = v16 - a2.d;
                                }
                            }
                            arrayList0.set(v, a2);
                            if(a1.b == a1.d) {
                                arrayList0.remove(v + 1);
                            }
                            else {
                                arrayList0.set(v + 1, a1);
                            }
                            if(a3 == null) {
                                continue;
                            }
                            arrayList0.add(v, a3);
                        }
                        continue;
                    }
                    case 4: {
                        int v17 = a1.d;
                        int v18 = a2.b;
                        if(v17 < v18) {
                            a2.b = v18 - 1;
                        }
                        else {
                            int v19 = a2.d;
                            if(v17 < v18 + v19) {
                                a2.d = v19 - 1;
                                a4 = o0.m(a2.c, 4, a1.b, 1);
                                goto label_114;
                            }
                        }
                        a4 = null;
                    label_114:
                        int v20 = a1.b;
                        int v21 = a2.b;
                        if(v20 <= v21) {
                            a2.b = v21 + 1;
                        }
                        else {
                            int v22 = v21 + a2.d;
                            if(v20 < v22) {
                                int v23 = v22 - v20;
                                a5 = o0.m(a2.c, 4, v20 + 1, v23);
                                a2.d -= v23;
                                goto label_126;
                            }
                        }
                        a5 = null;
                    label_126:
                        arrayList0.set(v + 1, a1);
                        if(a2.d > 0) {
                            arrayList0.set(v, a2);
                        }
                        else {
                            arrayList0.remove(v);
                            o0.getClass();
                            a2.c = null;
                            ((c)o0.b).c(a2);
                        }
                        if(a4 != null) {
                            arrayList0.add(v, a4);
                        }
                        if(a5 == null) {
                            continue;
                        }
                        arrayList0.add(v, a5);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            goto label_156;
        }
        int v29 = arrayList0.size();
        int v30 = 0;
    label_156:
        while(v30 < v29) {
            p2.a a6 = (p2.a)arrayList0.get(v30);
            int v31 = a6.a;
            if(v31 == 1) {
                this.p(a6);
            }
            else {
                c c0 = (c)this.b;
                u u0 = (u)this.e;
                switch(v31) {
                    case 2: {
                        int v32 = a6.b;
                        int v33 = a6.d + v32;
                        int v34 = v32;
                        int v35 = 0;
                        int v36 = -1;
                        while(v34 < v33) {
                            if(u0.b(v34) != null || this.b(v34)) {
                            label_177:
                                if(v36 == 0) {
                                    this.f(this.m(null, 2, v32, v35));
                                    v37 = 1;
                                    v34 -= v35;
                                    v33 -= v35;
                                    v35 = 1;
                                    goto label_186;
                                }
                                else {
                                    v37 = 1;
                                }
                            }
                            else {
                                if(v36 == 1) {
                                    this.p(this.m(null, 2, v32, v35));
                                    v37 = 0;
                                    v34 -= v35;
                                    v33 -= v35;
                                    v35 = 1;
                                    goto label_186;
                                }
                                else {
                                    v37 = 0;
                                    goto label_185;
                                }
                                goto label_177;
                            }
                        label_185:
                            ++v35;
                        label_186:
                            ++v34;
                            v36 = v37;
                        }
                        if(v35 != a6.d) {
                            a6.c = null;
                            c0.c(a6);
                            a6 = this.m(null, 2, v32, v35);
                        }
                        if(v36 == 0) {
                            this.f(a6);
                        }
                        else {
                            this.p(a6);
                        }
                        break;
                    }
                    case 4: {
                        int v38 = a6.b;
                        int v39 = a6.d + v38;
                        int v40 = -1;
                        int v41 = v38;
                        int v42 = 0;
                        while(v38 < v39) {
                            if(u0.b(v38) != null || this.b(v38)) {
                                if(v40 == 0) {
                                    this.f(this.m(a6.c, 4, v41, v42));
                                    v41 = v38;
                                    v42 = 0;
                                }
                                v40 = 1;
                            }
                            else {
                                if(v40 == 1) {
                                    this.p(this.m(a6.c, 4, v41, v42));
                                    v41 = v38;
                                    v42 = 0;
                                }
                                v40 = 0;
                            }
                            ++v42;
                            ++v38;
                        }
                        if(v42 != a6.d) {
                            Object object0 = a6.c;
                            a6.c = null;
                            c0.c(a6);
                            a6 = this.m(object0, 4, v41, v42);
                        }
                        if(v40 == 0) {
                            this.f(a6);
                        }
                        else {
                            this.p(a6);
                        }
                        break;
                    }
                    case 8: {
                        this.p(a6);
                    }
                }
            }
            ++v30;
        }
        arrayList0.clear();
    }

    public void r(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            p2.a a0 = (p2.a)arrayList0.get(v1);
            a0.c = null;
            ((c)this.b).c(a0);
        }
        arrayList0.clear();
    }

    public void s(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            this.d = null;
        }
        else {
            if(((n)this.d) == null) {
                this.d = new n();  // initializer: Ljava/lang/Object;-><init>()V
            }
            ((n)this.d).Z = colorStateList0;
            ((n)this.d).Y = true;
        }
        this.a();
    }

    public void t(ColorStateList colorStateList0) {
        if(((n)this.e) == null) {
            this.e = new n();  // initializer: Ljava/lang/Object;-><init>()V
        }
        ((n)this.e).Z = colorStateList0;
        ((n)this.e).Y = true;
        this.a();
    }

    public void u(PorterDuff.Mode porterDuff$Mode0) {
        if(((n)this.e) == null) {
            this.e = new n();  // initializer: Ljava/lang/Object;-><init>()V
        }
        ((n)this.e).b0 = porterDuff$Mode0;
        ((n)this.e).X = true;
        this.a();
    }

    public int v(int v, int v1) {
        int v7;
        int v6;
        ArrayList arrayList0 = (ArrayList)this.d;
        for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
            p2.a a0 = (p2.a)arrayList0.get(v2);
            int v3 = a0.a;
            if(v3 == 8) {
                int v4 = a0.b;
                int v5 = a0.d;
                if(v4 < v5) {
                    v6 = v4;
                    v7 = v5;
                }
                else {
                    v7 = v4;
                    v6 = v5;
                }
                if(v < v6 || v > v7) {
                    if(v < v4) {
                        if(v1 == 1) {
                            a0.b = v4 + 1;
                            a0.d = v5 + 1;
                        }
                        else if(v1 == 2) {
                            a0.b = v4 - 1;
                            a0.d = v5 - 1;
                        }
                    }
                }
                else if(v6 == v4) {
                    if(v1 == 1) {
                        a0.d = v5 + 1;
                    }
                    else if(v1 == 2) {
                        a0.d = v5 - 1;
                    }
                    ++v;
                }
                else {
                    if(v1 == 1) {
                        a0.b = v4 + 1;
                    }
                    else if(v1 == 2) {
                        a0.b = v4 - 1;
                    }
                    --v;
                }
            }
            else {
                int v8 = a0.b;
                if(v8 > v) {
                    if(v1 == 1) {
                        a0.b = v8 + 1;
                    }
                    else if(v1 == 2) {
                        a0.b = v8 - 1;
                    }
                }
                else if(v3 == 1) {
                    v -= a0.d;
                }
                else if(v3 == 2) {
                    v += a0.d;
                }
            }
        }
        for(int v9 = arrayList0.size() - 1; v9 >= 0; --v9) {
            p2.a a1 = (p2.a)arrayList0.get(v9);
            int v10 = a1.a;
            c c0 = (c)this.b;
            if(v10 != 8) {
                if(a1.d <= 0) {
                    arrayList0.remove(v9);
                    a1.c = null;
                    c0.c(a1);
                }
            }
            else if(a1.d == a1.b || a1.d < 0) {
                arrayList0.remove(v9);
                a1.c = null;
                c0.c(a1);
            }
        }
        return v;
    }

    public void w() {
        SharedPreferences.Editor sharedPreferences$Editor0 = PreferenceManager.getDefaultSharedPreferences(l.a()).edit();
        long v = 0L;
        Long long0 = (Long)this.b;
        sharedPreferences$Editor0.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", (long0 == null ? 0L : ((long)long0)));
        Long long1 = (Long)this.c;
        if(long1 != null) {
            v = (long)long1;
        }
        sharedPreferences$Editor0.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", v);
        sharedPreferences$Editor0.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.a);
        sharedPreferences$Editor0.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID)this.e).toString());
        sharedPreferences$Editor0.apply();
        A a0 = (A)this.f;
        if(a0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor1 = PreferenceManager.getDefaultSharedPreferences(l.a()).edit();
            sharedPreferences$Editor1.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", a0.b);
            sharedPreferences$Editor1.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", a0.c);
            sharedPreferences$Editor1.apply();
        }
    }
}

