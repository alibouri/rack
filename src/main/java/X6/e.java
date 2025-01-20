package x6;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public final class e implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final ChipGroup b;

    public e(ChipGroup chipGroup0) {
        this.b = chipGroup0;
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewAdded(View view0, View view1) {
        ChipGroup chipGroup0 = this.b;
        if(view0 == chipGroup0 && view1 instanceof Chip) {
            if(view1.getId() == -1) {
                view1.setId(View.generateViewId());
            }
            if(((Chip)view1).isChecked()) {
                ((ChipGroup)view0).b(((Chip)view1).getId());
            }
            ((Chip)view1).setOnCheckedChangeListenerInternal(chipGroup0.k0);
        }
        ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = this.a;
        if(viewGroup$OnHierarchyChangeListener0 != null) {
            viewGroup$OnHierarchyChangeListener0.onChildViewAdded(view0, view1);
        }
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewRemoved(View view0, View view1) {
        if(view0 == this.b && view1 instanceof Chip) {
            ((Chip)view1).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = this.a;
        if(viewGroup$OnHierarchyChangeListener0 != null) {
            viewGroup$OnHierarchyChangeListener0.onChildViewRemoved(view0, view1);
        }
    }
}

