package m3;

import Ab.e;
import Vb.j;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Build.VERSION;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import i3.t;
import j3.a;
import java.io.Closeable;
import java.util.ArrayList;
import pc.p;
import yc.l;

public abstract class g {
    public static final Bitmap.Config a;
    public static final p b;

    static {
        g.a = Build.VERSION.SDK_INT < 26 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        g.b = new p(((String[])new ArrayList(20).toArray(new String[0])));
    }

    public static final void a(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(RuntimeException runtimeException0) {
            throw runtimeException0;
        }
        catch(Exception unused_ex) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap0, String s) {
        if(s != null && !j.c0(s)) {
            String s1 = j.w0(j.w0(s, '#'), '?');
            return mimeTypeMap0.getMimeTypeFromExtension(j.v0('.', j.v0('/', s1, s1), ""));
        }
        return null;
    }

    public static final t c(ImageView imageView0) {
        Object object0 = imageView0.getTag(0x7F0A00DB);  // id:coil_request_manager
        t t0 = null;
        t t1 = object0 instanceof t ? ((t)object0) : null;
        if(t1 == null) {
            synchronized(imageView0) {
                Object object1 = imageView0.getTag(0x7F0A00DB);  // id:coil_request_manager
                if(object1 instanceof t) {
                    t0 = (t)object1;
                }
                if(t0 == null) {
                    t1 = new t();  // initializer: Ljava/lang/Object;-><init>()V
                    imageView0.addOnAttachStateChangeListener(t1);
                    imageView0.setTag(0x7F0A00DB, t1);  // id:coil_request_manager
                }
                else {
                    t1 = t0;
                }
                return t1;
            }
        }
        return t1;
    }

    // Deobfuscation rating: LOW(20)
    public static final boolean d(Uri uri0) {
        return Nb.j.a(uri0.getScheme(), "file") && Nb.j.a(((String)Bb.p.q0(uri0.getPathSegments())), "android_asset");
    }

    public static final int e(l l0, j3.g g0) {
        if(l0 instanceof a) {
            return ((a)l0).b;
        }
        switch(g0.ordinal()) {
            case 0: {
                return 0x80000000;
            }
            case 1: {
                return 0x7FFFFFFF;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }
}

