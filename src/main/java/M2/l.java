package m2;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import androidx.preference.SeekBarPreference;

public final class l implements View.OnKeyListener {
    public final SeekBarPreference X;

    public l(SeekBarPreference seekBarPreference0) {
        this.X = seekBarPreference0;
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() != 0) {
            return false;
        }
        if(!this.X.p0 && (v == 21 || v == 22)) {
            return false;
        }
        if(v != 23 && v != 66) {
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        }
        return false;
    }
}

