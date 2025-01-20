package U8;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;

public final class i extends PreviewScalingStrategy {
    public final int a;

    public i(int v) {
        this.a = v;
        super();
    }

    @Override  // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public final float a(Size size0, Size size1) {
        switch(this.a) {
            case 0: {
                if(size0.X > 0 && size0.Y > 0) {
                    Size size2 = size0.a(size1);
                    float f4 = ((float)size2.X) * 1.0f;
                    float f5 = f4 / ((float)size0.X);
                    if(f5 > 1.0f) {
                        f5 = (float)Math.pow(1.0f / f5, 1.1);
                    }
                    float f6 = ((float)size2.Y) * 1.0f / ((float)size1.Y) + f4 / ((float)size1.X);
                    return 1.0f / f6 / f6 * f5;
                }
                return 0.0f;
            }
            case 1: {
                if(size0.X > 0 && size0.Y > 0) {
                    Size size3 = size0.b(size1);
                    float f7 = (float)size3.X;
                    float f8 = f7 * 1.0f / ((float)size0.X);
                    if(f8 > 1.0f) {
                        f8 = (float)Math.pow(1.0f / f8, 1.1);
                    }
                    float f9 = ((float)size1.Y) * 1.0f / ((float)size3.Y) * (((float)size1.X) * 1.0f / f7);
                    return 1.0f / f9 / f9 / f9 * f8;
                }
                return 0.0f;
            }
            default: {
                int v = size0.X;
                if(v > 0) {
                    int v1 = size0.Y;
                    if(v1 > 0) {
                        int v2 = size1.X;
                        float f = ((float)v) * 1.0f / ((float)v2);
                        if(f < 1.0f) {
                            f = 1.0f / f;
                        }
                        float f1 = (float)size1.Y;
                        float f2 = ((float)v1) * 1.0f / f1;
                        if(f2 < 1.0f) {
                            f2 = 1.0f / f2;
                        }
                        float f3 = ((float)v) * 1.0f / ((float)v1) / (((float)v2) * 1.0f / f1);
                        if(f3 < 1.0f) {
                            f3 = 1.0f / f3;
                        }
                        return 1.0f / f3 / f3 / f3 * (1.0f / f / f2);
                    }
                }
                return 0.0f;
            }
        }
    }

    @Override  // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public final Rect b(Size size0, Size size1) {
        switch(this.a) {
            case 0: {
                Size size2 = size0.a(size1);
                Log.i("i", "Preview: " + size0 + "; Scaled: " + size2 + "; Want: " + size1);
                int v = (size2.X - size1.X) / 2;
                int v1 = (size2.Y - size1.Y) / 2;
                return new Rect(-v, -v1, size2.X - v, size2.Y - v1);
            }
            case 1: {
                Size size3 = size0.b(size1);
                Log.i("i", "Preview: " + size0 + "; Scaled: " + size3 + "; Want: " + size1);
                int v2 = (size3.X - size1.X) / 2;
                int v3 = (size3.Y - size1.Y) / 2;
                return new Rect(-v2, -v3, size3.X - v2, size3.Y - v3);
            }
            default: {
                return new Rect(0, 0, size1.X, size1.Y);
            }
        }
    }
}

