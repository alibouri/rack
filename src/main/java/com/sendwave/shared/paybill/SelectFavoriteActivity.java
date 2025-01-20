package com.sendwave.shared.paybill;

import Ab.o;
import K9.Y;
import R1.d;
import a5.w;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.j;
import com.sendwave.components.SimpleRecyclerView;
import f9.E;
import f9.I;
import f9.f;
import java.util.ArrayList;
import o9.R1;
import o9.m0;
import p2.s;
import p2.t;
import p2.u;
import p9.W;
import p9.X;
import p9.e;
import p9.j0;

public final class SelectFavoriteActivity extends e {
    public final o F0;
    public f G0;
    public final j H0;
    public final W I0;
    public static final int J0;

    public SelectFavoriteActivity() {
        this.F0 = W4.f.A(new R1(5, this));
        this.H0 = new j(new X(this));
        this.I0 = new W(this);
    }

    public final j0 I() {
        return (j0)this.F0.getValue();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.G0 = new f(new Adapter[]{new E(this, new Y(this.I().h0, 2), this.I()), new I(0x7F0D00B9, this.I(), this)});  // layout:pay_bill_select_favorite_add_cta
        i9.Y y0 = (i9.Y)d.a(this.getLayoutInflater(), 0x7F0D00B8, null);  // layout:pay_bill_select_favorite
        y0.v(this.I());
        f f0 = this.G0;
        if(f0 != null) {
            y0.u(f0);
            y0.r(this);
            j j0 = this.H0;
            SimpleRecyclerView simpleRecyclerView0 = j0.r;
            SimpleRecyclerView simpleRecyclerView1 = y0.q;
            if(simpleRecyclerView0 != simpleRecyclerView1) {
                s s0 = j0.z;
                if(simpleRecyclerView0 != null) {
                    simpleRecyclerView0.c0(j0);
                    SimpleRecyclerView simpleRecyclerView2 = j0.r;
                    simpleRecyclerView2.s0.remove(s0);
                    if(simpleRecyclerView2.t0 == s0) {
                        simpleRecyclerView2.t0 = null;
                    }
                    ArrayList arrayList0 = j0.r.E0;
                    if(arrayList0 != null) {
                        arrayList0.remove(j0);
                    }
                    ArrayList arrayList1 = j0.p;
                    for(int v = arrayList1.size() - 1; v >= 0; --v) {
                        t t0 = (t)arrayList1.get(0);
                        t0.g.cancel();
                        j0.m.d(j0.r, t0.e);
                    }
                    arrayList1.clear();
                    j0.w = null;
                    VelocityTracker velocityTracker0 = j0.t;
                    if(velocityTracker0 != null) {
                        velocityTracker0.recycle();
                        j0.t = null;
                    }
                    u u0 = j0.y;
                    if(u0 != null) {
                        u0.a = false;
                        j0.y = null;
                    }
                    if(j0.x != null) {
                        j0.x = null;
                    }
                }
                j0.r = simpleRecyclerView1;
                if(simpleRecyclerView1 != null) {
                    Resources resources0 = simpleRecyclerView1.getResources();
                    j0.f = resources0.getDimension(0x7F0700C6);  // dimen:item_touch_helper_swipe_escape_velocity
                    j0.g = resources0.getDimension(0x7F0700C5);  // dimen:item_touch_helper_swipe_escape_max_velocity
                    j0.q = ViewConfiguration.get(j0.r.getContext()).getScaledTouchSlop();
                    j0.r.i(j0);
                    j0.r.s0.add(s0);
                    SimpleRecyclerView simpleRecyclerView3 = j0.r;
                    if(simpleRecyclerView3.E0 == null) {
                        simpleRecyclerView3.E0 = new ArrayList();
                    }
                    simpleRecyclerView3.E0.add(j0);
                    j0.y = new u(j0);
                    j0.x = new GestureDetectorCompat(j0.r.getContext(), j0.y);
                }
            }
            this.setContentView(y0.d);
            this.C(this.I().d0);
            w.l(this.c(), null, new m0(1, this), 3);
            return;
        }
        Nb.j.p("adapter");
        throw null;
    }
}

