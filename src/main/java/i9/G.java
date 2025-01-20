package i9;

import android.view.View.OnClickListener;
import android.view.View;
import com.sendwave.shared.QRScanActivity;

public final class g implements View.OnClickListener {
    public final int X;
    public QRScanActivity Y;

    public g(int v) {
        this.X = v;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.X != 0) {
            this.Y.onFlashlight(view0);
            return;
        }
        this.Y.onBackButtonClicked(view0);
    }
}

