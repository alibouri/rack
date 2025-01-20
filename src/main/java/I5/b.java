package i5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class b extends Binder implements c {
    public static final int d;

    public static c b(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if(iInterface0 != null && iInterface0 instanceof c) {
            return (c)iInterface0;
        }
        c c0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
        c0.d = iBinder0;
        return c0;
    }
}

