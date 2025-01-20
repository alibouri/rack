package B2;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public final class p extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public p(Drawable.ConstantState drawable$ConstantState0) {
        this.a = drawable$ConstantState0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        Drawable drawable0 = new q();
        drawable0.X = (VectorDrawable)this.a.newDrawable();
        return drawable0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        Drawable drawable0 = new q();
        drawable0.X = (VectorDrawable)this.a.newDrawable(resources0);
        return drawable0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0, Resources.Theme resources$Theme0) {
        Drawable drawable0 = new q();
        drawable0.X = (VectorDrawable)this.a.newDrawable(resources0, resources$Theme0);
        return drawable0;
    }
}

