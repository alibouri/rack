package l9;

import I6.c;
import U8.a;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

public final class f {
    public boolean a;
    public boolean b;
    public final boolean c;
    public final Camera d;
    public final Handler e;
    public final a f;
    public static final ArrayList g;

    static {
        ArrayList arrayList0 = new ArrayList(1);
        f.g = arrayList0;
        arrayList0.add("auto");
    }

    public f(Camera camera0) {
        c c0 = new c(5, this);
        this.f = new a(1, this);
        this.e = new Handler(c0);
        this.d = camera0;
        String s = camera0.getParameters().getFocusMode();
        boolean z = f.g.contains(s);
        this.c = z;
        hd.c.a.n("f");
        hd.c.a.g("Current focus mode \'" + s + "\'; use auto focus? " + z, new Object[0]);
    }

    public final void a() {
        synchronized(this) {
            if(!this.a && !this.e.hasMessages(1)) {
                Message message0 = this.e.obtainMessage(1);
                this.e.sendMessageDelayed(message0, 2000L);
            }
        }
    }

    public final void b() {
        if(this.c && !this.a && !this.b) {
            try {
                this.d.autoFocus(this.f);
                this.b = true;
            }
            catch(RuntimeException runtimeException0) {
                hd.c.a.n("f");
                hd.c.a.m(runtimeException0, "Unexpected exception while focusing", new Object[0]);
                this.a();
            }
        }
    }
}

