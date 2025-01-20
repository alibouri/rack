package com.google.android.material.internal;

import B6.a;
import B6.e;
import J1.N;
import a5.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuItemImpl;
import n.v;
import o.i0;

public class NavigationMenuItemView extends e implements v {
    public FrameLayout A0;
    public MenuItemImpl B0;
    public ColorStateList C0;
    public boolean D0;
    public Drawable E0;
    public final a F0;
    public static final int[] G0;
    public int w0;
    public boolean x0;
    public boolean y0;
    public final CheckedTextView z0;

    static {
        NavigationMenuItemView.G0 = new int[]{0x10100A0};
    }

    public NavigationMenuItemView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        a a0 = new a(1, this);
        this.F0 = a0;
        this.setOrientation(0);
        LayoutInflater.from(context0).inflate(0x7F0D004B, this, true);  // layout:design_navigation_menu_item
        this.setIconSize(context0.getResources().getDimensionPixelSize(0x7F070090));  // dimen:design_navigation_icon_size
        CheckedTextView checkedTextView0 = (CheckedTextView)this.findViewById(0x7F0A0112);  // id:design_menu_item_text
        this.z0 = checkedTextView0;
        checkedTextView0.setDuplicateParentStateEnabled(true);
        N.k(checkedTextView0, a0);
    }

    @Override  // n.v
    public final void c(MenuItemImpl menuItemImpl0) {
        StateListDrawable stateListDrawable0;
        this.B0 = menuItemImpl0;
        int v = menuItemImpl0.a;
        if(v > 0) {
            this.setId(v);
        }
        this.setVisibility((menuItemImpl0.isVisible() ? 0 : 8));
        if(this.getBackground() == null) {
            TypedValue typedValue0 = new TypedValue();
            if(this.getContext().getTheme().resolveAttribute(0x7F0400F1, typedValue0, true)) {  // attr:colorControlHighlight
                stateListDrawable0 = new StateListDrawable();
                ColorDrawable colorDrawable0 = new ColorDrawable(typedValue0.data);
                stateListDrawable0.addState(NavigationMenuItemView.G0, colorDrawable0);
                stateListDrawable0.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            }
            else {
                stateListDrawable0 = null;
            }
            this.setBackground(stateListDrawable0);
        }
        this.setCheckable(menuItemImpl0.isCheckable());
        this.setChecked(menuItemImpl0.isChecked());
        this.setEnabled(menuItemImpl0.isEnabled());
        this.setTitle(menuItemImpl0.e);
        this.setIcon(menuItemImpl0.getIcon());
        this.setActionView(menuItemImpl0.getActionView());
        this.setContentDescription(menuItemImpl0.q);
        w.i0(this, menuItemImpl0.r);
        CheckedTextView checkedTextView0 = this.z0;
        if(this.B0.e != null || this.B0.getIcon() != null || this.B0.getActionView() == null) {
            checkedTextView0.setVisibility(0);
            FrameLayout frameLayout1 = this.A0;
            if(frameLayout1 != null) {
                i0 i01 = (i0)frameLayout1.getLayoutParams();
                i01.width = -2;
                this.A0.setLayoutParams(i01);
            }
        }
        else {
            checkedTextView0.setVisibility(8);
            FrameLayout frameLayout0 = this.A0;
            if(frameLayout0 != null) {
                i0 i00 = (i0)frameLayout0.getLayoutParams();
                i00.width = -1;
                this.A0.setLayoutParams(i00);
            }
        }
    }

    @Override  // n.v
    public MenuItemImpl getItemData() {
        return this.B0;
    }

    @Override  // android.view.ViewGroup
    public final int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.B0 != null && this.B0.isCheckable() && this.B0.isChecked()) {
            View.mergeDrawableStates(arr_v, NavigationMenuItemView.G0);
        }
        return arr_v;
    }

    private void setActionView(View view0) {
        if(view0 != null) {
            if(this.A0 == null) {
                this.A0 = (FrameLayout)((ViewStub)this.findViewById(0x7F0A0111)).inflate();  // id:design_menu_item_action_area_stub
            }
            this.A0.removeAllViews();
            this.A0.addView(view0);
        }
    }

    public void setCheckable(boolean z) {
        this.refreshDrawableState();
        if(this.y0 != z) {
            this.y0 = z;
            this.F0.h(this.z0, 0x800);
        }
    }

    public void setChecked(boolean z) {
        this.refreshDrawableState();
        this.z0.setChecked(z);
    }

    public void setHorizontalPadding(int v) {
        this.setPadding(v, 0, v, 0);
    }

    public void setIcon(Drawable drawable0) {
        if(drawable0 != null) {
            if(this.D0) {
                Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                if(drawable$ConstantState0 != null) {
                    drawable0 = drawable$ConstantState0.newDrawable();
                }
                drawable0 = drawable0.mutate();
                drawable0.setTintList(this.C0);
            }
            drawable0.setBounds(0, 0, this.w0, this.w0);
        }
        else if(this.x0) {
            if(this.E0 == null) {
                Drawable drawable1 = this.getResources().getDrawable(0x7F0802F4, this.getContext().getTheme());  // drawable:navigation_empty_icon
                this.E0 = drawable1;
                if(drawable1 != null) {
                    drawable1.setBounds(0, 0, this.w0, this.w0);
                }
            }
            drawable0 = this.E0;
        }
        this.z0.setCompoundDrawablesRelative(drawable0, null, null, null);
    }

    public void setIconPadding(int v) {
        this.z0.setCompoundDrawablePadding(v);
    }

    public void setIconSize(int v) {
        this.w0 = v;
    }

    public void setIconTintList(ColorStateList colorStateList0) {
        this.C0 = colorStateList0;
        this.D0 = colorStateList0 != null;
        MenuItemImpl menuItemImpl0 = this.B0;
        if(menuItemImpl0 != null) {
            this.setIcon(menuItemImpl0.getIcon());
        }
    }

    public void setMaxLines(int v) {
        this.z0.setMaxLines(v);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.x0 = z;
    }

    public void setTextAppearance(int v) {
        this.z0.setTextAppearance(v);
    }

    public void setTextColor(ColorStateList colorStateList0) {
        this.z0.setTextColor(colorStateList0);
    }

    public void setTitle(CharSequence charSequence0) {
        this.z0.setText(charSequence0);
    }
}

