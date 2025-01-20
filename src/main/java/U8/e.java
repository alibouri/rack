package U8;

import a5.c;
import android.view.View;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import v8.a;
import v8.g;

public final class e implements Runnable {
    public final int X;
    public final boolean Y;
    public final Object Z;

    public e(int v, Object object0, boolean z) {
        this.X = v;
        this.Z = object0;
        this.Y = z;
        super();
    }

    public e(View view0, boolean z) {
        this.X = 1;
        super();
        this.Y = z;
        this.Z = view0;
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                ((CameraInstance)this.Z).c.e(this.Y);
                return;
            }
            case 1: {
                if(!this.Y) {
                    ((View)this.Z).setVisibility(8);
                }
                return;
            }
            case 2: {
                ((a)this.Z).X.e(this.Y);
                return;
            }
            default: {
                g g0 = (g)((c)this.Z).b;
                g0.f = this.Y;
                if(g0.c) {
                    g0.d.removeCallbacksAndMessages(null);
                    if(g0.f) {
                        g0.d.postDelayed(g0.e, 300000L);
                    }
                }
            }
        }
    }
}

