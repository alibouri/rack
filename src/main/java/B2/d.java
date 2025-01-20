package B2;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;

public final class d extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public d(Drawable.ConstantState drawable$ConstantState0) {
        this.a = drawable$ConstantState0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        Drawable drawable0 = new e(null);
        Drawable drawable1 = this.a.newDrawable();
        drawable0.X = drawable1;
        drawable1.setCallback(drawable0.b0);
        return drawable0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        Drawable drawable0 = new e(null);
        Drawable drawable1 = this.a.newDrawable(resources0);
        drawable0.X = drawable1;
        drawable1.setCallback(drawable0.b0);
        return drawable0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0, Resources.Theme resources$Theme0) {
        Drawable drawable0 = new e(null);
        Drawable drawable1 = this.a.newDrawable(resources0, resources$Theme0);
        drawable0.X = drawable1;
        drawable1.setCallback(drawable0.b0);
        return drawable0;
    }
}

