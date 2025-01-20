package v2;

import M.J;
import Nb.j;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

public final class a implements LifecycleEventObserver {
    public final SavedStateRegistryOwner X;

    public a(SavedStateRegistryOwner savedStateRegistryOwner0) {
        this.X = savedStateRegistryOwner0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void b(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        Constructor constructor0;
        Class class0;
        if(lifecycle$Event0 != Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner0.a().c(this);
        SavedStateRegistryOwner savedStateRegistryOwner0 = this.X;
        Bundle bundle0 = savedStateRegistryOwner0.d().a("androidx.savedstate.Restarter");
        if(bundle0 == null) {
            return;
        }
        ArrayList arrayList0 = bundle0.getStringArrayList("classes_to_restore");
        if(arrayList0 == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for(Object object0: arrayList0) {
            String s = (String)object0;
            try {
                class0 = Class.forName(s, false, a.class.getClassLoader()).asSubclass(b.class);
                j.e(class0, "{\n                Class.…class.java)\n            }");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new RuntimeException(J.e("Class ", s, " wasn\'t found"), classNotFoundException0);
            }
            try {
                constructor0 = class0.getDeclaredConstructor(null);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new IllegalStateException("Class " + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
            }
            constructor0.setAccessible(true);
            try {
                Object object1 = constructor0.newInstance(null);
                j.e(object1, "{\n                constr…wInstance()\n            }");
                b b0 = (b)object1;
            }
            catch(Exception exception0) {
                throw new RuntimeException("Failed to instantiate " + s, exception0);
            }
            if(!(savedStateRegistryOwner0 instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            ViewModelStore viewModelStore0 = ((ViewModelStoreOwner)savedStateRegistryOwner0).q();
            d d0 = savedStateRegistryOwner0.d();
            viewModelStore0.getClass();
            LinkedHashMap linkedHashMap0 = viewModelStore0.a;
            for(Object object2: new HashSet(linkedHashMap0.keySet())) {
                j.f(((String)object2), "key");
                ViewModel viewModel0 = (ViewModel)linkedHashMap0.get(((String)object2));
                j.c(viewModel0);
                LegacySavedStateHandleController.a(viewModel0, d0, savedStateRegistryOwner0.a());
            }
            if(!new HashSet(linkedHashMap0.keySet()).isEmpty()) {
                d0.d();
            }
        }
    }
}

