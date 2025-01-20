package Q4;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Process;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.internal.measurement.i2;
import com.google.android.gms.measurement.internal.zzbf;
import h2.a;
import j6.O;
import j6.Y;
import j6.d0;
import j6.h0;
import j6.k1;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class j implements Callable {
    public final int a;
    public Object b;

    public j() {
        this.a = 2;
        super();
    }

    public j(View view0) {
        this.a = 0;
        super();
        this.b = new WeakReference(view0);
    }

    public j(a a0) {
        this.a = 1;
        super();
        this.b = a0;
    }

    public j(h0 h00, zzbf zzbf0, String s) {
        this.a = 3;
        super();
        this.b = h00;
    }

    @Override
    public final Object call() {
        switch(this.a) {
            case 0: {
                View view0 = (View)((WeakReference)this.b).get();
                if(view0 != null && view0.getWidth() != 0 && view0.getHeight() != 0) {
                    Bitmap bitmap0 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.RGB_565);
                    view0.draw(new Canvas(bitmap0));
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    bitmap0.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream0);
                    Object object0 = Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
                    Nb.j.e(object0, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
                    return object0;
                }
                return "";
            }
            case 1: {
                a a0 = (a)this.b;
                a0.b0.set(true);
                try {
                    Process.setThreadPriority(10);
                    a0.c0.d();
                    Binder.flushPendingCommands();
                }
                catch(Throwable throwable0) {
                    try {
                        a0.Z.set(true);
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        a0.a(null);
                        throw throwable1;
                    }
                }
                a0.a(null);
                return null;
            }
            case 2: {
                return new i2(((Y)this.b).j0);
            }
            default: {
                h0 h00 = (h0)this.b;
                h00.d.d0();
                O o0 = h00.d.f0;
                k1.v(o0);
                o0.q();
                ((d0)o0.Y).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            }
        }
    }
}

