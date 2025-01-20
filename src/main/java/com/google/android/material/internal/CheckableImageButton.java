package com.google.android.material.internal;

import J1.N;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public boolean Z;

        static {
            SavedState.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.Z = parcel0.readInt() == 1;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(((int)this.Z));
        }
    }

    public boolean e0;
    public boolean f0;
    public boolean g0;
    public static final int[] h0;

    static {
        CheckableImageButton.h0 = new int[]{0x10100A0};
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F0401FF);  // attr:imageButtonStyle
        this.f0 = true;
        this.g0 = true;
        N.k(this, new B6.a(0, this));
    }

    @Override  // android.widget.Checkable
    public final boolean isChecked() {
        return this.e0;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.widget.ImageView
    public final int[] onCreateDrawableState(int v) {
        return this.e0 ? View.mergeDrawableStates(super.onCreateDrawableState(v + 1), CheckableImageButton.h0) : super.onCreateDrawableState(v);
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).X);
        this.setChecked(((SavedState)parcelable0).Z);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());  // initializer: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.Z = this.e0;
        return parcelable0;
    }

    public void setCheckable(boolean z) {
        if(this.f0 != z) {
            this.f0 = z;
            this.sendAccessibilityEvent(0);
        }
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.f0 && this.e0 != z) {
            this.e0 = z;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setPressable(boolean z) {
        this.g0 = z;
    }

    @Override  // android.view.View
    public void setPressed(boolean z) {
        if(this.g0) {
            super.setPressed(z);
        }
    }

    @Override  // android.widget.Checkable
    public final void toggle() {
        this.setChecked(!this.e0);
    }
}

