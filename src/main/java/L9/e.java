package l9;

import Ab.k;
import Ab.t;
import Bb.F;
import E7.u;
import Fb.j;
import I2.w;
import I2.x;
import W5.f;
import Xb.G;
import android.content.Context;
import android.content.SharedPreferences;
import com.sendwave.photo.UploadWorker;
import com.sendwave.util.Country;
import com.wave.customer.CustomerApp;
import hb.n;
import hd.c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.HashMap;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;
import q9.C3;
import q9.r1;
import yb.a;
import yb.d;

public final class e extends j implements Function2 {
    public final UploadWorker c0;

    public e(UploadWorker uploadWorker0, g g0) {
        this.c0 = uploadWorker0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        d d0;
        URL uRL0;
        f.b0(object0);
        UploadWorker uploadWorker0 = this.c0;
        String s = uploadWorker0.b.b.b("WALLET_ID");
        String s1 = uploadWorker0.b.b.b("FILE_HASH");
        String s2 = uploadWorker0.b.b.b("FILE_URI_PATH");
        String s3 = uploadWorker0.b.b.b("DESCRIPTOR_TAG");
        File file0 = new File(s2);
        O7.g g0 = new O7.g(3);
        long v = file0.length();
        g0.Y = v;
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        S7.g g1 = new S7.g();  // initializer: Ljava/lang/Object;-><init>()V
        g1.b = -1L;
        if(!fileInputStream0.markSupported()) {
            fileInputStream0 = new BufferedInputStream(fileInputStream0);
        }
        g1.c = fileInputStream0;
        g0.Z = g1;
        g0.b0 = String.format("%s-%d", file0.getAbsolutePath(), v);
        HashMap hashMap0 = new HashMap();
        g0.c0 = hashMap0;
        hashMap0.put("filename", file0.getName());
        u u0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
        Context context0 = uploadWorker0.g;
        C3 c30 = r1.b(context0);
        int v1 = ((CustomerApp)c30).G0;
        switch(v1) {
            case 1: {
                uRL0 = new URL("http://10.0.2.2:1080/files/");
                break;
            }
            case 2: {
                Country country0 = c30.k();
                uRL0 = new URL(b.y(new StringBuilder("https://"), country0.Y, ".tusd.wave.com/files/"));
                break;
            }
            default: {
                throw new IllegalStateException(("getTusUrl called with unknown flavor enum value " + v1).toString());
            }
        }
        u0.b = uRL0;
        u0.d = F.K(new k[]{new k("Id-Photo-Sha", s1), new k("W-Id", s), new k("Descriptor-Tag", s3)});
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("tus", 0);
        Nb.j.e(sharedPreferences0, "getSharedPreferences(...)");
        g3.b b0 = new g3.b(19, false);
        b0.Y = sharedPreferences0;
        u0.a = true;
        u0.c = b0;
        c.a.n("PhotoUpload");
        c.a.g(s1 + ": Starting upload", new Object[0]);
        try {
            try {
                d0 = u0.r(g0);
            }
            catch(a unused_ex) {
                d0 = u0.d(g0);
            }
            catch(yb.c unused_ex) {
                d0 = u0.d(g0);
            }
            catch(yb.b b1) {
                if(b1.X == null || b1.X.getResponseCode() != 404) {
                    throw b1;
                }
                d0 = u0.d(g0);
            }
            d0.f = new byte[0x400];
            if(d0.i != null) {
                throw new IllegalStateException("payload size for a single request must not be modified as long as a request is in progress");
            }
            d0.g = (int)(v / 10L + 1L);
            UploadWorker.e(uploadWorker0, d0, s1, v);
            c.a.n("PhotoUpload");
            c.a.g(s1 + ": Upload available at " + d0.a, new Object[0]);
            return new x();
        }
        catch(Exception exception0) {
        }
        n.a(("ID photo upload attempt failed with exception: " + exception0), null, null, null, null, 30);
        c.a.n("PhotoUpload");
        c.a.l(s1 + ": Caught exception in attemptUpload: " + exception0, new Object[0]);
        c.a.n("PhotoUpload");
        c.a.l(s1 + ": Retrying upload", new Object[0]);
        return new w();  // initializer: Ljava/lang/Object;-><init>()V
    }
}

