package K6;

import R1.g;
import android.text.TextUtils;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.c;
import fa.d;
import o9.l;

public final class b implements View.OnFocusChangeListener {
    public final int a;
    public final Object b;

    public b(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    public b(d d0, int v) {
        this.a = 2;
        super();
        this.b = (g)d0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        switch(this.a) {
            case 0: {
                boolean z1 = !TextUtils.isEmpty(((EditText)view0).getText()) && z;
                ((h)this.b).d(z1);
                return;
            }
            case 1: {
                c c0 = (c)this.b;
                c0.a.setEndIconActivated(z);
                if(!z) {
                    c0.g(false);
                    c0.i = false;
                }
                return;
            }
            case 2: {
                ((d)(((g)this.b))).c(z);
                return;
            }
            default: {
                l l0 = (l)((ca.c)this.b).u;
                if(l0 != null) {
                    l0.e();
                }
            }
        }
    }
}

