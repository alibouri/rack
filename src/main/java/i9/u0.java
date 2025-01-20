package i9;

import M9.c;
import N2.l;
import Nb.j;
import Qa.T;
import R1.g;
import Tb.e;
import W4.f;
import Y8.N;
import Y8.Z6;
import Y8.j7;
import ac.B0;
import ac.h0;
import ac.h;
import ac.j0;
import ac.z0;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.sendwave.components.CodeEntryEditText;
import com.sendwave.components.KeypadView;
import com.sendwave.util.supportChannels.SupportChannelsModalComposeView;
import j9.a;
import j9.b;
import java.util.Map;
import o9.U0;
import o9.Z1;
import o9.d2;
import o9.e2;
import o9.m0;
import o9.s2;
import q9.P0;
import q9.Q0;

public final class u0 extends t0 implements a, b {
    public final c A;
    public final c B;
    public final g.a C;
    public final c D;
    public long E;
    public static final SparseIntArray F;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        u0.F = sparseIntArray0;
        sparseIntArray0.put(0x7F0A031E, 9);  // id:verify_auth_code_root
        sparseIntArray0.put(0x7F0A00AE, 10);  // id:button_group
        sparseIntArray0.put(0x7F0A0197, 11);  // id:keypad
    }

    public u0(View view0) {
        Object[] arr_object = g.l(view0, 12, null, u0.F);
        Button button0 = (Button)arr_object[7];
        Button button1 = (Button)arr_object[6];
        Button button2 = (Button)arr_object[5];
        RelativeLayout relativeLayout0 = (RelativeLayout)arr_object[10];
        TextView textView0 = (TextView)arr_object[2];
        KeypadView keypadView0 = (KeypadView)arr_object[11];
        super(null, view0, button0, button1, button2, textView0, ((ProgressBar)arr_object[4]), ((CodeEntryEditText)arr_object[3]), ((SupportChannelsModalComposeView)arr_object[8]), ((Toolbar)arr_object[1]), ((RelativeLayout)arr_object[9]));
        this.E = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        ((FrameLayout)arr_object[0]).setTag(null);
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        this.s(view0);
        this.A = new c(2, 2, this);
        this.B = new c(3, 2, this);
        this.C = new g.a(this);
        this.D = new c(4, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 2: {
                s2 s21 = this.z;
                if(s21 != null) {
                    Map map1 = com.apollographql.apollo.api.b.t("user_entry", s21.c0.X);
                    s21.b0.d("click resend SMS button", map1);
                    e[] arr_e = s2.N0;
                    Boolean boolean0 = (Boolean)s21.A0.a(arr_e[3], s21);
                    if(boolean0 != null) {
                        boolean z = boolean0.booleanValue();
                        String s = (String)s21.k0.a(arr_e[0], s21);
                        if(s != null) {
                            e2 e20 = new e2(s21, new j7(s), z, null);
                            N.k(s21, s21.j0, true, e20);
                            return;
                        }
                    }
                }
                break;
            }
            case 3: {
                s2 s22 = this.z;
                if(s22 != null) {
                    Map map2 = com.apollographql.apollo.api.b.t("user_entry", s22.c0.X);
                    s22.b0.d("click receive code by phone button", map2);
                    String s1 = (String)s22.k0.a(s2.N0[0], s22);
                    if(s1 != null) {
                        d2 d20 = new d2(s22, new Z6(s1), null);
                        N.k(s22, s22.j0, true, d20);
                        return;
                    }
                }
                break;
            }
            default: {
                if(v == 4) {
                    s2 s20 = this.z;
                    if(s20 != null) {
                        Map map0 = com.apollographql.apollo.api.b.t("user_entry", s20.c0.X);
                        s20.b0.d("click contact Wave support button", map0);
                        Z1 z10 = new Z1(s20, null);
                        N.k(s20, s20.j0, true, z10);
                    }
                }
            }
        }
    }

    @Override  // j9.b
    public final void b(CharSequence charSequence0) {
        s2 s20 = this.z;
        if(s20 != null && charSequence0 != null) {
            String s = charSequence0.toString();
            j.f(s, "s");
            s20.s0 = s;
            Integer integer0 = (Integer)s20.p0.a(s2.N0[2], s20);
            if(integer0 != null && s.length() == ((int)integer0)) {
                s20.q(false);
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        String s2;
        boolean z4;
        CharSequence charSequence0;
        h h1;
        h h0;
        String s1;
        boolean z3;
        boolean z2;
        boolean z1;
        T t1;
        U0 u00;
        T t0;
        l l1;
        l l0;
        String s;
        boolean z;
        synchronized(this) {
            long v = this.E;
            this.E = 0L;
        }
        s2 s20 = this.z;
        if(Long.compare(0xFFL & v, 0L) == 0) {
            z3 = false;
            h0 = null;
            z = false;
            z4 = false;
            h1 = null;
            charSequence0 = null;
            u00 = null;
            t1 = null;
            s1 = null;
            z2 = false;
            l1 = null;
        }
        else {
            if((v & 0xC1L) == 0L) {
                z = false;
            }
            else {
                j0 j00 = s20 == null ? null : s20.D0;
                R1.j.e(this, 0, j00);
                z = g.q((j00 == null ? null : ((Boolean)((B0)j00.X).getValue())));
            }
            if((v & 0xC2L) == 0L) {
                s = null;
            }
            else {
                j0 j01 = s20 == null ? null : s20.z0;
                R1.j.e(this, 1, j01);
                s = j01 == null ? null : ((String)((B0)j01.X).getValue());
            }
            if((v & 0xC0L) == 0L || s20 == null) {
                l0 = null;
                t0 = null;
                u00 = null;
                t1 = null;
                l1 = null;
            }
            else {
                l0 = s20.r0;
                l1 = s20.q0;
                t0 = s20.E0;
                u00 = s20.o0;
                t1 = s20.C0;
            }
            if((v & 0xC4L) == 0L) {
                z1 = false;
            }
            else {
                j0 j02 = s20 == null ? null : s20.F0;
                R1.j.e(this, 2, j02);
                z1 = g.q((j02 == null ? null : ((Boolean)((B0)j02.X).getValue())));
            }
            if((v & 200L) == 0L) {
                z2 = false;
            }
            else {
                j0 j03 = s20 == null ? null : s20.n0;
                R1.j.e(this, 3, j03);
                z2 = g.q((j03 == null ? null : ((Boolean)((B0)j03.X).getValue())));
            }
            if((v & 0xD0L) == 0L) {
                z3 = false;
            }
            else {
                j0 j04 = s20 == null ? null : s20.B0;
                R1.j.e(this, 4, j04);
                z3 = g.q((j04 == null ? null : ((Boolean)((B0)j04.X).getValue())));
            }
            if((v & 0xE0L) == 0L) {
            label_61:
                h0 = l0;
                h1 = t0;
                charSequence0 = s;
                z4 = z1;
                s1 = null;
            }
            else {
                B0 b00 = s20 == null ? null : s20.h0;
                R1.j.e(this, 5, b00);
                if(b00 != null) {
                    s1 = (String)b00.getValue();
                    h0 = l0;
                    h1 = t0;
                    charSequence0 = s;
                    z4 = z1;
                    goto label_78;
                }
                goto label_61;
            }
        }
    label_78:
        if((v & 0x80L) == 0L) {
            s2 = s1;
        }
        else {
            s2 = s1;
            this.q.setOnClickListener(this.D);
            this.r.setOnClickListener(this.B);
            this.s.setOnClickListener(this.A);
            f.N(this.v, this.C);
        }
        if((v & 0xC4L) != 0L) {
            q9.U0.o(this.q, z4);
        }
        if((v & 0xC1L) != 0L) {
            q9.U0.o(this.r, z);
        }
        if((0xC0L & v) != 0L) {
            q9.U0.b(this.r, h1);
            q9.U0.b(this.s, t1);
            q9.U0.e(this.t, h0);
            j.f(this.v, "<this>");
            P0 p00 = new P0(this.v, 2);
            q9.U0.a(this.v, l1, p00);
            j.f(this.v, "<this>");
            Q0 q00 = new Q0(this.v, 1);
            q9.U0.a(this.v, u00, q00);
            j.f(this.v, "<this>");
            m0 m00 = new m0(4, this.v);
            q9.U0.a(this.v, u00, m00);
            this.w.setItem(s20);
        }
        if((v & 0xC2L) != 0L) {
            f.M(this.s, charSequence0);
        }
        if((0xD0L & v) != 0L) {
            q9.U0.o(this.s, z3);
        }
        if((200L & v) != 0L) {
            q9.U0.o(this.u, z2);
        }
        if((v & 0xE0L) != 0L) {
            this.x.setTitle(s2);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.E != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.E = 0x80L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                z0 z04 = (z0)object0;
                return this.w(v1);
            }
            case 1: {
                z0 z03 = (z0)object0;
                return this.z(v1);
            }
            case 2: {
                z0 z02 = (z0)object0;
                return this.v(v1);
            }
            case 3: {
                z0 z01 = (z0)object0;
                return this.y(v1);
            }
            case 4: {
                z0 z00 = (z0)object0;
                return this.x(v1);
            }
            case 5: {
                h0 h00 = (h0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.E |= 0x20L;
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

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(30 == v) {
            this.u(((s2)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.t0
    public final void u(s2 s20) {
        this.z = s20;
        synchronized(this) {
            this.E |= 0x40L;
        }
        this.o();
    }

    public final boolean v(int v) {
        if(v == 0) {
            synchronized(this) {
                this.E |= 4L;
            }
            return true;
        }
        return false;
    }

    public final boolean w(int v) {
        if(v == 0) {
            synchronized(this) {
                this.E |= 1L;
            }
            return true;
        }
        return false;
    }

    public final boolean x(int v) {
        if(v == 0) {
            synchronized(this) {
                this.E |= 16L;
            }
            return true;
        }
        return false;
    }

    public final boolean y(int v) {
        if(v == 0) {
            synchronized(this) {
                this.E |= 8L;
            }
            return true;
        }
        return false;
    }

    public final boolean z(int v) {
        if(v == 0) {
            synchronized(this) {
                this.E |= 2L;
            }
            return true;
        }
        return false;
    }
}

