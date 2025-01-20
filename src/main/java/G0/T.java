package G0;

import B.M;
import B3.c;
import Bb.z;
import D0.b0;
import F0.c0;
import I2.J;
import J1.b;
import J2.w;
import K9.x;
import M0.a;
import M0.f;
import M0.g;
import M0.h;
import M0.i;
import M0.j;
import M0.o;
import M0.q;
import M0.r;
import O0.L;
import O0.P;
import O0.Q;
import O0.p;
import T0.s;
import Z0.n;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan.VerbatimBuilder;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.chip.Chip;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.e;
import n0.v;
import s.K;
import s.y;
import yc.l;

public final class t extends c {
    public final int Z;
    public final b b0;

    public t(b b0, int v) {
        this.Z = v;
        this.b0 = b0;
        super(11);
    }

    @Override  // B3.c
    public final boolean A(int v, int v1, Bundle bundle0) {
        int v13;
        int v12;
        G0.b b1;
        G0.b b4;
        long v7;
        a a2;
        a a1;
        a a0;
        Float float0;
        float f4;
        float f3;
        Boolean boolean0;
        b b0 = this.b0;
        boolean z = false;
        if(this.Z != 0) {
            Chip chip0 = ((Q1.a)b0).i;
            if(v != -1) {
                switch(v1) {
                    case 1: {
                        return ((Q1.a)b0).q(v);
                    }
                    case 2: {
                        return ((Q1.a)b0).j(v);
                    }
                    case 16: {
                        Chip chip1 = ((x6.b)(((Q1.a)b0))).q;
                        if(v == 0) {
                            return chip1.performClick();
                        }
                        if(v == 1) {
                            chip1.playSoundEffect(0);
                            View.OnClickListener view$OnClickListener0 = chip1.i0;
                            if(view$OnClickListener0 != null) {
                                view$OnClickListener0.onClick(chip1);
                                z = true;
                            }
                            chip1.r0.r(1, 1);
                            return z;
                        }
                        break;
                    }
                    case 0x40: {
                        AccessibilityManager accessibilityManager0 = ((Q1.a)b0).h;
                        if(accessibilityManager0.isEnabled() && accessibilityManager0.isTouchExplorationEnabled()) {
                            int v2 = ((Q1.a)b0).k;
                            if(v2 != v) {
                                if(v2 != 0x80000000) {
                                    ((Q1.a)b0).k = 0x80000000;
                                    ((Q1.a)b0).i.invalidate();
                                    ((Q1.a)b0).r(v2, 0x10000);
                                }
                                ((Q1.a)b0).k = v;
                                chip0.invalidate();
                                ((Q1.a)b0).r(v, 0x8000);
                                return true;
                            }
                        }
                        break;
                    }
                    case 0x80: {
                        if(((Q1.a)b0).k == v) {
                            ((Q1.a)b0).k = 0x80000000;
                            chip0.invalidate();
                            ((Q1.a)b0).r(v, 0x10000);
                            return true;
                        }
                        break;
                    }
                    default: {
                        return false;
                    }
                }
                return false;
            }
            return chip0.performAccessibilityAction(v1, bundle0);
        }
        J0 j00 = (J0)((androidx.compose.ui.platform.b)b0).t().f(v);
        if(j00 != null) {
            o o0 = j00.a;
            if(o0 != null) {
                Object object0 = null;
                AndroidComposeView androidComposeView0 = ((androidx.compose.ui.platform.b)b0).d;
                switch(v1) {
                    case 0x40: {
                        AccessibilityManager accessibilityManager1 = ((androidx.compose.ui.platform.b)b0).g;
                        if(accessibilityManager1.isEnabled() && accessibilityManager1.isTouchExplorationEnabled()) {
                            int v14 = ((androidx.compose.ui.platform.b)b0).n;
                            if(v14 != v) {
                                if(v14 != 0x80000000) {
                                    androidx.compose.ui.platform.b.I(((androidx.compose.ui.platform.b)b0), v14, 0x10000, null, 12);
                                }
                                ((androidx.compose.ui.platform.b)b0).n = v;
                                androidComposeView0.invalidate();
                                androidx.compose.ui.platform.b.I(((androidx.compose.ui.platform.b)b0), v, 0x8000, null, 12);
                                return true;
                            }
                        }
                        break;
                    }
                    case 0x80: {
                        if(((androidx.compose.ui.platform.b)b0).n == v) {
                            ((androidx.compose.ui.platform.b)b0).n = 0x80000000;
                            ((androidx.compose.ui.platform.b)b0).o = null;
                            androidComposeView0.invalidate();
                            androidx.compose.ui.platform.b.I(((androidx.compose.ui.platform.b)b0), v, 0x10000, null, 12);
                            return true;
                        }
                        break;
                    }
                    default: {
                        j j0 = o0.d;
                        int v3 = o0.g;
                        LinkedHashMap linkedHashMap0 = j0.X;
                        if(v1 != 0x100 && v1 != 0x200) {
                            switch(v1) {
                                case 0x4000: {
                                    Object object34 = linkedHashMap0.get(i.o);
                                    Object object35 = object34 == null ? null : object34;
                                    if(((a)object35) == null) {
                                        return false;
                                    }
                                    Function0 function015 = (Function0)((a)object35).b;
                                    return function015 == null ? false : ((Boolean)function015.invoke()).booleanValue();
                                }
                                case 0x20000: {
                                    boolean z1 = ((androidx.compose.ui.platform.b)b0).O(o0, (bundle0 == null ? -1 : bundle0.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1)), (bundle0 == null ? -1 : bundle0.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1)), false);
                                    if(z1) {
                                        androidx.compose.ui.platform.b.I(((androidx.compose.ui.platform.b)b0), ((androidx.compose.ui.platform.b)b0).E(v3), 0, null, 12);
                                    }
                                    return z1;
                                label_56:
                                    if(G.a(o0)) {
                                        switch(v1) {
                                            case 1: {
                                                Object object31 = linkedHashMap0.get(i.u);
                                                Object object32 = object31 == null ? null : object31;
                                                if(((a)object32) == null) {
                                                    return false;
                                                }
                                                Function0 function014 = (Function0)((a)object32).b;
                                                return function014 == null ? false : ((Boolean)function014.invoke()).booleanValue();
                                            }
                                            case 2: {
                                                Object object33 = linkedHashMap0.get(q.k);
                                                if(!Nb.j.a((object33 == null ? null : object33), Boolean.TRUE)) {
                                                    return false;
                                                }
                                                androidComposeView0.getFocusOwner().e(8, false, true);
                                                return true;
                                            }
                                            default: {
                                                float f = 0.0f;
                                                switch(v1) {
                                                    case 16: {
                                                        Object object1 = linkedHashMap0.get(i.b);
                                                        if(object1 == null) {
                                                            object1 = null;
                                                        }
                                                        if(((a)object1) == null) {
                                                            boolean0 = null;
                                                        }
                                                        else {
                                                            Function0 function00 = (Function0)((a)object1).b;
                                                            boolean0 = function00 == null ? null : ((Boolean)function00.invoke());
                                                        }
                                                        androidx.compose.ui.platform.b.I(((androidx.compose.ui.platform.b)b0), v, 1, null, 12);
                                                        return boolean0 == null ? false : boolean0.booleanValue();
                                                    label_74:
                                                        if(v1 == 0x1020038 || v1 == 0x1020039 || v1 == 0x102003A || v1 == 0x102003B) {
                                                            goto label_113;
                                                        }
                                                        else {
                                                            switch(v1) {
                                                                case 0x1020046: {
                                                                    Object object3 = linkedHashMap0.get(i.w);
                                                                    if(object3 != null) {
                                                                        object0 = object3;
                                                                    }
                                                                    if(((a)object0) != null) {
                                                                        Function0 function01 = (Function0)((a)object0).b;
                                                                        return function01 == null ? false : ((Boolean)function01.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                }
                                                                case 0x1020047: {
                                                                    Object object4 = linkedHashMap0.get(i.y);
                                                                    if(object4 != null) {
                                                                        object0 = object4;
                                                                    }
                                                                    if(((a)object0) != null) {
                                                                        Function0 function02 = (Function0)((a)object0).b;
                                                                        return function02 == null ? false : ((Boolean)function02.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                }
                                                                case 0x1020048: {
                                                                    Object object5 = linkedHashMap0.get(i.x);
                                                                    if(object5 != null) {
                                                                        object0 = object5;
                                                                    }
                                                                    if(((a)object0) != null) {
                                                                        Function0 function03 = (Function0)((a)object0).b;
                                                                        return function03 == null ? false : ((Boolean)function03.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                }
                                                                case 0x1020049: {
                                                                    Object object6 = linkedHashMap0.get(i.z);
                                                                    if(object6 != null) {
                                                                        object0 = object6;
                                                                    }
                                                                    if(((a)object0) != null) {
                                                                        Function0 function04 = (Function0)((a)object0).b;
                                                                        return function04 == null ? false : ((Boolean)function04.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                }
                                                                default: {
                                                                    K k0 = (K)((androidx.compose.ui.platform.b)b0).s.d(v);
                                                                    if(k0 != null && ((CharSequence)k0.d(v1)) != null) {
                                                                        Object object2 = linkedHashMap0.get(i.v);
                                                                        if(object2 != null) {
                                                                            object0 = object2;
                                                                        }
                                                                        if(((List)object0) != null && ((List)object0).size() > 0) {
                                                                            ((List)object0).get(0).getClass();
                                                                            throw new ClassCastException();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 0x20: {
                                                        Object object7 = linkedHashMap0.get(i.c);
                                                        Object object8 = object7 == null ? null : object7;
                                                        if(((a)object8) == null) {
                                                            return false;
                                                        }
                                                        Function0 function05 = (Function0)((a)object8).b;
                                                        return function05 == null ? false : ((Boolean)function05.invoke()).booleanValue();
                                                    }
                                                    case 0x1000: 
                                                    case 0x2000: {
                                                    label_113:
                                                        if(v1 == 0x1000 || v1 == 0x2000) {
                                                            Object object9 = linkedHashMap0.get(q.c);
                                                            if(object9 == null) {
                                                                object9 = null;
                                                            }
                                                            Object object10 = linkedHashMap0.get(i.g);
                                                            if(object10 == null) {
                                                                object10 = null;
                                                            }
                                                            if(((f)object9) != null && ((a)object10) != null) {
                                                                float f1 = J.m(((f)object9).b.b, ((f)object9).b.a);
                                                                float f2 = J.o(((f)object9).b.a, ((f)object9).b.b);
                                                                int v4 = ((f)object9).c;
                                                                if(v4 > 0) {
                                                                    f3 = f1 - f2;
                                                                    f4 = (float)(v4 + 1);
                                                                }
                                                                else {
                                                                    f3 = f1 - f2;
                                                                    f4 = 20.0f;
                                                                }
                                                                float f5 = f3 / f4;
                                                                if(v1 == 0x2000) {
                                                                    f5 = -f5;
                                                                }
                                                                Function1 function10 = (Function1)((a)object10).b;
                                                                return function10 == null ? false : ((Boolean)function10.n(((float)(((f)object9).a + f5)))).booleanValue();
                                                            }
                                                        }
                                                        m0.c c0 = b0.e(((F0.t)o0.c.u0.c));
                                                        long v5 = w.m(c0.d(), c0.c());
                                                        ArrayList arrayList0 = new ArrayList();
                                                        Object object11 = linkedHashMap0.get(i.A);
                                                        if(object11 == null) {
                                                            object11 = null;
                                                        }
                                                        if(((a)object11) == null) {
                                                            float0 = null;
                                                        }
                                                        else {
                                                            Function1 function11 = (Function1)((a)object11).b;
                                                            float0 = function11 == null || !((Boolean)function11.n(arrayList0)).booleanValue() ? null : ((Float)arrayList0.get(0));
                                                        }
                                                        Object object12 = linkedHashMap0.get(i.d);
                                                        if(object12 == null) {
                                                            object12 = null;
                                                        }
                                                        if(((a)object12) != null) {
                                                            Object object13 = linkedHashMap0.get(q.o);
                                                            if(object13 == null) {
                                                                object13 = null;
                                                            }
                                                            Ab.c c1 = ((a)object12).b;
                                                            if(((h)object13) != null && (v1 == 0x1020039 || v1 == 0x102003B || v1 == 0x1000 || v1 == 0x2000)) {
                                                                float f6 = float0 == null ? e.d(v5) : ((float)float0);
                                                                if(v1 == 0x1020039 || v1 == 0x2000) {
                                                                    f6 = -f6;
                                                                }
                                                                if(((h)object13).c) {
                                                                    f6 = -f6;
                                                                }
                                                                if(G.b(o0) && (v1 == 0x1020039 || v1 == 0x102003B)) {
                                                                    f6 = -f6;
                                                                }
                                                                if(androidx.compose.ui.platform.b.B(((h)object13), f6)) {
                                                                    M0.t t0 = i.x;
                                                                    if(!linkedHashMap0.containsKey(t0) && !linkedHashMap0.containsKey(i.z)) {
                                                                        return ((Function2)c1) == null ? false : ((Boolean)((Function2)c1).j(f6, 0.0f)).booleanValue();
                                                                    }
                                                                    if(f6 > 0.0f) {
                                                                        Object object14 = linkedHashMap0.get(i.z);
                                                                        a0 = (a)(object14 == null ? null : object14);
                                                                    }
                                                                    else {
                                                                        Object object15 = linkedHashMap0.get(t0);
                                                                        a0 = (a)(object15 == null ? null : object15);
                                                                    }
                                                                    if(a0 == null) {
                                                                        return false;
                                                                    }
                                                                    Function0 function06 = (Function0)a0.b;
                                                                    return function06 == null ? false : ((Boolean)function06.invoke()).booleanValue();
                                                                }
                                                            }
                                                            Object object16 = linkedHashMap0.get(q.p);
                                                            if(object16 == null) {
                                                                object16 = null;
                                                            }
                                                            if(((h)object16) == null || v1 != 0x1020038 && v1 != 0x102003A && v1 != 0x1000 && v1 != 0x2000) {
                                                                return false;
                                                            }
                                                            float f7 = float0 == null ? e.b(v5) : ((float)float0);
                                                            if(v1 == 0x1020038 || v1 == 0x2000) {
                                                                f7 = -f7;
                                                            }
                                                            if(((h)object16).c) {
                                                                f7 = -f7;
                                                            }
                                                            if(!androidx.compose.ui.platform.b.B(((h)object16), f7)) {
                                                                return false;
                                                            }
                                                            M0.t t1 = i.w;
                                                            if(!linkedHashMap0.containsKey(t1) && !linkedHashMap0.containsKey(i.y)) {
                                                                return ((Function2)c1) == null ? false : ((Boolean)((Function2)c1).j(0.0f, f7)).booleanValue();
                                                            }
                                                            if(f7 > 0.0f) {
                                                                Object object17 = linkedHashMap0.get(i.y);
                                                                a1 = (a)(object17 == null ? null : object17);
                                                            }
                                                            else {
                                                                Object object18 = linkedHashMap0.get(t1);
                                                                a1 = (a)(object18 == null ? null : object18);
                                                            }
                                                            if(a1 == null) {
                                                                return false;
                                                            }
                                                            Function0 function07 = (Function0)a1.b;
                                                            return function07 == null ? false : ((Boolean)function07.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    }
                                                    case 0x8000: {
                                                        Object object19 = linkedHashMap0.get(i.q);
                                                        if(object19 != null) {
                                                            object0 = object19;
                                                        }
                                                        if(((a)object0) != null) {
                                                            Function0 function08 = (Function0)((a)object0).b;
                                                            return function08 == null ? false : ((Boolean)function08.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    }
                                                    case 0x10000: {
                                                        Object object20 = linkedHashMap0.get(i.p);
                                                        if(object20 != null) {
                                                            object0 = object20;
                                                        }
                                                        if(((a)object0) != null) {
                                                            Function0 function09 = (Function0)((a)object0).b;
                                                            return function09 == null ? false : ((Boolean)function09.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    }
                                                    case 0x40000: {
                                                        Object object21 = linkedHashMap0.get(i.r);
                                                        if(object21 != null) {
                                                            object0 = object21;
                                                        }
                                                        if(((a)object0) != null) {
                                                            Function0 function010 = (Function0)((a)object0).b;
                                                            return function010 == null ? false : ((Boolean)function010.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    }
                                                    case 0x80000: {
                                                        Object object22 = linkedHashMap0.get(i.s);
                                                        if(object22 != null) {
                                                            object0 = object22;
                                                        }
                                                        if(((a)object0) != null) {
                                                            Function0 function011 = (Function0)((a)object0).b;
                                                            return function011 == null ? false : ((Boolean)function011.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    }
                                                    case 0x100000: {
                                                        Object object23 = linkedHashMap0.get(i.t);
                                                        if(object23 != null) {
                                                            object0 = object23;
                                                        }
                                                        if(((a)object0) != null) {
                                                            Function0 function012 = (Function0)((a)object0).b;
                                                            return function012 == null ? false : ((Boolean)function012.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    }
                                                    case 0x200000: {
                                                        String s = bundle0 == null ? null : bundle0.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                                        Object object24 = linkedHashMap0.get(i.i);
                                                        if(object24 == null) {
                                                            object24 = null;
                                                        }
                                                        if(((a)object24) != null) {
                                                            Function1 function12 = (Function1)((a)object24).b;
                                                            if(function12 != null) {
                                                                if(s == null) {
                                                                    s = "";
                                                                }
                                                                return ((Boolean)function12.n(new O0.f(6, s, null))).booleanValue();
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 0x1020036: {
                                                        o o1 = o0.j();
                                                        if(o1 != null) {
                                                            Object object25 = o1.d.X.get(i.d);
                                                            if(object25 == null) {
                                                                object25 = null;
                                                            }
                                                            a2 = (a)object25;
                                                            goto label_248;
                                                        }
                                                        while(true) {
                                                            a2 = null;
                                                        label_248:
                                                            if(o1 == null || a2 != null) {
                                                                break;
                                                            }
                                                            o1 = o1.j();
                                                            if(o1 == null) {
                                                                continue;
                                                            }
                                                            Object object26 = o1.d.X.get(i.d);
                                                            if(object26 == null) {
                                                                object26 = null;
                                                            }
                                                            a2 = (a)object26;
                                                            goto label_248;
                                                        }
                                                        if(o1 != null) {
                                                            m0.c c2 = b0.e(((F0.t)o1.c.u0.c));
                                                            LayoutCoordinates layoutCoordinates0 = ((F0.t)o1.c.u0.c).h();
                                                            long v6 = 0L;
                                                            m0.c c3 = c2.i((layoutCoordinates0 == null ? 0L : ((c0)layoutCoordinates0).F(0L)));
                                                            c0 c00 = o0.c();
                                                            if(c00 == null) {
                                                                v7 = 0L;
                                                            }
                                                            else {
                                                                if(!c00.G0().k0) {
                                                                    c00 = null;
                                                                }
                                                                v7 = c00 == null ? 0L : c00.F(0L);
                                                            }
                                                            c0 c01 = o0.c();
                                                            if(c01 != null) {
                                                                v6 = c01.Z;
                                                            }
                                                            m0.c c4 = l.g(v7, io.sentry.config.a.a0(v6));
                                                            LinkedHashMap linkedHashMap1 = o1.d.X;
                                                            Object object27 = linkedHashMap1.get(q.o);
                                                            if(object27 == null) {
                                                                object27 = null;
                                                            }
                                                            Object object28 = linkedHashMap1.get(q.p);
                                                            if(object28 != null) {
                                                                object0 = object28;
                                                            }
                                                            float f8 = c4.a - c3.a;
                                                            float f9 = c4.c - c3.c;
                                                            if(Math.signum(f8) != Math.signum(f9)) {
                                                                f8 = 0.0f;
                                                            }
                                                            else if(Math.abs(f8) >= Math.abs(f9)) {
                                                                f8 = f9;
                                                            }
                                                            if(((h)object27) != null && ((h)object27).c) {
                                                                f8 = -f8;
                                                            }
                                                            if(G.b(o0)) {
                                                                f8 = -f8;
                                                            }
                                                            float f10 = c4.b - c3.b;
                                                            float f11 = c4.d - c3.d;
                                                            if(Math.signum(f10) == Math.signum(f11)) {
                                                                f = Math.abs(f10) < Math.abs(f11) ? f10 : f11;
                                                            }
                                                            if(((h)object0) != null && ((h)object0).c) {
                                                                f = -f;
                                                            }
                                                            if(a2 != null) {
                                                                Function2 function20 = (Function2)a2.b;
                                                                return function20 == null ? false : ((Boolean)function20.j(f8, f)).booleanValue();
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 0x102003D: {
                                                        if(bundle0 != null && bundle0.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                            Object object29 = linkedHashMap0.get(i.g);
                                                            if(object29 != null) {
                                                                object0 = object29;
                                                            }
                                                            if(((a)object0) != null) {
                                                                Function1 function13 = (Function1)((a)object0).b;
                                                                return function13 == null ? false : ((Boolean)function13.n(bundle0.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))).booleanValue();
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 0x1020054: {
                                                        Object object30 = linkedHashMap0.get(i.n);
                                                        if(object30 != null) {
                                                            object0 = object30;
                                                        }
                                                        if(((a)object0) != null) {
                                                            Function0 function013 = (Function0)((a)object0).b;
                                                            return function013 == null ? false : ((Boolean)function013.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    }
                                                    default: {
                                                        goto label_74;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return false;
                                }
                                default: {
                                    goto label_56;
                                }
                            }
                        }
                        if(bundle0 != null) {
                            int v8 = bundle0.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                            boolean z2 = bundle0.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                            Integer integer0 = ((androidx.compose.ui.platform.b)b0).v;
                            if(integer0 == null || v3 != ((int)integer0)) {
                                ((androidx.compose.ui.platform.b)b0).u = -1;
                                ((androidx.compose.ui.platform.b)b0).v = v3;
                            }
                            String s1 = androidx.compose.ui.platform.b.x(o0);
                            if(s1 != null && s1.length() != 0) {
                                String s2 = androidx.compose.ui.platform.b.x(o0);
                                if(s2 == null || s2.length() == 0) {
                                    b1 = null;
                                }
                                else {
                                    switch(v8) {
                                        case 1: {
                                            Locale locale0 = androidComposeView0.getContext().getResources().getConfiguration().locale;
                                            if(G0.b.e == null) {
                                                G0.b b2 = new G0.b(0);
                                                b2.d = BreakIterator.getCharacterInstance(locale0);
                                                G0.b.e = b2;
                                            }
                                            b1 = G0.b.e;
                                            Nb.j.d(b1, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                            b1.B(s2);
                                            break;
                                        }
                                        case 2: {
                                            Locale locale1 = androidComposeView0.getContext().getResources().getConfiguration().locale;
                                            if(G0.b.f == null) {
                                                G0.b b3 = new G0.b(1);
                                                b3.d = BreakIterator.getWordInstance(locale1);
                                                G0.b.f = b3;
                                            }
                                            b1 = G0.b.f;
                                            Nb.j.d(b1, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                            b1.B(s2);
                                            break;
                                        }
                                        case 8: {
                                            if(d.c == null) {
                                                d.c = new d();  // initializer: LG0/a;-><init>()V
                                            }
                                            b1 = d.c;
                                            Nb.j.d(b1, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                            b1.a = s2;
                                            break;
                                        }
                                        case 4: 
                                        case 16: {
                                            if(linkedHashMap0.containsKey(i.a)) {
                                                L l0 = G.h(j0);
                                                if(l0 == null) {
                                                    b1 = null;
                                                }
                                                else {
                                                    if(v8 == 4) {
                                                        if(G0.b.g == null) {
                                                            G0.b.g = new G0.b(2);
                                                        }
                                                        b4 = G0.b.g;
                                                        Nb.j.d(b4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                                        b4.a = s2;
                                                        b4.d = l0;
                                                    }
                                                    else {
                                                        if(G0.c.e == null) {
                                                            G0.c c5 = new G0.c();  // initializer: LG0/a;-><init>()V
                                                            new Rect();
                                                            G0.c.e = c5;
                                                        }
                                                        b4 = G0.c.e;
                                                        Nb.j.d(b4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                                        b4.a = s2;
                                                        b4.c = l0;
                                                        b4.d = o0;
                                                    }
                                                    b1 = b4;
                                                }
                                            }
                                            else {
                                                b1 = null;
                                            }
                                            break;
                                        }
                                        default: {
                                            b1 = null;
                                        }
                                    }
                                }
                                if(b1 != null) {
                                    int v9 = ((androidx.compose.ui.platform.b)b0).r(o0);
                                    if(v9 == -1) {
                                        v9 = v1 == 0x100 ? s1.length() : 0;
                                    }
                                    int[] arr_v = v1 == 0x100 ? b1.o(v9) : b1.f(v9);
                                    if(arr_v != null) {
                                        int v10 = arr_v[0];
                                        int v11 = arr_v[1];
                                        if(!z2 || linkedHashMap0.containsKey(q.a) || !linkedHashMap0.containsKey(q.x)) {
                                            v12 = v1 == 0x100 ? v10 : v11;
                                            v13 = v12;
                                        }
                                        else {
                                            v12 = ((androidx.compose.ui.platform.b)b0).s(o0);
                                            if(v12 == -1) {
                                                v12 = v1 == 0x100 ? v11 : v10;
                                            }
                                            v13 = v1 == 0x100 ? v11 : v10;
                                        }
                                        ((androidx.compose.ui.platform.b)b0).z = new M(o0, (v1 == 0x100 ? 0x200 : 0x100), v8, v10, v11, SystemClock.uptimeMillis());
                                        ((androidx.compose.ui.platform.b)b0).O(o0, v12, v13, true);
                                        return true;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override  // B3.c
    public void g(int v, K1.d d0, String s, Bundle bundle0) {
        if(this.Z != 0) {
            return;
        }
        ((androidx.compose.ui.platform.b)this.b0).j(v, d0, s, bundle0);
    }

    @Override  // B3.c
    public final K1.d h(int v) {
        K1.d d8;
        AndroidComposeView androidComposeView2;
        int v35;
        boolean z12;
        boolean z11;
        boolean z8;
        boolean z7;
        LayoutNode layoutNode0;
        G0.j j4;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        K1.d d7;
        CharSequence charSequence0;
        R2.w w1;
        ArrayList arrayList1;
        z z3;
        z z2;
        ArrayList arrayList0;
        j j2;
        o o4;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AndroidComposeView androidComposeView1;
        AccessibilityNodeInfo accessibilityNodeInfo1;
        State lifecycle$State0;
        b b0 = this.b0;
        if(this.Z != 0) {
            return new K1.d(AccessibilityNodeInfo.obtain(((Q1.a)b0).o(v).a));
        }
        AndroidComposeView androidComposeView0 = ((androidx.compose.ui.platform.b)b0).d;
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = androidComposeView0.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 == null) {
            lifecycle$State0 = null;
        }
        else {
            Lifecycle lifecycle0 = androidComposeView$ViewTreeOwners0.a.a();
            lifecycle$State0 = lifecycle0 == null ? null : lifecycle0.b();
        }
        if(lifecycle$State0 == State.X) {
            v35 = v;
            d8 = null;
        }
        else {
            AccessibilityNodeInfo accessibilityNodeInfo0 = AccessibilityNodeInfo.obtain();
            K1.d d0 = new K1.d(accessibilityNodeInfo0);
            J0 j00 = (J0)((androidx.compose.ui.platform.b)b0).t().f(v);
            if(j00 == null) {
                v35 = v;
                d8 = null;
            }
            else {
                o o0 = j00.a;
                if(v == -1) {
                    ViewParent viewParent0 = androidComposeView0.getParentForAccessibility();
                    d0.b = -1;
                    accessibilityNodeInfo0.setParent((viewParent0 instanceof View ? ((View)viewParent0) : null));
                    goto label_32;
                }
                else {
                    o o1 = o0.j();
                    Integer integer0 = o1 == null ? null : ((int)o1.g);
                    if(integer0 != null) {
                        int v1 = integer0.intValue();
                        if(v1 == androidComposeView0.getSemanticsOwner().a().g) {
                            v1 = -1;
                        }
                        d0.b = v1;
                        accessibilityNodeInfo0.setParent(androidComposeView0, v1);
                    label_32:
                        d0.c = v;
                        accessibilityNodeInfo0.setSource(androidComposeView0, v);
                        accessibilityNodeInfo0.setBoundsInScreen(((androidx.compose.ui.platform.b)b0).k(j00));
                        d0.i("android.view.View");
                        if(o0.d.X.containsKey(q.x)) {
                            d0.i("android.widget.EditText");
                        }
                        j j0 = o0.d;
                        LinkedHashMap linkedHashMap0 = j0.X;
                        if(linkedHashMap0.containsKey(q.u)) {
                            d0.i("android.widget.TextView");
                        }
                        Object object0 = linkedHashMap0.get(q.s);
                        if(object0 == null) {
                            object0 = null;
                        }
                        if(((g)object0) != null && (o0.e || o.h(o0, true, 4).isEmpty())) {
                            int v2 = ((g)object0).a;
                            if(v2 == 4) {
                                accessibilityNodeInfo0.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "Tab");
                            }
                            else if(v2 == 2) {
                                accessibilityNodeInfo0.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "Switch");
                            }
                            else {
                                String s = G.q(v2);
                                if(v2 == 5 || o0.m() || j0.Y) {
                                    d0.i(s);
                                }
                            }
                        }
                        accessibilityNodeInfo0.setPackageName("com.wave.personal");
                        boolean z = G.j(o0);
                        if(Build.VERSION.SDK_INT >= 24) {
                            accessibilityNodeInfo0.setImportantForAccessibility(z);
                        }
                        List list0 = o.h(o0, true, 4);
                        int v3 = list0.size();
                        for(int v4 = 0; true; ++v4) {
                            accessibilityNodeInfo1 = d0.a;
                            if(v4 >= v3) {
                                break;
                            }
                            o o2 = (o)list0.get(v4);
                            if(((androidx.compose.ui.platform.b)b0).t().b(o2.g)) {
                                d1.h h0 = (d1.h)androidComposeView0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(o2.c);
                                int v5 = o2.g;
                                if(v5 != -1) {
                                    if(h0 == null) {
                                        accessibilityNodeInfo1.addChild(androidComposeView0, v5);
                                    }
                                    else {
                                        accessibilityNodeInfo0.addChild(h0);
                                    }
                                }
                            }
                        }
                        if(v == ((androidx.compose.ui.platform.b)b0).n) {
                            accessibilityNodeInfo1.setAccessibilityFocused(true);
                            d0.b(K1.c.g);
                        }
                        else {
                            accessibilityNodeInfo1.setAccessibilityFocused(false);
                            d0.b(K1.c.f);
                        }
                        O0.f f0 = androidx.compose.ui.platform.b.w(o0);
                        if(f0 == null) {
                            androidComposeView1 = androidComposeView0;
                            accessibilityNodeInfo2 = accessibilityNodeInfo0;
                            o4 = o0;
                            j2 = j0;
                            d7 = d0;
                            charSequence0 = null;
                        }
                        else {
                            androidComposeView0.getFontFamilyResolver();
                            Density density0 = androidComposeView0.getDensity();
                            String s1 = f0.X;
                            SpannableString spannableString0 = new SpannableString(s1);
                            List list1 = f0.Y;
                            if(list1 != null) {
                                int v6 = list1.size();
                                int v7 = 0;
                                while(v7 < v6) {
                                    Object object1 = list1.get(v7);
                                    O0.G g0 = (O0.G)((O0.d)object1).a;
                                    long v8 = g0.a.b();
                                    n n0 = g0.a;
                                    if(!v.c(v8, n0.b())) {
                                        n0 = v8 == 16L ? Z0.l.a : new Z0.c(v8);
                                    }
                                    long v9 = n0.b();
                                    int v10 = ((O0.d)object1).b;
                                    int v11 = ((O0.d)object1).c;
                                    Pb.a.J(spannableString0, v9, v10, v11);
                                    Pb.a.K(spannableString0, g0.b, density0, v10, v11);
                                    T0.w w0 = g0.c;
                                    s s2 = g0.d;
                                    if(w0 != null || s2 != null) {
                                        if(w0 == null) {
                                            w0 = T0.w.k0;
                                        }
                                        spannableString0.setSpan(new StyleSpan(w.E(w0, (s2 == null ? 0 : s2.a))), v10, v11, 33);
                                    }
                                    Z0.j j1 = g0.m;
                                    if(j1 != null) {
                                        int v12 = j1.a;
                                        if((v12 | 1) == v12) {
                                            spannableString0.setSpan(new UnderlineSpan(), v10, v11, 33);
                                        }
                                        if((v12 | 2) == v12) {
                                            spannableString0.setSpan(new StrikethroughSpan(), v10, v11, 33);
                                        }
                                    }
                                    Z0.o o3 = g0.j;
                                    if(o3 != null) {
                                        spannableString0.setSpan(new ScaleXSpan(o3.a), v10, v11, 33);
                                    }
                                    Pb.a.L(spannableString0, g0.k, v10, v11);
                                    long v13 = g0.l;
                                    if(v13 != 16L) {
                                        spannableString0.setSpan(new BackgroundColorSpan(n0.M.G(v13)), v10, v11, 33);
                                    }
                                    ++v7;
                                    v6 = v6;
                                    list1 = list1;
                                    androidComposeView0 = androidComposeView0;
                                    o0 = o0;
                                    j0 = j0;
                                    accessibilityNodeInfo0 = accessibilityNodeInfo0;
                                    d0 = d0;
                                }
                            }
                            androidComposeView1 = androidComposeView0;
                            accessibilityNodeInfo2 = accessibilityNodeInfo0;
                            o4 = o0;
                            j2 = j0;
                            int v14 = s1.length();
                            z z1 = z.X;
                            List list2 = f0.b0;
                            if(list2 == null) {
                                z3 = z1;
                                arrayList0 = z3;
                            }
                            else {
                                arrayList0 = new ArrayList(list2.size());
                                int v15 = list2.size();
                                int v16 = 0;
                                while(v16 < v15) {
                                    Object object2 = list2.get(v16);
                                    O0.d d1 = (O0.d)object2;
                                    if(d1.a instanceof Q) {
                                        z2 = z1;
                                        if(O0.g.c(0, v14, d1.b, d1.c)) {
                                            arrayList0.add(object2);
                                        }
                                    }
                                    else {
                                        z2 = z1;
                                    }
                                    ++v16;
                                    z1 = z2;
                                }
                                z3 = z1;
                            }
                            int v17 = arrayList0.size();
                            for(int v18 = 0; v18 < v17; ++v18) {
                                O0.d d2 = (O0.d)arrayList0.get(v18);
                                Q q0 = (Q)d2.a;
                                if(!(q0 instanceof Q)) {
                                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                }
                                spannableString0.setSpan(new TtsSpan.VerbatimBuilder(q0.a).build(), d2.b, d2.c, 33);
                            }
                            int v19 = s1.length();
                            if(list2 == null) {
                                arrayList1 = z3;
                            }
                            else {
                                arrayList1 = new ArrayList(list2.size());
                                int v20 = list2.size();
                                for(int v21 = 0; v21 < v20; ++v21) {
                                    Object object3 = list2.get(v21);
                                    O0.d d3 = (O0.d)object3;
                                    if(d3.a instanceof P && O0.g.c(0, v19, d3.b, d3.c)) {
                                        arrayList1.add(object3);
                                    }
                                }
                            }
                            int v22 = arrayList1.size();
                            for(int v23 = 0; true; ++v23) {
                                w1 = ((androidx.compose.ui.platform.b)b0).G;
                                if(v23 >= v22) {
                                    break;
                                }
                                O0.d d4 = (O0.d)arrayList1.get(v23);
                                P p0 = (P)d4.a;
                                WeakHashMap weakHashMap0 = (WeakHashMap)w1.Y;
                                Object object4 = weakHashMap0.get(p0);
                                if(object4 == null) {
                                    object4 = new URLSpan(p0.a);
                                    weakHashMap0.put(p0, object4);
                                }
                                spannableString0.setSpan(((URLSpan)object4), d4.b, d4.c, 33);
                            }
                            List list3 = f0.a(0, s1.length());
                            int v24 = list3.size();
                            for(int v25 = 0; v25 < v24; ++v25) {
                                O0.d d5 = (O0.d)list3.get(v25);
                                int v26 = d5.b;
                                int v27 = d5.c;
                                if(v26 != v27) {
                                    Object object5 = d5.a;
                                    O0.q q1 = (O0.q)object5;
                                    if(q1 instanceof p) {
                                        q1.getClass();
                                        Nb.j.d(object5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                        O0.d d6 = new O0.d(v26, v27, ((p)object5));
                                        WeakHashMap weakHashMap1 = (WeakHashMap)w1.Z;
                                        Object object6 = weakHashMap1.get(d6);
                                        if(object6 == null) {
                                            object6 = new URLSpan(((p)object5).a);
                                            weakHashMap1.put(d6, object6);
                                        }
                                        spannableString0.setSpan(((URLSpan)object6), v26, v27, 33);
                                    }
                                    else {
                                        WeakHashMap weakHashMap2 = (WeakHashMap)w1.b0;
                                        Object object7 = weakHashMap2.get(d5);
                                        if(object7 == null) {
                                            object7 = new x(q1);
                                            weakHashMap2.put(d5, object7);
                                        }
                                        spannableString0.setSpan(((ClickableSpan)object7), v26, v27, 33);
                                    }
                                }
                            }
                            charSequence0 = (SpannableString)androidx.compose.ui.platform.b.Q(spannableString0);
                            d7 = d0;
                        }
                        d7.n(charSequence0);
                        M0.t t0 = q.D;
                        if(linkedHashMap0.containsKey(t0)) {
                            accessibilityNodeInfo3 = accessibilityNodeInfo2;
                            accessibilityNodeInfo3.setContentInvalid(true);
                            Object object8 = linkedHashMap0.get(t0);
                            if(object8 == null) {
                                object8 = null;
                            }
                            accessibilityNodeInfo1.setError(((CharSequence)object8));
                        }
                        else {
                            accessibilityNodeInfo3 = accessibilityNodeInfo2;
                        }
                        String s3 = ((androidx.compose.ui.platform.b)b0).v(o4);
                        if(Build.VERSION.SDK_INT >= 30) {
                            A1.c.g(accessibilityNodeInfo1, s3);
                        }
                        else {
                            accessibilityNodeInfo1.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", s3);
                        }
                        accessibilityNodeInfo1.setCheckable(androidx.compose.ui.platform.b.u(o4));
                        Object object9 = linkedHashMap0.get(q.B);
                        if(object9 == null) {
                            object9 = null;
                        }
                        if(((N0.a)object9) != null) {
                            if(((N0.a)object9) == N0.a.X) {
                                accessibilityNodeInfo1.setChecked(true);
                            }
                            else if(((N0.a)object9) == N0.a.Y) {
                                accessibilityNodeInfo1.setChecked(false);
                            }
                        }
                        Object object10 = linkedHashMap0.get(q.A);
                        if(object10 == null) {
                            object10 = null;
                        }
                        if(((Boolean)object10) != null) {
                            boolean z4 = ((Boolean)object10).booleanValue();
                            if((((g)object0) == null ? false : g.a(((g)object0).a, 4))) {
                                accessibilityNodeInfo3.setSelected(z4);
                            }
                            else {
                                accessibilityNodeInfo1.setChecked(z4);
                            }
                        }
                        if(!j2.Y || o.h(o4, true, 4).isEmpty()) {
                            Object object11 = linkedHashMap0.get(q.a);
                            if(object11 == null) {
                                object11 = null;
                            }
                            accessibilityNodeInfo1.setContentDescription((((List)object11) == null ? null : ((String)Bb.p.q0(((List)object11)))));
                        }
                        Object object12 = linkedHashMap0.get(q.t);
                        if(object12 == null) {
                            object12 = null;
                        }
                        if(((String)object12) != null) {
                            for(o o5 = o4; true; o5 = o5.j()) {
                                boolean z5 = false;
                                if(o5 == null) {
                                    break;
                                }
                                M0.t t1 = r.a;
                                j j3 = o5.d;
                                if(j3.X.containsKey(t1)) {
                                    z5 = ((Boolean)j3.a(t1)).booleanValue();
                                    break;
                                }
                            }
                            if(z5) {
                                accessibilityNodeInfo3.setViewIdResourceName(((String)object12));
                            }
                        }
                        Object object13 = linkedHashMap0.get(q.h);
                        if(object13 == null) {
                            object13 = null;
                        }
                        if(((Ab.t)object13) != null) {
                            if(Build.VERSION.SDK_INT >= 28) {
                                accessibilityNodeInfo1.setHeading(true);
                            }
                            else {
                                d7.h(2, true);
                            }
                        }
                        accessibilityNodeInfo3.setPassword(linkedHashMap0.containsKey(q.C));
                        accessibilityNodeInfo3.setEditable(linkedHashMap0.containsKey(q.F));
                        Object object14 = linkedHashMap0.get(q.G);
                        if(object14 == null) {
                            object14 = null;
                        }
                        accessibilityNodeInfo1.setMaxTextLength((((Integer)object14) == null ? -1 : ((int)(((Integer)object14)))));
                        accessibilityNodeInfo1.setEnabled(G.a(o4));
                        M0.t t2 = q.k;
                        accessibilityNodeInfo1.setFocusable(linkedHashMap0.containsKey(t2));
                        if(accessibilityNodeInfo3.isFocusable()) {
                            accessibilityNodeInfo1.setFocused(((Boolean)j2.a(t2)).booleanValue());
                            if(accessibilityNodeInfo3.isFocused()) {
                                d7.a(2);
                            }
                            else {
                                d7.a(1);
                            }
                        }
                        c0 c00 = o4.c();
                        accessibilityNodeInfo1.setVisibleToUser(!(c00 == null ? false : c00.N0()) && !j2.X.containsKey(q.m));
                        Object object15 = linkedHashMap0.get(q.j);
                        if(object15 == null) {
                            object15 = null;
                        }
                        if(((M0.e)object15) != null) {
                            accessibilityNodeInfo3.setLiveRegion(1);
                        }
                        accessibilityNodeInfo1.setClickable(false);
                        Object object16 = linkedHashMap0.get(i.b);
                        if(object16 == null) {
                            object16 = null;
                        }
                        if(((a)object16) != null) {
                            Object object17 = linkedHashMap0.get(q.A);
                            if(object17 == null) {
                                object17 = null;
                            }
                            boolean z6 = Nb.j.a(object17, Boolean.TRUE);
                            accessibilityNodeInfo1.setClickable(!(((g)object0) == null ? false : g.a(((g)object0).a, 4)) && !(((g)object0) == null ? false : g.a(((g)object0).a, 3)) || !z6);
                            if(G.a(o4) && accessibilityNodeInfo3.isClickable()) {
                                d7.b(new K1.c(16, ((a)object16).a));
                            }
                        }
                        accessibilityNodeInfo1.setLongClickable(false);
                        Object object18 = linkedHashMap0.get(i.c);
                        if(object18 == null) {
                            object18 = null;
                        }
                        if(((a)object18) != null) {
                            accessibilityNodeInfo1.setLongClickable(true);
                            if(G.a(o4)) {
                                d7.b(new K1.c(0x20, ((a)object18).a));
                            }
                        }
                        Object object19 = linkedHashMap0.get(i.o);
                        if(object19 == null) {
                            object19 = null;
                        }
                        if(((a)object19) != null) {
                            d7.b(new K1.c(0x4000, ((a)object19).a));
                        }
                        if(G.a(o4)) {
                            Object object20 = linkedHashMap0.get(i.i);
                            if(object20 == null) {
                                object20 = null;
                            }
                            if(((a)object20) != null) {
                                d7.b(new K1.c(0x200000, ((a)object20).a));
                            }
                            Object object21 = linkedHashMap0.get(i.n);
                            if(object21 == null) {
                                object21 = null;
                            }
                            if(((a)object21) != null) {
                                d7.b(new K1.c(0x1020054, ((a)object21).a));
                            }
                            Object object22 = linkedHashMap0.get(i.p);
                            if(object22 == null) {
                                object22 = null;
                            }
                            if(((a)object22) != null) {
                                d7.b(new K1.c(0x10000, ((a)object22).a));
                            }
                            Object object23 = linkedHashMap0.get(i.q);
                            if(object23 == null) {
                                object23 = null;
                            }
                            if(((a)object23) != null && accessibilityNodeInfo3.isFocused() && androidComposeView1.getClipboardManager().c()) {
                                d7.b(new K1.c(0x8000, ((a)object23).a));
                            }
                        }
                        String s4 = androidx.compose.ui.platform.b.x(o4);
                        if(s4 != null && s4.length() != 0) {
                            accessibilityNodeInfo3.setTextSelection(((androidx.compose.ui.platform.b)b0).s(o4), ((androidx.compose.ui.platform.b)b0).r(o4));
                            Object object24 = linkedHashMap0.get(i.h);
                            if(object24 == null) {
                                object24 = null;
                            }
                            d7.b(new K1.c(0x20000, (((a)object24) == null ? null : ((a)object24).a)));
                            d7.a(0x100);
                            d7.a(0x200);
                            accessibilityNodeInfo1.setMovementGranularities(11);
                            Object object25 = linkedHashMap0.get(q.a);
                            if(object25 == null) {
                                object25 = null;
                            }
                            if((((List)object25) != null || ((List)object25).isEmpty()) && linkedHashMap0.containsKey(i.a)) {
                                if(j2.X.containsKey(q.x)) {
                                    Object object26 = j2.X.get(t2);
                                    if(object26 == null) {
                                        object26 = null;
                                    }
                                    if(Nb.j.a(object26, Boolean.TRUE)) {
                                        j4 = G0.j.c0;
                                        layoutNode0 = o4.c.s();
                                        goto label_398;
                                    }
                                    else {
                                        z7 = true;
                                    }
                                }
                                else {
                                    j4 = G0.j.c0;
                                    for(layoutNode0 = o4.c.s(); true; layoutNode0 = layoutNode0.s()) {
                                    label_398:
                                        if(layoutNode0 == null) {
                                            layoutNode0 = null;
                                            break;
                                        }
                                        if(((Boolean)j4.n(layoutNode0)).booleanValue()) {
                                            break;
                                        }
                                    }
                                    if(layoutNode0 == null) {
                                        z7 = false;
                                    }
                                    else {
                                        j j5 = layoutNode0.o();
                                        if(j5 == null) {
                                            z8 = false;
                                        }
                                        else {
                                            Object object27 = j5.X.get(q.k);
                                            if(object27 == null) {
                                                object27 = null;
                                            }
                                            z8 = Nb.j.a(object27, Boolean.TRUE);
                                        }
                                        z7 = z8 ? false : true;
                                    }
                                }
                                if(!z7) {
                                    accessibilityNodeInfo1.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                }
                            }
                        }
                        int v28 = Build.VERSION.SDK_INT;
                        if(v28 >= 26) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add("androidx.compose.ui.semantics.id");
                            CharSequence charSequence1 = d7.g();
                            if(charSequence1 != null && charSequence1.length() != 0 && linkedHashMap0.containsKey(i.a)) {
                                arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if(linkedHashMap0.containsKey(q.t)) {
                                arrayList2.add("androidx.compose.ui.semantics.testTag");
                            }
                            accessibilityNodeInfo3.setAvailableExtraData(arrayList2);
                        }
                        Object object28 = linkedHashMap0.get(q.c);
                        if(object28 == null) {
                            object28 = null;
                        }
                        if(((f)object28) != null) {
                            M0.t t3 = i.g;
                            if(linkedHashMap0.containsKey(t3)) {
                                d7.i("android.widget.SeekBar");
                            }
                            else {
                                d7.i("android.widget.ProgressBar");
                            }
                            float f1 = ((f)object28).a;
                            Sb.a a0 = ((f)object28).b;
                            if(((f)object28) != f.d) {
                                accessibilityNodeInfo1.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, a0.a, a0.b, f1));
                            }
                            if(linkedHashMap0.containsKey(t3) && G.a(o4)) {
                                if(f1 < J.m(a0.b, a0.a)) {
                                    d7.b(K1.c.h);
                                }
                                if(f1 > J.o(a0.a, a0.b)) {
                                    d7.b(K1.c.i);
                                }
                            }
                        }
                        if(v28 >= 24) {
                            G0.r.a(d7, o4);
                        }
                        Object object29 = o4.i().X.get(q.f);
                        if(object29 == null) {
                            object29 = null;
                        }
                        if(((M0.b)object29) == null) {
                            ArrayList arrayList3 = new ArrayList();
                            Object object30 = o4.i().X.get(q.e);
                            if(object30 == null) {
                                object30 = null;
                            }
                            if(object30 != null) {
                                List list4 = o.h(o4, true, 4);
                                int v29 = list4.size();
                                for(int v30 = 0; v30 < v29; ++v30) {
                                    o o6 = (o)list4.get(v30);
                                    if(o6.i().X.containsKey(q.A)) {
                                        arrayList3.add(o6);
                                    }
                                }
                            }
                            if(!arrayList3.isEmpty()) {
                                boolean z9 = Z6.b.j(arrayList3);
                                d7.j(I5.h.r((z9 ? 1 : arrayList3.size()), (z9 ? arrayList3.size() : 1), 0));
                            }
                        }
                        else {
                            d7.j(I5.h.r(((M0.b)object29).a, ((M0.b)object29).b, 0));
                        }
                        Object object31 = o4.i().X.get(q.g);
                        if(object31 == null) {
                            object31 = null;
                        }
                        if(object31 != null) {
                            throw new ClassCastException();
                        }
                        o o7 = o4.j();
                        if(o7 != null) {
                            Object object32 = o7.i().X.get(q.e);
                            if(object32 == null) {
                                object32 = null;
                            }
                            if(object32 != null) {
                                Object object33 = o7.i().X.get(q.f);
                                if(object33 == null) {
                                    object33 = null;
                                }
                                if((((M0.b)object33) == null || ((M0.b)object33).a >= 0 && ((M0.b)object33).b >= 0) && o4.i().X.containsKey(q.A)) {
                                    ArrayList arrayList4 = new ArrayList();
                                    List list5 = o.h(o7, true, 4);
                                    int v31 = list5.size();
                                    int v33 = 0;
                                    for(int v32 = 0; v32 < v31; ++v32) {
                                        o o8 = (o)list5.get(v32);
                                        if(o8.i().X.containsKey(q.A)) {
                                            arrayList4.add(o8);
                                            if(o8.c.t() < o4.c.t()) {
                                                ++v33;
                                            }
                                        }
                                    }
                                    if(!arrayList4.isEmpty()) {
                                        boolean z10 = Z6.b.j(arrayList4);
                                        int v34 = z10 ? 0 : v33;
                                        if(!z10) {
                                            v33 = 0;
                                        }
                                        Object object34 = o4.i().X.get(q.A);
                                        if(object34 == null) {
                                            object34 = Boolean.FALSE;
                                        }
                                        d7.k(U7.c.t(((Boolean)object34).booleanValue(), v34, 1, v33, 1));
                                    }
                                }
                            }
                        }
                        Object object35 = j2.X.get(q.o);
                        if(object35 == null) {
                            object35 = null;
                        }
                        a a1 = (a)l.u(j2, i.d);
                        if(((h)object35) != null && a1 != null) {
                            Object object36 = o4.i().X.get(q.f);
                            if(object36 == null) {
                                object36 = null;
                            }
                            if(object36 == null) {
                                Object object37 = o4.i().X.get(q.e);
                                if(object37 == null) {
                                    object37 = null;
                                }
                                z11 = object37 == null ? false : true;
                            }
                            else {
                                z11 = true;
                            }
                            if(!z11) {
                                d7.i("android.widget.HorizontalScrollView");
                            }
                            if(((Number)((h)object35).a().invoke()).floatValue() > 0.0f) {
                                d7.m(true);
                            }
                            if(G.a(o4)) {
                                if(androidx.compose.ui.platform.b.D(((h)object35))) {
                                    d7.b(K1.c.h);
                                    d7.b((G.b(o4) ? K1.c.n : K1.c.p));
                                }
                                if(androidx.compose.ui.platform.b.C(((h)object35))) {
                                    d7.b(K1.c.i);
                                    d7.b((G.b(o4) ? K1.c.p : K1.c.n));
                                }
                            }
                        }
                        h h1 = (h)l.u(o4.k(), q.p);
                        if(h1 != null && a1 != null) {
                            Object object38 = o4.i().X.get(q.f);
                            if(object38 == null) {
                                object38 = null;
                            }
                            if(object38 == null) {
                                Object object39 = o4.i().X.get(q.e);
                                if(object39 == null) {
                                    object39 = null;
                                }
                                z12 = object39 == null ? false : true;
                            }
                            else {
                                z12 = true;
                            }
                            if(!z12) {
                                d7.i("android.widget.ScrollView");
                            }
                            if(((Number)h1.a().invoke()).floatValue() > 0.0f) {
                                d7.m(true);
                            }
                            if(G.a(o4)) {
                                if(androidx.compose.ui.platform.b.D(h1)) {
                                    d7.b(K1.c.h);
                                    d7.b(K1.c.o);
                                }
                                if(androidx.compose.ui.platform.b.C(h1)) {
                                    d7.b(K1.c.i);
                                    d7.b(K1.c.m);
                                }
                            }
                        }
                        if(v28 >= 29) {
                            G0.s.a(d7, o4);
                        }
                        CharSequence charSequence2 = (CharSequence)l.u(o4.k(), q.d);
                        if(v28 >= 28) {
                            accessibilityNodeInfo1.setPaneTitle(charSequence2);
                        }
                        else {
                            accessibilityNodeInfo1.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence2);
                        }
                        if(G.a(o4)) {
                            a a2 = (a)l.u(o4.k(), i.r);
                            if(a2 != null) {
                                d7.b(new K1.c(0x40000, a2.a));
                            }
                            a a3 = (a)l.u(o4.k(), i.s);
                            if(a3 != null) {
                                d7.b(new K1.c(0x80000, a3.a));
                            }
                            a a4 = (a)l.u(o4.k(), i.t);
                            if(a4 != null) {
                                d7.b(new K1.c(0x100000, a4.a));
                            }
                            M0.t t4 = i.v;
                            if(o4.k().X.containsKey(t4)) {
                                List list6 = (List)o4.k().a(t4);
                                s.r r0 = androidx.compose.ui.platform.b.N;
                                if(list6.size() >= r0.b) {
                                    throw new IllegalStateException(M.J.f(new StringBuilder("Can\'t have more than "), r0.b, " custom actions for one widget"));
                                }
                                K k0 = new K(0);
                                y y0 = new y();
                                K k1 = ((androidx.compose.ui.platform.b)b0).t;
                                v35 = v;
                                if(t.a.a(k1.Z, v35, k1.X) >= 0) {
                                    y y1 = (y)k1.d(v35);
                                    s.r r1 = new s.r();
                                    int[] arr_v = r0.a;
                                    int v36 = r0.b;
                                    for(int v37 = 0; v37 < v36; ++v37) {
                                        r1.a(arr_v[v37]);
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    if(list6.size() <= 0) {
                                        if(arrayList5.size() > 0) {
                                            A3.e.x(arrayList5.get(0));
                                            r1.c(0);
                                            throw null;
                                        }
                                        ((androidx.compose.ui.platform.b)b0).s.e(v35, k0);
                                        k1.e(v35, y0);
                                        goto label_624;
                                    }
                                    A3.e.x(list6.get(0));
                                    Nb.j.c(y1);
                                }
                                else {
                                    if(list6.size() <= 0) {
                                        ((androidx.compose.ui.platform.b)b0).s.e(v35, k0);
                                        k1.e(v35, y0);
                                        goto label_624;
                                    }
                                    A3.e.x(list6.get(0));
                                    r0.c(0);
                                }
                                throw null;
                            }
                            else {
                                v35 = v;
                            }
                        }
                        else {
                            v35 = v;
                        }
                    label_624:
                        boolean z13 = ((androidx.compose.ui.platform.b)b0).z(o4);
                        if(Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo1.setScreenReaderFocusable(z13);
                        }
                        else {
                            d7.h(1, z13);
                        }
                        int v38 = ((androidx.compose.ui.platform.b)b0).C.e(v35);
                        if(v38 == -1) {
                            androidComposeView2 = androidComposeView1;
                        }
                        else {
                            d1.h h2 = G.o(androidComposeView1.getAndroidViewsHandler$ui_release(), v38);
                            if(h2 == null) {
                                androidComposeView2 = androidComposeView1;
                                accessibilityNodeInfo1.setTraversalBefore(androidComposeView2, v38);
                            }
                            else {
                                accessibilityNodeInfo1.setTraversalBefore(h2);
                                androidComposeView2 = androidComposeView1;
                            }
                            ((androidx.compose.ui.platform.b)b0).j(v35, d7, ((androidx.compose.ui.platform.b)b0).E, null);
                        }
                        int v39 = ((androidx.compose.ui.platform.b)b0).D.e(v35);
                        if(v39 != -1) {
                            d1.h h3 = G.o(androidComposeView2.getAndroidViewsHandler$ui_release(), v39);
                            if(h3 != null) {
                                accessibilityNodeInfo1.setTraversalAfter(h3);
                                ((androidx.compose.ui.platform.b)b0).j(v35, d7, ((androidx.compose.ui.platform.b)b0).F, null);
                            }
                        }
                        d8 = d7;
                        goto label_657;
                    }
                    M6.b.U(("semanticsNode " + v + " has null parent"));
                    throw null;
                }
            }
        }
    label_657:
        if(((androidx.compose.ui.platform.b)b0).p && v35 == ((androidx.compose.ui.platform.b)b0).n) {
            ((androidx.compose.ui.platform.b)b0).o = d8;
        }
        return d8;
    }

    @Override  // B3.c
    public final K1.d j(int v) {
        if(this.Z != 0) {
            Q1.a a0 = (Q1.a)this.b0;
            int v1 = v == 2 ? a0.k : a0.l;
            return v1 == 0x80000000 ? null : this.h(v1);
        }
        return this.h(((androidx.compose.ui.platform.b)this.b0).n);
    }
}

