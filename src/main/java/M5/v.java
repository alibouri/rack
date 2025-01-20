package M5;

import R2.c;
import Y6.b;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;

public final class v extends BroadcastReceiver {
    public Context a;
    public final c b;

    public v(c c0) {
        this.b = c0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Uri uri0 = intent0.getData();
        if("com.google.android.gms".equals((uri0 == null ? null : uri0.getSchemeSpecificPart()))) {
            o o0 = (o)((b)this.b.Z).Z;
            o0.Z.set(null);
            Message message0 = o0.e0.n.obtainMessage(3);
            o0.e0.n.sendMessage(message0);
            AlertDialog alertDialog0 = (AlertDialog)this.b.Y;
            if(alertDialog0.isShowing()) {
                alertDialog0.dismiss();
            }
            synchronized(this) {
                Context context1 = this.a;
                if(context1 != null) {
                    context1.unregisterReceiver(this);
                }
                this.a = null;
            }
        }
    }
}

