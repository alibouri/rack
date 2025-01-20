package m8;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

public final class f implements Externalizable {
    public boolean X;
    public String Y;
    public final ArrayList Z;
    public final ArrayList b0;
    public boolean c0;
    public String d0;

    public f() {
        this.Y = "";
        this.Z = new ArrayList();
        this.b0 = new ArrayList();
        this.d0 = "";
    }

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        if(objectInput0.readBoolean()) {
            String s = objectInput0.readUTF();
            this.X = true;
            this.Y = s;
        }
        int v = objectInput0.readInt();
        for(int v2 = 0; v2 < v; ++v2) {
            Integer integer0 = objectInput0.readInt();
            this.Z.add(integer0);
        }
        int v3 = objectInput0.readInt();
        for(int v1 = 0; v1 < v3; ++v1) {
            Integer integer1 = objectInput0.readInt();
            this.b0.add(integer1);
        }
        if(objectInput0.readBoolean()) {
            String s1 = objectInput0.readUTF();
            this.c0 = true;
            this.d0 = s1;
        }
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeBoolean(this.X);
        if(this.X) {
            objectOutput0.writeUTF(this.Y);
        }
        int v = this.Z.size();
        objectOutput0.writeInt(v);
        for(int v2 = 0; v2 < v; ++v2) {
            objectOutput0.writeInt(((int)(((Integer)this.Z.get(v2)))));
        }
        ArrayList arrayList0 = this.b0;
        int v3 = arrayList0.size();
        objectOutput0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            objectOutput0.writeInt(((int)(((Integer)arrayList0.get(v1)))));
        }
        objectOutput0.writeBoolean(this.c0);
        if(this.c0) {
            objectOutput0.writeUTF(this.d0);
        }
    }
}

