package L9;

import K9.J;
import K9.Q;
import K9.Y;
import M9.b;
import M9.c;
import R1.g;
import R2.w;
import W4.f;
import Y8.N;
import ac.B0;
import ac.h0;
import ac.h;
import ac.j0;
import ac.z0;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.androidApi.Contact;
import com.sendwave.components.RequestListener;
import com.sendwave.components.RequesterEditText;
import com.sendwave.util.Country;
import com.wave.components.sendmoney.SendMoneyDialogParams;
import f9.o0;
import q9.U0;

public final class j extends i implements b {
    public final c H;
    public final c I;
    public B3.c J;
    public U7.c K;
    public long L;
    public static final w M;
    public static final SparseIntArray N;

    static {
        w w0 = new w(25);
        j.M = w0;
        w0.G(2, new int[]{13}, new String[]{"overdraft_banner"}, new int[]{0x7F0D00AF});  // layout:overdraft_banner
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        j.N = sparseIntArray0;
        sparseIntArray0.put(0x7F0A01BC, 14);  // id:main_container
        sparseIntArray0.put(0x7F0A00EA, 15);  // id:confirm_transfer_recipient_field
        sparseIntArray0.put(0x7F0A0264, 16);  // id:recipient_label
        sparseIntArray0.put(0x7F0A0167, 17);  // id:guideline
        sparseIntArray0.put(0x7F0A0261, 18);  // id:recipient_border
        sparseIntArray0.put(0x7F0A007F, 19);  // id:balance_amount
        sparseIntArray0.put(0x7F0A0080, 20);  // id:balance_overdraft_separator
        sparseIntArray0.put(0x7F0A0226, 21);  // id:overdraft_amount
        sparseIntArray0.put(0x7F0A01A8, 22);  // id:linearLayout2
        sparseIntArray0.put(0x7F0A029E, 23);  // id:send_button_shadow
        sparseIntArray0.put(0x7F0A029D, 24);  // id:send_button_bg
    }

    public j(View view0) {
        Object[] arr_object = g.l(view0, 25, j.M, j.N);
        TextView textView0 = (TextView)arr_object[11];
        TextView textView1 = (TextView)arr_object[19];
        TextView textView2 = (TextView)arr_object[20];
        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
        ConstraintLayout constraintLayout1 = (ConstraintLayout)arr_object[15];
        TextView textView3 = (TextView)arr_object[10];
        Guideline guideline0 = (Guideline)arr_object[17];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[22];
        ScrollView scrollView0 = (ScrollView)arr_object[14];
        TextView textView4 = (TextView)arr_object[21];
        d d0 = (d)arr_object[13];
        TextInputLayout textInputLayout0 = (TextInputLayout)arr_object[8];
        RequesterEditText requesterEditText0 = (RequesterEditText)arr_object[9];
        View view1 = (View)arr_object[18];
        TextView textView5 = (TextView)arr_object[5];
        ImageView imageView0 = (ImageView)arr_object[3];
        TextView textView6 = (TextView)arr_object[16];
        TextView textView7 = (TextView)arr_object[4];
        TextInputLayout textInputLayout1 = (TextInputLayout)arr_object[6];
        RequesterEditText requesterEditText1 = (RequesterEditText)arr_object[7];
        Button button0 = (Button)arr_object[12];
        View view2 = (View)arr_object[24];
        View view3 = (View)arr_object[23];
        super(null, view0, textView0, textView1, textView2, constraintLayout0, textView3, textView4, d0, textInputLayout0, requesterEditText0, textView5, imageView0, textView7, textInputLayout1, requesterEditText1, button0, ((Toolbar)arr_object[1]));
        this.L = -1L;
        this.q.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        ((ConstraintLayout)arr_object[2]).setTag(null);
        d d1 = this.w;
        if(d1 != null) {
            d1.i = this;
        }
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.s(view0);
        this.H = new c(1, 0, this);
        this.I = new c(2, 0, this);
        this.j();
    }

    public final boolean A(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 1L;
            }
            return true;
        }
        return false;
    }

    public final boolean B(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 16L;
            }
            return true;
        }
        return false;
    }

    public final boolean C(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override  // M9.b
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                com.wave.components.sendmoney.d d0 = this.G;
                if(d0 != null) {
                    J j0 = new J(d0, null);
                    N.k(d0, d0.i0, true, j0);
                    return;
                }
                break;
            }
            case 2: {
                com.wave.components.sendmoney.d d1 = this.G;
                if(d1 != null) {
                    com.wave.components.sendmoney.c c0 = new com.wave.components.sendmoney.c(d1, null);
                    N.k(d1, d1.i0, true, c0);
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        String s13;
        RequestListener requestListener3;
        int v12;
        CharSequence charSequence4;
        boolean z5;
        String s12;
        int v11;
        String s11;
        CharSequence charSequence3;
        boolean z4;
        CharSequence charSequence2;
        h h0;
        boolean z3;
        RequestListener requestListener2;
        CharSequence charSequence1;
        CharSequence charSequence0;
        int v10;
        long v9;
        j0 j02;
        int v8;
        String s10;
        String s9;
        RequestListener requestListener1;
        String s8;
        RequestListener requestListener0;
        B0 b03;
        B3.c c3;
        B3.c c2;
        U7.c c1;
        String s7;
        int v7;
        int v6;
        int v5;
        B0 b02;
        int v4;
        int v3;
        B0 b01;
        String s6;
        String s5;
        boolean z2;
        String s4;
        B0 b00;
        int v2;
        int v1;
        Country country1;
        Integer integer0;
        String s3;
        Q q0;
        String s2;
        String s1;
        Y y0;
        Country country0;
        String s;
        SendMoneyDialogParams sendMoneyDialogParams0;
        boolean z = true;
        synchronized(this) {
            v = this.L;
            this.L = 0L;
        }
        com.wave.components.sendmoney.d d0 = this.G;
        if(Long.compare(0x7FDL & v, 0L) == 0) {
            v12 = 0;
            h0 = null;
            requestListener2 = null;
            charSequence2 = null;
            z5 = false;
            b00 = null;
            requestListener3 = null;
            s12 = null;
            charSequence4 = null;
            charSequence3 = null;
            s2 = null;
            q0 = null;
            v1 = 0;
            v11 = 0;
            z4 = false;
            v10 = 0;
            z3 = false;
            charSequence0 = null;
            s11 = null;
            charSequence1 = null;
        }
        else {
            if(Long.compare(v & 0x600L, 0L) == 0) {
                v2 = 0;
                v1 = 0;
                s = null;
                y0 = null;
                s1 = null;
                s2 = null;
                q0 = null;
                s3 = null;
            }
            else {
                if(d0 == null) {
                    sendMoneyDialogParams0 = null;
                    s = null;
                    country0 = null;
                    y0 = null;
                    s1 = null;
                    s2 = null;
                    q0 = null;
                }
                else {
                    sendMoneyDialogParams0 = d0.Z;
                    s = sendMoneyDialogParams0.Y.Z == null ? "" : sendMoneyDialogParams0.Y.Z;
                    country0 = d0.b0;
                    y0 = d0.E0;
                    s1 = d0.k0;
                    s2 = d0.l0;
                    q0 = d0.q0;
                }
                Contact contact0 = sendMoneyDialogParams0 == null ? null : sendMoneyDialogParams0.Y;
                if(contact0 == null) {
                    country1 = null;
                    integer0 = null;
                    s3 = null;
                }
                else {
                    s3 = contact0.b();
                    integer0 = contact0.h0;
                    country1 = contact0.g0;
                }
                v1 = g.p(integer0);
                boolean z1 = country1 != country0;
                v |= (z1 ? 0x1000L : 0x800L);
                v2 = z1 ? 0 : 8;
            }
            if((v & 0x601L) == 0L) {
                b00 = null;
            }
            else {
                b00 = d0 == null ? null : d0.n0;
                R1.j.e(this, 0, b00);
                if(b00 != null) {
                    Integer integer1 = (Integer)b00.getValue();
                }
            }
            if((v & 0x610L) == 0L) {
                s4 = null;
                z2 = false;
            }
            else {
                j0 j00 = d0 == null ? null : d0.A0;
                R1.j.e(this, 4, j00);
                s4 = j00 == null ? null : ((String)((B0)j00.X).getValue());
                z2 = s4 == null ? false : true;
            }
            if((v & 0x620L) == 0L) {
                s5 = null;
                z = false;
            }
            else {
                j0 j01 = d0 == null ? null : d0.B0;
                R1.j.e(this, 5, j01);
                s5 = j01 == null ? null : ((String)((B0)j01.X).getValue());
                if(s5 == null) {
                    z = false;
                }
            }
            if((v & 1740L) == 0L) {
                s6 = s5;
                v3 = v2;
                s7 = s4;
                v8 = 0;
                s10 = null;
                s9 = null;
                requestListener1 = null;
                v5 = 0;
                requestListener0 = null;
            }
            else {
                o0 o00 = d0 == null ? null : d0.p0;
                if((v & 0x604L) == 0L) {
                    s6 = s5;
                    v3 = v2;
                    v4 = 0;
                }
                else {
                    s6 = s5;
                    if(o00 == null) {
                        v3 = v2;
                        b01 = null;
                    }
                    else {
                        b01 = o00.j0;
                        v3 = v2;
                    }
                    R1.j.e(this, 2, b01);
                    v4 = g.p((b01 == null ? null : ((Integer)b01.getValue())));
                }
                if((v & 0x608L) == 0L) {
                    v5 = v4;
                    v6 = 0;
                }
                else {
                    if(o00 == null) {
                        v5 = v4;
                        b02 = null;
                    }
                    else {
                        b02 = o00.l0;
                        v5 = v4;
                    }
                    R1.j.e(this, 3, b02);
                    v6 = g.p((b02 == null ? null : ((Integer)b02.getValue())));
                }
                if((v & 0x600L) == 0L || o00 == null) {
                    v7 = v6;
                    s7 = s4;
                    c1 = null;
                    c3 = null;
                }
                else {
                    B3.c c0 = this.J;
                    if(c0 == null) {
                        v7 = v6;
                        s7 = s4;
                        c0 = new B3.c(12, false);
                        this.J = c0;
                    }
                    else {
                        v7 = v6;
                        s7 = s4;
                    }
                    c0.Y = o00;
                    c1 = this.K;
                    if(c1 == null) {
                        c2 = c0;
                        c1 = new U7.c(12, false);
                        this.K = c1;
                    }
                    else {
                        c2 = c0;
                    }
                    c1.Y = o00;
                    c3 = c2;
                }
                if((v & 1600L) == 0L) {
                    requestListener0 = c1;
                    s8 = null;
                }
                else {
                    if(o00 == null) {
                        requestListener0 = c1;
                        b03 = null;
                    }
                    else {
                        b03 = o00.k0;
                        requestListener0 = c1;
                    }
                    R1.j.e(this, 6, b03);
                    s8 = b03 == null ? null : ((String)b03.getValue());
                }
                if((v & 0x680L) == 0L) {
                label_153:
                    s10 = s8;
                    requestListener1 = c3;
                    v8 = v7;
                    s9 = null;
                }
                else {
                    B0 b04 = o00 == null ? null : o00.i0;
                    R1.j.e(this, 7, b04);
                    if(b04 != null) {
                        requestListener1 = c3;
                        s9 = (String)b04.getValue();
                        s10 = s8;
                        v8 = v7;
                        goto label_167;
                    }
                    goto label_153;
                }
            }
        label_167:
            if((v & 0x700L) == 0L) {
                v10 = v8;
                charSequence0 = s10;
                charSequence1 = s9;
                requestListener2 = requestListener1;
                z3 = z2;
                h0 = y0;
                charSequence2 = s1;
                z4 = z;
                charSequence3 = s3;
                s11 = s6;
                v12 = v3;
                v11 = v5;
                s12 = s7;
                z5 = false;
                charSequence4 = s;
            }
            else {
                if(d0 == null) {
                    v9 = v;
                    j02 = null;
                }
                else {
                    j02 = d0.x0;
                    v9 = v;
                }
                R1.j.e(this, 8, j02);
                v10 = v8;
                charSequence0 = s10;
                charSequence1 = s9;
                requestListener2 = requestListener1;
                z3 = z2;
                h0 = y0;
                charSequence2 = s1;
                z4 = z;
                charSequence3 = s3;
                s11 = s6;
                v11 = v5;
                s12 = s7;
                v = v9;
                z5 = g.q((j02 == null ? null : ((Boolean)((B0)j02.X).getValue())));
                charSequence4 = s;
                v12 = v3;
            }
            requestListener3 = requestListener0;
        }
        if((v & 0x700L) == 0L) {
            s13 = s12;
        }
        else {
            s13 = s12;
            U0.o(this.q, z5);
        }
        if((v & 0x601L) != 0L) {
            U0.i(this.t, b00);
        }
        if((v & 0x600L) != 0L) {
            U0.e(this.u, q0);
            this.x.setHint(s2);
            this.y.setOnRequest(requestListener3);
            f.M(this.z, charSequence4);
            U0.j(this.A, v1);
            this.A.setVisibility(v12);
            f.M(this.B, charSequence3);
            this.C.setHint(charSequence2);
            this.D.setOnRequest(requestListener2);
            U0.b(this.E, h0);
        }
        if((v & 0x610L) != 0L) {
            this.x.setError(s13);
            this.x.setErrorEnabled(z3);
        }
        if((1600L & v) != 0L) {
            f.M(this.y, charSequence0);
        }
        if((0x608L & v) != 0L) {
            this.y.setSelection(v10);
        }
        if((v & 0x620L) != 0L) {
            this.C.setErrorEnabled(z4);
            this.C.setError(s11);
        }
        if((0x680L & v) != 0L) {
            f.M(this.D, charSequence1);
        }
        if((0x604L & v) != 0L) {
            this.D.setSelection(v11);
        }
        if((v & 0x400L) != 0L) {
            this.E.setOnClickListener(this.I);
            this.F.setOnClickListener(this.H);
        }
        this.w.g();
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(Long.compare(this.L, 0L) != 0) {
                return true;
            }
        }
        return this.w.i();
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.L = 0x400L;
        }
        this.w.j();
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                h0 h00 = (h0)object0;
                return this.A(v1);
            }
            case 1: {
                d d0 = (d)object0;
                return this.v(v1);
            }
            case 2: {
                h0 h01 = (h0)object0;
                return this.y(v1);
            }
            case 3: {
                h0 h02 = (h0)object0;
                return this.w(v1);
            }
            case 4: {
                z0 z00 = (z0)object0;
                return this.B(v1);
            }
            case 5: {
                z0 z01 = (z0)object0;
                return this.C(v1);
            }
            case 6: {
                h0 h03 = (h0)object0;
                return this.x(v1);
            }
            case 7: {
                h0 h04 = (h0)object0;
                return this.z(v1);
            }
            case 8: {
                z0 z02 = (z0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.L |= 0x100L;
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
    public final void r(LifecycleOwner lifecycleOwner0) {
        super.r(lifecycleOwner0);
        this.w.r(lifecycleOwner0);
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(30 == v) {
            this.u(((com.wave.components.sendmoney.d)object0));
            return true;
        }
        return false;
    }

    @Override  // L9.i
    public final void u(com.wave.components.sendmoney.d d0) {
        this.G = d0;
        synchronized(this) {
            this.L |= 0x200L;
        }
        this.o();
    }

    public final boolean v(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 2L;
            }
            return true;
        }
        return false;
    }

    public final boolean w(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 8L;
            }
            return true;
        }
        return false;
    }

    public final boolean x(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 0x40L;
            }
            return true;
        }
        return false;
    }

    public final boolean y(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 4L;
            }
            return true;
        }
        return false;
    }

    public final boolean z(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 0x80L;
            }
            return true;
        }
        return false;
    }
}

