package i9;

import Ab.k;
import Bb.q;
import M9.c;
import Nb.j;
import R1.g;
import W4.f;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.Country;
import com.sendwave.util.CurrencyAmountView;
import com.wave.models.ProposedTransfer;
import j9.a;
import q9.M0;
import q9.U0;
import q9.l1;
import q9.u0;

public final class w extends v implements a {
    public final ImageButton D;
    public final LinearLayout E;
    public final TextView F;
    public final Button G;
    public final RelativeLayout H;
    public final RelativeLayout I;
    public final c J;
    public final c K;
    public long L;
    public static final SparseIntArray M;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        w.M = sparseIntArray0;
        sparseIntArray0.put(0x7F0A00E7, 18);  // id:confirm_to
        sparseIntArray0.put(0x7F0A00E8, 19);  // id:confirm_to_label
        sparseIntArray0.put(0x7F0A00E6, 20);  // id:confirm_send_label
        sparseIntArray0.put(0x7F0A00E4, 21);  // id:confirm_receive_label
    }

    public w(View view0) {
        Object[] arr_object = g.l(view0, 22, null, w.M);
        CurrencyAmountView currencyAmountView0 = (CurrencyAmountView)arr_object[11];
        TextView textView0 = (TextView)arr_object[10];
        TextView textView1 = (TextView)arr_object[8];
        TextView textView2 = (TextView)arr_object[7];
        CurrencyAmountView currencyAmountView1 = (CurrencyAmountView)arr_object[12];
        TextView textView3 = (TextView)arr_object[21];
        CurrencyAmountView currencyAmountView2 = (CurrencyAmountView)arr_object[5];
        TextView textView4 = (TextView)arr_object[20];
        RelativeLayout relativeLayout0 = (RelativeLayout)arr_object[18];
        TextView textView5 = (TextView)arr_object[19];
        super(null, view0, currencyAmountView0, textView0, textView1, textView2, currencyAmountView1, currencyAmountView2, ((CurrencyAmountView)arr_object[15]), ((TextView)arr_object[14]), ((TextView)arr_object[4]), ((ImageView)arr_object[2]), ((TextView)arr_object[3]));
        this.L = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.v.setTag(null);
        ((LinearLayout)arr_object[0]).setTag(null);
        this.D = (ImageButton)arr_object[1];
        ((ImageButton)arr_object[1]).setTag(null);
        this.E = (LinearLayout)arr_object[13];
        ((LinearLayout)arr_object[13]).setTag(null);
        this.F = (TextView)arr_object[16];
        ((TextView)arr_object[16]).setTag(null);
        this.G = (Button)arr_object[17];
        ((Button)arr_object[17]).setTag(null);
        this.H = (RelativeLayout)arr_object[6];
        ((RelativeLayout)arr_object[6]).setTag(null);
        this.I = (RelativeLayout)arr_object[9];
        ((RelativeLayout)arr_object[9]).setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.s(view0);
        this.J = new c(1, 2, this);
        this.K = new c(2, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                u0 u00 = this.C;
                if(u00 != null) {
                    u00.a();
                    return;
                }
                break;
            }
            case 2: {
                u0 u01 = this.C;
                if(u01 != null) {
                    u01.b.onClick(u01.a, -1);
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        long v5;
        boolean z7;
        CharSequence charSequence0;
        String s10;
        Drawable drawable1;
        String s9;
        boolean z6;
        boolean z5;
        String s8;
        boolean z4;
        CurrencyAmount currencyAmount5;
        boolean z3;
        CurrencyAmount currencyAmount4;
        int v4;
        int v3;
        Drawable drawable0;
        String s7;
        CurrencyAmount currencyAmount3;
        String s6;
        boolean z2;
        int v1;
        String s5;
        String s4;
        String s3;
        String s2;
        CurrencyAmount currencyAmount2;
        k k0;
        String s1;
        Integer integer0;
        CurrencyAmount currencyAmount1;
        CurrencyAmount currencyAmount0;
        boolean z;
        String s;
        synchronized(this) {
            v = this.L;
            this.L = 0L;
        }
        ProposedTransfer proposedTransfer0 = this.B;
        if(Long.compare(v & 5L, 0L) == 0) {
            charSequence0 = null;
            drawable1 = null;
            z7 = false;
            s2 = null;
            s3 = null;
            z2 = false;
            currencyAmount4 = null;
            z4 = false;
            z5 = false;
            s = null;
            z6 = false;
            currencyAmount0 = null;
            currencyAmount1 = null;
            s10 = null;
            s8 = null;
            s9 = null;
            currencyAmount5 = null;
            v4 = 0;
            v3 = 0;
            z3 = false;
        }
        else {
            if(proposedTransfer0 == null) {
                s5 = null;
                s1 = null;
                s2 = null;
                s3 = null;
                integer0 = null;
                k0 = null;
                currencyAmount2 = null;
                s = null;
                z = false;
                currencyAmount0 = null;
                currencyAmount1 = null;
                s4 = null;
                v1 = 0;
            }
            else {
                s = proposedTransfer0.f0;
                z = proposedTransfer0.o0;
                currencyAmount0 = proposedTransfer0.Z;
                currencyAmount1 = proposedTransfer0.Y;
                integer0 = proposedTransfer0.p0;
                Country country0 = M0.c(proposedTransfer0.X);
                j.c(country0);
                boolean z1 = country0.equals(proposedTransfer0.g0);
                s1 = proposedTransfer0.i0;
                k0 = proposedTransfer0.m0;
                currencyAmount2 = proposedTransfer0.c0;
                s2 = proposedTransfer0.b0;
                s3 = proposedTransfer0.d0;
                s4 = proposedTransfer0.n0;
                s5 = l1.d(proposedTransfer0.X, proposedTransfer0.g0.Y);
                v1 = !z1;
            }
            v |= (v1 == 0 ? 8L : 16L);
            z2 = s != null;
            int v2 = g.p(integer0);
            if((v & 5L) != 0L) {
                v |= (k0 == null ? 0x20L : 0x40L);
            }
            if(k0 == null) {
                s6 = null;
                currencyAmount3 = null;
            }
            else {
                s6 = (String)k0.X;
                currencyAmount3 = (CurrencyAmount)k0.Y;
            }
            if(k0 == null) {
                s7 = s6;
                drawable0 = q.v(this.G.getContext(), 0x7F080304);  // drawable:oval_corners_button
            }
            else {
                s7 = s6;
                drawable0 = q.v(this.G.getContext(), 0x7F080306);  // drawable:oval_corners_button_violet
            }
            v3 = v1 == 0 ? 8 : 0;
            v4 = v2;
            currencyAmount4 = currencyAmount2;
            z3 = z;
            currencyAmount5 = currencyAmount3;
            z4 = s4 != null;
            s8 = s5;
            z5 = k0 != null;
            z6 = s3 != null;
            s9 = s7;
            drawable1 = drawable0;
            s10 = s1;
            charSequence0 = s4;
            z7 = s2 != null;
        }
        if((v & 5L) == 0L) {
            v5 = v;
        }
        else {
            v5 = v;
            this.q.setCurrencyAmount(currencyAmount4);
            f.M(this.r, s2);
            f.M(this.s, s);
            f.M(this.t, s3);
            U0.o(this.t, z6);
            this.u.setCurrencyAmount(currencyAmount0);
            this.v.setCurrencyAmount(currencyAmount1);
            U0.o(this.E, z5);
            U0.o(this.F, z4);
            f.M(this.F, charSequence0);
            this.G.setBackground(drawable1);
            U0.o(this.H, z2);
            U0.o(this.I, z7);
            this.w.setCurrencyAmount(currencyAmount5);
            f.M(this.x, s9);
            f.M(this.y, s8);
            U0.j(this.z, v4);
            this.z.setVisibility(v3);
            U0.o(this.A, z3);
            f.M(this.A, s10);
        }
        if((v5 & 4L) != 0L) {
            this.D.setOnClickListener(this.J);
            this.G.setOnClickListener(this.K);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.L != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.L = 4L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(20 == v) {
            this.B = (ProposedTransfer)object0;
            synchronized(this) {
                this.L |= 1L;
            }
            this.o();
            return true;
        }
        if(10 == v) {
            this.u(((u0)object0));
            return true;
        }
        return false;
    }

    public final void u(u0 u00) {
        this.C = u00;
        synchronized(this) {
            this.L |= 2L;
        }
        this.o();
    }
}

