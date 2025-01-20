package E5;

import android.text.TextUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public abstract class f {
    public static String a(int v, Object object0) {
        if(v > 10) {
            return "ERROR: Recursive toString calls";
        }
        if(object0 != null) {
            if(object0 instanceof String) {
                return TextUtils.isEmpty(((String)object0)) ? "" : object0.toString();
            }
            if(object0 instanceof Integer) {
                return ((int)(((Integer)object0))) == 0 ? "" : object0.toString();
            }
            if(object0 instanceof Long) {
                return ((long)(((Long)object0))) == 0L ? "" : object0.toString();
            }
            if(object0 instanceof Double) {
                return ((double)(((Double)object0))) == 0.0 ? "" : object0.toString();
            }
            if(object0 instanceof Boolean) {
                return ((Boolean)object0).booleanValue() ? object0.toString() : "";
            }
            if(object0 instanceof List) {
                StringBuilder stringBuilder0 = new StringBuilder();
                if(v > 0) {
                    stringBuilder0.append("[");
                }
                int v1 = stringBuilder0.length();
                for(Object object1: ((List)object0)) {
                    if(stringBuilder0.length() > v1) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(f.a(v + 1, object1));
                }
                if(v > 0) {
                    stringBuilder0.append("]");
                }
                return stringBuilder0.toString();
            }
            if(object0 instanceof Map) {
                StringBuilder stringBuilder1 = new StringBuilder();
                boolean z = false;
                int v2 = 0;
                for(Object object2: new TreeMap(((Map)object0)).entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object2;
                    String s = f.a(v + 1, map$Entry0.getValue());
                    if(!TextUtils.isEmpty(s)) {
                        if(v > 0 && !z) {
                            stringBuilder1.append("{");
                            v2 = stringBuilder1.length();
                            z = true;
                        }
                        if(stringBuilder1.length() > v2) {
                            stringBuilder1.append(", ");
                        }
                        stringBuilder1.append(((String)map$Entry0.getKey()));
                        stringBuilder1.append('=');
                        stringBuilder1.append(s);
                    }
                }
                if(z) {
                    stringBuilder1.append("}");
                }
                return stringBuilder1.toString();
            }
            return object0.toString();
        }
        return "";
    }

    public static String zza(Object object0) {
        return f.a(0, object0);
    }

    public abstract void zzc(f arg1);
}

