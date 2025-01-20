package com.google.android.material.button;

public final class b implements OnPressedChangeListener {
    public final MaterialButtonToggleGroup a;

    public b(MaterialButtonToggleGroup materialButtonToggleGroup0) {
        this.a = materialButtonToggleGroup0;
    }

    @Override  // com.google.android.material.button.MaterialButton$OnPressedChangeListener
    public final void a() {
        this.a.invalidate();
    }
}

