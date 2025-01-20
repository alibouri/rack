package i;

import android.window.OnBackInvokedCallback;

public final class v implements OnBackInvokedCallback {
    public final int a;
    public final Object b;

    public v(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        if(this.a != 0) {
            ((Runnable)this.b).run();
            return;
        }
        ((B)this.b).E();
    }
}

