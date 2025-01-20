package q9;

import Nb.e;
import Nb.j;
import Y8.o;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.util.AnnouncementDetailActivity;
import com.sendwave.util.AnnouncementDetailsParams;

public final class y implements Factory {
    public final AnnouncementDetailActivity a;

    public y(AnnouncementDetailActivity announcementDetailActivity0) {
        this.a = announcementDetailActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        AnnouncementDetailActivity announcementDetailActivity0 = this.a;
        Parcelable parcelable0 = announcementDetailActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(AnnouncementDetailActivity.class.getName() + " invoked with no params");
        }
        return new C(((AnnouncementDetailsParams)parcelable0), r1.b(announcementDetailActivity0).e());
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel b(e e0, MutableCreationExtras mutableCreationExtras0) {
        return o.a(this, e0, mutableCreationExtras0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel c(Class class0, CreationExtras creationExtras0) {
        return o.b(this, class0, creationExtras0);
    }
}

