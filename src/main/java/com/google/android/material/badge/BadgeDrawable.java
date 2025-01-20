package com.google.android.material.badge;

import B6.i;
import B6.j;
import B6.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

public final class BadgeDrawable extends Drawable implements i {
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public int X;
        public int Y;
        public int Z;
        public int b0;
        public int c0;
        public String d0;
        public int e0;
        public int f0;
        public int g0;
        public boolean h0;
        public int i0;
        public int j0;
        public int k0;
        public int l0;

        static {
            SavedState.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.X);
            parcel0.writeInt(this.Y);
            parcel0.writeInt(this.Z);
            parcel0.writeInt(this.b0);
            parcel0.writeInt(this.c0);
            parcel0.writeString(this.d0.toString());
            parcel0.writeInt(this.e0);
            parcel0.writeInt(this.g0);
            parcel0.writeInt(this.i0);
            parcel0.writeInt(this.j0);
            parcel0.writeInt(this.k0);
            parcel0.writeInt(this.l0);
            parcel0.writeInt(((int)this.h0));
        }
    }

    public final WeakReference X;
    public final MaterialShapeDrawable Y;
    public final j Z;
    public final Rect b0;
    public final float c0;
    public final float d0;
    public final float e0;
    public final SavedState f0;
    public float g0;
    public float h0;
    public int i0;
    public float j0;
    public float k0;
    public float l0;
    public WeakReference m0;
    public WeakReference n0;

    public BadgeDrawable(Context context0) {
        WeakReference weakReference0 = new WeakReference(context0);
        this.X = weakReference0;
        l.c(context0, l.b, "Theme.MaterialComponents");
        Resources resources0 = context0.getResources();
        this.b0 = new Rect();
        this.Y = new MaterialShapeDrawable();
        this.c0 = (float)resources0.getDimensionPixelSize(0x7F07010E);  // dimen:mtrl_badge_radius
        this.e0 = (float)resources0.getDimensionPixelSize(0x7F07010D);  // dimen:mtrl_badge_long_text_horizontal_padding
        this.d0 = (float)resources0.getDimensionPixelSize(0x7F070113);  // dimen:mtrl_badge_with_text_radius
        j j0 = new j(this);
        this.Z = j0;
        j0.a.setTextAlign(Paint.Align.CENTER);
        SavedState badgeDrawable$SavedState0 = new SavedState();  // initializer: Ljava/lang/Object;-><init>()V
        badgeDrawable$SavedState0.Z = 0xFF;
        badgeDrawable$SavedState0.b0 = -1;
        badgeDrawable$SavedState0.Y = new TextAppearance(context0, 0x7F1301D6).a.getDefaultColor();  // style:TextAppearance.MaterialComponents.Badge
        badgeDrawable$SavedState0.d0 = "New notification";
        badgeDrawable$SavedState0.e0 = 0x7F100002;  // plurals:mtrl_badge_content_description
        badgeDrawable$SavedState0.f0 = 0x7F120292;  // string:mtrl_exceed_max_badge_number_content_description "More than %1$d new notifications"
        badgeDrawable$SavedState0.h0 = true;
        this.f0 = badgeDrawable$SavedState0;
        Context context1 = (Context)weakReference0.get();
        if(context1 != null) {
            TextAppearance textAppearance0 = new TextAppearance(context1, 0x7F1301D6);  // style:TextAppearance.MaterialComponents.Badge
            if(j0.f != textAppearance0) {
                Context context2 = (Context)weakReference0.get();
                if(context2 != null) {
                    j0.b(textAppearance0, context2);
                    this.f();
                }
            }
        }
    }

    @Override  // B6.i
    public final void a() {
        this.invalidateSelf();
    }

    public final String b() {
        if(this.c() <= this.i0) {
            return NumberFormat.getInstance().format(((long)this.c()));
        }
        Context context0 = (Context)this.X.get();
        return context0 == null ? "" : context0.getString(0x7F120293, new Object[]{((int)this.i0), "+"});  // string:mtrl_exceed_max_badge_number_suffix "%1$d%2$s"
    }

    public final int c() {
        return this.d() ? this.f0.b0 : 0;
    }

    public final boolean d() {
        return this.f0.b0 != -1;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        if(!this.getBounds().isEmpty() && this.f0.Z != 0 && this.isVisible()) {
            this.Y.draw(canvas0);
            if(this.d()) {
                Rect rect0 = new Rect();
                String s = this.b();
                this.Z.a.getTextBounds(s, 0, s.length(), rect0);
                canvas0.drawText(s, this.g0, this.h0 + ((float)(rect0.height() / 2)), this.Z.a);
            }
        }
    }

    public final void e(View view0, FrameLayout frameLayout0) {
        this.m0 = new WeakReference(view0);
        this.n0 = new WeakReference(frameLayout0);
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        viewGroup0.setClipChildren(false);
        viewGroup0.setClipToPadding(false);
        this.f();
        this.invalidateSelf();
    }

    public final void f() {
        Context context0 = (Context)this.X.get();
        FrameLayout frameLayout0 = null;
        View view0 = this.m0 == null ? null : ((View)this.m0.get());
        if(context0 != null && view0 != null) {
            Rect rect0 = new Rect();
            Rect rect1 = this.b0;
            rect0.set(rect1);
            Rect rect2 = new Rect();
            view0.getDrawingRect(rect2);
            WeakReference weakReference0 = this.n0;
            if(weakReference0 != null) {
                frameLayout0 = (FrameLayout)weakReference0.get();
            }
            if(frameLayout0 != null) {
                frameLayout0.offsetDescendantRectToMyCoords(view0, rect2);
            }
            SavedState badgeDrawable$SavedState0 = this.f0;
            int v = badgeDrawable$SavedState0.j0 + badgeDrawable$SavedState0.l0;
            this.h0 = badgeDrawable$SavedState0.g0 == 0x800053 || badgeDrawable$SavedState0.g0 == 0x800055 ? ((float)(rect2.bottom - v)) : ((float)(rect2.top + v));
            float f = this.d0;
            if(this.c() <= 9) {
                if(!this.d()) {
                    f = this.c0;
                }
                this.j0 = f;
                this.l0 = f;
                this.k0 = f;
            }
            else {
                this.j0 = f;
                this.l0 = f;
                String s = this.b();
                this.k0 = this.Z.a(s) / 2.0f + this.e0;
            }
            int v1 = context0.getResources().getDimensionPixelSize((this.d() ? 0x7F07010F : 0x7F07010C));  // dimen:mtrl_badge_text_horizontal_edge_offset
            int v2 = badgeDrawable$SavedState0.i0 + badgeDrawable$SavedState0.k0;
            if(badgeDrawable$SavedState0.g0 == 0x800033 || badgeDrawable$SavedState0.g0 == 0x800053) {
                this.g0 = view0.getLayoutDirection() == 0 ? ((float)rect2.left) - this.k0 + ((float)v1) + ((float)v2) : ((float)rect2.right) + this.k0 - ((float)v1) - ((float)v2);
            }
            else {
                this.g0 = view0.getLayoutDirection() == 0 ? ((float)rect2.right) + this.k0 - ((float)v1) - ((float)v2) : ((float)rect2.left) - this.k0 + ((float)v1) + ((float)v2);
            }
            rect1.set(((int)(this.g0 - this.k0)), ((int)(this.h0 - this.l0)), ((int)(this.g0 + this.k0)), ((int)(this.h0 + this.l0)));
            float f1 = this.j0;
            MaterialShapeDrawable materialShapeDrawable0 = this.Y;
            H6.i i0 = materialShapeDrawable0.X.a.e();
            i0.e = new H6.a(f1);
            i0.f = new H6.a(f1);
            i0.g = new H6.a(f1);
            i0.h = new H6.a(f1);
            materialShapeDrawable0.setShapeAppearanceModel(i0.a());
            if(!rect0.equals(rect1)) {
                materialShapeDrawable0.setBounds(rect1);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f0.Z;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b0.height();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b0.width();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override  // android.graphics.drawable.Drawable, B6.i
    public final boolean onStateChange(int[] arr_v) {
        return super.onStateChange(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        this.f0.Z = v;
        this.Z.a.setAlpha(v);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
    }
}

