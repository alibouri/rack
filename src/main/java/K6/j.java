package K6;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

public final class j extends MaterialShapeDrawable {
    public final Paint v0;
    public final RectF w0;
    public int x0;

    public j(ShapeAppearanceModel shapeAppearanceModel0) {
        if(shapeAppearanceModel0 == null) {
            shapeAppearanceModel0 = new ShapeAppearanceModel();
        }
        super(shapeAppearanceModel0);
        Paint paint0 = new Paint(1);
        this.v0 = paint0;
        paint0.setStyle(Paint.Style.FILL_AND_STROKE);
        paint0.setColor(-1);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.w0 = new RectF();
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final void draw(Canvas canvas0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(!(drawable$Callback0 instanceof View)) {
            this.x0 = canvas0.saveLayer(0.0f, 0.0f, ((float)canvas0.getWidth()), ((float)canvas0.getHeight()), null);
        }
        else if(((View)drawable$Callback0).getLayerType() != 2) {
            ((View)drawable$Callback0).setLayerType(2, null);
        }
        super.draw(canvas0);
        canvas0.drawRect(this.w0, this.v0);
        if(!(this.getCallback() instanceof View)) {
            canvas0.restoreToCount(this.x0);
        }
    }

    public final void n(float f, float f1, float f2, float f3) {
        RectF rectF0 = this.w0;
        if(f == rectF0.left || f1 == rectF0.top || f2 == rectF0.right || f3 != rectF0.bottom) {
            rectF0.set(f, f1, f2, f3);
            this.invalidateSelf();
        }
    }
}

