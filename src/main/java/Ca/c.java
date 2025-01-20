package ca;

import K6.b;
import K6.e;
import R1.g;
import R9.X1;
import R9.l1;
import W4.f;
import ac.B0;
import ac.d0;
import ac.h0;
import ac.h;
import ac.j0;
import ac.z0;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.components.RequestListener;
import com.sendwave.components.RequesterEditText;
import f9.a;
import i.s;
import o9.l;
import o9.m;
import o9.w;
import q9.U0;
import q9.j;

public final class c extends g implements fa.c {
    public final int q;
    public Object r;
    public long s;
    public final View t;
    public Object u;
    public Object v;
    public Object w;

    public c(R1.c c0, View view0, TextView textView0, TextView textView1, TextView textView2, TextView textView3) {
        this.q = 1;
        super(c0, view0, 0);
        this.r = textView0;
        this.t = textView1;
        this.u = textView2;
        this.v = textView3;
    }

    public c(View view0, int v) {
        this.q = v;
        switch(v) {
            case 2: {
                Object[] arr_object1 = g.l(view0, 3, null, null);
                TextInputLayout textInputLayout0 = (TextInputLayout)arr_object1[1];
                this.q = 2;
                super(null, view0, 2);
                this.t = textInputLayout0;
                this.s = -1L;
                ((TextInputLayout)this.t).setTag(null);
                ((ConstraintLayout)arr_object1[0]).setTag(null);
                this.r = (RequesterEditText)arr_object1[2];
                ((RequesterEditText)arr_object1[2]).setTag(null);
                this.s(view0);
                this.v = new b(3, this);
                this.j();
                return;
            }
            case 3: {
                Object[] arr_object2 = g.l(view0, 3, null, null);
                FrameLayout frameLayout0 = (FrameLayout)arr_object2[0];
                this.q = 3;
                super(null, view0, 0);
                this.t = frameLayout0;
                this.s = -1L;
                this.r = (TextInputLayout)arr_object2[1];
                ((TextInputLayout)arr_object2[1]).setTag(null);
                this.v = (EditText)arr_object2[2];
                ((EditText)arr_object2[2]).setTag(null);
                ((FrameLayout)this.t).setTag(null);
                this.s(view0);
                this.j();
                return;
            }
            case 4: {
                Object[] arr_object3 = g.l(view0, 3, null, null);
                TextInputLayout textInputLayout1 = (TextInputLayout)arr_object3[1];
                ConstraintLayout constraintLayout1 = (ConstraintLayout)arr_object3[0];
                this.q = 4;
                super(null, view0, 3);
                this.u = textInputLayout1;
                this.t = constraintLayout1;
                this.s = -1L;
                ((TextInputLayout)this.u).setTag(null);
                this.v = (RequesterEditText)arr_object3[2];
                ((RequesterEditText)arr_object3[2]).setTag(null);
                ((ConstraintLayout)this.t).setTag(null);
                this.s(view0);
                this.j();
                return;
            }
            case 5: {
                Object[] arr_object4 = g.l(view0, 4, null, null);
                ImageView imageView1 = (ImageView)arr_object4[1];
                ImageView imageView2 = (ImageView)arr_object4[2];
                this.q = 5;
                super(null, view0, 0);
                this.u = imageView1;
                this.t = imageView2;
                this.s = -1L;
                ((ImageView)this.u).setTag(null);
                ((ConstraintLayout)arr_object4[0]).setTag(null);
                this.w = (Button)arr_object4[3];
                ((Button)arr_object4[3]).setTag(null);
                ((ImageView)this.t).setTag(null);
                this.s(view0);
                this.j();
                return;
            }
            default: {
                Object[] arr_object = g.l(view0, 3, null, null);
                ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
                ImageView imageView0 = (ImageView)arr_object[1];
                TextView textView0 = (TextView)arr_object[2];
                this.q = 0;
                super(null, view0, 0);
                this.t = constraintLayout0;
                this.u = imageView0;
                this.r = textView0;
                this.s = -1L;
                ((ConstraintLayout)this.t).setTag(null);
                ((ImageView)this.u).setTag(null);
                ((TextView)this.r).setTag(null);
                this.s(view0);
                this.w = new M9.c(1, 1, this);
                this.j();
            }
        }
    }

    private final boolean A() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }

    private final boolean B() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }

    private final boolean C() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }

    private final boolean D() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }

    private final void E() {
        synchronized(this) {
            this.s = 4L;
        }
        this.o();
    }

    private final void F() {
        synchronized(this) {
            this.s = 2L;
        }
        this.o();
    }

    private final void G() {
        synchronized(this) {
            this.s = 8L;
        }
        this.o();
    }

    private final void H() {
        synchronized(this) {
            this.s = 2L;
        }
        this.o();
    }

    private final void I() {
        synchronized(this) {
            this.s = 16L;
        }
        this.o();
    }

    public boolean J(int v) {
        if(v == 0) {
            synchronized(this) {
                this.s |= 1L;
            }
            return true;
        }
        return false;
    }

    public boolean K(int v) {
        if(v == 0) {
            synchronized(this) {
                this.s |= 1L;
            }
            return true;
        }
        return false;
    }

    public boolean L(int v) {
        if(v == 0) {
            synchronized(this) {
                this.s |= 2L;
            }
            return true;
        }
        return false;
    }

    private final boolean M(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                h0 h00 = (h0)object0;
                return this.K(v1);
            }
            case 1: {
                z0 z00 = (z0)object0;
                return this.L(v1);
            }
            case 2: {
                h0 h01 = (h0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.s |= 4L;
                    }
                    return true;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }

    public void N(Drawable drawable0) {
        this.r = drawable0;
        synchronized(this) {
            this.s |= 2L;
        }
        this.o();
    }

    private final boolean O(int v, Object object0) {
        if(16 == v) {
            this.v = (l1)object0;
            synchronized(this) {
                this.s |= 1L;
            }
            this.o();
            return true;
        }
        if(30 == v) {
            X1 x10 = (X1)object0;
            return true;
        }
        return false;
    }

    private final boolean P(int v, Object object0) {
        if(16 == v) {
            this.w = (j)object0;
            synchronized(this) {
                this.s |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }

    private final boolean Q(int v, Object object0) {
        if(16 == v) {
            this.u = (l)object0;
            synchronized(this) {
                this.s |= 4L;
            }
            this.o();
            return true;
        }
        return false;
    }

    private final boolean R(int v, Object object0) {
        if(16 == v) {
            this.u = (m)object0;
            synchronized(this) {
                this.s |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }

    private final boolean S(int v, Object object0) {
        if(16 == v) {
            this.r = (w)object0;
            synchronized(this) {
                this.s |= 8L;
            }
            this.o();
            return true;
        }
        return false;
    }

    @Override  // fa.c
    public void a(View view0, int v) {
        l1 l10 = (l1)this.v;
        if(l10 != null) {
            l10.c.d("click payment category", null);
            l10.b.invoke();
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        switch(this.q) {
            case 0: {
                this.u();
                return;
            }
            case 1: {
                this.v();
                return;
            }
            case 2: {
                this.w();
                return;
            }
            case 3: {
                this.x();
                return;
            }
            case 4: {
                this.y();
                return;
            }
            default: {
                synchronized(this) {
                    v = this.s;
                    this.s = 0L;
                }
                View.OnClickListener view$OnClickListener0 = (View.OnClickListener)this.v;
                Drawable drawable0 = (Drawable)this.r;
                int v1 = Long.compare(5L & v, 0L);
                int v2 = Long.compare(v & 6L, 0L);
                boolean z = v2 != 0 && drawable0 != null;
                if(v2 != 0) {
                    ((ImageView)this.u).setImageDrawable(drawable0);
                    U0.n(((Button)this.w), z);
                    U0.n(((ImageView)this.t), z);
                }
                if(v1 != 0) {
                    ((Button)this.w).setOnClickListener(view$OnClickListener0);
                }
            }
        }
    }

    @Override  // R1.g
    public final boolean i() {
        switch(this.q) {
            case 0: {
                return this.z();
            }
            case 1: {
                return this.A();
            }
            case 2: {
                return this.B();
            }
            case 3: {
                return this.C();
            }
            case 4: {
                return this.D();
            }
            default: {
                synchronized(this) {
                    if(this.s != 0L) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @Override  // R1.g
    public final void j() {
        switch(this.q) {
            case 0: {
                this.E();
                return;
            }
            case 1: {
                this.F();
                return;
            }
            case 2: {
                this.G();
                return;
            }
            case 3: {
                this.H();
                return;
            }
            case 4: {
                this.I();
                return;
            }
            default: {
                synchronized(this) {
                    this.s = 4L;
                }
                this.o();
            }
        }
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(this.q) {
            case 0: {
                return false;
            }
            case 1: {
                return false;
            }
            case 2: {
                switch(v) {
                    case 0: {
                        h0 h00 = (h0)object0;
                        return this.J(v1);
                    }
                    case 1: {
                        h0 h01 = (h0)object0;
                        if(v1 == 0) {
                            synchronized(this) {
                                this.s |= 2L;
                            }
                            return true;
                        }
                        return false;
                    }
                    default: {
                        return false;
                    }
                }
            }
            case 3: {
                return false;
            }
            case 4: {
                return this.M(v, v1, object0);
            }
            default: {
                return false;
            }
        }
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        switch(this.q) {
            case 0: {
                return this.O(v, object0);
            }
            case 1: {
                return this.P(v, object0);
            }
            case 2: {
                return this.Q(v, object0);
            }
            case 3: {
                return this.R(v, object0);
            }
            case 4: {
                return this.S(v, object0);
            }
            default: {
                if(22 == v) {
                    this.v = (View.OnClickListener)object0;
                    synchronized(this) {
                        this.s |= 1L;
                    }
                    this.o();
                    return true;
                }
                if(12 == v) {
                    this.N(((Drawable)object0));
                    return true;
                }
                return false;
            }
        }
    }

    private final void u() {
        long v;
        String s1;
        String s;
        synchronized(this) {
            v = this.s;
            this.s = 0L;
        }
        l1 l10 = (l1)this.v;
        int v1 = Long.compare(5L & v, 0L);
        if(v1 == 0 || l10 == null) {
            s = null;
            s1 = null;
        }
        else {
            s = l10.d;
            s1 = l10.a;
        }
        if((v & 4L) != 0L) {
            ((ConstraintLayout)this.t).setOnClickListener(((M9.c)this.w));
        }
        if(v1 != 0) {
            U0.f(((ImageView)this.u), s);
            f.M(((TextView)this.r), s1);
        }
    }

    private final void v() {
        long v;
        String s3;
        String s2;
        String s1;
        String s;
        synchronized(this) {
            v = this.s;
            this.s = 0L;
        }
        j j0 = (j)this.w;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || j0 == null) {
            s = null;
            s1 = null;
            s2 = null;
            s3 = null;
        }
        else {
            s = j0.d;
            s1 = j0.c;
            s2 = j0.e;
            s3 = j0.b;
        }
        if(v1 != 0) {
            f.M(((TextView)this.r), s);
            f.M(((TextView)this.t), s2);
            f.M(((TextView)this.u), s3);
            f.M(((TextView)this.v), s1);
        }
    }

    private final void w() {
        h h0;
        RequestListener requestListener0;
        int v3;
        CharSequence charSequence0;
        s s0;
        d0 d00;
        int v2;
        synchronized(this) {
            long v = this.s;
            this.s = 0L;
        }
        l l0 = (l)this.u;
        int v1 = 0;
        if(Long.compare(15L & v, 0L) == 0) {
            v3 = 0;
            requestListener0 = null;
            charSequence0 = null;
            h0 = null;
        }
        else {
            if((v & 12L) == 0L || l0 == null) {
                v2 = 0;
                s0 = null;
                d00 = null;
            }
            else {
                v2 = l0.c0;
                d00 = l0.j0;
                s0 = (s)this.w;
                if(s0 == null) {
                    s0 = new s();  // initializer: Ljava/lang/Object;-><init>()V
                    this.w = s0;
                }
                s0.X = l0;
            }
            a a0 = l0 == null ? null : l0.f0;
            if((v & 13L) != 0L) {
                B0 b00 = a0 == null ? null : a0.e0;
                R1.j.e(this, 0, b00);
                v1 = g.p((b00 == null ? null : ((Integer)b00.getValue())));
            }
            if((v & 14L) == 0L) {
                v3 = v1;
                charSequence0 = null;
            }
            else {
                B0 b01 = a0 == null ? null : a0.b0;
                R1.j.e(this, 1, b01);
                if(b01 == null) {
                    v3 = v1;
                    charSequence0 = null;
                }
                else {
                    charSequence0 = (String)b01.getValue();
                    v3 = v1;
                }
            }
            v1 = v2;
            requestListener0 = s0;
            h0 = d00;
        }
        if((v & 12L) != 0L) {
            U0.c(((TextInputLayout)this.t), h0);
            ((RequesterEditText)this.r).setOnRequest(requestListener0);
            U0.m(((RequesterEditText)this.r), v1);
        }
        if((v & 14L) != 0L) {
            f.M(((RequesterEditText)this.r), charSequence0);
        }
        if((13L & v) != 0L) {
            ((RequesterEditText)this.r).setSelection(v3);
        }
        if((v & 8L) != 0L) {
            ((RequesterEditText)this.r).setOnFocusChangeListener(((b)this.v));
        }
    }

    private final void x() {
        long v;
        String s1;
        int v2;
        e e0;
        String s;
        synchronized(this) {
            v = this.s;
            this.s = 0L;
        }
        m m0 = (m)this.u;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || m0 == null) {
            s = null;
            v2 = 0;
            e0 = null;
            s1 = null;
        }
        else {
            s = m0.Z.c;
            e0 = (e)this.w;
            if(e0 == null) {
                e0 = new e(7);
                this.w = e0;
            }
            e0.Y = m0;
            v2 = m0.c0;
            s1 = m0.c();
        }
        if(v1 != 0) {
            ((TextInputLayout)this.r).setHint(s);
            ((EditText)this.v).setOnClickListener(e0);
            f.M(((EditText)this.v), s1);
            U0.m(((EditText)this.v), v2);
        }
    }

    private final void y() {
        int v4;
        int v3;
        CharSequence charSequence0;
        g3.b b0;
        d0 d00;
        int v2;
        String s;
        synchronized(this) {
            long v = this.s;
            this.s = 0L;
        }
        w w0 = (w)this.r;
        int v1 = 0;
        Integer integer0 = null;
        if(Long.compare(0x1FL & v, 0L) == 0) {
            v4 = 0;
            v3 = 0;
            s = null;
            b0 = null;
            charSequence0 = null;
            d00 = null;
        }
        else {
            if((v & 24L) == 0L || w0 == null) {
                v2 = 0;
                s = null;
                b0 = null;
                d00 = null;
            }
            else {
                s = w0.Z.c;
                v2 = w0.c0;
                d00 = w0.i0;
                b0 = (g3.b)this.w;
                if(b0 == null) {
                    b0 = new g3.b(4, false);
                    this.w = b0;
                }
                b0.Y = w0;
            }
            if((v & 25L) == 0L) {
                charSequence0 = null;
            }
            else {
                B0 b00 = w0 == null ? null : w0.g0;
                R1.j.e(this, 0, b00);
                charSequence0 = b00 == null ? null : ((String)b00.getValue());
            }
            if((v & 26L) == 0L) {
                v3 = 0;
            }
            else {
                j0 j00 = w0 == null ? null : w0.j0;
                R1.j.e(this, 1, j00);
                v3 = g.p((j00 == null ? null : ((Integer)((B0)j00.X).getValue())));
            }
            if((v & 28L) != 0L) {
                B0 b01 = w0 == null ? null : w0.h0;
                R1.j.e(this, 2, b01);
                if(b01 != null) {
                    integer0 = (Integer)b01.getValue();
                }
                v1 = g.p(integer0);
            }
            v4 = v1;
            v1 = v2;
        }
        if((v & 24L) != 0L) {
            ((TextInputLayout)this.u).setHint(s);
            U0.c(((TextInputLayout)this.u), d00);
            ((RequesterEditText)this.v).setOnRequest(b0);
            U0.m(((RequesterEditText)this.v), v1);
        }
        if((v & 25L) != 0L) {
            f.M(((RequesterEditText)this.v), charSequence0);
        }
        if((28L & v) != 0L) {
            ((RequesterEditText)this.v).setSelection(v4);
        }
        if((v & 26L) != 0L && g.m >= 3) {
            ((RequesterEditText)this.v).setRawInputType(v3);
        }
    }

    private final boolean z() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }
}

