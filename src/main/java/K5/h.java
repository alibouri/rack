package K5;

import a6.d;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public final class h extends d {
    public final Context a;
    public final b b;

    public h(b b0, Context context0) {
        this.b = b0;
        super((Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper()), 0);
        this.a = context0.getApplicationContext();
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        int v = message0.what;
        if(v != 1) {
            Log.w("GoogleApiAvailability", "Don\'t know how to handle this message: " + v);
            return;
        }
        b b0 = this.b;
        Context context0 = this.a;
        int v1 = b0.b(context0, c.a);
        if(v1 != 1 && v1 != 2 && v1 != 3 && v1 != 9) {
            return;
        }
        Intent intent0 = b0.a(v1, context0, "n");
        b0.g(context0, v1, (intent0 == null ? null : PendingIntent.getActivity(context0, 0, intent0, 0xC000000)));
    }
}

