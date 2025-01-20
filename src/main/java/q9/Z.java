package q9;

import Nb.e;
import Nb.j;
import Y8.o;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.util.AnnouncementDetailSplashActivity;
import com.sendwave.util.AnnouncementDetailsParams;

public final class z implements Factory {
    public final AnnouncementDetailSplashActivity a;

    public z(AnnouncementDetailSplashActivity announcementDetailSplashActivity0) {
        this.a = announcementDetailSplashActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        AnnouncementDetailSplashActivity announcementDetailSplashActivity0 = this.a;
        Parcelable parcelable0 = announcementDetailSplashActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(AnnouncementDetailSplashActivity.class.getName() + " invoked with no params");
        }
        return new C(((AnnouncementDetailsParams)parcelable0), r1.b(announcementDetailSplashActivity0).e());
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

