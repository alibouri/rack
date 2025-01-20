package I2;

import Bb.p;
import Nb.j;
import T4.l;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import yc.d;

public final class m {
    public final HashMap a;
    public static final m b;

    static {
        m m0 = new m(new LinkedHashMap());
        d.H(m0);
        m.b = m0;
    }

    public m(m m0) {
        j.f(m0, "other");
        super();
        this.a = new HashMap(m0.a);
    }

    public m(LinkedHashMap linkedHashMap0) {
        j.f(linkedHashMap0, "values");
        super();
        this.a = new HashMap(linkedHashMap0);
    }

    public static final m a(byte[] arr_b) {
        DataInputStream dataInputStream0;
        ObjectInputStream objectInputStream0;
        int v;
        ByteArrayInputStream byteArrayInputStream0;
        j.f(arr_b, "bytes");
        if(arr_b.length > 0x2800) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if(arr_b.length == 0) {
            return m.b;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        try {
            boolean z = true;
            byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            byte[] arr_b1 = new byte[2];
            byteArrayInputStream0.read(arr_b1);
            v = 0;
            if(arr_b1[0] != -84 || arr_b1[1] != -19) {
                z = false;
            }
            byteArrayInputStream0.reset();
            if(z) {
                objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
                goto label_15;
            }
            goto label_27;
        }
        catch(IOException iOException0) {
            A.e().d(n.a, "Error in Data#fromByteArray: ", iOException0);
            return new m(linkedHashMap0);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            A.e().d(n.a, "Error in Data#fromByteArray: ", classNotFoundException0);
            return new m(linkedHashMap0);
        }
        try {
        label_15:
            int v1 = objectInputStream0.readInt();
            while(true) {
                if(v >= v1) {
                    goto label_25;
                }
                String s = objectInputStream0.readUTF();
                j.e(s, "readUTF()");
                linkedHashMap0.put(s, objectInputStream0.readObject());
                ++v;
            }
        }
        catch(Throwable throwable0) {
            try {
                l.F(objectInputStream0, throwable0);
                throw throwable0;
            label_25:
                l.F(objectInputStream0, null);
            }
            catch(IOException iOException0) {
                A.e().d(n.a, "Error in Data#fromByteArray: ", iOException0);
                return new m(linkedHashMap0);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                A.e().d(n.a, "Error in Data#fromByteArray: ", classNotFoundException0);
                return new m(linkedHashMap0);
            }
        }
        return new m(linkedHashMap0);
        try {
        label_27:
            dataInputStream0 = new DataInputStream(byteArrayInputStream0);
        }
        catch(IOException iOException0) {
            A.e().d(n.a, "Error in Data#fromByteArray: ", iOException0);
            return new m(linkedHashMap0);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            A.e().d(n.a, "Error in Data#fromByteArray: ", classNotFoundException0);
            return new m(linkedHashMap0);
        }
        try {
            int v2 = dataInputStream0.readShort();
            if(v2 != 0xFFFFABEF) {
                throw new IllegalStateException(("Magic number doesn\'t match: " + v2).toString());
            }
            int v3 = dataInputStream0.readShort();
            if(v3 != 1) {
                throw new IllegalStateException(("Unsupported version number: " + v3).toString());
            }
            int v4 = dataInputStream0.readInt();
            while(true) {
                if(v >= v4) {
                    goto label_45;
                }
                Serializable serializable0 = d.l(dataInputStream0, dataInputStream0.readByte());
                String s1 = dataInputStream0.readUTF();
                j.e(s1, "key");
                linkedHashMap0.put(s1, serializable0);
                ++v;
            }
        }
        catch(Throwable throwable1) {
            try {
                l.F(dataInputStream0, throwable1);
                throw throwable1;
            label_45:
                l.F(dataInputStream0, null);
                return new m(linkedHashMap0);
            }
            catch(IOException iOException0) {
            }
            catch(ClassNotFoundException classNotFoundException0) {
                A.e().d(n.a, "Error in Data#fromByteArray: ", classNotFoundException0);
                return new m(linkedHashMap0);
            }
        }
        A.e().d(n.a, "Error in Data#fromByteArray: ", iOException0);
        return new m(linkedHashMap0);
    }

    public final String b(String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof String ? ((String)object0) : null;
    }

    public final boolean c(Class class0, String s) {
        Object object0 = this.a.get(s);
        return object0 != null && class0.isAssignableFrom(object0.getClass());
    }

    @Override
    public final boolean equals(Object object0) {
        boolean z;
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(m.class.equals(class0)) {
                HashMap hashMap0 = this.a;
                Set set0 = hashMap0.keySet();
                HashMap hashMap1 = ((m)object0).a;
                if(!j.a(set0, hashMap1.keySet())) {
                    return false;
                }
                for(Object object1: set0) {
                    Object object2 = hashMap0.get(((String)object1));
                    Object object3 = hashMap1.get(((String)object1));
                    if(object2 == null || object3 == null) {
                        z = object2 == object3;
                    }
                    else if(!(object2 instanceof Object[]) || !(object3 instanceof Object[])) {
                        z = object2.equals(object3);
                    }
                    else {
                        z = Bb.n.f0(((Object[])object2), ((Object[])object3));
                    }
                    if(!z) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            v += (object1 instanceof Object[] ? Objects.hashCode(map$Entry0.getKey()) ^ Arrays.deepHashCode(((Object[])object1)) : map$Entry0.hashCode());
        }
        return v * 0x1F;
    }

    @Override
    public final String toString() {
        String s = "Data {" + p.v0(this.a.entrySet(), null, null, null, I2.l.X, 0x1F) + "}";
        j.e(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

