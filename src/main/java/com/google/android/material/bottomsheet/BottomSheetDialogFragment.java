package com.google.android.material.bottomsheet;

import android.app.Dialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import u6.e;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override  // androidx.appcompat.app.AppCompatDialogFragment
    public final Dialog V() {
        return new e(this.n(), this.c1);
    }
}

