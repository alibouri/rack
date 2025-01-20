package h8;

import e8.n;
import e8.s;
import g8.g;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import l8.b;

public final class d extends s {
    public final int a;
    public final Object b;
    public static final a c;

    static {
        d.c = new a(1);
    }

    public d() {
        this.a = 0;
        super();
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateTimeInstance(2, 2, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if(g.a >= 9) {
            arrayList0.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale0));
        }
    }

    public d(s s0) {
        this.a = 1;
        super();
        this.b = s0;
    }

    @Override  // e8.s
    public final Object a(l8.a a0) {
        if(this.a != 0) {
            Date date0 = (Date)((s)this.b).a(a0);
            return date0 != null ? new Timestamp(date0.getTime()) : null;
        }
        if(a0.O() == 9) {
            a0.G();
            return null;
        }
        String s = a0.nextString();
        synchronized(this) {
            Iterator iterator0 = ((ArrayList)this.b).iterator();
        label_12:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                DateFormat dateFormat0 = (DateFormat)object0;
                try {
                    return dateFormat0.parse(s);
                }
                catch(ParseException unused_ex) {
                    goto label_12;
                }
            }
            try {
                return i8.a.b(s, new ParsePosition(0));
            }
            catch(ParseException parseException0) {
                throw new n(s, parseException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
        }
    }

    @Override  // e8.s
    public final void b(b b0, Object object0) {
        if(this.a != 0) {
            ((s)this.b).b(b0, ((Timestamp)object0));
            return;
        }
        synchronized(this) {
            if(((Date)object0) == null) {
                b0.z();
                return;
            }
            b0.S(((DateFormat)((ArrayList)this.b).get(0)).format(((Date)object0)));
        }
    }
}

