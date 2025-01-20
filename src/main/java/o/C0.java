package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;

public final class c0 extends Drawable implements Drawable.Callback {
    public Drawable X;
    public boolean Y;

    public final void a(Canvas canvas0) {
        this.X.draw(canvas0);
    }

    public final void b(float f, float f1) {
        this.X.setHotspot(f, f1);
    }

    public final void c(int v, int v1, int v2, int v3) {
        this.X.setHotspotBounds(v, v1, v2, v3);
    }

    // Deobfuscation rating: LOW(20)
    public final boolean d(boolean z, boolean z1) {
        return super.setVisible(z, z1) || this.X.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        if(this.Y) {
            this.a(canvas0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.X.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.X.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.X.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.X.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.X.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.X.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.X.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect0) {
        return this.X.getPadding(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.X.getState();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.X.getTransparentRegion();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.X.isAutoMirrored();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.X.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.X.jumpToCurrentState();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        this.X.setBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int v) {
        return this.X.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        this.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        this.X.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.X.setAutoMirrored(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int v) {
        this.X.setChangingConfigurations(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.X.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.X.setDither(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.X.setFilterBitmap(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f1) {
        if(this.Y) {
            this.b(f, f1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int v, int v1, int v2, int v3) {
        if(this.Y) {
            this.c(v, v1, v2, v3);
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.graphics.drawable.Drawable
    public final boolean setState(int[] arr_v) {
        return this.Y ? this.X.setState(arr_v) : false;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTint(int v) {
        this.X.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList0) {
        this.X.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.X.setTintMode(porterDuff$Mode0);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z1) {
        return this.Y ? this.d(z, z1) : false;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        this.unscheduleSelf(runnable0);
    }
}

