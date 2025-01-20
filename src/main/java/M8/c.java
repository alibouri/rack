package m8;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

public final class c implements Externalizable {
    public String X;
    public String Y;
    public final ArrayList Z;
    public boolean b0;
    public String c0;
    public boolean d0;
    public boolean e0;
    public String f0;

    public c() {
        this.X = "";
        this.Y = "";
        this.Z = new ArrayList();
        this.c0 = "";
        this.d0 = false;
        this.f0 = "";
    }

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        this.X = objectInput0.readUTF();
        this.Y = objectInput0.readUTF();
        int v = objectInput0.readInt();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = objectInput0.readUTF();
            this.Z.add(s);
        }
        if(objectInput0.readBoolean()) {
            String s1 = objectInput0.readUTF();
            this.b0 = true;
            this.c0 = s1;
        }
        if(objectInput0.readBoolean()) {
            String s2 = objectInput0.readUTF();
            this.e0 = true;
            this.f0 = s2;
        }
        this.d0 = objectInput0.readBoolean();
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeUTF(this.X);
        objectOutput0.writeUTF(this.Y);
        int v = this.Z.size();
        objectOutput0.writeInt(v);
        for(int v1 = 0; v1 < v; ++v1) {
            objectOutput0.writeUTF(((String)this.Z.get(v1)));
        }
        objectOutput0.writeBoolean(this.b0);
        if(this.b0) {
            objectOutput0.writeUTF(this.c0);
        }
        objectOutput0.writeBoolean(this.e0);
        if(this.e0) {
            objectOutput0.writeUTF(this.f0);
        }
        objectOutput0.writeBoolean(this.d0);
    }
}

