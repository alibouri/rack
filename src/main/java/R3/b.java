package r3;

import B3.a;
import B3.c;
import android.content.Context;
import android.util.Pair;
import io.sentry.hints.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import x3.e;

public final class b implements Callable {
    public final int a;
    public final Context b;
    public final String c;
    public final String d;

    public b(Context context0, String s, String s1, int v) {
        this.a = v;
        this.b = context0;
        this.c = s;
        this.d = s1;
        super();
    }

    @Override
    public final Object call() {
        Object object0;
        n n1;
        a a3;
        r3.a a2;
        n n0;
        B3.b b0;
        FileInputStream fileInputStream0;
        File file0;
        if(this.a != 0) {
            Context context0 = this.b;
            String s = this.c;
            String s1 = this.d;
            r3.a a0 = s1 == null ? null : e.b.a(s1);
            if(a0 != null) {
                return new n(a0);
            }
            try {
                return d.b(context0, context0.getAssets().open(s), s1);
            }
            catch(IOException iOException0) {
                return new n(iOException0);
            }
        }
        Context context1 = this.b;
        String s2 = this.c;
        String s3 = this.d;
        B3.d d0 = Pb.a.a;
        if(d0 == null) {
            synchronized(B3.d.class) {
                d0 = Pb.a.a;
                if(d0 == null) {
                    d0 = new B3.d(Pb.a.C(context1), new i(1));
                    Pb.a.a = d0;
                }
            }
        }
        int v1 = 1;
        a a1 = null;
        if(s3 == null) {
            a2 = null;
        }
        else {
            c c0 = (c)d0.Y;
            try {
                file0 = c0.o(s2);
                if(file0 == null) {
                    goto label_40;
                }
                else {
                    fileInputStream0 = new FileInputStream(file0);
                    goto label_32;
                }
                goto label_41;
            }
            catch(FileNotFoundException unused_ex) {
                goto label_40;
            }
        label_32:
            if(file0.getAbsolutePath().endsWith(".zip")) {
                b0 = B3.b.Z;
            }
            else {
                b0 = file0.getAbsolutePath().endsWith(".gz") ? B3.b.b0 : B3.b.Y;
            }
            file0.getAbsolutePath();
            E3.d.a();
            Pair pair0 = new Pair(b0, fileInputStream0);
            goto label_41;
            try {
            label_40:
                pair0 = null;
            }
            catch(FileNotFoundException unused_ex) {
                goto label_40;
            }
        label_41:
            if(pair0 == null) {
                a2 = null;
            }
            else {
                B3.b b1 = (B3.b)pair0.first;
                InputStream inputStream0 = (InputStream)pair0.second;
                switch(b1.ordinal()) {
                    case 1: {
                        n0 = d.e(context1, new ZipInputStream(inputStream0), s3);
                        break;
                    }
                    case 2: {
                        try {
                            n0 = d.c(new GZIPInputStream(inputStream0), s3);
                        }
                        catch(IOException iOException1) {
                            n0 = new n(iOException1);
                        }
                        break;
                    }
                    default: {
                        n0 = d.c(inputStream0, s3);
                    }
                }
                a2 = n0.a;
                if(a2 == null) {
                    a2 = null;
                }
            }
        }
        if(a2 == null) {
            E3.d.a();
            E3.d.a();
            try {
                a3 = i.s(s2);
                goto label_69;
            }
            catch(Exception exception0) {
                n1 = new n(exception0);
                goto label_86;
            label_69:
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)a3.Y;
                int v2 = 0;
                try {
                    if(httpURLConnection0.getResponseCode() / 100 != 2) {
                        v1 = 0;
                    }
                    v2 = v1;
                }
                catch(IOException unused_ex) {
                }
                catch(Exception exception0) {
                    goto label_81;
                }
                catch(Throwable throwable0) {
                    goto label_94;
                }
                try {
                    if(v2 == 0) {
                        object0 = new n(new IllegalArgumentException(a3.a()));
                    }
                    else {
                        object0 = d0.x(context1, s2, httpURLConnection0.getInputStream(), httpURLConnection0.getContentType(), s3);
                        E3.d.a();
                    }
                    goto label_101;
                }
                catch(Exception exception0) {
                }
                catch(Throwable throwable0) {
                    goto label_94;
                }
            label_81:
                a1 = a3;
                try {
                    n1 = new n(exception0);
                    goto label_86;
                }
                catch(Throwable throwable0) {
                }
                goto label_95;
            }
            catch(Throwable throwable0) {
                goto label_95;
            }
        label_86:
            if(a1 != null) {
                try {
                    a1.close();
                }
                catch(IOException iOException2) {
                    E3.d.c("LottieFetchResult close failed ", iOException2);
                }
            }
            object0 = n1;
            goto label_105;
        label_94:
            a1 = a3;
        label_95:
            if(a1 != null) {
                try {
                    a1.close();
                }
                catch(IOException iOException3) {
                    E3.d.c("LottieFetchResult close failed ", iOException3);
                }
            }
            throw throwable0;
            try {
            label_101:
                a3.close();
            }
            catch(IOException iOException4) {
                E3.d.c("LottieFetchResult close failed ", iOException4);
            }
        }
        else {
            object0 = new n(a2);
        }
    label_105:
        if(s3 != null) {
            r3.a a4 = object0.a;
            if(a4 != null) {
                e.b.a.l(s3, a4);
            }
        }
        return object0;
    }
}

