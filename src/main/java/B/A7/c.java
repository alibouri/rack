package a7;

import N5.r;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.i0;
import j6.t0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import x7.a;

public final class c {
    public final a a;
    public Integer b;

    public c(a a0) {
        this.a = a0;
        this.b = null;
    }

    public static boolean a(ArrayList arrayList0, b b0) {
        String s = b0.a;
        for(Object object0: arrayList0) {
            if(((b)object0).a.equals(s) && ((b)object0).b.equals(b0.b)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final ArrayList b() {
        d7.c c0 = (d7.c)(((d7.b)this.a.get()));
        c0.getClass();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((e0)c0.a.Y).c("frc", "")) {
            r.j(((Bundle)object0));
            d7.a a0 = new d7.a();  // initializer: Ljava/lang/Object;-><init>()V
            String s = (String)t0.a(((Bundle)object0), "origin", String.class, null);
            r.j(s);
            a0.a = s;
            String s1 = (String)t0.a(((Bundle)object0), "name", String.class, null);
            r.j(s1);
            a0.b = s1;
            a0.c = t0.a(((Bundle)object0), "value", Object.class, null);
            a0.d = (String)t0.a(((Bundle)object0), "trigger_event_name", String.class, null);
            a0.e = (long)(((Long)t0.a(((Bundle)object0), "trigger_timeout", Long.class, 0L)));
            a0.f = (String)t0.a(((Bundle)object0), "timed_out_event_name", String.class, null);
            a0.g = (Bundle)t0.a(((Bundle)object0), "timed_out_event_params", Bundle.class, null);
            a0.h = (String)t0.a(((Bundle)object0), "triggered_event_name", String.class, null);
            a0.i = (Bundle)t0.a(((Bundle)object0), "triggered_event_params", Bundle.class, null);
            a0.j = (long)(((Long)t0.a(((Bundle)object0), "time_to_live", Long.class, 0L)));
            a0.k = (String)t0.a(((Bundle)object0), "expired_event_name", String.class, null);
            a0.l = (Bundle)t0.a(((Bundle)object0), "expired_event_params", Bundle.class, null);
            a0.n = ((Boolean)t0.a(((Bundle)object0), "active", Boolean.class, Boolean.FALSE)).booleanValue();
            a0.m = (long)(((Long)t0.a(((Bundle)object0), "creation_timestamp", Long.class, 0L)));
            a0.o = (long)(((Long)t0.a(((Bundle)object0), "triggered_timestamp", Long.class, 0L)));
            arrayList0.add(a0);
        }
        return arrayList0;
    }

    public final void c(ArrayList arrayList0) {
        Object object10;
        ObjectInputStream objectInputStream0;
        ObjectOutputStream objectOutputStream0;
        ByteArrayOutputStream byteArrayOutputStream0;
        b b0;
        a a0 = this.a;
        if(a0.get() == null) {
            throw new a7.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            String s = "";
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Map map0 = (Map)object0;
            ArrayList arrayList2 = new ArrayList();
            String[] arr_s = b.g;
            for(int v = 0; v < 5; ++v) {
                String s1 = arr_s[v];
                if(!map0.containsKey(s1)) {
                    arrayList2.add(s1);
                }
            }
            if(!arrayList2.isEmpty()) {
                throw new a7.a(String.format("The following keys are missing from the experiment info map: %s", arrayList2));  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            try {
                String s2 = (String)map0.get("experimentStartTime");
                Date date0 = b.h.parse(s2);
                long v1 = Long.parseLong(((String)map0.get("triggerTimeoutMillis")));
                long v2 = Long.parseLong(((String)map0.get("timeToLiveMillis")));
                Object object1 = map0.get("experimentId");
                Object object2 = map0.get("variantId");
                if(map0.containsKey("triggerEvent")) {
                    s = (String)map0.get("triggerEvent");
                }
                b0 = new b(((String)object1), ((String)object2), s, date0, v1, v2);
                goto label_33;
            }
            catch(ParseException parseException0) {
            }
            catch(NumberFormatException numberFormatException0) {
                throw new a7.a("Could not process experiment: one of the durations could not be converted into a long.", numberFormatException0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            throw new a7.a("Could not process experiment: parsing experiment start time failed.", parseException0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        label_33:
            arrayList1.add(b0);
        }
        if(arrayList1.isEmpty()) {
            if(a0.get() == null) {
                throw new a7.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            for(Object object3: this.b()) {
                String s3 = ((d7.a)object3).b;
                e0 e00 = (e0)((d7.c)(((d7.b)a0.get()))).a.Y;
                e00.getClass();
                e00.e(new i0(e00, s3, null, null, 1));
            }
            return;
        }
        if(a0.get() == null) {
            throw new a7.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        ArrayList arrayList3 = this.b();
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: arrayList3) {
            String s4 = ((d7.a)object4).d;
            arrayList4.add(new b(((d7.a)object4).b, String.valueOf(((d7.a)object4).c), (s4 == null ? "" : s4), new Date(((d7.a)object4).m), ((d7.a)object4).e, ((d7.a)object4).j));
            a0 = a0;
        }
        ArrayList arrayList5 = new ArrayList();
        for(Object object5: arrayList4) {
            b b1 = (b)object5;
            if(!c.a(arrayList1, b1)) {
                arrayList5.add(b1.a());
            }
        }
        for(Object object6: arrayList5) {
            String s5 = ((d7.a)object6).b;
            e0 e01 = (e0)((d7.c)(((d7.b)a0.get()))).a.Y;
            e01.getClass();
            e01.e(new i0(e01, s5, null, null, 1));
        }
        ArrayList arrayList6 = new ArrayList();
        for(Object object7: arrayList1) {
            b b2 = (b)object7;
            if(!c.a(arrayList4, b2)) {
                arrayList6.add(b2);
            }
        }
        ArrayDeque arrayDeque0 = new ArrayDeque(this.b());
        if(this.b == null) {
            this.b = ((e0)((d7.c)(((d7.b)a0.get()))).a.Y).a("frc");
        }
        int v3 = (int)this.b;
        for(Object object8: arrayList6) {
            while(arrayDeque0.size() >= v3) {
                String s6 = ((d7.a)arrayDeque0.pollFirst()).b;
                e0 e02 = (e0)((d7.c)(((d7.b)a0.get()))).a.Y;
                e02.getClass();
                e02.e(new i0(e02, s6, null, null, 1));
            }
            d7.a a1 = ((b)object8).a();
            d7.c c0 = (d7.c)(((d7.b)a0.get()));
            c0.getClass();
            String s7 = a1.a;
            if(s7 != null && !s7.isEmpty()) {
                Object object9 = a1.c;
                if(object9 == null) {
                label_126:
                    if(!e7.a.b.contains(s7) && e7.a.b(s7, a1.b) && (a1.k == null || e7.a.a(a1.k, a1.l) && e7.a.c(s7, a1.k, a1.l)) && (a1.h == null || e7.a.a(a1.h, a1.i) && e7.a.c(s7, a1.h, a1.i)) && (a1.f == null || e7.a.a(a1.f, a1.g) && e7.a.c(s7, a1.f, a1.g))) {
                        Bundle bundle0 = new Bundle();
                        String s8 = a1.a;
                        if(s8 != null) {
                            bundle0.putString("origin", s8);
                        }
                        String s9 = a1.b;
                        if(s9 != null) {
                            bundle0.putString("name", s9);
                        }
                        Object object11 = a1.c;
                        if(object11 != null) {
                            t0.e(bundle0, object11);
                        }
                        String s10 = a1.d;
                        if(s10 != null) {
                            bundle0.putString("trigger_event_name", s10);
                        }
                        bundle0.putLong("trigger_timeout", a1.e);
                        String s11 = a1.f;
                        if(s11 != null) {
                            bundle0.putString("timed_out_event_name", s11);
                        }
                        Bundle bundle1 = a1.g;
                        if(bundle1 != null) {
                            bundle0.putBundle("timed_out_event_params", bundle1);
                        }
                        String s12 = a1.h;
                        if(s12 != null) {
                            bundle0.putString("triggered_event_name", s12);
                        }
                        Bundle bundle2 = a1.i;
                        if(bundle2 != null) {
                            bundle0.putBundle("triggered_event_params", bundle2);
                        }
                        bundle0.putLong("time_to_live", a1.j);
                        String s13 = a1.k;
                        if(s13 != null) {
                            bundle0.putString("expired_event_name", s13);
                        }
                        Bundle bundle3 = a1.l;
                        if(bundle3 != null) {
                            bundle0.putBundle("expired_event_params", bundle3);
                        }
                        bundle0.putLong("creation_timestamp", a1.m);
                        bundle0.putBoolean("active", a1.n);
                        bundle0.putLong("triggered_timestamp", a1.o);
                        e0 e03 = (e0)c0.a.Y;
                        e03.getClass();
                        e03.e(new f0(e03, bundle0));
                    }
                }
                else {
                    try {
                        byteArrayOutputStream0 = new ByteArrayOutputStream();
                        objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
                    }
                    catch(Throwable throwable0) {
                        try {
                            objectOutputStream0 = null;
                            objectInputStream0 = null;
                            goto label_116;
                        }
                        catch(IOException | ClassNotFoundException unused_ex) {
                            goto label_124;
                        }
                    }
                    try {
                        objectOutputStream0.writeObject(object9);
                        objectOutputStream0.flush();
                        objectInputStream0 = null;
                        objectInputStream0 = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream0.toByteArray()));
                        object10 = objectInputStream0.readObject();
                        goto label_121;
                    }
                    catch(Throwable throwable0) {
                        try {
                        label_116:
                            if(objectOutputStream0 != null) {
                                objectOutputStream0.close();
                            }
                            if(objectInputStream0 != null) {
                                objectInputStream0.close();
                            }
                            throw throwable0;
                        label_121:
                            objectOutputStream0.close();
                            objectInputStream0.close();
                            goto label_125;
                        }
                        catch(IOException | ClassNotFoundException unused_ex) {
                        }
                    }
                label_124:
                    object10 = null;
                label_125:
                    if(object10 != null) {
                        goto label_126;
                    }
                }
            }
            arrayDeque0.offer(a1);
        }
    }
}

