package R9;

import Aa.r;
import Ab.k;
import Bb.p;
import Bb.v;
import Bb.z;
import Eb.a;
import Nb.j;
import W5.f;
import Y8.G6;
import Y8.H6;
import Y8.R5;
import Y8.R6;
import Y8.S5;
import Y8.S6;
import Y8.T;
import Y8.W5;
import Y8.m2;
import Y8.o2;
import Y8.y6;
import a9.Q5;
import a9.a6;
import a9.c6;
import a9.d6;
import a9.e6;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import c.l;
import com.apollographql.apollo.api.Optional;
import com.sendwave.backend.fragment.PaymentListFragment;
import com.sendwave.backend.fragment.PaymentOptionsEdgeFragment;
import com.wave.customer.PaymentCategoryHeader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n2.c;
import n2.d;

public final class x1 {
    public final String a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Serializable g;
    public Serializable h;

    public x1(R6 r60, X1 x10, m2 m20, String s, String s1, boolean z, r r0, r r1) {
        j.f(r60, "repo");
        j.f(x10, "viewmodel");
        super();
        this.c = r60;
        this.d = x10;
        this.e = m20;
        this.a = s;
        this.f = s1;
        this.b = z;
        this.g = r0;
        this.h = r1;
    }

    public x1(AssetManager assetManager0, Executor executor0, c c0, String s, File file0) {
        this.b = false;
        this.c = executor0;
        this.d = c0;
        this.a = s;
        this.f = file0;
        int v = Build.VERSION.SDK_INT;
        byte[] arr_b = null;
        if(v >= 24) {
            if(v >= 0x1F) {
                arr_b = d.d;
            }
            else {
                switch(v) {
                    case 24: 
                    case 25: {
                        arr_b = d.h;
                        break;
                    }
                    case 26: {
                        arr_b = d.g;
                        break;
                    }
                    case 27: {
                        arr_b = d.f;
                        break;
                    }
                    case 28: 
                    case 29: 
                    case 30: {
                        arr_b = d.e;
                    }
                }
            }
        }
        this.e = arr_b;
    }

    public ArrayList a() {
        m2 m20 = (m2)this.e;
        Iterable iterable0 = ((PaymentListFragment)m20.a).b.b.a;
        ArrayList arrayList0 = new ArrayList(Bb.r.b0(iterable0));
        for(Object object0: iterable0) {
            arrayList0.add(new k(((Q5)object0).b, m20));
        }
        return arrayList0;
    }

    public List b(List list0) {
        ArrayList arrayList1;
        r1 r10;
        j.f(list0, "page");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            PaymentOptionsEdgeFragment paymentOptionsEdgeFragment0 = (PaymentOptionsEdgeFragment)((k)object0).X;
            o2 o20 = (o2)((k)object0).Y;
            c6 c60 = paymentOptionsEdgeFragment0.b;
            e6 e60 = c60.b;
            if(e60 == null) {
                d6 d60 = c60.c;
                r10 = d60 == null ? null : new q1(d60, new v1(this, o20, c60, 1));
            }
            else {
                v1 v10 = new v1(this, o20, c60, 0);
                r10 = new r1(e60.b, v10);
            }
            if(r10 == null) {
                arrayList1 = z.X;
            }
            else {
                arrayList1 = new ArrayList();
                a6 a60 = paymentOptionsEdgeFragment0.d;
                if(a60 != null) {
                    arrayList1.add(new f9.j(new PaymentCategoryHeader(a60.a), "CATEGORY_HEADER_" + a60.a, 0x7F0D00BF));  // layout:payment_category_header_item
                }
                arrayList1.add(new f9.j(r10, paymentOptionsEdgeFragment0.c, 0x7F0D002E));  // layout:business_search_item
            }
            v.f0(arrayList0, arrayList1);
        }
        return p.H0(arrayList0);
    }

    public Serializable c(int v, String s, H6 h60, Fb.c c0) {
        x1 x10;
        T t1;
        R6 r60;
        w1 w10;
        if(c0 instanceof w1) {
            w10 = (w1)c0;
            int v1 = w10.f0;
            if((v1 & 0x80000000) == 0) {
                w10 = new w1(this, c0);
            }
            else {
                w10.f0 = v1 ^ 0x80000000;
            }
        }
        else {
            w10 = new w1(this, c0);
        }
        Object object0 = w10.d0;
        Serializable serializable0 = a.X;
        boolean z = true;
        switch(w10.f0) {
            case 0: {
                f.b0(object0);
                String s1 = (String)this.f;
                String s2 = this.a;
                if(s == null && (s2 == null || Vb.j.c0(s2)) && s1 == null && !this.b) {
                    return this.a();
                }
                Optional optional0 = Optional.Companion.presentIfNotNull(s);
                Optional optional1 = Optional.Companion.presentIfNotNull(s2);
                Optional optional2 = Optional.Companion.presentIfNotNull(s1);
                W5 w50 = new W5(optional0, S6.a(new Integer(v)), optional1, optional2);
                G6 g60 = (s == null || Vb.j.c0(s)) && (s2 == null || Vb.j.c0(s2)) ? G6.X : G6.Y;
                try {
                    r60 = (R6)this.c;
                }
                catch(T t0) {
                    t1 = t0;
                    x10 = this;
                    break;
                }
                try {
                    w10.b0 = this;
                    w10.c0 = s;
                    w10.f0 = 1;
                    object0 = r60.c(w50, h60, g60, w10);
                }
                catch(T t1) {
                    x10 = this;
                    break;
                }
                if(object0 == serializable0) {
                    return serializable0;
                }
                x10 = this;
                goto label_44;
            }
            case 1: {
                try {
                    s = w10.c0;
                    x10 = w10.b0;
                    f.b0(object0);
                label_44:
                    Boolean boolean0 = Boolean.FALSE;
                    ((r)x10.g).n(boolean0);
                    ((r)x10.h).n(boolean0);
                    Iterable iterable0 = ((R5)((y6)object0).b).a.b.b.a;
                    Serializable serializable1 = new ArrayList(Bb.r.b0(iterable0));
                    for(Object object1: iterable0) {
                        ((ArrayList)serializable1).add(new k(((S5)object1).b, ((m2)x10.e)));
                    }
                    return serializable1;
                }
                catch(T t1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Boolean boolean1 = Boolean.TRUE;
        ((r)x10.g).n(boolean1);
        if((x10.a == null || Vb.j.c0(x10.a)) && ((String)x10.f) == null) {
            z = false;
        }
        if(!z) {
            ((r)x10.h).n(boolean1);
            if(s == null) {
                return x10.a();
            }
        }
        throw t1;
    }

    public FileInputStream d(AssetManager assetManager0, String s) {
        try {
            return assetManager0.openFd(s).createInputStream();
        }
        catch(FileNotFoundException fileNotFoundException0) {
            String s1 = fileNotFoundException0.getMessage();
            if(s1 != null && s1.contains("compressed")) {
                ((c)this.d).e();
            }
            return null;
        }
    }

    public void e(int v, Serializable serializable0) {
        l l0 = new l(v, 2, this, serializable0);
        ((Executor)this.c).execute(l0);
    }
}

