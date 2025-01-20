package i9;

import M9.c;
import R1.g;
import W4.f;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.CurrencyAmountView;
import j9.a;
import q9.u0;

public final class r extends q implements a {
    public final Button A;
    public final c B;
    public final c C;
    public long D;
    public final TextView w;
    public final ImageButton x;
    public final TextView y;
    public final CurrencyAmountView z;

    public r(View view0) {
        Object[] arr_object = g.l(view0, 7, null, null);
        super(null, view0, ((SimpleRecyclerView)arr_object[3]));
        this.D = -1L;
        this.q.setTag(null);
        ((LinearLayout)arr_object[0]).setTag(null);
        this.w = (TextView)arr_object[1];
        ((TextView)arr_object[1]).setTag(null);
        this.x = (ImageButton)arr_object[2];
        ((ImageButton)arr_object[2]).setTag(null);
        this.y = (TextView)arr_object[4];
        ((TextView)arr_object[4]).setTag(null);
        this.z = (CurrencyAmountView)arr_object[5];
        ((CurrencyAmountView)arr_object[5]).setTag(null);
        this.A = (Button)arr_object[6];
        ((Button)arr_object[6]).setTag(null);
        this.s(view0);
        this.B = new c(1, 2, this);
        this.C = new c(2, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                u0 u00 = this.v;
                if(u00 != null) {
                    u00.a();
                    return;
                }
                break;
            }
            case 2: {
                u0 u01 = this.v;
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
        synchronized(this) {
            v = this.D;
            this.D = 0L;
        }
        Adapter recyclerView$Adapter0 = this.s;
        String s = this.u;
        String s1 = this.t;
        CurrencyAmount currencyAmount0 = this.r;
        int v1 = Long.compare(36L & v, 0L);
        int v2 = Long.compare(40L & v, 0L);
        int v3 = Long.compare(0x30L & v, 0L);
        if(Long.compare(34L & v, 0L) != 0) {
            this.q.setAdapter(recyclerView$Adapter0);
        }
        if(v1 != 0) {
            f.M(this.w, s);
        }
        if((v & 0x20L) != 0L) {
            this.x.setOnClickListener(this.B);
            this.A.setOnClickListener(this.C);
        }
        if(v2 != 0) {
            f.M(this.y, s1);
        }
        if(v3 != 0) {
            this.z.setCurrencyAmount(currencyAmount0);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.D != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.D = 0x20L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(10 == v) {
            this.w(((u0)object0));
            return true;
        }
        if(14 == v) {
            this.x(((Adapter)object0));
            return true;
        }
        if(9 == v) {
            this.v(((String)object0));
            return true;
        }
        if(28 == v) {
            this.y(((String)object0));
            return true;
        }
        if(6 == v) {
            this.u(((CurrencyAmount)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.q
    public final void u(CurrencyAmount currencyAmount0) {
        this.r = currencyAmount0;
        synchronized(this) {
            this.D |= 16L;
        }
        this.o();
    }

    @Override  // i9.q
    public final void v(String s) {
        this.u = s;
        synchronized(this) {
            this.D |= 4L;
        }
        this.o();
    }

    @Override  // i9.q
    public final void w(u0 u00) {
        this.v = u00;
        synchronized(this) {
            this.D |= 1L;
        }
        this.o();
    }

    @Override  // i9.q
    public final void x(Adapter recyclerView$Adapter0) {
        this.s = recyclerView$Adapter0;
        synchronized(this) {
            this.D |= 2L;
        }
        this.o();
    }

    @Override  // i9.q
    public final void y(String s) {
        this.t = s;
        synchronized(this) {
            this.D |= 8L;
        }
        this.o();
    }
}

