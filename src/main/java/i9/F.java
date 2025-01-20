package i9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sendwave.shared.QRScanActivity;

public abstract class f extends g {
    public final Button q;
    public final ImageButton r;
    public final ConstraintLayout s;
    public QRScanActivity t;

    public f(c c0, View view0, Button button0, ImageButton imageButton0, ConstraintLayout constraintLayout0) {
        super(c0, view0, 0);
        this.q = button0;
        this.r = imageButton0;
        this.s = constraintLayout0;
    }

    public abstract void u(QRScanActivity arg1);
}

