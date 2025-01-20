package q9;

import android.os.AsyncTask;
import hd.c;
import java.io.File;
import m9.m;

public final class o3 extends AsyncTask {
    public final p3 a;

    public o3(p3 p30) {
        this.a = p30;
        super();
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        c.a.n("Updater");
        c.a.g("Start background task to apply patches.", new Object[0]);
        p3 p30 = this.a;
        p30.i = true;
        try {
            File[] arr_file = p30.f.listFiles();
            for(int v1 = 0; v1 < arr_file.length; ++v1) {
                File file0 = arr_file[v1];
                try {
                    p3.a(p30, file0);
                }
                catch(Exception exception0) {
                    c.a.n("Updater");
                    c.a.e(exception0, "Failed to apply patch: %s", new Object[]{file0});
                    p30.h(new m(file0));
                }
                p3.b(file0);
            }
            return null;
        }
        finally {
            c.a.n("Updater");
            c.a.g("End background task for applying patches.", new Object[0]);
            p30.i = false;
        }
    }
}

