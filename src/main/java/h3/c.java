package h3;

import Ab.h;
import C3.i;
import M4.s;
import Nb.j;
import Vb.q;
import b4.A0;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m3.n;
import pc.p;
import pc.r;

public final class c {
    public final A0 a;
    public final b b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public c(A0 a00, b b0) {
        int v4;
        Date date2;
        int v2;
        this.a = a00;
        this.b = b0;
        this.k = -1;
        if(b0 != null) {
            this.h = b0.c;
            this.i = b0.d;
            p p0 = b0.f;
            int v = p0.size();
            int v1 = 0;
            while(v1 < v) {
                String s = p0.d(v1);
                if(q.J(s, "Date")) {
                    String s1 = p0.a("Date");
                    Date date0 = null;
                    if(s1 != null && s1.length() != 0) {
                        ParsePosition parsePosition0 = new ParsePosition(0);
                        Date date1 = ((DateFormat)vc.c.a.get()).parse(s1, parsePosition0);
                        if(parsePosition0.getIndex() == s1.length()) {
                            date0 = date1;
                        }
                        else {
                            String[] arr_s = vc.c.b;
                            __monitor_enter(arr_s);
                            try {
                                v2 = 0;
                                while(true) {
                                    if(v2 < arr_s.length) {
                                        DateFormat[] arr_dateFormat = vc.c.c;
                                        DateFormat dateFormat0 = arr_dateFormat[v2];
                                        if(dateFormat0 == null) {
                                            dateFormat0 = new SimpleDateFormat(vc.c.b[v2], Locale.US);
                                            dateFormat0.setTimeZone(rc.b.e);
                                            arr_dateFormat[v2] = dateFormat0;
                                        }
                                        parsePosition0.setIndex(0);
                                        date2 = dateFormat0.parse(s1, parsePosition0);
                                        if(parsePosition0.getIndex() == 0) {
                                            ++v2;
                                            continue;
                                        }
                                        else {
                                            goto label_38;
                                        }
                                    }
                                    goto label_43;
                                }
                            }
                            catch(Throwable throwable0) {
                            }
                            __monitor_exit(arr_s);
                            throw throwable0;
                        label_38:
                            __monitor_exit(arr_s);
                            date0 = date2;
                            goto label_45;
                        label_43:
                            __monitor_exit(arr_s);
                        }
                    }
                label_45:
                    this.c = date0;
                    this.d = p0.g(v1);
                }
                else if(q.J(s, "Expires")) {
                    this.g = p0.c("Expires");
                }
                else if(q.J(s, "Last-Modified")) {
                    this.e = p0.c("Last-Modified");
                    this.f = p0.g(v1);
                }
                else if(q.J(s, "ETag")) {
                    this.j = p0.g(v1);
                }
                else if(q.J(s, "Age")) {
                    Long long0 = q.Q(p0.g(v1));
                    if(long0 == null) {
                        v4 = -1;
                    }
                    else {
                        long v3 = (long)long0;
                        if(v3 > 0x7FFFFFFFL) {
                            v4 = 0x7FFFFFFF;
                        }
                        else if(v3 < 0L) {
                            v4 = 0;
                        }
                        else {
                            v4 = (int)v3;
                        }
                    }
                    this.k = v4;
                }
                ++v1;
            }
        }
    }

    public final d a() {
        String s2;
        long v12;
        long v6;
        String s;
        long v1;
        b b1;
        A0 a00 = this.a;
        b b0 = this.b;
        if(b0 == null) {
            return new d(a00, null);
        }
        r r0 = (r)a00.b;
        if(r0.i && !b0.e) {
            return new d(a00, null);
        }
        Object object0 = b0.a;
        pc.c c0 = (pc.c)((h)object0).getValue();
        if(!a00.g().b && !((pc.c)((h)object0).getValue()).b && !j.a(b0.f.a("Vary"), "*")) {
            pc.c c1 = a00.g();
            if(!c1.a) {
                p p0 = (p)a00.d;
                if(p0.a("If-Modified-Since") == null && p0.a("If-None-Match") == null) {
                    long v = this.i;
                    Date date0 = this.c;
                    if(date0 == null) {
                        b1 = b0;
                        v1 = 0L;
                    }
                    else {
                        b1 = b0;
                        v1 = Math.max(0L, v - date0.getTime());
                    }
                    int v2 = this.k;
                    if(v2 != -1) {
                        v1 = Math.max(v1, TimeUnit.SECONDS.toMillis(((long)v2)));
                    }
                    long v3 = this.h;
                    long v4 = v1 + (v - v3) + (((Number)n.a.invoke()).longValue() - v);
                    int v5 = ((pc.c)((h)object0).getValue()).c;
                    Date date1 = this.e;
                    if(v5 == -1) {
                        Date date2 = this.g;
                        if(date2 != null) {
                            if(date0 != null) {
                                v = date0.getTime();
                            }
                            long v7 = date2.getTime() - v;
                            if(v7 <= 0L) {
                                v7 = 0L;
                            }
                            v6 = v7;
                        }
                        else if(date1 == null) {
                            v6 = 0L;
                        }
                        else {
                            ArrayList arrayList0 = r0.f;
                            if(arrayList0 == null) {
                                s = null;
                            }
                            else {
                                StringBuilder stringBuilder0 = new StringBuilder();
                                pc.b.h(arrayList0, stringBuilder0);
                                s = stringBuilder0.toString();
                            }
                            if(s == null) {
                                if(date0 != null) {
                                    v3 = date0.getTime();
                                }
                                long v8 = v3 - date1.getTime();
                                v6 = v8 > 0L ? v8 / 10L : 0L;
                            }
                            else {
                                v6 = 0L;
                            }
                        }
                    }
                    else {
                        v6 = TimeUnit.SECONDS.toMillis(((long)v5));
                    }
                    int v9 = c1.c;
                    if(v9 != -1) {
                        v6 = Math.min(v6, TimeUnit.SECONDS.toMillis(((long)v9)));
                    }
                    long v10 = c1.i == -1 ? 0L : TimeUnit.SECONDS.toMillis(((long)c1.i));
                    if(c0.g) {
                        v12 = 0L;
                    }
                    else {
                        int v11 = c1.h;
                        v12 = v11 == -1 ? 0L : TimeUnit.SECONDS.toMillis(((long)v11));
                    }
                    if(!c0.a && v4 + v10 < v6 + v12) {
                        return new d(null, b1);
                    }
                    String s1 = this.j;
                    if(s1 == null) {
                        if(date1 != null) {
                            s1 = this.f;
                            j.c(s1);
                        }
                        else if(date0 != null) {
                            s1 = this.d;
                            j.c(s1);
                        }
                        else {
                            return new d(a00, null);
                        }
                        s2 = "If-Modified-Since";
                    }
                    else {
                        s2 = "If-None-Match";
                    }
                    i i0 = a00.N();
                    ((s)i0.Z).b(s2, s1);
                    return new d(i0.j(), b1);
                }
            }
            return new d(a00, null);
        }
        return new d(a00, null);
    }
}

