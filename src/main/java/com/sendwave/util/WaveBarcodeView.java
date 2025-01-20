package com.sendwave.util;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.journeyapps.barcodescanner.BarcodeView;

public class WaveBarcodeView extends BarcodeView {
    public WaveBarcodeView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // com.journeyapps.barcodescanner.CameraPreview
    public final Rect b(Rect rect0, Rect rect1) {
        Rect rect2 = new Rect(rect0);
        rect2.intersect(rect1);
        return rect2;
    }
}

