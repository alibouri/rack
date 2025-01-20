package E7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import o6.p;
import yc.l;

public final class x implements Closeable {
    public final URL X;
    public volatile Future Y;
    public p Z;

    public x(URL uRL0) {
        this.X = uRL0;
    }

    public final Bitmap a() {
        byte[] arr_b;
        boolean z = Log.isLoggable("FirebaseMessaging", 4);
        URL uRL0 = this.X;
        if(z) {
            Log.i("FirebaseMessaging", "Starting download of: " + uRL0);
        }
        URLConnection uRLConnection0 = uRL0.openConnection();
        if(uRLConnection0.getContentLength() > 0x100000) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        try(InputStream inputStream0 = uRLConnection0.getInputStream()) {
            arr_b = l.E(new d(inputStream0));
        }
        if(Log.isLoggable("FirebaseMessaging", 2)) {
            Log.v("FirebaseMessaging", "Downloaded " + arr_b.length + " bytes from " + uRL0);
        }
        if(arr_b.length > 0x100000) {
            throw new IOException("Image exceeds max size of 1048576");
        }
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        if(bitmap0 == null) {
            throw new IOException("Failed to decode image: " + uRL0);
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + uRL0);
        }
        return bitmap0;
    }

    @Override
    public final void close() {
        this.Y.cancel(true);
    }
}

