package J2;

import I2.b;
import M4.l;
import W4.c;
import W4.e;
import Z4.f;
import a5.w;
import android.graphics.Canvas;
import android.view.View;
import android.view.Window.Callback;
import android.view.Window;
import androidx.work.impl.WorkDatabase;
import f5.a;
import io.sentry.ILogger;
import io.sentry.M1;
import io.sentry.android.core.C;
import io.sentry.i1;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public final class i implements Runnable {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;

    public i(Object object0, Object object1, Object object2, Object object3, int v) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        this.b0 = object2;
        this.c0 = object3;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.c0;
        Object object1 = this.b0;
        Object object2 = this.Z;
        Object object3 = this.Y;
        switch(this.X) {
            case 0: {
                for(Object object4: ((List)object3)) {
                    ((g)object4).a(((R2.i)object2).a);
                }
                j.b(((b)object1), ((WorkDatabase)object0), ((List)object3));
                return;
            }
            case 1: {
                JSONObject jSONObject0 = (JSONObject)object3;
                String s = (String)object2;
                f f0 = (f)object1;
                String s1 = (String)object0;
                Class class0 = f.class;
                if(!a.b(class0)) {
                    try {
                        Nb.j.f(s, "$buttonText");
                        Nb.j.f(f0, "this$0");
                        try {
                            String s2 = w.D(l.a());
                            if(s2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String s3 = s2.toLowerCase();
                            Nb.j.e(s3, "(this as java.lang.String).toLowerCase()");
                            float[] arr_f = Z4.a.c(s3, jSONObject0);
                            String s4 = Z4.a.e(s, f0.b0, s3);
                            if(arr_f != null) {
                                String[] arr_s = e.f(c.Y, new float[][]{arr_f}, new String[]{s4});
                                if(arr_s != null) {
                                    String s5 = arr_s[0];
                                    Z4.b.a(s1, s5);
                                    if(!Nb.j.a(s5, "other")) {
                                        Z4.a.j(s5, s, arr_f);
                                        return;
                                    }
                                }
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        return;
                    }
                    catch(Throwable throwable1) {
                    }
                    a.a(throwable1, class0);
                }
                return;
            }
            case 2: {
                View view1 = ((Window)object3).peekDecorView();
                if(view1 != null) {
                    ((Window)object3).setCallback(((Window.Callback)object2));
                    S7.b.a(view1, ((M1)object1), ((C)object0));
                }
                return;
            }
            default: {
                View view0 = (View)object3;
                Canvas canvas0 = (Canvas)object2;
                try {
                    view0.draw(canvas0);
                }
                catch(Throwable throwable0) {
                    ((ILogger)object1).l(i1.ERROR, "Taking screenshot failed (view.draw).", throwable0);
                }
                finally {
                    ((CountDownLatch)object0).countDown();
                }
            }
        }
    }
}

