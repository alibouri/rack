package W0;

import F0.A;
import I.I0;
import M.V;
import O0.B;
import O0.G;
import O0.O;
import O0.w;
import O0.x;
import O0.z;
import P0.n;
import R0.f;
import T0.l;
import T0.s;
import T0.t;
import U.N0;
import V0.e;
import X0.a;
import X1.h;
import Z0.j;
import Z0.o;
import Z0.p;
import Z0.q;
import a1.k;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import n0.M;
import n0.P;
import n0.Q;
import n0.U;
import n0.r;
import n0.v;

public final class c implements w {
    public final String X;
    public final O Y;
    public final List Z;
    public final List b0;
    public final FontFamily.Resolver c0;
    public final Density d0;
    public final d e0;
    public final CharSequence f0;
    public final n g0;
    public R2.w h0;
    public final boolean i0;
    public final int j0;

    public c(String s, O o0, List list0, List list1, FontFamily.Resolver fontFamily$Resolver0, Density density0) {
        f f10;
        int v33;
        int v28;
        Integer[] arr_integer1;
        G g6;
        ArrayList arrayList2;
        float f8;
        float f7;
        V v12;
        int v11;
        boolean z6;
        CharSequence charSequence0;
        G g1;
        Locale locale0;
        boolean z;
        int v1;
        List list2 = list0;
        super();
        this.X = s;
        this.Y = o0;
        this.Z = list2;
        this.b0 = list1;
        this.c0 = fontFamily$Resolver0;
        this.d0 = density0;
        float f = density0.getDensity();
        d d0 = new d(1);  // initializer: Landroid/text/TextPaint;-><init>(I)V
        d0.density = f;
        d0.b = j.b;
        d0.c = 3;
        d0.d = Q.d;
        this.e0 = d0;
        B3.c c0 = g.a;
        N0 n00 = (N0)c0.Y;
        if(n00 == null) {
            if(h.c()) {
                n00 = c0.p();
                c0.Y = n00;
            }
            else {
                n00 = W0.h.a;
            }
        }
        this.i0 = ((Boolean)n00.getValue()).booleanValue();
        x x0 = o0.b;
        int v = x0.b;
        G g0 = o0.a;
        V0.c c1 = g0.k;
        switch(v) {
            case 1: {
                v1 = 0;
                goto label_48;
            }
            case 2: {
                v1 = 1;
                goto label_48;
            }
            case 3: {
                z = true;
                break;
            }
            case 4: {
                v1 = 2;
                goto label_48;
            }
            case 5: {
                v1 = 3;
                goto label_48;
            }
            default: {
                z = v == 0x80000000;
            }
        }
        if(!z) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if(c1 == null) {
            locale0 = Locale.getDefault();
        }
        else {
            locale0 = c1.a().a;
            if(locale0 == null) {
                locale0 = Locale.getDefault();
            }
        }
        v1 = TextUtils.getLayoutDirectionFromLocale(locale0) == 1 ? 3 : 2;
    label_48:
        this.j0 = v1;
        V v2 = new V(1, this);
        q q0 = x0.i == null ? q.c : x0.i;
        d0.setFlags((q0.b ? d0.getFlags() | 0x80 : d0.getFlags() & 0xFFFFFF7F));
        int v3 = q0.a;
        if(v3 == 1) {
            d0.setFlags(d0.getFlags() | 0x40);
            d0.setHinting(0);
        }
        else if(v3 == 2) {
            d0.getFlags();
            d0.setHinting(1);
        }
        else if(v3 == 3) {
            d0.getFlags();
            d0.setHinting(0);
        }
        else {
            d0.getFlags();
        }
        boolean z1 = list2.isEmpty();
        long v4 = a1.j.b(g0.b);
        long v5 = g0.b;
        if(k.a(v4, 0x100000000L)) {
            d0.setTextSize(density0.T(v5));
        }
        else if(k.a(v4, 0x200000000L)) {
            d0.setTextSize(a1.j.c(v5) * d0.getTextSize());
        }
        T0.w w0 = g0.c;
        s s1 = g0.d;
        l l0 = g0.f;
        if(l0 != null || s1 != null || w0 != null) {
            if(w0 == null) {
                w0 = T0.w.k0;
            }
            d0.setTypeface(((Typeface)v2.r(l0, w0, new s((s1 == null ? 0 : s1.a)), new t((g0.e == null ? 1 : g0.e.a)))));
        }
        V0.c c2 = g0.k;
        if(c2 != null) {
            V0.d d1 = e.a;
            if(!c2.equals(d1.c())) {
                if(Build.VERSION.SDK_INT >= 24) {
                    a.a.b(d0, c2);
                }
                else {
                    d0.setTextLocale((c2.X.isEmpty() ? d1.c().a() : c2.a()).a);
                }
            }
        }
        String s2 = g0.g;
        if(s2 != null && !s2.equals("")) {
            d0.setFontFeatureSettings(s2);
        }
        o o1 = g0.j;
        if(o1 != null && !o1.equals(o.c)) {
            d0.setTextScaleX(d0.getTextScaleX() * o1.a);
            d0.setTextSkewX(d0.getTextSkewX() + o1.b);
        }
        d0.d(g0.a.b());
        d0.c(g0.a.e(), 0x7FC000007FC00000L, g0.a.a());
        d0.f(g0.n);
        d0.g(g0.m);
        d0.e(g0.p);
        long v6 = g0.h;
        if(k.a(a1.j.b(v6), 0x100000000L) && a1.j.c(v6) != 0.0f) {
            float f1 = d0.getTextSize();
            float f2 = d0.getTextScaleX() * f1;
            float f3 = density0.T(v6);
            if(f2 != 0.0f) {
                d0.setLetterSpacing(f3 / f2);
            }
        }
        else if(k.a(a1.j.b(v6), 0x200000000L)) {
            d0.setLetterSpacing(a1.j.c(v6));
        }
        boolean z2 = !z1 && k.a(a1.j.b(v6), 0x100000000L) && a1.j.c(v6) == 0.0f;
        long v7 = v.i;
        long v8 = g0.l;
        boolean z3 = !v.c(v8, v7) && !v.c(v8, v.h);
        Z0.a a0 = g0.i;
        boolean z4 = a0 != null && Float.compare(a0.a, 0.0f) != 0;
        if(z2 || z3 || z4) {
            if(!z2) {
                v6 = a1.j.c;
            }
            g1 = new G(0L, 0L, null, null, null, null, null, v6, (z4 ? a0 : null), null, null, (z3 ? v8 : v7), null, null, 0xF67F);
        }
        else {
            g1 = null;
        }
        if(g1 != null) {
            int v9 = list0.size();
            ArrayList arrayList0 = new ArrayList(v9 + 1);
            for(int v10 = 0; v10 < v9 + 1; ++v10) {
                arrayList0.add((v10 == 0 ? new O0.d(0, this.X.length(), g1) : ((O0.d)this.Z.get(v10 - 1))));
            }
            list2 = arrayList0;
        }
        String s3 = this.X;
        float f4 = this.e0.getTextSize();
        O o2 = this.Y;
        List list3 = this.b0;
        Density density1 = this.d0;
        if(!this.i0 || !h.c()) {
            charSequence0 = s3;
        }
        else {
            charSequence0 = h.a().f(0, s3.length(), 0, s3);
            Nb.j.c(charSequence0);
        }
        if(!list2.isEmpty() || !list3.isEmpty() || !Nb.j.a(o2.b.d, p.c) || !Bb.q.H(o2.b.c)) {
            charSequence0 = charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : new SpannableString(charSequence0);
            if(Nb.j.a(o2.a.m, j.c)) {
                ((Spannable)charSequence0).setSpan(b.a, 0, s3.length(), 33);
            }
            B b0 = o2.c;
            if(b0 == null) {
                z6 = false;
            }
            else {
                z z5 = b0.b;
                z6 = z5 == null ? false : z5.a;
            }
            x x1 = o2.b;
            if(!z6 || x1.f != null) {
                Z0.g g2 = x1.f == null ? Z0.g.c : x1.f;
                float f6 = Pb.a.F(x1.c, f4, density1);
                if(!Float.isNaN(f6)) {
                    if(charSequence0.length() == 0) {
                        v11 = charSequence0.length() + 1;
                    }
                    else {
                        if(charSequence0.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        v11 = charSequence0.charAt(Vb.j.W(charSequence0)) == 10 ? charSequence0.length() + 1 : charSequence0.length();
                    }
                    ((Spannable)charSequence0).setSpan(new R0.h(f6, v11, (g2.b & 1) > 0, (g2.b & 16) > 0, g2.a), 0, charSequence0.length(), 33);
                }
            }
            else {
                float f5 = Pb.a.F(x1.c, f4, density1);
                if(!Float.isNaN(f5)) {
                    ((Spannable)charSequence0).setSpan(new R0.g(f5), 0, charSequence0.length(), 33);
                }
            }
            p p0 = x1.d;
            if(p0 == null) {
                v12 = v2;
            }
            else {
                v12 = v2;
                long v13 = p0.a;
                long v14 = p0.b;
                if((!a1.j.a(v13, Bb.q.C(0)) || !a1.j.a(v14, Bb.q.C(0))) && !Bb.q.H(v13) && !Bb.q.H(v14)) {
                    long v15 = a1.j.b(v13);
                    if(k.a(v15, 0x100000000L)) {
                        f7 = density1.T(v13);
                    }
                    else {
                        f7 = k.a(v15, 0x200000000L) ? a1.j.c(v13) * f4 : 0.0f;
                    }
                    long v16 = a1.j.b(v14);
                    if(k.a(v16, 0x100000000L)) {
                        f8 = density1.T(v14);
                    }
                    else {
                        f8 = k.a(v16, 0x200000000L) ? a1.j.c(v14) * f4 : 0.0f;
                    }
                    int v17 = charSequence0.length();
                    ((Spannable)charSequence0).setSpan(new LeadingMarginSpan.Standard(((int)(((float)Math.ceil(f7)))), ((int)(((float)Math.ceil(f8))))), 0, v17, 33);
                }
            }
            ArrayList arrayList1 = new ArrayList(list2.size());
            int v18 = list2.size();
            for(int v19 = 0; v19 < v18; ++v19) {
                Object object0 = list2.get(v19);
                G g3 = (G)((O0.d)object0).a;
                if(g3.f != null || g3.d != null || g3.c != null || ((G)((O0.d)object0).a).e != null) {
                    arrayList1.add(object0);
                }
            }
            G g4 = o2.a.f != null || o2.a.d != null || o2.a.c != null || o2.a.e != null ? new G(0L, 0L, o2.a.c, o2.a.d, o2.a.e, o2.a.f, null, 0L, null, null, null, 0L, null, null, 0xFFC3) : null;
            I0 i00 = new I0(charSequence0, 2, v12);
            if(arrayList1.size() > 1) {
                int v20 = arrayList1.size();
                int v21 = v20 * 2;
                Integer[] arr_integer = new Integer[v21];
                for(int v22 = 0; v22 < v21; ++v22) {
                    arr_integer[v22] = 0;
                }
                int v23 = arrayList1.size();
                for(int v24 = 0; v24 < v23; ++v24) {
                    O0.d d2 = (O0.d)arrayList1.get(v24);
                    arr_integer[v24] = (int)d2.b;
                    arr_integer[v24 + v20] = (int)d2.c;
                }
                if(arr_integer.length > 1) {
                    Arrays.sort(arr_integer);
                }
                int v25 = ((Number)Bb.n.s0(arr_integer)).intValue();
                int v26 = 0;
                while(v26 < v21) {
                    Integer integer0 = arr_integer[v26];
                    int v27 = (int)integer0;
                    if(v27 == v25) {
                        arrayList2 = arrayList1;
                        g6 = g4;
                        arr_integer1 = arr_integer;
                        v28 = v21;
                    }
                    else {
                        int v29 = arrayList1.size();
                        g6 = g4;
                        int v30 = 0;
                        while(v30 < v29) {
                            O0.d d3 = (O0.d)arrayList1.get(v30);
                            if(d3.b != d3.c && O0.g.c(v25, v27, d3.b, d3.c)) {
                                G g7 = (G)d3.a;
                                if(g4 != null) {
                                    g7 = g4.c(g7);
                                }
                                g4 = g7;
                            }
                            ++v30;
                            arrayList1 = arrayList1;
                            arr_integer = arr_integer;
                            v21 = v21;
                        }
                        arrayList2 = arrayList1;
                        arr_integer1 = arr_integer;
                        v28 = v21;
                        if(g4 != null) {
                            i00.h(g4, v25, integer0);
                        }
                        v25 = v27;
                    }
                    ++v26;
                    g4 = g6;
                    arrayList1 = arrayList2;
                    arr_integer = arr_integer1;
                    v21 = v28;
                }
            }
            else if(!arrayList1.isEmpty()) {
                G g5 = (G)((O0.d)arrayList1.get(0)).a;
                if(g4 != null) {
                    g5 = g4.c(g5);
                }
                i00.h(g5, ((int)((O0.d)arrayList1.get(0)).b), ((int)((O0.d)arrayList1.get(0)).c));
            }
            int v31 = list2.size();
            int v32 = 0;
            boolean z7 = false;
            while(v32 < v31) {
                O0.d d4 = (O0.d)list2.get(v32);
                if(d4.b >= 0 && d4.b < charSequence0.length() && (d4.c > d4.b && d4.c <= charSequence0.length())) {
                    G g8 = (G)d4.a;
                    Z0.a a1 = g8.i;
                    int v34 = d4.b;
                    int v35 = d4.c;
                    if(a1 != null) {
                        ((Spannable)charSequence0).setSpan(new R0.a(0, a1.a), v34, v35, 33);
                    }
                    Pb.a.J(((Spannable)charSequence0), g8.a.b(), v34, v35);
                    r r0 = g8.a.e();
                    float f9 = g8.a.a();
                    if(r0 != null) {
                        if(r0 instanceof U) {
                            Pb.a.J(((Spannable)charSequence0), ((U)r0).a, v34, v35);
                        }
                        else {
                            ((Spannable)charSequence0).setSpan(new Y0.b(((P)r0), f9), v34, v35, 33);
                        }
                    }
                    j j0 = g8.m;
                    if(j0 != null) {
                        ((Spannable)charSequence0).setSpan(new R0.k((j0.a | 1) == j0.a, (j0.a | 2) == j0.a), v34, v35, 33);
                    }
                    Pb.a.K(((Spannable)charSequence0), g8.b, density1, v34, v35);
                    String s4 = g8.g;
                    if(s4 != null) {
                        ((Spannable)charSequence0).setSpan(new R0.b(0, s4), v34, v35, 33);
                    }
                    o o3 = g8.j;
                    if(o3 != null) {
                        ((Spannable)charSequence0).setSpan(new ScaleXSpan(o3.a), v34, v35, 33);
                        ((Spannable)charSequence0).setSpan(new R0.a(1, o3.b), v34, v35, 33);
                    }
                    Pb.a.L(((Spannable)charSequence0), g8.k, v34, v35);
                    long v36 = g8.l;
                    if(v36 != 16L) {
                        ((Spannable)charSequence0).setSpan(new BackgroundColorSpan(M.G(v36)), v34, v35, 33);
                    }
                    Q q1 = g8.n;
                    if(q1 == null) {
                        v33 = v31;
                    }
                    else {
                        int v37 = M.G(q1.a);
                        v33 = v31;
                        ((Spannable)charSequence0).setSpan(new R0.j(m0.b.d(q1.b), m0.b.e(q1.b), (q1.c == 0.0f ? 1.401298E-45f : q1.c), v37), v34, v35, 33);
                    }
                    p0.e e0 = g8.p;
                    if(e0 != null) {
                        ((Spannable)charSequence0).setSpan(new Y0.a(e0), v34, v35, 33);
                    }
                    if(k.a(a1.j.b(g8.h), 0x100000000L) || k.a(a1.j.b(g8.h), 0x200000000L)) {
                        z7 = true;
                    }
                }
                else {
                    v33 = v31;
                }
                ++v32;
                v31 = v33;
            }
            if(z7) {
                int v38 = list2.size();
                for(int v39 = 0; v39 < v38; ++v39) {
                    O0.d d5 = (O0.d)list2.get(v39);
                    int v40 = d5.b;
                    G g9 = (G)d5.a;
                    if(v40 >= 0 && v40 < charSequence0.length()) {
                        int v41 = d5.c;
                        if(v41 > v40 && v41 <= charSequence0.length()) {
                            long v42 = g9.h;
                            long v43 = a1.j.b(v42);
                            if(k.a(v43, 0x100000000L)) {
                                f10 = new f(density1.T(v42));
                            }
                            else if(k.a(v43, 0x200000000L)) {
                                f10 = new R0.e(a1.j.c(v42));
                            }
                            else {
                                f10 = null;
                            }
                            if(f10 != null) {
                                ((Spannable)charSequence0).setSpan(f10, v40, v41, 33);
                            }
                        }
                    }
                }
            }
            if(list3.size() > 0) {
                O0.d d6 = (O0.d)list3.get(0);
                if(d6.a != null) {
                    throw new ClassCastException();
                }
                Object[] arr_object = ((Spanned)charSequence0).getSpans(d6.b, d6.c, X1.v.class);
                for(int v44 = 0; v44 < arr_object.length; ++v44) {
                    ((Spannable)charSequence0).removeSpan(((X1.v)arr_object[v44]));
                }
                throw null;
            }
        }
        this.f0 = charSequence0;
        this.g0 = new n(charSequence0, this.e0, this.j0);
    }

    @Override  // O0.w
    public final float a() {
        n n0 = this.g0;
        if(!Float.isNaN(n0.e)) {
            return n0.e;
        }
        TextPaint textPaint0 = n0.b;
        BreakIterator breakIterator0 = BreakIterator.getLineInstance(textPaint0.getTextLocale());
        CharSequence charSequence0 = n0.a;
        breakIterator0.setText(new P0.k(charSequence0.length(), charSequence0));
        PriorityQueue priorityQueue0 = new PriorityQueue(10, new A(3));
        int v = breakIterator0.next();
        int v1 = 0;
        while(v != -1) {
            if(priorityQueue0.size() < 10) {
                priorityQueue0.add(new Ab.k(v1, v));
            }
            else {
                Ab.k k0 = (Ab.k)priorityQueue0.peek();
                if(k0 != null && ((Number)k0.Y).intValue() - ((Number)k0.X).intValue() < v - v1) {
                    priorityQueue0.poll();
                    priorityQueue0.add(new Ab.k(v1, v));
                }
            }
            v1 = v;
            v = breakIterator0.next();
        }
        float f = 0.0f;
        for(Object object0: priorityQueue0) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence0, ((Number)((Ab.k)object0).X).intValue(), ((Number)((Ab.k)object0).Y).intValue(), textPaint0));
        }
        n0.e = f;
        return f;
    }

    @Override  // O0.w
    public final boolean b() {
        if(!(this.h0 == null ? false : this.h0.y())) {
            if(!this.i0) {
                N0 n00 = (N0)g.a.Y;
                if(n00 == null) {
                    n00 = W0.h.a;
                }
                return ((Boolean)n00.getValue()).booleanValue();
            }
            return false;
        }
        return true;
    }

    @Override  // O0.w
    public final float d() {
        return this.g0.b();
    }
}

