package m2;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.material.chip.ChipGroup;

public final class a implements CompoundButton.OnCheckedChangeListener {
    public final int a;
    public final Object b;

    public a(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        switch(this.a) {
            case 0: {
                ((CheckBoxPreference)this.b).getClass();
                ((CheckBoxPreference)this.b).i(z);
                return;
            }
            case 1: {
                ((SwitchPreference)this.b).getClass();
                ((SwitchPreference)this.b).i(z);
                return;
            }
            case 2: {
                ((SwitchPreferenceCompat)this.b).getClass();
                ((SwitchPreferenceCompat)this.b).i(z);
                return;
            }
            default: {
                ChipGroup chipGroup0 = (ChipGroup)this.b;
                if(!chipGroup0.n0) {
                    if(chipGroup0.getCheckedChipIds().isEmpty() && chipGroup0.i0) {
                        chipGroup0.c(compoundButton0.getId(), true);
                        chipGroup0.m0 = compoundButton0.getId();
                        return;
                    }
                    int v = compoundButton0.getId();
                    if(z) {
                        int v1 = chipGroup0.m0;
                        if(v1 != -1 && v1 != v && chipGroup0.h0) {
                            chipGroup0.c(v1, false);
                        }
                        chipGroup0.setCheckedId(v);
                        return;
                    }
                    if(chipGroup0.m0 == v) {
                        chipGroup0.setCheckedId(-1);
                    }
                }
            }
        }
    }
}

