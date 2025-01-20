package ca;

import K9.j;
import W4.f;
import android.util.SparseIntArray;
import android.widget.ImageView;
import com.sendwave.androidApi.Contact;
import q9.U0;

public final class h extends g {
    public long v;
    public static final SparseIntArray w;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        h.w = sparseIntArray0;
        sparseIntArray0.put(0x7F0A01BD, 4);  // id:main_text
        sparseIntArray0.put(0x7F0A0261, 5);  // id:recipient_border
    }

    @Override  // R1.g
    public final void f() {
        long v;
        int v2;
        CharSequence charSequence1;
        Integer integer0;
        Contact contact0;
        synchronized(this) {
            v = this.v;
            this.v = 0L;
        }
        j j0 = (j)this.u;
        int v1 = Long.compare(v & 3L, 0L);
        CharSequence charSequence0 = null;
        if(v1 == 0) {
            v2 = 0;
            charSequence1 = null;
        }
        else {
            if(j0 == null) {
                contact0 = null;
                integer0 = null;
            }
            else {
                contact0 = j0.a;
                integer0 = j0.b;
            }
            if(contact0 == null) {
                charSequence1 = null;
            }
            else {
                charSequence0 = contact0.c();
                charSequence1 = contact0.b();
            }
            v2 = R1.g.p(integer0);
        }
        if(v1 != 0) {
            U0.j(((ImageView)this.s), v2);
            f.M(this.q, charSequence0);
            f.M(this.r, charSequence1);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.v != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.v = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(16 == v) {
            this.u = (j)object0;
            synchronized(this) {
                this.v |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

