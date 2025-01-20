package J5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.io.IOException;
import o6.a;
import o6.g;
import o6.h;
import o6.k;
import o6.p;

public final class c implements a, g {
    public final int X;
    public static final c Y;
    public static final c Z;
    public static final c b0;

    static {
        c.Y = new c(0);
        c.Z = new c(1);
        c.b0 = new c(2);
    }

    public c(int v) {
        this.X = v;
        super();
    }

    @Override  // o6.g
    public p i(Object object0) {
        return ((Bundle)object0) == null || !((Bundle)object0).containsKey("google.messenger") ? k.e(((Bundle)object0)) : k.e(null);
    }

    @Override  // o6.a
    public Object j(h h0) {
        if(this.X != 0) {
            Intent intent0 = (Intent)((Bundle)h0.f()).getParcelable("notification_data");
            return intent0 != null ? new CloudMessage(intent0) : null;
        }
        if(h0.h()) {
            return (Bundle)h0.f();
        }
        if(Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: " + h0.e());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", h0.e());
    }
}

