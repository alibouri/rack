package n9;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;
import com.sendwave.remit.util.CountryPhoneInputView;

public final class b implements View.OnTouchListener {
    public final int X;
    public boolean Y;
    public float Z;
    public float b0;

    public b(CountryPhoneInputView countryPhoneInputView0) {
        this.X = ViewConfiguration.get(countryPhoneInputView0.getContext()).getScaledTouchSlop();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.Y = false;
                this.Z = motionEvent0.getRawX();
                this.b0 = motionEvent0.getRawY();
                return false;
            }
            case 1: {
                return this.Y ? false : view0.performClick();
            }
            case 2: {
                float f = motionEvent0.getRawX() - this.Z;
                float f1 = motionEvent0.getRawY() - this.b0;
                float f2 = (float)this.X;
                if(Math.abs(f) <= f2 || Math.abs(f1) <= f2) {
                    this.Y = true;
                    return false;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

