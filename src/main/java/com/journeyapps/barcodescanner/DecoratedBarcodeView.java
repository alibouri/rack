package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import v8.h;

public class DecoratedBarcodeView extends FrameLayout {
    public interface TorchListener {
        void a();

        void b();
    }

    public final BarcodeView b0;
    public final ViewfinderView c0;
    public final TextView d0;
    public TorchListener e0;

    public DecoratedBarcodeView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, h.c);
        int v = typedArray0.getResourceId(0, 0x7F0D0108);  // layout:zxing_barcode_scanner
        typedArray0.recycle();
        View.inflate(this.getContext(), v, this);
        BarcodeView barcodeView0 = (BarcodeView)this.findViewById(0x7F0A033A);  // id:zxing_barcode_surface
        this.b0 = barcodeView0;
        if(barcodeView0 == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView0.c(attributeSet0);
        ViewfinderView viewfinderView0 = (ViewfinderView)this.findViewById(0x7F0A0344);  // id:zxing_viewfinder_view
        this.c0 = viewfinderView0;
        if(viewfinderView0 == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView0.setCameraPreview(this.b0);
        this.d0 = (TextView)this.findViewById(0x7F0A0343);  // id:zxing_status_view
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView)this.findViewById(0x7F0A033A);  // id:zxing_barcode_surface
    }

    public CameraSettings getCameraSettings() {
        return this.b0.getCameraSettings();
    }

    public DecoderFactory getDecoderFactory() {
        return this.b0.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.d0;
    }

    public ViewfinderView getViewFinder() {
        return this.c0;
    }

    @Override  // android.view.View
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        switch(v) {
            case 24: {
                this.b0.setTorch(true);
                TorchListener decoratedBarcodeView$TorchListener0 = this.e0;
                if(decoratedBarcodeView$TorchListener0 != null) {
                    decoratedBarcodeView$TorchListener0.b();
                }
                return true;
            }
            case 25: {
                this.b0.setTorch(false);
                TorchListener decoratedBarcodeView$TorchListener1 = this.e0;
                if(decoratedBarcodeView$TorchListener1 != null) {
                    decoratedBarcodeView$TorchListener1.a();
                }
                return true;
            }
            case 27: 
            case 80: {
                return true;
            }
            default: {
                return super.onKeyDown(v, keyEvent0);
            }
        }
    }

    public void setCameraSettings(CameraSettings cameraSettings0) {
        this.b0.setCameraSettings(cameraSettings0);
    }

    public void setDecoderFactory(DecoderFactory decoderFactory0) {
        this.b0.setDecoderFactory(decoderFactory0);
    }

    public void setStatusText(String s) {
        TextView textView0 = this.d0;
        if(textView0 != null) {
            textView0.setText(s);
        }
    }

    public void setTorchListener(TorchListener decoratedBarcodeView$TorchListener0) {
        this.e0 = decoratedBarcodeView$TorchListener0;
    }
}

