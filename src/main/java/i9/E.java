package i9;

import android.util.SparseIntArray;

public final class e extends d {
    public b A;
    public b B;
    public b C;
    public b D;
    public b E;
    public b F;
    public b G;
    public b H;
    public long I;
    public static final SparseIntArray J;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        e.J = sparseIntArray0;
        sparseIntArray0.put(0x7F0A02B4, 10);  // id:snap_mode
        sparseIntArray0.put(0x7F0A030B, 11);  // id:top_menu
        sparseIntArray0.put(0x7F0A02D8, 12);  // id:surface_view
        sparseIntArray0.put(0x7F0A016D, 13);  // id:header
        sparseIntArray0.put(0x7F0A02B3, 14);  // id:snap_menu
        sparseIntArray0.put(0x7F0A0252, 15);  // id:preview_mode
        sparseIntArray0.put(0x7F0A0244, 16);  // id:photo
        sparseIntArray0.put(0x7F0A0251, 17);  // id:preview_menu
        sparseIntArray0.put(0x7F0A01E2, 18);  // id:more_pages_back
        sparseIntArray0.put(0x7F0A01E3, 19);  // id:more_pages_dialog
        sparseIntArray0.put(0x7F0A0211, 20);  // id:notice_text
        sparseIntArray0.put(0x7F0A0335, 21);  // id:yes_btn
        sparseIntArray0.put(0x7F0A020C, 22);  // id:no_btn
    }

    @Override  // R1.g
    public final void f() {
        long v;
        b b7;
        b b6;
        b b5;
        b b4;
        b b3;
        b b2;
        b b1;
        b b0;
        synchronized(this) {
            v = this.I;
            this.I = 0L;
        }
        W8.e e0 = this.z;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || e0 == null) {
            b0 = null;
            b1 = null;
            b2 = null;
            b3 = null;
            b4 = null;
            b5 = null;
            b6 = null;
            b7 = null;
        }
        else {
            b0 = this.A;
            if(b0 == null) {
                b0 = new b(15);
                this.A = b0;
            }
            b0.Y = e0;
            b1 = this.B;
            if(b1 == null) {
                b1 = new b(8);
                this.B = b1;
            }
            b1.Y = e0;
            b2 = this.C;
            if(b2 == null) {
                b2 = new b(9);
                this.C = b2;
            }
            b2.Y = e0;
            b3 = this.D;
            if(b3 == null) {
                b3 = new b(10);
                this.D = b3;
            }
            b3.Y = e0;
            b4 = this.E;
            if(b4 == null) {
                b4 = new b(11);
                this.E = b4;
            }
            b4.Y = e0;
            b5 = this.F;
            if(b5 == null) {
                b5 = new b(12);
                this.F = b5;
            }
            b5.Y = e0;
            b6 = this.G;
            if(b6 == null) {
                b6 = new b(13);
                this.G = b6;
            }
            b6.Y = e0;
            b7 = this.H;
            if(b7 == null) {
                b7 = new b(14);
                this.H = b7;
            }
            b7.Y = e0;
        }
        if(v1 != 0) {
            this.q.setOnClickListener(b6);
            this.r.setOnClickListener(b6);
            this.s.setOnClickListener(b3);
            this.t.setOnClickListener(b5);
            this.u.setOnClickListener(b2);
            this.v.setOnClickListener(b1);
            this.w.setOnClickListener(b7);
            this.x.setOnClickListener(b0);
            this.y.setOnClickListener(b4);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.I != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.I = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(1 == v) {
            this.u(((W8.e)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.d
    public final void u(W8.e e0) {
        this.z = e0;
        synchronized(this) {
            this.I |= 1L;
        }
        this.o();
    }
}

