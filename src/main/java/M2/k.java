package m2;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

public final class k implements SeekBar.OnSeekBarChangeListener {
    public final SeekBarPreference a;

    public k(SeekBarPreference seekBarPreference0) {
        this.a = seekBarPreference0;
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        SeekBarPreference seekBarPreference0 = this.a;
        if(z && (seekBarPreference0.q0 || !seekBarPreference0.o0)) {
            seekBarPreference0.i(seekBar0);
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
        this.a.o0 = true;
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
        SeekBarPreference seekBarPreference0 = this.a;
        seekBarPreference0.o0 = false;
        if(seekBar0.getProgress() + seekBarPreference0.l0 != seekBarPreference0.k0) {
            seekBarPreference0.i(seekBar0);
        }
    }
}

