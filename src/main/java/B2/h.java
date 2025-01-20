package B2;

import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class h extends Drawable {
    public Drawable X;

    @Override  // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme resources$Theme0) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.applyTheme(resources$Theme0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? super.getCurrent() : drawable0.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? super.getMinimumHeight() : drawable0.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? super.getMinimumWidth() : drawable0.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect0) {
        Drawable drawable0 = this.X;
        return drawable0 == null ? super.getPadding(rect0) : drawable0.getPadding(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? super.getState() : drawable0.getState();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? super.getTransparentRegion() : drawable0.getTransparentRegion();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLevelChange(int v) {
        Drawable drawable0 = this.X;
        return drawable0 == null ? super.onLevelChange(v) : drawable0.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int v) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setChangingConfigurations(v);
            return;
        }
        super.setChangingConfigurations(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(int v, PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setColorFilter(v, porterDuff$Mode0);
            return;
        }
        super.setColorFilter(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setFilterBitmap(z);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f1) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setHotspot(f, f1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int v, int v1, int v2, int v3) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setHotspotBounds(v, v1, v2, v3);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean setState(int[] arr_v) {
        Drawable drawable0 = this.X;
        return drawable0 == null ? super.setState(arr_v) : drawable0.setState(arr_v);
    }
}

