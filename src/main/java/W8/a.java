package W8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera;
import android.view.View;
import android.widget.ImageView;
import c4.c;
import com.drew.metadata.exif.ExifIFD0Directory;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import l9.f;
import yc.d;

public final class a implements Camera.PictureCallback {
    public final View a;
    public final e b;

    public a(e e0, View view0) {
        this.b = e0;
        this.a = view0;
    }

    @Override  // android.hardware.Camera$PictureCallback
    public final void onPictureTaken(byte[] arr_b, Camera camera0) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
        e e0 = this.b;
        int v = e0.I(bitmapFactory$Options0);
        bitmapFactory$Options0.inJustDecodeBounds = false;
        bitmapFactory$Options0.inSampleSize = v;
        e0.G0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
        Matrix matrix0 = new Matrix();
        if(e0.H0) {
            matrix0.postRotate(180.0f);
        }
        try {
            ExifIFD0Directory exifIFD0Directory0 = (ExifIFD0Directory)d.y(new BufferedInputStream(new ByteArrayInputStream(arr_b))).o(ExifIFD0Directory.class);
            if(exifIFD0Directory0 != null && exifIFD0Directory0.containsTag(274)) {
                switch(exifIFD0Directory0.getInt(274)) {
                    case 2: {
                        matrix0.postScale(-1.0f, 1.0f);
                        break;
                    }
                    case 3: {
                        matrix0.postRotate(180.0f);
                        break;
                    }
                    case 4: {
                        matrix0.postRotate(180.0f);
                        matrix0.postScale(-1.0f, 1.0f);
                        break;
                    }
                    case 5: {
                        matrix0.postRotate(90.0f);
                        matrix0.postScale(-1.0f, 1.0f);
                        break;
                    }
                    case 6: {
                        matrix0.postRotate(90.0f);
                        break;
                    }
                    case 7: {
                        matrix0.postRotate(270.0f);
                        matrix0.postScale(-1.0f, 1.0f);
                        break;
                    }
                    case 8: {
                        matrix0.postRotate(270.0f);
                    }
                }
            }
        }
        catch(c | com.drew.metadata.d | IOException c0) {
            c0.printStackTrace();
        }
        e0.G0 = Bitmap.createBitmap(e0.G0, 0, 0, e0.G0.getWidth(), e0.G0.getHeight(), matrix0, false);
        if(e0.getIntent().getBooleanExtra("useConfirmationFlow", true)) {
            ((ImageView)e0.findViewById(0x7F0A0244)).setImageBitmap(e0.G0);  // id:photo
            e0.L(true);
            e0.E0.startPreview();
            e0.F0.setEnabled(true);
            f f0 = new f(e0.E0);
            e0.J0 = f0;
            f0.a = false;
            f0.b();
            return;
        }
        e0.onSubmit(this.a);
    }
}

