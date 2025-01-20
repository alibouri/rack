package V4;

import Nb.j;
import android.os.AsyncTask;
import f5.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public final class l extends AsyncTask {
    public final String a;
    public final File b;
    public final k c;

    public l(String s, File file0, k k0) {
        j.f(s, "uriStr");
        super();
        this.a = s;
        this.b = file0;
        this.c = k0;
    }

    public final Boolean a(String[] arr_s) {
        if(a.b(this)) {
            return null;
        }
        try {
            j.f(arr_s, "args");
            try {
                URL uRL0 = new URL(this.a);
                int v = uRL0.openConnection().getContentLength();
                DataInputStream dataInputStream0 = new DataInputStream(uRL0.openStream());
                byte[] arr_b = new byte[v];
                dataInputStream0.readFully(arr_b);
                dataInputStream0.close();
                DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(this.b));
                dataOutputStream0.write(arr_b);
                dataOutputStream0.flush();
                dataOutputStream0.close();
                return Boolean.TRUE;
            }
            catch(Exception unused_ex) {
                return Boolean.FALSE;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        if(a.b(this)) {
            return null;
        }
        try {
            return this.a(((String[])arr_object));
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    @Override  // android.os.AsyncTask
    public final void onPostExecute(Object object0) {
        if(a.b(this)) {
            return;
        }
        try {
            if(!a.b(this) && ((Boolean)object0).booleanValue()) {
                try {
                    this.c.c(this.b);
                }
                catch(Throwable throwable1) {
                    a.a(throwable1, this);
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

