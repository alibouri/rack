package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import v.h;

public final class a {
    public boolean a;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public a(a a0, Object object0) {
        this.a = false;
        a0.getClass();
        this.b = a0.b;
        this.b(object0);
    }

    public static void a(Context context0, XmlResourceParser xmlResourceParser0, HashMap hashMap0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser0), n.d);
        int v = typedArray0.getIndexCount();
        String s = null;
        int v2 = 0;
        boolean z = false;
        Object object0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = typedArray0.getIndex(v1);
            if(v3 == 0) {
                s = typedArray0.getString(0);
                if(s != null && s.length() > 0) {
                    s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                }
            }
            else {
                switch(v3) {
                    case 1: {
                        object0 = Boolean.valueOf(typedArray0.getBoolean(1, false));
                        v2 = 6;
                        break;
                    }
                    case 2: {
                        object0 = typedArray0.getColor(2, 0);
                        v2 = 4;
                        break;
                    }
                    case 3: {
                        object0 = typedArray0.getColor(3, 0);
                        v2 = 3;
                        break;
                    }
                    case 4: {
                        object0 = typedArray0.getDimension(4, 0.0f);
                        v2 = 7;
                        break;
                    }
                    case 5: {
                        object0 = typedArray0.getFloat(5, NaNf);
                        v2 = 2;
                        break;
                    }
                    case 6: {
                        object0 = typedArray0.getInteger(6, -1);
                        v2 = 1;
                        break;
                    }
                    case 7: {
                        object0 = TypedValue.applyDimension(1, typedArray0.getDimension(7, 0.0f), context0.getResources().getDisplayMetrics());
                        v2 = 7;
                        break;
                    }
                    case 8: {
                        int v4 = typedArray0.getResourceId(8, -1);
                        if(v4 == -1) {
                            v4 = typedArray0.getInt(8, -1);
                        }
                        object0 = v4;
                        v2 = 8;
                        break;
                    }
                    case 9: {
                        object0 = typedArray0.getString(9);
                        v2 = 4;
                        break;
                    }
                    case 10: {
                        s = typedArray0.getString(10);
                        z = true;
                    }
                }
            }
        }
        if(s != null && object0 != null) {
            a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
            a0.b = v2;
            a0.a = z;
            a0.b(object0);
            hashMap0.put(s, a0);
        }
        typedArray0.recycle();
    }

    public final void b(Object object0) {
        switch(h.d(this.b)) {
            case 1: {
                this.d = (float)(((Float)object0));
                return;
            }
            case 2: 
            case 3: {
                this.g = (int)(((Integer)object0));
                return;
            }
            case 4: {
                this.e = (String)object0;
                return;
            }
            case 5: {
                this.f = ((Boolean)object0).booleanValue();
                return;
            }
            case 6: {
                this.d = (float)(((Float)object0));
                return;
            }
            case 0: 
            case 7: {
                this.c = (int)(((Integer)object0));
            }
        }
    }
}

