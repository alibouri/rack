package P4;

import Ab.k;
import Ab.t;
import Bb.F;
import M4.y;
import Vb.q;
import a5.w;
import io.sentry.hints.i;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class h {
    public static final Object a;
    public static final Object b;
    public static final Object c;

    static {
        f f0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f0.a = m.X;
        f0.b = n.Y;
        k k0 = new k(b.Y, f0);
        f f1 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f1.a = m.X;
        f1.b = n.Z;
        k k1 = new k(b.Z, f1);
        f f2 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f2.a = m.X;
        f2.b = n.b0;
        k k2 = new k(b.b0, f2);
        f f3 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f3.a = m.X;
        f3.b = n.c0;
        k k3 = new k(b.c0, f3);
        f f4 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f4.a = m.X;
        f4.b = n.d0;
        k k4 = new k(b.d0, f4);
        f f5 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f5.a = m.Y;
        f5.b = n.e0;
        k k5 = new k(b.f0, f5);
        f f6 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f6.a = m.Y;
        f6.b = n.f0;
        k k6 = new k(b.g0, f6);
        f f7 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f7.a = m.Y;
        f7.b = n.g0;
        k k7 = new k(b.h0, f7);
        f f8 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f8.a = m.Y;
        f8.b = n.h0;
        k k8 = new k(b.i0, f8);
        f f9 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f9.a = m.Y;
        f9.b = n.i0;
        k k9 = new k(b.j0, f9);
        f f10 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f10.a = m.Y;
        f10.b = n.j0;
        k k10 = new k(b.k0, f10);
        f f11 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f11.a = m.Y;
        f11.b = n.k0;
        k k11 = new k(b.l0, f11);
        f f12 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f12.a = m.Y;
        f12.b = n.l0;
        k k12 = new k(b.m0, f12);
        f f13 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f13.a = m.Y;
        f13.b = n.m0;
        k k13 = new k(b.n0, f13);
        f f14 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f14.a = m.Y;
        f14.b = n.n0;
        k k14 = new k(b.o0, f14);
        f f15 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f15.a = m.Y;
        f15.b = n.o0;
        k k15 = new k(b.p0, f15);
        f f16 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f16.a = m.X;
        f16.b = null;
        h.a = F.K(new k[]{k0, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, new k(b.e0, f16)});
        e e0 = new e(null, P4.k.Z);
        k k16 = new k(o.Y, e0);
        e e1 = new e(null, P4.k.b0);
        k k17 = new k(o.Z, e1);
        e e2 = new e(m.Z, P4.k.Y);
        k k18 = new k(o.b0, e2);
        e e3 = new e(m.Z, P4.k.c0);
        k k19 = new k(o.c0, e3);
        e e4 = new e(m.Z, P4.k.d0);
        k k20 = new k(o.d0, e4);
        e e5 = new e(m.Z, P4.k.e0);
        k k21 = new k(o.e0, e5);
        e e6 = new e(m.Z, P4.k.p0);
        k k22 = new k(o.p0, e6);
        e e7 = new e(m.Z, P4.k.f0);
        k k23 = new k(o.f0, e7);
        e e8 = new e(m.Z, P4.k.g0);
        k k24 = new k(o.g0, e8);
        e e9 = new e(m.Z, P4.k.h0);
        k k25 = new k(o.h0, e9);
        e e10 = new e(m.Z, P4.k.i0);
        k k26 = new k(o.i0, e10);
        e e11 = new e(m.Z, P4.k.j0);
        k k27 = new k(o.j0, e11);
        e e12 = new e(m.Z, P4.k.k0);
        k k28 = new k(o.k0, e12);
        e e13 = new e(m.Z, P4.k.l0);
        k k29 = new k(o.l0, e13);
        e e14 = new e(m.Z, P4.k.m0);
        k k30 = new k(o.m0, e14);
        e e15 = new e(m.Z, P4.k.n0);
        k k31 = new k(o.n0, e15);
        e e16 = new e(m.Z, P4.k.o0);
        h.b = F.K(new k[]{k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, new k(o.o0, e16)});
        h.c = F.K(new k[]{new k("fb_mobile_achievement_unlocked", l.Y), new k("fb_mobile_activate_app", l.Z), new k("fb_mobile_add_payment_info", l.b0), new k("fb_mobile_add_to_cart", l.c0), new k("fb_mobile_add_to_wishlist", l.d0), new k("fb_mobile_complete_registration", l.e0), new k("fb_mobile_content_view", l.f0), new k("fb_mobile_initiated_checkout", l.g0), new k("fb_mobile_level_achieved", l.h0), new k("fb_mobile_purchase", l.i0), new k("fb_mobile_rate", l.j0), new k("fb_mobile_search", l.k0), new k("fb_mobile_spent_credits", l.l0), new k("fb_mobile_tutorial_completion", l.m0)});
    }

    public static final Object a(Object object0, String s) {
        boolean z = false;
        boolean z1 = s.equals("extInfo");
        g g0 = g.X;
        if(!z1 && !s.equals("url_schemes") && !s.equals("fb_content_id") && !s.equals("fb_content") && !s.equals("data_processing_options")) {
            boolean z2 = s.equals("advertiser_tracking_enabled");
            g0 = g.Y;
            if(!z2 && !s.equals("application_tracking_enabled")) {
                g0 = s.equals("_logTime") ? g.Z : null;
            }
        }
        String s1 = object0 instanceof String ? ((String)object0) : null;
        if(g0 != null && s1 != null) {
            switch(g0.ordinal()) {
                case 0: {
                    try {
                        ArrayList arrayList0 = w.t(new JSONArray(s1));
                        Object object1 = new ArrayList();
                        Iterator iterator0 = arrayList0.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                return object1;
                            }
                            Object object2 = iterator0.next();
                            String s2 = (String)object2;
                            try {
                                s2 = w.u(new JSONObject(s2));
                            }
                            catch(JSONException unused_ex) {
                                try {
                                    s2 = w.t(new JSONArray(s2));
                                }
                                catch(JSONException unused_ex) {
                                }
                            }
                            ((ArrayList)object1).add(s2);
                        }
                    }
                    catch(JSONException jSONException0) {
                        i.D(y.b0, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", new Object[]{object0, jSONException0});
                        return t.a;
                    }
                }
                case 1: {
                    Integer integer0 = q.P(s1.toString());
                    if(integer0 != null) {
                        if(((int)integer0) != 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    return null;
                }
                case 2: {
                    return q.P(object0.toString());
                }
                default: {
                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
        }
        return object0;
    }
}

