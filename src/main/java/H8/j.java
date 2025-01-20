package h8;

import e8.n;
import e8.s;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import jeb.synthetic.FIN;
import l8.b;

public final class j extends s {
    public final int a;
    public final SimpleDateFormat b;
    public static final a c;
    public static final a d;

    static {
        j.c = new a(3);
        j.d = new a(4);
    }

    public j(int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = new SimpleDateFormat("MMM d, yyyy");
            return;
        }
        super();
        this.b = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override  // e8.s
    public final Object a(l8.a a0) {
        if(this.a != 0) {
            __monitor_enter(this);
            int v = FIN.finallyOpen$NT();
            if(a0.O() == 9) {
                a0.G();
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
                return null;
            }
            try {
                String s = a0.nextString();
                Time time0 = new Time(this.b.parse(s).getTime());
                FIN.finallyExec$NT(v);
                return time0;
            }
            catch(ParseException parseException0) {
                FIN.finallyExec$NT(v);
                throw new n(parseException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
        }
        return this.c(a0);
    }

    @Override  // e8.s
    public final void b(b b0, Object object0) {
        if(this.a != 0) {
            synchronized(this) {
                b0.S((((Time)object0) == null ? null : this.b.format(((Time)object0))));
            }
            return;
        }
        this.d(b0, object0);
    }

    private final Object c(l8.a a0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(a0.O() == 9) {
            a0.G();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return null;
        }
        try {
            String s = a0.nextString();
            Object object0 = new Date(this.b.parse(s).getTime());
            FIN.finallyExec$NT(v);
            return object0;
        }
        catch(ParseException parseException0) {
            FIN.finallyExec$NT(v);
            throw new n(parseException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
    }

    private final void d(b b0, Object object0) {
        synchronized(this) {
            b0.S((((Date)object0) == null ? null : this.b.format(((Date)object0))));
        }
    }
}

