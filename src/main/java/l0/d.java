package l0;

import Ab.e;
import B.m0;
import B.w0;
import D0.b0;
import E.k;
import E.l;
import F0.W;
import F0.c0;
import F0.f;
import F0.o0;
import Nb.j;
import Nb.w;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import d6.a;
import g0.n;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import m0.c;
import v.h;

public abstract class d {
    public static final int[] a;

    static {
        d.a = new int[2];
    }

    public static final boolean A(q q0) {
        Boolean boolean0 = d.B(q0, 7);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public static final Boolean B(q q0, int v) {
        Boolean boolean0;
        a a0 = f.w(q0).getFocusOwner().b();
        r r0 = new r(q0, 1);
        try {
            if(a0.X) {
                a.a(a0);
            }
            a0.X = true;
            ((W.d)a0.Z).c(r0);
            switch(h.d(d.v(q0, v))) {
                case 0: {
                    boolean0 = Boolean.valueOf(d.w(q0));
                    break;
                }
                case 2: {
                    boolean0 = Boolean.TRUE;
                    break;
                }
                case 1: 
                case 3: {
                    boolean0 = null;
                    break;
                }
                default: {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
            return boolean0;
        }
        finally {
            a.b(a0);
        }
    }

    public static final boolean C(q q0, q q1) {
        n n2;
        boolean z;
        n n0 = q1.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n n1 = n0.c0;
        LayoutNode layoutNode0 = f.v(q1);
    alab1:
        while(true) {
            Object object0 = null;
            z = false;
            n2 = null;
            if(layoutNode0 == null) {
                break;
            }
            if((((n)layoutNode0.u0.f).b0 & 0x400) != 0) {
                while(n1 != null) {
                    if((n1.Z & 0x400) != 0) {
                        object0 = n1;
                        W.d d0 = null;
                        while(object0 != null) {
                            if(object0 instanceof q) {
                                break alab1;
                            }
                            if((object0.Z & 0x400) != 0 && object0 instanceof F0.n) {
                                n n3 = ((F0.n)object0).m0;
                                int v = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            object0 = n3;
                                        }
                                        else {
                                            if(d0 == null) {
                                                d0 = new W.d(new n[16]);
                                            }
                                            if(object0 != null) {
                                                d0.c(object0);
                                                object0 = null;
                                            }
                                            d0.c(n3);
                                        }
                                    }
                                    n3 = n3.d0;
                                }
                                if(v != 1) {
                                    object0 = f.f(d0);
                                }
                            }
                            else {
                                object0 = f.f(d0);
                            }
                        }
                    }
                    n1 = n1.c0;
                }
            }
            layoutNode0 = layoutNode0.s();
            if(layoutNode0 != null) {
                W w0 = layoutNode0.u0;
                if(w0 != null) {
                    n1 = (o0)w0.e;
                    continue;
                }
            }
            n1 = null;
        }
        if(j.a(object0, q0)) {
            int v1 = q0.y0().ordinal();
            p p0 = p.Y;
            switch(v1) {
                case 0: {
                    d.p(q1);
                    q0.C0(p0);
                    return true;
                label_54:
                    if(v1 == 2) {
                        return z;
                    }
                    if(v1 != 3) {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    n n4 = q0.X;
                    if(!n4.k0) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    n n5 = n4.c0;
                    LayoutNode layoutNode1 = f.v(q0);
                label_60:
                    while(layoutNode1 != null) {
                        if((((n)layoutNode1.u0.f).b0 & 0x400) != 0) {
                            while(n5 != null) {
                                if((n5.Z & 0x400) != 0) {
                                    n n6 = n5;
                                    W.d d1 = null;
                                    while(n6 != null) {
                                        if(n6 instanceof q) {
                                            n2 = n6;
                                            break label_60;
                                        }
                                        if((n6.Z & 0x400) != 0 && n6 instanceof F0.n) {
                                            n n7 = ((F0.n)n6).m0;
                                            int v2 = 0;
                                            while(n7 != null) {
                                                if((n7.Z & 0x400) != 0) {
                                                    ++v2;
                                                    if(v2 == 1) {
                                                        n6 = n7;
                                                    }
                                                    else {
                                                        if(d1 == null) {
                                                            d1 = new W.d(new n[16]);
                                                        }
                                                        if(n6 != null) {
                                                            d1.c(n6);
                                                            n6 = null;
                                                        }
                                                        d1.c(n7);
                                                    }
                                                }
                                                n7 = n7.d0;
                                            }
                                            if(v2 != 1) {
                                                n6 = f.f(d1);
                                            }
                                        }
                                        else {
                                            n6 = f.f(d1);
                                        }
                                    }
                                }
                                n5 = n5.c0;
                            }
                        }
                        layoutNode1 = layoutNode1.s();
                        if(layoutNode1 != null) {
                            W w1 = layoutNode1.u0;
                            if(w1 != null) {
                                n5 = (o0)w1.e;
                                continue;
                            }
                        }
                        n5 = null;
                    }
                    if(((q)n2) == null && f.w(q0).getFocusOwner().m()) {
                        d.p(q1);
                        q0.C0(p0);
                        return true;
                    }
                    if(((q)n2) == null || !d.C(((q)n2), q0)) {
                        return z;
                    }
                    z = d.C(q0, q1);
                    if(q0.y0() != p0) {
                        throw new IllegalStateException("Deactivated node is focused");
                    }
                    if(!z) {
                        return z;
                    }
                    d.z(((q)n2));
                    return z;
                }
                case 1: {
                    if(d.n(q0) == null) {
                        throw new IllegalArgumentException("ActiveParent with no focused child");
                    }
                    q q2 = d.n(q0);
                    if((q2 == null ? true : d.e(q2, false, true))) {
                        d.p(q1);
                        return true;
                    }
                    return z;
                }
                default: {
                    goto label_54;
                }
            }
        }
        throw new IllegalStateException("Non child node cannot request focus.");
    }

    public static final boolean D(View view0, Integer integer0, Rect rect0) {
        if(integer0 == null) {
            return view0.requestFocus();
        }
        if(!(view0 instanceof ViewGroup)) {
            return view0.requestFocus(((int)integer0), rect0);
        }
        if(((ViewGroup)view0).isFocused()) {
            return true;
        }
        if(((ViewGroup)view0).isFocusable() && !view0.hasFocus()) {
            return view0.requestFocus(((int)integer0), rect0);
        }
        if(view0 instanceof AndroidComposeView) {
            return view0.requestFocus(((int)integer0), rect0);
        }
        if(rect0 != null) {
            View view1 = FocusFinder.getInstance().findNextFocusFromRect(((ViewGroup)view0), rect0, ((int)integer0));
            return view1 == null ? view0.requestFocus(((int)integer0), rect0) : view1.requestFocus(((int)integer0), rect0);
        }
        View view2 = view0.hasFocus() ? view0.findFocus() : null;
        View view3 = FocusFinder.getInstance().findNextFocus(((ViewGroup)view0), view2, ((int)integer0));
        return view3 == null ? view0.requestFocus(((int)integer0)) : view3.requestFocus(((int)integer0));
    }

    public static final Object E(q q0, int v, Function1 function10) {
        Object object0;
        int v1;
        n n0 = q0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n n1 = n0.c0;
        LayoutNode layoutNode0 = f.v(q0);
    alab1:
        while(true) {
            n n2 = null;
            v1 = 1;
            object0 = null;
            if(layoutNode0 == null) {
                break;
            }
            if((((n)layoutNode0.u0.f).b0 & 0x400) != 0) {
                while(n1 != null) {
                    if((n1.Z & 0x400) != 0) {
                        n2 = n1;
                        W.d d0 = null;
                        while(n2 != null) {
                            if(n2 instanceof q) {
                                break alab1;
                            }
                            if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v2 = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        ++v2;
                                        if(v2 == 1) {
                                            n2 = n3;
                                        }
                                        else {
                                            if(d0 == null) {
                                                d0 = new W.d(new n[16]);
                                            }
                                            if(n2 != null) {
                                                d0.c(n2);
                                                n2 = null;
                                            }
                                            d0.c(n3);
                                        }
                                    }
                                    n3 = n3.d0;
                                }
                                if(v2 != 1) {
                                    n2 = f.f(d0);
                                }
                            }
                            else {
                                n2 = f.f(d0);
                            }
                        }
                    }
                    n1 = n1.c0;
                }
            }
            layoutNode0 = layoutNode0.s();
            if(layoutNode0 != null) {
                W w0 = layoutNode0.u0;
                if(w0 != null) {
                    n1 = (o0)w0.e;
                    continue;
                }
            }
            n1 = null;
        }
        if(((q)n2) != null && j.a(((k)((q)n2).X(D0.f.a)), ((k)q0.X(D0.f.a)))) {
            return null;
        }
        k k0 = (k)q0.X(D0.f.a);
        if(k0 != null) {
            if(v == 5) {
                v1 = 5;
            }
            else if(v != 3 && v != 6) {
                switch(v) {
                    case 1: {
                        v1 = 2;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 4: {
                        v1 = 6;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                }
            }
            else {
                v1 = 6;
            }
            l l0 = k0.X;
            if(l0.b() > 0 && l0.d()) {
                int v3 = k0.m(v1) ? l0.c() : l0.f();
                w w1 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                k0.Y.getClass();
                E.h h0 = new E.h(v3, v3);
                W.d d1 = (W.d)k0.Y.Y;
                d1.c(h0);
                w1.X = h0;
                while(object0 == null && k0.k(((E.h)w1.X), v1)) {
                    E.h h1 = (E.h)w1.X;
                    int v4 = h1.a;
                    boolean z = k0.m(v1);
                    int v5 = h1.b;
                    if(z) {
                        ++v5;
                    }
                    else {
                        --v4;
                    }
                    E.h h2 = new E.h(v4, v5);
                    d1.c(h2);
                    d1.o(((E.h)w1.X));
                    w1.X = h2;
                    l0.e();
                    object0 = function10.n(new E.j(k0, w1, v1));
                }
                d1.o(((E.h)w1.X));
                l0.e();
                return object0;
            }
            return function10.n(k.d0);
        }
        return null;
    }

    public static final boolean F(int v, m0 m00, q q0, c c0) {
        W.d d0 = new W.d(new q[16]);
        n n0 = q0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        W.d d1 = new W.d(new n[16]);
        n n1 = n0.d0;
        if(n1 == null) {
            f.b(d1, n0);
        }
        else {
            d1.c(n1);
        }
        while(d1.n()) {
            n n2 = (n)d1.p(d1.Z - 1);
            if((n2.b0 & 0x400) == 0) {
                f.b(d1, n2);
            }
            else {
                while(n2 != null) {
                    if((n2.Z & 0x400) != 0) {
                        W.d d2 = null;
                        while(n2 != null) {
                            if(!(n2 instanceof q)) {
                                if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                    n n3 = ((F0.n)n2).m0;
                                    int v1 = 0;
                                    while(n3 != null) {
                                        if((n3.Z & 0x400) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
                                                n2 = n3;
                                            }
                                            else {
                                                if(d2 == null) {
                                                    d2 = new W.d(new n[16]);
                                                }
                                                if(n2 != null) {
                                                    d2.c(n2);
                                                    n2 = null;
                                                }
                                                d2.c(n3);
                                            }
                                        }
                                        n3 = n3.d0;
                                    }
                                    if(v1 != 1) {
                                        goto label_42;
                                    }
                                    continue;
                                }
                            }
                            else if(((q)n2).k0) {
                                d0.c(((q)n2));
                            }
                        label_42:
                            n2 = f.f(d2);
                        }
                        break;
                    }
                    n2 = n2.d0;
                }
            }
        }
        while(d0.n()) {
            q q1 = d.h(d0, c0, v);
            if(q1 == null) {
                return false;
            }
            if(q1.x0().a) {
                return ((Boolean)m00.n(q1)).booleanValue();
            }
            if(d.l(v, m00, q1, c0)) {
                return true;
            }
            d0.o(q1);
        }
        return false;
    }

    public static final boolean G(q q0, q q1, int v, m0 m00) {
        if(q0.y0() != p.Y) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        q[] arr_q = new q[16];
        n n0 = q0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        W.d d0 = new W.d(new n[16]);
        n n1 = n0.d0;
        if(n1 == null) {
            f.b(d0, n0);
        }
        else {
            d0.c(n1);
        }
        int v1 = 0;
        while(d0.n()) {
            n n2 = (n)d0.p(d0.Z - 1);
            if((n2.b0 & 0x400) == 0) {
                f.b(d0, n2);
            }
            else {
                while(n2 != null) {
                    if((n2.Z & 0x400) != 0) {
                        W.d d1 = null;
                        while(n2 != null) {
                            if(n2 instanceof q) {
                                if(arr_q.length < v1 + 1) {
                                    arr_q = Arrays.copyOf(arr_q, Math.max(v1 + 1, arr_q.length * 2));
                                    j.e(arr_q, "copyOf(this, newSize)");
                                }
                                arr_q[v1] = (q)n2;
                                ++v1;
                            }
                            else if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v2 = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        ++v2;
                                        if(v2 == 1) {
                                            n2 = n3;
                                        }
                                        else {
                                            if(d1 == null) {
                                                d1 = new W.d(new n[16]);
                                            }
                                            if(n2 != null) {
                                                d1.c(n2);
                                                n2 = null;
                                            }
                                            d1.c(n3);
                                        }
                                    }
                                    n3 = n3.d0;
                                }
                                if(v2 != 1) {
                                    goto label_47;
                                }
                                continue;
                            }
                        label_47:
                            n2 = f.f(d1);
                        }
                        break;
                    }
                    n2 = n2.d0;
                }
            }
        }
        j.f(arr_q, "<this>");
        Arrays.sort(arr_q, 0, v1, s.X);
        if(v == 1) {
            int v3 = new Sb.d(0, v1 - 1, 1).Y;  // initializer: LSb/b;-><init>(III)V
            if(v3 < 0) {
                goto label_80;
            }
            int v4 = 0;
            boolean z = false;
            while(true) {
                if(z) {
                    q q2 = arr_q[v4];
                    if(d.s(q2) && d.k(q2, m00)) {
                        return true;
                    }
                }
                if(j.a(arr_q[v4], q1)) {
                    z = true;
                }
                if(v4 == v3) {
                    goto label_80;
                }
                ++v4;
            }
        }
        if(v != 2) {
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        int v5 = new Sb.d(0, v1 - 1, 1).Y;  // initializer: LSb/b;-><init>(III)V
        if(v5 >= 0) {
            boolean z1 = false;
            while(true) {
                if(z1) {
                    q q3 = arr_q[v5];
                    if(d.s(q3) && d.a(q3, m00)) {
                        return true;
                    }
                }
                if(j.a(arr_q[v5], q1)) {
                    z1 = true;
                }
                if(v5 == 0) {
                    break;
                }
                --v5;
            }
        }
    label_80:
        if(v != 1 && q0.x0().a) {
            n n4 = q0.X;
            if(!n4.k0) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            n n5 = n4.c0;
            LayoutNode layoutNode0 = f.v(q0);
            while(layoutNode0 != null) {
                if((((n)layoutNode0.u0.f).b0 & 0x400) != 0) {
                    while(n5 != null) {
                        if((n5.Z & 0x400) != 0) {
                            n n6 = n5;
                            W.d d2 = null;
                            while(n6 != null) {
                                if(n6 instanceof q) {
                                    return n6 == null ? false : ((Boolean)m00.n(q0)).booleanValue();
                                }
                                if((n6.Z & 0x400) != 0 && n6 instanceof F0.n) {
                                    n n7 = ((F0.n)n6).m0;
                                    int v6 = 0;
                                    while(n7 != null) {
                                        if((n7.Z & 0x400) != 0) {
                                            ++v6;
                                            if(v6 == 1) {
                                                n6 = n7;
                                            }
                                            else {
                                                if(d2 == null) {
                                                    d2 = new W.d(new n[16]);
                                                }
                                                if(n6 != null) {
                                                    d2.c(n6);
                                                    n6 = null;
                                                }
                                                d2.c(n7);
                                            }
                                        }
                                        n7 = n7.d0;
                                    }
                                    if(v6 != 1) {
                                        n6 = f.f(d2);
                                    }
                                }
                                else {
                                    n6 = f.f(d2);
                                }
                            }
                        }
                        n5 = n5.c0;
                    }
                }
                layoutNode0 = layoutNode0.s();
                if(layoutNode0 != null) {
                    W w0 = layoutNode0.u0;
                    if(w0 != null) {
                        n5 = (o0)w0.e;
                        continue;
                    }
                }
                n5 = null;
            }
            return false;
        }
        return false;
    }

    public static final Integer H(int v) {
        switch(v) {
            case 1: {
                return 2;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 17;
            }
            case 4: {
                return 66;
            }
            case 5: {
                return 33;
            }
            case 6: {
                return 130;
            }
            default: {
                return null;
            }
        }
    }

    public static final b I(int v) {
        switch(v) {
            case 1: {
                return new b(2);
            }
            case 2: {
                return new b(1);
            }
            case 17: {
                return new b(3);
            }
            case 33: {
                return new b(5);
            }
            case 66: {
                return new b(4);
            }
            case 130: {
                return new b(6);
            }
            default: {
                return null;
            }
        }
    }

    public static final Boolean J(int v, m0 m00, q q0, c c0) {
        int v1 = q0.y0().ordinal();
        if(v1 != 0) {
            switch(v1) {
                case 1: {
                    q q1 = d.n(q0);
                    if(q1 != null) {
                        switch(q1.y0().ordinal()) {
                            case 1: {
                                Boolean boolean0 = d.J(v, m00, q1, c0);
                                if(!j.a(boolean0, Boolean.FALSE)) {
                                    return boolean0;
                                }
                                if(c0 == null) {
                                    if(q1.y0() != p.Y) {
                                        throw new IllegalStateException("Searching for active node in inactive hierarchy");
                                    }
                                    q q2 = d.g(q1);
                                    if(q2 == null) {
                                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                                    }
                                    return Boolean.valueOf(d.l(v, m00, q0, d.j(q2)));
                                }
                                return Boolean.valueOf(d.l(v, m00, q0, c0));
                            }
                            case 0: 
                            case 2: {
                                if(c0 == null) {
                                    c0 = d.j(q1);
                                }
                                return Boolean.valueOf(d.l(v, m00, q0, c0));
                            }
                            case 3: {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            default: {
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                        }
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                case 2: {
                    break;
                }
                case 3: {
                    if(q0.x0().a) {
                        return (Boolean)m00.n(q0);
                    }
                    return c0 == null ? Boolean.valueOf(d.i(q0, v, m00)) : Boolean.valueOf(d.F(v, m00, q0, c0));
                }
                default: {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
        }
        return Boolean.valueOf(d.i(q0, v, m00));
    }

    public static final boolean a(q q0, m0 m00) {
        int v = q0.y0().ordinal();
        if(v != 0) {
            switch(v) {
                case 1: {
                    q q1 = d.n(q0);
                    if(q1 != null) {
                        switch(q1.y0().ordinal()) {
                            case 1: {
                                return d.a(q1, m00) || d.m(q0, q1, 2, m00) || q1.x0().a && ((Boolean)m00.n(q1)).booleanValue();
                            }
                            case 0: 
                            case 2: {
                                return d.m(q0, q1, 2, m00);
                            }
                            case 3: {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            default: {
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                        }
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                case 2: {
                    break;
                }
                case 3: {
                    if(!d.x(q0, m00)) {
                        return q0.x0().a ? ((Boolean)m00.n(q0)).booleanValue() : false;
                    }
                    return true;
                }
                default: {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
        }
        return d.x(q0, m00);
    }

    public static final boolean b(c c0, c c1, c c2, int v) {
        float f8;
        if(!d.c(v, c2, c0) && d.c(v, c1, c0)) {
            float f = c2.b;
            float f1 = c2.d;
            float f2 = c2.a;
            float f3 = c2.c;
            float f4 = c0.d;
            float f5 = c0.b;
            float f6 = c0.c;
            float f7 = c0.a;
            if(v != 3) {
                switch(v) {
                    case 4: {
                        if(f6 <= f2) {
                            goto label_19;
                        }
                        break;
                    }
                    case 5: {
                        if(f5 >= f1) {
                            goto label_19;
                        }
                        break;
                    }
                    case 6: {
                        if(f4 <= f) {
                        label_19:
                            if(v != 3 && v != 4) {
                                switch(v) {
                                    case 5: {
                                        f8 = f5 - c1.d;
                                        break;
                                    }
                                    case 6: {
                                        f8 = c1.b - f4;
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                                    }
                                }
                                float f9 = Math.max(0.0f, f8);
                                switch(v) {
                                    case 5: {
                                        return f9 < Math.max(1.0f, f5 - f);
                                    }
                                    case 6: {
                                        return f9 < Math.max(1.0f, f1 - f4);
                                    }
                                    default: {
                                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                                    }
                                }
                            }
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                }
            }
            else if(f7 >= f3) {
                goto label_19;
            }
            return true;
        }
        return false;
    }

    public static final boolean c(int v, c c0, c c1) {
        if((v == 3 ? true : v == 4)) {
            return c0.d > c1.b && c0.b < c1.d;
        }
        if(!(v == 5 ? true : v == 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return c0.c <= c1.a && c0.a >= c1.c;
    }

    public static final c d(View view0) {
        view0.getLocationInWindow(d.a);
        float f = (float)d.a[0];
        return new c(f, ((float)d.a[1]), ((float)view0.getWidth()) + f, ((float)d.a[1]) + ((float)view0.getHeight()));
    }

    public static final boolean e(q q0, boolean z, boolean z1) {
        int v = q0.y0().ordinal();
        p p0 = p.Z;
        switch(v) {
            case 0: {
                q0.C0(p0);
                if(!z1) {
                    return true;
                }
                d.z(q0);
                return true;
            }
            case 1: {
                q q1 = d.n(q0);
                if((q1 == null ? true : d.e(q1, z, z1))) {
                    q0.C0(p0);
                    if(z1) {
                        d.z(q0);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            case 2: {
                if(z) {
                    q0.C0(p0);
                    if(z1) {
                        d.z(q0);
                        return z;
                    }
                }
                return z;
            }
            case 3: {
                return true;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static final void f(q q0, W.d d0) {
        n n0 = q0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        W.d d1 = new W.d(new n[16]);
        n n1 = n0.d0;
        if(n1 == null) {
            f.b(d1, n0);
        }
        else {
            d1.c(n1);
        }
        while(d1.n()) {
            n n2 = (n)d1.p(d1.Z - 1);
            if((n2.b0 & 0x400) == 0) {
                f.b(d1, n2);
            }
            else {
                while(n2 != null) {
                    if((n2.Z & 0x400) != 0) {
                        W.d d2 = null;
                        while(n2 != null) {
                            if(!(n2 instanceof q)) {
                                if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                    n n3 = ((F0.n)n2).m0;
                                    int v = 0;
                                    while(n3 != null) {
                                        if((n3.Z & 0x400) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                n2 = n3;
                                            }
                                            else {
                                                if(d2 == null) {
                                                    d2 = new W.d(new n[16]);
                                                }
                                                if(n2 != null) {
                                                    d2.c(n2);
                                                    n2 = null;
                                                }
                                                d2.c(n3);
                                            }
                                        }
                                        n3 = n3.d0;
                                    }
                                    if(v != 1) {
                                        goto label_44;
                                    }
                                    continue;
                                }
                            }
                            else if(((q)n2).k0 && !f.v(((q)n2)).E0) {
                                if(((q)n2).x0().a) {
                                    d0.c(((q)n2));
                                }
                                else {
                                    d.f(((q)n2), d0);
                                }
                            }
                        label_44:
                            n2 = f.f(d2);
                        }
                        break;
                    }
                    n2 = n2.d0;
                }
            }
        }
    }

    public static final q g(q q0) {
        switch(q0.y0().ordinal()) {
            case 1: {
                n n0 = q0.X;
                if(!n0.k0) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                W.d d0 = new W.d(new n[16]);
                n n1 = n0.d0;
                if(n1 == null) {
                    f.b(d0, n0);
                }
                else {
                    d0.c(n1);
                }
                while(d0.n()) {
                    n n2 = (n)d0.p(d0.Z - 1);
                    if((n2.b0 & 0x400) == 0) {
                        f.b(d0, n2);
                    }
                    else {
                        while(n2 != null) {
                            if((n2.Z & 0x400) != 0) {
                                W.d d1 = null;
                                while(n2 != null) {
                                    if(n2 instanceof q) {
                                        q q1 = d.g(((q)n2));
                                        if(q1 != null) {
                                            return q1;
                                        }
                                    }
                                    else if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                        n n3 = ((F0.n)n2).m0;
                                        int v = 0;
                                        while(n3 != null) {
                                            if((n3.Z & 0x400) != 0) {
                                                ++v;
                                                if(v == 1) {
                                                    n2 = n3;
                                                }
                                                else {
                                                    if(d1 == null) {
                                                        d1 = new W.d(new n[16]);
                                                    }
                                                    if(n2 != null) {
                                                        d1.c(n2);
                                                        n2 = null;
                                                    }
                                                    d1.c(n3);
                                                }
                                            }
                                            n3 = n3.d0;
                                        }
                                        if(v != 1) {
                                            goto label_44;
                                        }
                                        continue;
                                    }
                                label_44:
                                    n2 = f.f(d1);
                                }
                                break;
                            }
                            n2 = n2.d0;
                        }
                    }
                }
                return null;
            }
            case 0: 
            case 2: {
                return q0;
            }
            case 3: {
                return null;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static final q h(W.d d0, c c0, int v) {
        c c1;
        switch(v) {
            case 3: {
                c1 = c0.h(c0.d() + 1.0f, 0.0f);
                break;
            }
            case 4: {
                c1 = c0.h(-(c0.d() + 1.0f), 0.0f);
                break;
            }
            case 5: {
                c1 = c0.h(0.0f, c0.c() + 1.0f);
                break;
            }
            case 6: {
                c1 = c0.h(0.0f, -(c0.c() + 1.0f));
                break;
            }
            default: {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
        int v1 = d0.Z;
        q q0 = null;
        if(v1 > 0) {
            Object[] arr_object = d0.X;
            int v2 = 0;
            while(true) {
                q q1 = (q)arr_object[v2];
                if(d.s(q1)) {
                    c c2 = d.j(q1);
                    if(d.q(v, c2, c0) && (!d.q(v, c1, c0) || d.b(c0, c2, c1, v) || !d.b(c0, c1, c2, v) && d.r(v, c0, c2) < d.r(v, c0, c1))) {
                        q0 = q1;
                        c1 = c2;
                    }
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        return q0;
    }

    public static final boolean i(q q0, int v, Function1 function10) {
        c c1;
        W.d d0 = new W.d(new q[16]);
        d.f(q0, d0);
        boolean z = true;
        if(d0.Z <= 1) {
            Object object0 = d0.m() ? null : d0.X[0];
            return ((q)object0) == null ? false : ((Boolean)function10.n(((q)object0))).booleanValue();
        }
        if(v == 7) {
            v = 4;
        }
        if((v == 4 ? true : v == 6)) {
            c c0 = d.j(q0);
            c1 = new c(c0.a, c0.b, c0.a, c0.b);
        }
        else {
            if(v != 3) {
                z = v == 5;
            }
            if(!z) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c c2 = d.j(q0);
            c1 = new c(c2.c, c2.d, c2.c, c2.d);
        }
        q q1 = d.h(d0, c1, v);
        return q1 == null ? false : ((Boolean)function10.n(q1)).booleanValue();
    }

    public static final c j(q q0) {
        c0 c00 = q0.f0;
        return c00 == null ? c.e : b0.h(c00).x(c00, false);
    }

    public static final boolean k(q q0, m0 m00) {
        switch(q0.y0().ordinal()) {
            case 1: {
                q q1 = d.n(q0);
                if(q1 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                return d.k(q1, m00) || d.m(q0, q1, 1, m00);
            }
            case 0: 
            case 2: {
                return d.y(q0, m00);
            }
            case 3: {
                return q0.x0().a ? ((Boolean)m00.n(q0)).booleanValue() : d.y(q0, m00);
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static final boolean l(int v, m0 m00, q q0, c c0) {
        if(d.F(v, m00, q0, c0)) {
            return true;
        }
        Boolean boolean0 = (Boolean)d.E(q0, v, new w0(q0, c0, v, m00, 5));
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public static final boolean m(q q0, q q1, int v, m0 m00) {
        if(d.G(q0, q1, v, m00)) {
            return true;
        }
        Boolean boolean0 = (Boolean)d.E(q0, v, new w0(q0, q1, v, m00, 4));
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public static final q n(q q0) {
        n n0 = q0.X;
        boolean z = n0.k0;
        if(!z) {
            return null;
        }
        if(!z) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        W.d d0 = new W.d(new n[16]);
        n n1 = n0.d0;
        if(n1 == null) {
            f.b(d0, n0);
        }
        else {
            d0.c(n1);
        }
        while(d0.n()) {
            n n2 = (n)d0.p(d0.Z - 1);
            if((n2.b0 & 0x400) == 0) {
                f.b(d0, n2);
            }
            else {
                while(n2 != null) {
                    if((n2.Z & 0x400) != 0) {
                        W.d d1 = null;
                        while(n2 != null) {
                            if(n2 instanceof q) {
                                if(((q)n2).X.k0) {
                                    int v = ((q)n2).y0().ordinal();
                                    if(v == 0 || v == 1 || v == 2) {
                                        return (q)n2;
                                    }
                                }
                            }
                            else if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v1 = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            n2 = n3;
                                        }
                                        else {
                                            if(d1 == null) {
                                                d1 = new W.d(new n[16]);
                                            }
                                            if(n2 != null) {
                                                d1.c(n2);
                                                n2 = null;
                                            }
                                            d1.c(n3);
                                        }
                                    }
                                    n3 = n3.d0;
                                }
                                if(v1 != 1) {
                                    goto label_45;
                                }
                                continue;
                            }
                        label_45:
                            n2 = f.f(d1);
                        }
                        break;
                    }
                    n2 = n2.d0;
                }
            }
        }
        return null;
    }

    public static final p o(l0.c c0) {
        n n0 = ((n)c0).X;
        W.d d0 = null;
        while(true) {
            int v = 0;
            if(n0 == null) {
                break;
            }
            if(n0 instanceof q) {
                p p0 = ((q)n0).y0();
                if(p0.ordinal() == 0 || p0.ordinal() == 1 || p0.ordinal() == 2) {
                    return p0;
                }
            }
            else if((n0.Z & 0x400) != 0 && n0 instanceof F0.n) {
                for(n n1 = ((F0.n)n0).m0; n1 != null; n1 = n1.d0) {
                    if((n1.Z & 0x400) != 0) {
                        ++v;
                        if(v == 1) {
                            n0 = n1;
                        }
                        else {
                            if(d0 == null) {
                                d0 = new W.d(new n[16]);
                            }
                            if(n0 != null) {
                                d0.c(n0);
                                n0 = null;
                            }
                            d0.c(n1);
                        }
                    }
                }
                if(v != 1) {
                    goto label_25;
                }
                continue;
            }
        label_25:
            n0 = f.f(d0);
        }
        n n2 = ((n)c0).X;
        if(!n2.k0) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        W.d d1 = new W.d(new n[16]);
        n n3 = n2.d0;
        if(n3 == null) {
            f.b(d1, n2);
        }
        else {
            d1.c(n3);
        }
        while(d1.n()) {
            n n4 = (n)d1.p(d1.Z - 1);
            if((n4.b0 & 0x400) == 0) {
                f.b(d1, n4);
            }
            else {
                while(n4 != null) {
                    if((n4.Z & 0x400) != 0) {
                        W.d d2 = null;
                        while(n4 != null) {
                            if(n4 instanceof q) {
                                p p1 = ((q)n4).y0();
                                if(p1.ordinal() == 0 || p1.ordinal() == 1 || p1.ordinal() == 2) {
                                    return p1;
                                }
                            }
                            else if((n4.Z & 0x400) != 0 && n4 instanceof F0.n) {
                                n n5 = ((F0.n)n4).m0;
                                int v1 = 0;
                                while(n5 != null) {
                                    if((n5.Z & 0x400) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            n4 = n5;
                                        }
                                        else {
                                            if(d2 == null) {
                                                d2 = new W.d(new n[16]);
                                            }
                                            if(n4 != null) {
                                                d2.c(n4);
                                                n4 = null;
                                            }
                                            d2.c(n5);
                                        }
                                    }
                                    n5 = n5.d0;
                                }
                                if(v1 != 1) {
                                    goto label_68;
                                }
                                continue;
                            }
                        label_68:
                            n4 = f.f(d2);
                        }
                        break;
                    }
                    n4 = n4.d0;
                }
            }
        }
        return p.Z;
    }

    public static final void p(q q0) {
        f.s(q0, new r(q0, 0));
        switch(q0.y0().ordinal()) {
            case 1: 
            case 3: {
                q0.C0(p.X);
            }
        }
    }

    public static final boolean q(int v, c c0, c c1) {
        float f = c0.a;
        float f1 = c0.c;
        if(v == 3) {
            return (Float.compare(c1.c, f1) > 0 || c1.a < f1) && c1.a <= f;
        }
        if(v == 4) {
            return (Float.compare(c1.a, f) < 0 || c1.c > f) && c1.c >= f1;
        }
        float f2 = c0.b;
        float f3 = c0.d;
        if(v == 5) {
            return (Float.compare(c1.d, f3) > 0 || c1.b < f3) && c1.b <= f2;
        }
        if(v != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return (Float.compare(c1.b, f2) < 0 || c1.d > f2) && c1.d < f3;
    }

    public static final long r(int v, c c0, c c1) {
        float f4;
        float f3;
        float f2;
        float f = c1.b;
        float f1 = c1.a;
        if(v == 3) {
            f2 = c0.a - c1.c;
        }
        else {
            switch(v) {
                case 4: {
                    f2 = f1 - c0.c;
                    break;
                }
                case 5: {
                    f2 = c0.b - c1.d;
                    break;
                }
                case 6: {
                    f2 = f - c0.d;
                    break;
                }
                default: {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
            }
        }
        long v1 = (long)Math.abs(Math.max(0.0f, f2));
        boolean z = true;
        if((v == 3 ? true : v == 4)) {
            f3 = c0.c() / 2.0f + c0.b;
            f4 = c1.c() / 2.0f + f;
        }
        else {
            if(v != 5) {
                z = v == 6;
            }
            if(!z) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f3 = c0.d() / 2.0f + c0.a;
            f4 = c1.d() / 2.0f + f1;
        }
        long v2 = (long)Math.abs(f3 - f4);
        return v2 * v2 + 13L * v1 * v1;
    }

    // Deobfuscation rating: LOW(40)
    public static final boolean s(q q0) {
        return q0.f0 != null && (q0.f0.j0 != null && q0.f0.j0.F()) && (q0.f0 != null && (q0.f0.j0 != null && q0.f0.j0.E()));
    }

    public static final int t(q q0, int v) {
        int v1 = q0.y0().ordinal();
        int v2 = 1;
        if(v1 != 0) {
            switch(v1) {
                case 1: {
                    q q1 = d.n(q0);
                    if(q1 == null) {
                        throw new IllegalArgumentException("ActiveParent with no focused child");
                    }
                    int v3 = d.t(q1, v);
                    if(v3 == 1) {
                        v3 = 0;
                    }
                    if(v3 != 0) {
                        return v3;
                    }
                    if(!q0.l0) {
                        try {
                            q0.l0 = true;
                            m m0 = (m)((Function1)q0.x0().k).n(new b(v));
                            if(m0 != m.b) {
                                if(m0 == m.c) {
                                    return 2;
                                }
                                v2 = m0.a(g.c0) ? 3 : 4;
                            }
                            return v2;
                        }
                        finally {
                            q0.l0 = false;
                        }
                    }
                    break;
                }
                case 2: {
                    return 2;
                }
                case 3: {
                    break;
                }
                default: {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
        }
        return 1;
    }

    public static final int u(q q0, int v) {
        if(!q0.m0) {
            try {
                q0.m0 = true;
                m m0 = (m)((Function1)q0.x0().j).n(new b(v));
                if(m0 != m.b) {
                    if(m0 == m.c) {
                        return 2;
                    }
                    return m0.a(g.c0) ? 3 : 4;
                }
                return 1;
            }
            finally {
                q0.m0 = false;
            }
        }
        return 1;
    }

    public static final int v(q q0, int v) {
        n n2;
        switch(q0.y0().ordinal()) {
            case 1: {
                q q1 = d.n(q0);
                if(q1 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                return d.t(q1, v);
            }
            case 0: 
            case 2: {
                return 1;
            }
            case 3: {
                n n0 = q0.X;
                if(n0.k0) {
                    n n1 = n0.c0;
                    LayoutNode layoutNode0 = f.v(q0);
                alab1:
                    while(true) {
                        n2 = null;
                        if(layoutNode0 == null) {
                            break;
                        }
                        if((((n)layoutNode0.u0.f).b0 & 0x400) != 0) {
                            while(n1 != null) {
                                if((n1.Z & 0x400) != 0) {
                                    n n3 = n1;
                                    W.d d0 = null;
                                    while(n3 != null) {
                                        if(n3 instanceof q) {
                                            n2 = n3;
                                            break alab1;
                                        }
                                        if((n3.Z & 0x400) != 0 && n3 instanceof F0.n) {
                                            n n4 = ((F0.n)n3).m0;
                                            int v1 = 0;
                                            while(n4 != null) {
                                                if((n4.Z & 0x400) != 0) {
                                                    ++v1;
                                                    if(v1 == 1) {
                                                        n3 = n4;
                                                    }
                                                    else {
                                                        if(d0 == null) {
                                                            d0 = new W.d(new n[16]);
                                                        }
                                                        if(n3 != null) {
                                                            d0.c(n3);
                                                            n3 = null;
                                                        }
                                                        d0.c(n4);
                                                    }
                                                }
                                                n4 = n4.d0;
                                            }
                                            if(v1 != 1) {
                                                n3 = f.f(d0);
                                            }
                                        }
                                        else {
                                            n3 = f.f(d0);
                                        }
                                    }
                                }
                                n1 = n1.c0;
                            }
                        }
                        layoutNode0 = layoutNode0.s();
                        if(layoutNode0 != null) {
                            W w0 = layoutNode0.u0;
                            if(w0 != null) {
                                n1 = (o0)w0.e;
                                continue;
                            }
                        }
                        n1 = null;
                    }
                    if(((q)n2) == null) {
                        return 1;
                    }
                    switch(((q)n2).y0().ordinal()) {
                        case 0: {
                            return d.u(((q)n2), v);
                        }
                        case 1: {
                            return d.v(((q)n2), v);
                        }
                        case 2: {
                            return 2;
                        }
                        case 3: {
                            int v2 = d.v(((q)n2), v);
                            int v3 = v2 == 1 ? 0 : v2;
                            return v3 == 0 ? d.u(((q)n2), v) : v3;
                        }
                        default: {
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                    }
                }
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static final boolean w(q q0) {
        n n2;
        boolean z = true;
        switch(q0.y0().ordinal()) {
            case 1: {
                q q1 = d.n(q0);
                if((q1 == null ? true : d.e(q1, false, true))) {
                    d.p(q0);
                    goto label_64;
                }
                z = false;
                goto label_64;
            }
            case 0: 
            case 2: {
            label_64:
                if(z) {
                    d.z(q0);
                }
                return z;
            }
            case 3: {
                n n0 = q0.X;
                if(!n0.k0) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                n n1 = n0.c0;
                LayoutNode layoutNode0 = f.v(q0);
            alab1:
                while(true) {
                    n2 = null;
                    if(layoutNode0 == null) {
                        break;
                    }
                    if((((n)layoutNode0.u0.f).b0 & 0x400) != 0) {
                        while(n1 != null) {
                            if((n1.Z & 0x400) != 0) {
                                n n3 = n1;
                                W.d d0 = null;
                                while(n3 != null) {
                                    if(n3 instanceof q) {
                                        n2 = n3;
                                        break alab1;
                                    }
                                    if((n3.Z & 0x400) != 0 && n3 instanceof F0.n) {
                                        n n4 = ((F0.n)n3).m0;
                                        int v = 0;
                                        while(n4 != null) {
                                            if((n4.Z & 0x400) != 0) {
                                                ++v;
                                                if(v == 1) {
                                                    n3 = n4;
                                                }
                                                else {
                                                    if(d0 == null) {
                                                        d0 = new W.d(new n[16]);
                                                    }
                                                    if(n3 != null) {
                                                        d0.c(n3);
                                                        n3 = null;
                                                    }
                                                    d0.c(n4);
                                                }
                                            }
                                            n4 = n4.d0;
                                        }
                                        if(v != 1) {
                                            n3 = f.f(d0);
                                        }
                                    }
                                    else {
                                        n3 = f.f(d0);
                                    }
                                }
                            }
                            n1 = n1.c0;
                        }
                    }
                    layoutNode0 = layoutNode0.s();
                    if(layoutNode0 != null) {
                        W w0 = layoutNode0.u0;
                        if(w0 != null) {
                            n1 = (o0)w0.e;
                            continue;
                        }
                    }
                    n1 = null;
                }
                if(((q)n2) != null) {
                    p p0 = ((q)n2).y0();
                    z = d.C(((q)n2), q0);
                    if(z && p0 != ((q)n2).y0()) {
                        d.z(((q)n2));
                    }
                }
                else if(f.w(q0).getFocusOwner().m()) {
                    d.p(q0);
                }
                else {
                    z = false;
                }
                goto label_64;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static final boolean x(q q0, m0 m00) {
        q[] arr_q = new q[16];
        n n0 = q0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        W.d d0 = new W.d(new n[16]);
        n n1 = n0.d0;
        if(n1 == null) {
            f.b(d0, n0);
        }
        else {
            d0.c(n1);
        }
        int v = 0;
        while(d0.n()) {
            n n2 = (n)d0.p(d0.Z - 1);
            if((n2.b0 & 0x400) == 0) {
                f.b(d0, n2);
            }
            else {
                while(n2 != null) {
                    if((n2.Z & 0x400) != 0) {
                        W.d d1 = null;
                        while(n2 != null) {
                            if(n2 instanceof q) {
                                if(arr_q.length < v + 1) {
                                    arr_q = Arrays.copyOf(arr_q, Math.max(v + 1, arr_q.length * 2));
                                    j.e(arr_q, "copyOf(this, newSize)");
                                }
                                arr_q[v] = (q)n2;
                                ++v;
                            }
                            else if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v1 = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            n2 = n3;
                                        }
                                        else {
                                            if(d1 == null) {
                                                d1 = new W.d(new n[16]);
                                            }
                                            if(n2 != null) {
                                                d1.c(n2);
                                                n2 = null;
                                            }
                                            d1.c(n3);
                                        }
                                    }
                                    n3 = n3.d0;
                                }
                                if(v1 != 1) {
                                    goto label_46;
                                }
                                continue;
                            }
                        label_46:
                            n2 = f.f(d1);
                        }
                        break;
                    }
                    n2 = n2.d0;
                }
            }
        }
        j.f(arr_q, "<this>");
        Arrays.sort(arr_q, 0, v, s.X);
        if(v > 0) {
            int v2 = v - 1;
            while(true) {
                q q1 = arr_q[v2];
                if(d.s(q1) && d.a(q1, m00)) {
                    return true;
                }
                --v2;
                if(v2 < 0) {
                    break;
                }
            }
        }
        return false;
    }

    public static final boolean y(q q0, m0 m00) {
        q[] arr_q = new q[16];
        n n0 = q0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        W.d d0 = new W.d(new n[16]);
        n n1 = n0.d0;
        if(n1 == null) {
            f.b(d0, n0);
        }
        else {
            d0.c(n1);
        }
        int v = 0;
        while(d0.n()) {
            n n2 = (n)d0.p(d0.Z - 1);
            if((n2.b0 & 0x400) == 0) {
                f.b(d0, n2);
            }
            else {
                while(n2 != null) {
                    if((n2.Z & 0x400) != 0) {
                        W.d d1 = null;
                        while(n2 != null) {
                            if(n2 instanceof q) {
                                if(arr_q.length < v + 1) {
                                    arr_q = Arrays.copyOf(arr_q, Math.max(v + 1, arr_q.length * 2));
                                    j.e(arr_q, "copyOf(this, newSize)");
                                }
                                arr_q[v] = (q)n2;
                                ++v;
                            }
                            else if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v1 = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            n2 = n3;
                                        }
                                        else {
                                            if(d1 == null) {
                                                d1 = new W.d(new n[16]);
                                            }
                                            if(n2 != null) {
                                                d1.c(n2);
                                                n2 = null;
                                            }
                                            d1.c(n3);
                                        }
                                    }
                                    n3 = n3.d0;
                                }
                                if(v1 != 1) {
                                    goto label_46;
                                }
                                continue;
                            }
                        label_46:
                            n2 = f.f(d1);
                        }
                        break;
                    }
                    n2 = n2.d0;
                }
            }
        }
        j.f(arr_q, "<this>");
        Arrays.sort(arr_q, 0, v, s.X);
        if(v > 0) {
            int v2 = 0;
            while(true) {
                q q1 = arr_q[v2];
                if(d.s(q1) && d.k(q1, m00)) {
                    return true;
                }
                ++v2;
                if(v2 >= v) {
                    break;
                }
            }
        }
        return false;
    }

    public static final void z(q q0) {
        n n0 = q0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        LayoutNode layoutNode0 = f.v(q0);
        n n1 = n0;
    label_4:
        while(layoutNode0 != null) {
            if((((n)layoutNode0.u0.f).b0 & 0x1400) != 0) {
                while(n1 != null) {
                    int v = n1.Z;
                    if((v & 0x1400) != 0) {
                        if(n1 != n0 && (v & 0x400) != 0) {
                            break label_4;
                        }
                        if((v & 0x1000) != 0) {
                            n n2 = n1;
                            W.d d0 = null;
                            while(n2 != null) {
                                if(n2 instanceof l0.c) {
                                    ((l0.c)n2).z(d.o(((l0.c)n2)));
                                }
                                else if((n2.Z & 0x1000) != 0 && n2 instanceof F0.n) {
                                    n n3 = ((F0.n)n2).m0;
                                    int v1 = 0;
                                    while(n3 != null) {
                                        if((n3.Z & 0x1000) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
                                                n2 = n3;
                                            }
                                            else {
                                                if(d0 == null) {
                                                    d0 = new W.d(new n[16]);
                                                }
                                                if(n2 != null) {
                                                    d0.c(n2);
                                                    n2 = null;
                                                }
                                                d0.c(n3);
                                            }
                                        }
                                        n3 = n3.d0;
                                    }
                                    if(v1 != 1) {
                                        goto label_35;
                                    }
                                    continue;
                                }
                            label_35:
                                n2 = f.f(d0);
                            }
                        }
                    }
                    n1 = n1.c0;
                }
            }
            layoutNode0 = layoutNode0.s();
            if(layoutNode0 != null) {
                W w0 = layoutNode0.u0;
                if(w0 != null) {
                    n1 = (o0)w0.e;
                    continue;
                }
            }
            n1 = null;
        }
    }
}

