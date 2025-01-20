package Ba;

import A3.e;
import Aa.J;
import Ab.t;
import Bb.r;
import Da.i;
import Da.m;
import E7.B;
import Fa.E;
import Fa.W;
import J2.w;
import Nb.j;
import Qa.A;
import Qa.f;
import U.F;
import X2.h;
import Y8.N;
import Y8.O1;
import Y8.x6;
import Y8.y6;
import Y8.z6;
import a1.g;
import ac.B0;
import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import android.support.v4.media.session.a;
import androidx.compose.ui.unit.Density;
import c.D;
import c0.b;
import com.apollographql.apollo.api.DefaultFakeResolver;
import com.apollographql.apollo.api.DefaultUpload.Builder;
import com.apollographql.apollo.api.FileUpload;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.sendwave.backend.fragment.AnnouncementFragment;
import com.sendwave.backend.fragment.DeviceManagementDevicesFragment;
import com.sendwave.backend.fragment.TooltipFragment;
import com.sendwave.shared.IncorrectAnswerCallSupportFragment;
import com.sendwave.util.Country;
import com.wave.customer.scratchCardRewards.components.RewardsPathState.Reward;
import com.wave.customer.scratchCardRewards.components.RewardsPathState;
import com.wave.customer.scratchCardRewards.components.c;
import com.wave.customer.scratchCardRewards.components.d;
import com.wave.customer.transactions.sync.initial.TransactionHistoryInitialSyncWorker;
import ha.l0;
import ha.m0;
import hb.n;
import io.sentry.i1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import n0.U;
import n0.v;
import o9.X;
import o9.b0;
import pc.C;
import q9.l1;

public final class l implements Function1 {
    public final int X;
    public final Object Y;

    public l(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object6;
        U u0;
        U u1;
        String s = "";
        int v = 0;
        Object object1 = t.a;
        Object object2 = this.Y;
        switch(this.X) {
            case 0: {
                Throwable throwable0 = (Throwable)object0;
                B0 b00 = ((q)object2).b0;
                do {
                    Object object3 = b00.getValue();
                }
                while(!b00.j(object3, k.a(((k)object3), false, null, null, null, null, null, null, null, null, false, 0x3FE)));
                return object1;
            }
            case 1: {
                j.f(((Date)object0), "it");
                ((Function1)object2).n(((Date)object0).getTime());
                return object1;
            }
            case 2: {
                Throwable throwable1 = (Throwable)object0;
                B0 b01 = ((m)object2).b0;
                do {
                    Object object4 = b01.getValue();
                }
                while(!b01.j(object4, i.a(((i)object4), false, null, null, null, null, null, 62)));
                return object1;
            }
            case 3: {
                j.f(((Density)object0), "$this$offset");
                float f = ((Density)object0).w(((E)object2).a);
                float f1 = ((Number)((E)object2).b.b0.getValue()).floatValue();
                return new g(a.i(Pb.a.H((((float)Math.sin(31.0f * f1)) + ((float)Math.sin(13.0f * f1))) / 2.0f * f), Pb.a.H(f * ((((float)Math.sin(23.0f * f1)) + ((float)Math.sin(f1 * 7.0f))) / 2.0f))));
            }
            case 4: {
                j.f(((C.i)object0), "$this$LazyRow");
                e.o(((C.i)object0), null, Fa.q.j, 3);
                int v1 = ((RewardsPathState)object2).X;
                if(v1 > 0) {
                    e.o(((C.i)object0), null, Fa.q.k, 3);
                    e.q(((C.i)object0), v1 - 1, null, new b(195060277, new c(((RewardsPathState)object2)), true), 6);
                }
                Reward rewardsPathState$Reward0 = (Reward)((RewardsPathState)object2).Z.get(v1);
                if(v1 == 0) {
                    e.o(((C.i)object0), null, Fa.q.l, 3);
                }
                else if(rewardsPathState$Reward0 == null) {
                    e.o(((C.i)object0), null, new b(0x5ABB84B8, new W(((RewardsPathState)object2), 0), true), 3);
                }
                else {
                    e.o(((C.i)object0), null, new b(0xCA230458, new d(((RewardsPathState)object2), rewardsPathState$Reward0), true), 3);
                }
                b b0 = new b(0xE7856870, new com.wave.customer.scratchCardRewards.components.e(((RewardsPathState)object2)), true);
                e.q(((C.i)object0), ((RewardsPathState)object2).Y - v1, null, b0, 6);
                e.o(((C.i)object0), null, new b(0xD7EF4C42, new W(((RewardsPathState)object2), 1), true), 3);
                return object1;
            }
            case 5: {
                if(object0 != null) {
                    throw new ClassCastException();
                }
                ((I3.g)object2).getClass();
                throw null;
            }
            case 6: {
                j.f(((Exception)object0), "e");
                n.b(new B(m5.b.y(com.apollographql.apollo.api.b.s("Failed to parse \"", ((TooltipFragment)object2).getId(), "\" background color \""), ((TooltipFragment)object2).d, "\"."), ((Exception)object0)), i1.WARNING, null, 12);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                return object1;
            }
            case 7: {
                j.f(((String)object0), "mobile");
                return io.sentry.hints.i.t(((TransactionHistoryInitialSyncWorker)object2).g, ((String)object0));
            }
            case 8: {
                j.f(((A)object0), "$this$updateState");
                return A.a(((A)object0), null, null, null, ((f)((Qa.E)object2).n(((A)object0).d)), false, null, 55);
            }
            case 9: {
                j.f(((o9.i1)object0), "it");
                b0 b02 = (b0)((R9.q)object2).k0.a();
                if(b02 != null) {
                    b02.I(((o9.i1)object0));
                }
                return object1;
            }
            case 10: {
                j.f(((X2.a)object0), "cursor");
                String s1 = ((X2.a)object0).a(0);
                j.c(s1);
                String s2 = ((X2.a)object0).a(1);
                j.c(s2);
                return ((J)object2).j(s1, s2);
            }
            case 11: {
                j.f(((X2.a)object0), "cursor");
                String s3 = ((X2.a)object0).a(0);
                j.c(s3);
                String s4 = ((X2.a)object0).a(1);
                j.c(s4);
                return ((J)object2).j(s3, s4);
            }
            case 12: {
                j.f(((h)object0), "$this$executeQuery");
                ((h)object0).c(0, ((String)((T3.e)object2).b0));
                return object1;
            }
            case 13: {
                j.f(((h)object0), "$this$executeQuery");
                for(Object object5: ((Collection)((T3.e)object2).b0)) {
                    if(v >= 0) {
                        ((h)object0).c(v, ((String)object5));
                        ++v;
                        continue;
                    }
                    Bb.q.Z();
                    throw null;
                }
                return object1;
            }
            case 14: {
                j.f(((F)object0), "$this$DisposableEffect");
                return new E.B(7, ((Context)object2));
            }
            case 15: {
                Cursor cursor0 = (Cursor)object0;
                j.f(cursor0, "it");
                X8.f f2 = (X8.f)object2;
                f2.getClass();
                try {
                    int v2 = cursor0.getColumnIndex("display_name");
                    String s5 = cursor0.isNull(v2) ? null : cursor0.getString(v2);
                    if(s5 != null) {
                        int v3 = cursor0.getColumnIndex("data1");
                        String s6 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                        if(s6 != null) {
                            return f2.c(s5, s6);
                        }
                    }
                }
                catch(IllegalStateException illegalStateException0) {
                    n.b(new Exception("Avoided crash (CUSTOMER-24H). Type of Display Name / Number col is not a String", illegalStateException0), i1.INFO, null, 12);
                }
                return null;
            }
            case 16: {
                j.f(((Cursor)object0), "it");
                int v4 = ((Cursor)object0).getColumnIndex("data1");
                String s7 = ((Cursor)object0).isNull(v4) ? null : ((Cursor)object0).getString(v4);
                if(s7 != null) {
                    s = s7;
                }
                Locale locale0 = Locale.getDefault();
                j.e(locale0, "getDefault(...)");
                String s8 = ((Country)object2).Y.toUpperCase(locale0);
                j.e(s8, "toUpperCase(...)");
                try {
                    Phonenumber.PhoneNumber phonenumber$PhoneNumber0 = l1.f().p(s, s8);
                    return l1.f().k(phonenumber$PhoneNumber0) ? l1.e(phonenumber$PhoneNumber0) : String.valueOf(phonenumber$PhoneNumber0.Z);
                }
                catch(Throwable unused_ex) {
                    return null;
                }
            }
            case 17: {
                j.f(((p0.d)object0), "$this$drawBehind");
                a9.b b1 = ((a9.j)object2).d;
                long v5 = ((p0.d)object0).d();
                a9.g g0 = b1.c;
                if(g0 == null) {
                    a9.f f3 = b1.b;
                    if(f3 == null) {
                        object6 = object1;
                        u1 = new U(v.e);
                    }
                    else {
                        double f4 = ((double)(((float)f3.b) / 180.0f)) * 3.141593;
                        object6 = object1;
                        float f5 = ((float)Math.sqrt(((float)Math.pow(m0.e.d(v5), 2.0)) + ((float)Math.pow(m0.e.b(v5), 2.0)))) / 2.0f;
                        long v6 = m0.b.i(w.G(v5), yc.d.d(((float)Math.cos(f4)) * f5, ((float)Math.sin(f4)) * f5));
                        float f6 = m0.e.b(v5);
                        long v7 = yc.d.d(Math.min(I2.J.m(m0.b.d(v6), 0.0f), m0.e.d(v5)), f6 - Math.min(I2.J.m(m0.b.e(v6), 0.0f), m0.e.b(v5)));
                        ArrayList arrayList0 = new ArrayList(r.b0(f3.a));
                        for(Object object7: f3.a) {
                            v v8 = new v(((a9.c)object7).a);
                            arrayList0.add(new Ab.k(((float)((a9.c)object7).b), v8));
                        }
                        Ab.k[] arr_k = (Ab.k[])arrayList0.toArray(new Ab.k[0]);
                        Ab.k[] arr_k1 = (Ab.k[])Arrays.copyOf(arr_k, arr_k.length);
                        long v9 = m0.b.h(yc.d.d(m0.e.d(v5), m0.e.b(v5)), v7);
                        ArrayList arrayList1 = new ArrayList(arr_k1.length);
                        for(int v10 = 0; v10 < arr_k1.length; ++v10) {
                            arrayList1.add(new v(((v)arr_k1[v10].Y).a));
                        }
                        ArrayList arrayList2 = new ArrayList(arr_k1.length);
                        while(v < arr_k1.length) {
                            arrayList2.add(((Number)arr_k1[v].X).floatValue());
                            ++v;
                        }
                        u1 = new n0.F(arrayList1, arrayList2, v9, v7, 0);
                    }
                    u0 = u1;
                }
                else {
                    u0 = new U(g0.a);
                    object6 = object1;
                }
                m5.b.k(((p0.d)object0), u0, 0L, ((p0.d)object0).d(), 0.0f, null, 0x7A);
                return object6;
            }
            case 18: {
                return ((AnnouncementFragment)((X9.j)object2).a.get(((int)(((Integer)object0))))).getId();
            }
            case 19: {
                Throwable throwable2 = (Throwable)object0;
                ((Dc.g)(((C)object2))).b(1001, null);
                return object1;
            }
            case 20: {
                IOException iOException0 = (IOException)object0;
                ((b3.f)object2).i0 = true;
                return object1;
            }
            case 21: {
                return DefaultFakeResolver.resolveLeaf$lambda$1(((DefaultFakeResolver)object2), object0);
            }
            case 22: {
                return Builder.content$lambda$7$lambda$6(((Ec.m)object2), ((Ec.k)object0));
            }
            case 23: {
                return Builder.content$lambda$10$lambda$9(((byte[])object2), ((Ec.k)object0));
            }
            case 24: {
                return FileUpload.toUpload$lambda$1(((File)object2), ((Ec.k)object0));
            }
            case 25: {
                if(((z6)object2) instanceof y6) {
                    DeviceManagementDevicesFragment deviceManagementDevicesFragment0 = ((O1)((y6)(((z6)object2))).b).a.b.c;
                    return ea.f.a(((ea.f)object0), deviceManagementDevicesFragment0.b, deviceManagementDevicesFragment0.c.a, false, false, false, null, 60);
                }
                if(!(((z6)object2) instanceof x6)) {
                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                return ea.f.a(((ea.f)object0), null, false, true, false, false, null, 59);
            }
            case 26: {
                j.f(((String)object0), "s");
                return Vb.q.M(((String)object0), ((f9.i)object2).b, "");
            }
            case 27: {
                if(((Location)object0) != null) {
                    ((f9.t)object2).l(((Location)object0));
                }
                return object1;
            }
            case 28: {
                j.f(((Density)object0), "$this$offset");
                return ((m0)object2).m == null ? new g(a.i(0, ((Density)object0).I(l0.b))) : new g(a.i(0, ((Density)object0).I(Y9.a.a + ia.l.a + ia.c.a)));
            }
            default: {
                j.f(((D)object0), "$this$addCallback");
                X x0 = ((IncorrectAnswerCallSupportFragment)object2).X0;
                if(x0 != null) {
                    o9.J j0 = new o9.J(x0, null);
                    N.k(x0, x0.g0, true, j0);
                }
                return object1;
            }
        }
    }
}

