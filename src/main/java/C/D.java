package c;

import Nb.j;
import c2.x;

public final class d implements Runnable {
    public final int X;
    public final x Y;

    public d(x x0, int v) {
        this.X = v;
        this.Y = x0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            try {
                this.Y.onBackPressed();
                return;
            }
            catch(IllegalStateException illegalStateException0) {
                if(!j.a(illegalStateException0.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw illegalStateException0;
                }
            }
            catch(NullPointerException nullPointerException0) {
                if(!j.a(nullPointerException0.getMessage(), "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference")) {
                    throw nullPointerException0;
                }
            }
            return;
        }
        this.Y.invalidateOptionsMenu();
    }
}

