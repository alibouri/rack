package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.Size;

public abstract class PreviewScalingStrategy {
    public float a(Size size0, Size size1) {
        return 0.5f;
    }

    public abstract Rect b(Size arg1, Size arg2);
}

