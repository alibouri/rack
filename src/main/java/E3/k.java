package E3;

import G0.T;
import Pb.a;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import io.sentry.util.f;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import rc.b;

public final class k extends ThreadLocal {
    public final int a;

    public k(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object initialValue() {
        switch(this.a) {
            case 0: {
                return new PathMeasure();
            }
            case 1: {
                return new Path();
            }
            case 2: {
                return new Path();
            }
            case 3: {
                return new float[4];
            }
            case 4: {
                Choreographer choreographer0 = Choreographer.getInstance();
                Looper looper0 = Looper.myLooper();
                if(looper0 == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                T t0 = new T(choreographer0, a.w(looper0));
                return DefaultImpls.d(t0, t0.j0);
            }
            case 5: {
                return Boolean.FALSE;
            }
            case 6: {
                return new Random();
            }
            case 7: {
                return 0L;
            }
            case 8: {
                return new f();
            }
            default: {
                Object object0 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
                ((DateFormat)object0).setLenient(false);
                ((DateFormat)object0).setTimeZone(b.e);
                return object0;
            }
        }
    }
}

