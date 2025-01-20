package Q4;

import Bb.q;
import E7.n;
import M4.l;
import Nb.j;
import R4.d;
import android.os.Bundle;
import android.view.View;
import f5.a;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c {
    public static final c a;

    static {
        c.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public g a() {
        g g0 = null;
        synchronized(this) {
            if((a.b(g.class) ? null : g.g) == null) {
                g g1 = new g();
                if(!a.b(g.class)) {
                    g.g = g1;
                }
            }
            if(!a.b(g.class)) {
                g0 = g.g;
            }
            if(g0 != null) {
                return g0;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
    }

    public static Bundle b(R4.c c0, View view0, View view1) {
        String s1;
        Bundle bundle0 = new Bundle();
        List list0 = Collections.unmodifiableList(c0.c);
        j.e(list0, "unmodifiableList(parameters)");
        Iterator iterator0 = list0.iterator();
    label_4:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            d d0 = (d)object0;
            String s = d0.a;
            if(d0.b != null && d0.b.length() > 0) {
                bundle0.putString(s, d0.b);
            }
            else {
                ArrayList arrayList0 = d0.c;
                if(arrayList0.size() > 0) {
                    Iterator iterator1 = (j.a(d0.d, "relative") ? q.n(view1, arrayList0, 0, -1, view1.getClass().getSimpleName()) : q.n(view0, arrayList0, 0, -1, view0.getClass().getSimpleName())).iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            continue label_4;
                        }
                        Object object1 = iterator1.next();
                        e e0 = (e)object1;
                        if(e0.a() != null) {
                            s1 = R4.g.i(e0.a());
                            if(s1.length() > 0) {
                                break;
                            }
                        }
                    }
                    bundle0.putString(s, s1);
                }
            }
        }
        return bundle0;
    }

    public static final void c(R4.c c0, View view0, View view1) {
        Class class0 = c.class;
        if(a.b(class0)) {
            return;
        }
        try {
            Bundle bundle0 = c.b(c0, view0, view1);
            c.a.d(bundle0);
            l.c().execute(new n(c0.a, 14, bundle0));
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
    }

    public void d(Bundle bundle0) {
        Locale locale0;
        String s1;
        double f;
        if(a.b(this)) {
            return;
        }
        try {
            String s = bundle0.getString("_valueToSum");
            if(s != null) {
                try {
                    f = 0.0;
                    Matcher matcher0 = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(s);
                    if(matcher0.find()) {
                        s1 = matcher0.group(0);
                        goto label_8;
                    }
                }
                catch(ParseException unused_ex) {
                }
                bundle0.putDouble("_valueToSum", f);
                bundle0.putString("_is_fb_codeless", "1");
                return;
                try {
                label_8:
                    locale0 = null;
                    locale0 = l.a().getResources().getConfiguration().locale;
                }
                catch(Exception unused_ex) {
                }
                try {
                    if(locale0 == null) {
                        locale0 = Locale.getDefault();
                        j.e(locale0, "getDefault()");
                    }
                    f = NumberFormat.getNumberInstance(locale0).parse(s1).doubleValue();
                }
                catch(ParseException unused_ex) {
                }
                bundle0.putDouble("_valueToSum", f);
            }
            bundle0.putString("_is_fb_codeless", "1");
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }
}

