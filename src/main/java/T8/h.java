package T8;

import android.content.Intent;
import android.util.Log;

public final class h implements Runnable {
    public final int X;
    public final j Y;

    public h(j j0, int v) {
        this.X = v;
        this.Y = j0;
        super();
    }

    @Override
    public final void run() {
        j j0 = this.Y;
        if(this.X != 0) {
            Intent intent0 = new Intent("com.google.zxing.client.android.SCAN");
            intent0.putExtra("TIMEOUT", true);
            j0.a.setResult(0, intent0);
            j0.a();
            return;
        }
        j0.getClass();
        Log.d("j", "Finishing due to inactivity");
        j0.a.finish();
    }
}

