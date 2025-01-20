package f9;

import Nb.j;

public final class b {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;

    public b() {
        this(0, 0, "", false, false);
    }

    public b(int v, int v1, String s, boolean z, boolean z1) {
        j.f(s, "currentlyPlayingAudioId");
        super();
        this.a = z;
        this.b = z1;
        this.c = v;
        this.d = v1;
        this.e = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(this.a != ((b)object0).a) {
            return false;
        }
        if(this.b != ((b)object0).b) {
            return false;
        }
        if(this.c != ((b)object0).c) {
            return false;
        }
        return this.d == ((b)object0).d ? j.a(this.e, ((b)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.a ? 0x4CF : 0x4D5;
        if(this.b) {
            v = 0x4CF;
        }
        return this.e.hashCode() + (((v1 * 0x1F + v) * 0x1F + this.c) * 0x1F + this.d) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AudioPlayerState(isAudioLoading=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", isAudioPlaying=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", playProgress=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", bufferProgress=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", currentlyPlayingAudioId=");
        return m5.b.y(stringBuilder0, this.e, ")");
    }
}

