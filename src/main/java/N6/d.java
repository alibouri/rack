package N6;

import K.i;
import M6.g;
import Q6.a;
import V6.p;
import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.play.core.review.c;

public abstract class d extends Binder implements IInterface {
    public final int d;

    public d(int v) {
        this.d = v;
        super();
    }

    public d(String s, int v) {
        this.d = v;
        switch(v) {
            case 4: {
                super();
                this.attachInterface(this, s);
                return;
            }
            case 5: {
                super();
                this.attachInterface(this, s);
                return;
            }
            case 6: {
                super();
                this.attachInterface(this, s);
                return;
            }
            default: {
                super();
                this.attachInterface(this, s);
            }
        }
    }

    public abstract boolean J(int arg1, Parcel arg2, Parcel arg3);

    public abstract boolean K(int arg1, Parcel arg2, Parcel arg3);

    public abstract boolean L(int arg1, Parcel arg2);

    public boolean M(int v, Parcel parcel0, Parcel parcel1) {
        return false;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        Parcelable parcelable0 = null;
        switch(this.d) {
            case 0: {
                if(v <= 0xFFFFFF) {
                    parcel0.enforceInterface(this.getInterfaceDescriptor());
                }
                else if(super.onTransact(v, parcel0, parcel1, v1)) {
                    return true;
                }
                switch(v) {
                    case 2: {
                        Parcelable.Creator parcelable$Creator0 = Bundle.CREATOR;
                        if(parcel0.readInt() != 0) {
                            parcelable0 = (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
                        }
                        int v2 = parcel0.dataAvail();
                        if(v2 > 0) {
                            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + v2);
                        }
                        ((g)this).i(((Bundle)parcelable0));
                        return true;
                    }
                    case 3: {
                        Parcelable.Creator parcelable$Creator1 = Bundle.CREATOR;
                        if(parcel0.readInt() != 0) {
                            parcelable0 = (Parcelable)parcelable$Creator1.createFromParcel(parcel0);
                        }
                        int v3 = parcel0.dataAvail();
                        if(v3 > 0) {
                            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + v3);
                        }
                        ((g)this).o(((Bundle)parcelable0));
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
            case 1: {
                if(v <= 0xFFFFFF) {
                    parcel0.enforceInterface(this.getInterfaceDescriptor());
                }
                else if(super.onTransact(v, parcel0, parcel1, v1)) {
                    return true;
                }
                if(v == 2) {
                    Parcelable.Creator parcelable$Creator2 = Bundle.CREATOR;
                    if(parcel0.readInt() != 0) {
                        parcelable0 = (Parcelable)parcelable$Creator2.createFromParcel(parcel0);
                    }
                    int v4 = parcel0.dataAvail();
                    if(v4 > 0) {
                        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + v4);
                    }
                    ((c)this).o(((Bundle)parcelable0));
                    return true;
                }
                return false;
            }
            case 2: {
                if(v <= 0xFFFFFF) {
                    parcel0.enforceInterface(this.getInterfaceDescriptor());
                }
                else if(super.onTransact(v, parcel0, parcel1, v1)) {
                    return true;
                }
                if(v == 2) {
                    Parcelable.Creator parcelable$Creator3 = Bundle.CREATOR;
                    Parcelable parcelable1 = parcel0.readInt() == 0 ? null : ((Parcelable)parcelable$Creator3.createFromParcel(parcel0));
                    int v5 = parcel0.dataAvail();
                    if(v5 > 0) {
                        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + v5);
                    }
                    synchronized(((Q6.d)this).g.c.f) {
                        ((Q6.d)this).g.c.e.remove(((Q6.d)this).f);
                    }
                    p p0 = new p(0, ((Q6.d)this).g.c);
                    ((Q6.d)this).g.c.a().post(p0);
                    ((Q6.d)this).e.a("onRequestIntegrityToken", new Object[0]);
                    int v7 = ((Bundle)parcelable1).getInt("error");
                    if(v7 != 0) {
                        a a0 = new a(v7, null);
                        ((Q6.d)this).f.c(a0);
                        return true;
                    }
                    String s = ((Bundle)parcelable1).getString("token");
                    if(s == null) {
                        a a1 = new a(-100, null);
                        ((Q6.d)this).f.c(a1);
                        return true;
                    }
                    if(Build.VERSION.SDK_INT >= 33) {
                        PendingIntent pendingIntent0 = (PendingIntent)i.u(((Bundle)parcelable1));
                    }
                    else {
                        PendingIntent pendingIntent1 = (PendingIntent)((Bundle)parcelable1).getParcelable("dialog.intent");
                    }
                    o6.i i0 = ((Q6.d)this).f;
                    if(((Q6.d)this).e == null) {
                        throw new NullPointerException("Null logger");
                    }
                    i0.d(new Q6.g(s));
                    return true;
                }
                return false;
            }
            case 3: {
                if(v > 0xFFFFFF) {
                    return super.onTransact(v, parcel0, parcel1, v1) ? true : this.K(v, parcel0, parcel1);
                }
                parcel0.enforceInterface(this.getInterfaceDescriptor());
                return this.K(v, parcel0, parcel1);
            }
            case 4: {
                if(v > 0xFFFFFF) {
                    return super.onTransact(v, parcel0, parcel1, v1) ? true : this.J(v, parcel0, parcel1);
                }
                parcel0.enforceInterface(this.getInterfaceDescriptor());
                return this.J(v, parcel0, parcel1);
            }
            case 5: {
                if(v > 0xFFFFFF) {
                    return super.onTransact(v, parcel0, parcel1, v1) ? true : this.M(v, parcel0, parcel1);
                }
                parcel0.enforceInterface(this.getInterfaceDescriptor());
                return this.M(v, parcel0, parcel1);
            }
            default: {
                if(v > 0xFFFFFF) {
                    return super.onTransact(v, parcel0, parcel1, v1) ? true : this.L(v, parcel0);
                }
                parcel0.enforceInterface(this.getInterfaceDescriptor());
                return this.L(v, parcel0);
            }
        }
    }
}

