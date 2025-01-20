package T8;

import E7.D;
import J5.k;
import U7.c;
import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;

public final class q extends OrientationEventListener {
    public final k a;

    public q(k k0, Context context0) {
        this.a = k0;
        super(context0, 3);
    }

    @Override  // android.view.OrientationEventListener
    public final void onOrientationChanged(int v) {
        k k0 = this.a;
        WindowManager windowManager0 = (WindowManager)k0.c;
        c c0 = (c)k0.e;
        if(windowManager0 != null && c0 != null) {
            int v1 = windowManager0.getDefaultDisplay().getRotation();
            if(v1 != k0.b) {
                k0.b = v1;
                ((BarcodeView)c0.Y).d0.postDelayed(new D(12, c0), 0xFAL);
            }
        }
    }
}

