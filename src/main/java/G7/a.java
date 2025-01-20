package g7;

import E7.C;
import W5.f;
import X2.g;
import h7.c;
import io.sentry.ILogger;
import io.sentry.O1;
import io.sentry.h;
import io.sentry.i1;
import io.sentry.l;
import io.sentry.m;
import io.sentry.n;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m7.e;
import m7.r;

public final class a implements e {
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object b0;

    public a(Object object0, Object object1, Object object2, Object object3) {
        this.X = object0;
        this.Y = object1;
        this.Z = object2;
        this.b0 = object3;
        super();
    }

    public void a() {
        int v2;
        File file0 = (File)this.b0;
        i1 i10 = i1.DEBUG;
        String s = (String)this.Y;
        ILogger iLogger0 = (ILogger)this.X;
        iLogger0.h(i10, "Started processing cached files from %s", new Object[]{s});
        n n0 = (n)this.Z;
        ILogger iLogger1 = n0.b;
        try {
            iLogger1.h(i10, "Processing dir. %s", new Object[]{file0.getAbsolutePath()});
            if(!file0.exists()) {
                Object[] arr_object3 = {file0.getAbsolutePath()};
                iLogger1.h(i1.WARNING, "Directory \'%s\' doesn\'t exist. No cached events to send.", arr_object3);
            }
            else if(file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file == null) {
                    Object[] arr_object1 = {file0.getAbsolutePath()};
                    iLogger1.h(i1.ERROR, "Cache dir %s is null.", arr_object1);
                }
                else {
                    File[] arr_file1 = file0.listFiles(new l(n0));
                    iLogger1.h(i10, "Processing %d items from cache dir %s", new Object[]{((int)(arr_file1 == null ? 0 : arr_file1.length)), file0.getAbsolutePath()});
                    int v = arr_file.length;
                    int v1 = 0;
                    while(v1 < v) {
                        File file1 = arr_file[v1];
                        if(file1.isFile()) {
                            String s1 = file1.getAbsolutePath();
                            O1 o10 = n0.d;
                            if(o10.contains(s1)) {
                                iLogger1.h(i1.DEBUG, "File \'%s\' has already been processed so it will not be processed again.", new Object[]{s1});
                                goto label_35;
                            }
                            else {
                                g g0 = n0.a.e();
                                if(g0 != null && g0.q(h.All)) {
                                    iLogger1.h(i1.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                                    break;
                                }
                                v2 = v;
                                iLogger1.h(i1.DEBUG, "Processing file: %s", new Object[]{s1});
                                n0.b(file1, f.w(new m(n0.c, n0.b, s1, o10)));
                                Thread.sleep(100L);
                                goto label_36;
                            }
                            goto label_33;
                        }
                        else {
                        label_33:
                            Object[] arr_object = {file1.getAbsolutePath()};
                            iLogger1.h(i1.DEBUG, "File %s is not a File.", arr_object);
                        }
                    label_35:
                        v2 = v;
                    label_36:
                        ++v1;
                        v = v2;
                    }
                }
            }
            else {
                Object[] arr_object2 = {file0.getAbsolutePath()};
                iLogger1.h(i1.ERROR, "Cache dir %s is not a directory.", arr_object2);
            }
        }
        catch(Throwable throwable0) {
            Object[] arr_object4 = {file0.getAbsolutePath()};
            iLogger1.k(i1.ERROR, throwable0, "Failed processing \'%s\'", arr_object4);
        }
        iLogger0.h(i1.DEBUG, "Finished processing cached files from %s", new Object[]{s});
    }

    @Override  // m7.e
    public Object d(C c0) {
        return new c(((Z6.g)c0.a(Z6.g.class)), c0.l(v7.e.class), ((Executor)c0.k(((r)this.X))), ((Executor)c0.k(((r)this.Y))), ((Executor)c0.k(((r)this.Z))), ((ScheduledExecutorService)c0.k(((r)this.b0))));
    }
}

