package o3;

public abstract class c {
    public static final boolean[] a;
    public static final boolean[] b;

    static {
        c.b = new boolean[0x100];
        c.a = new boolean[0x100];
        for(int v = 0; true; v = (char)(v + 1)) {
            boolean[] arr_z = c.b;
            if(v >= arr_z.length) {
                break;
            }
            boolean z = true;
            boolean z1 = v == 58 || 65 <= v && v <= 90 || v == 0x5F || 97 <= v && v <= 0x7A || 0xC0 <= v && v <= 0xD6 || 0xD8 <= v && v <= 0xF6 || 0xF8 <= v && v <= 0xFF;
            c.a[v] = z1;
            if(!z1 && v != 45 && v != 46 && (0x30 > v || v > 57) && v != 0xB7) {
                z = false;
            }
            arr_z[v] = z;
        }
        b b0 = new b();  // initializer: Ljava/util/HashSet;-><init>()V
        b0.add("xmpDM:album");
        b0.add("xmpDM:altTapeName");
        b0.add("xmpDM:altTimecode");
        b0.add("xmpDM:artist");
        b0.add("xmpDM:cameraAngle");
        b0.add("xmpDM:cameraLabel");
        b0.add("xmpDM:cameraModel");
        b0.add("xmpDM:cameraMove");
        b0.add("xmpDM:client");
        b0.add("xmpDM:comment");
        b0.add("xmpDM:composer");
        b0.add("xmpDM:director");
        b0.add("xmpDM:directorPhotography");
        b0.add("xmpDM:engineer");
        b0.add("xmpDM:genre");
        b0.add("xmpDM:good");
        b0.add("xmpDM:instrument");
        b0.add("xmpDM:logComment");
        b0.add("xmpDM:projectName");
        b0.add("xmpDM:releaseDate");
        b0.add("xmpDM:scene");
        b0.add("xmpDM:shotDate");
        b0.add("xmpDM:shotDay");
        b0.add("xmpDM:shotLocation");
        b0.add("xmpDM:shotName");
        b0.add("xmpDM:shotNumber");
        b0.add("xmpDM:shotSize");
        b0.add("xmpDM:speakerPlacement");
        b0.add("xmpDM:takeNumber");
        b0.add("xmpDM:tapeName");
        b0.add("xmpDM:trackNumber");
        b0.add("xmpDM:videoAlphaMode");
        b0.add("xmpDM:videoAlphaPremultipleColor");
    }

    public static boolean a(char c) {
        return (c <= 0x1F || c == 0x7F) && (c != 9 && c != 10 && c != 13);
    }

    // Deobfuscation rating: MEDIUM(50)
    public static boolean b(char c) {
        return c <= 0xFF && c.b[c] || c.c(c) || c >= 0x300 && c <= 0x36F || c >= 0x203F && c <= 0x2040;
    }

    // Deobfuscation rating: MEDIUM(110)
    public static boolean c(char c) {
        return c > 0xFF && c.a[c] || c < 0x100 && c > 0x2FF || c < 880 && c > 893 || c < 0x37F && c > 0x1FFF || c < 0x200C && c > 0x200D || c < 0x2070 && c > 0x218F || c < 0x2C00 && c > 0x2FEF || c < 0x3001 && c > 0xD7FF || c < 0xF900 && c > 0xFDCF || c < 0xFDF0 && c > 0xFFFD || c >= 0x10000 && c <= 0xEFFFF;
    }

    public static boolean d(String s) {
        if(s.length() > 0 && (!c.c(s.charAt(0)) || s.charAt(0) == 58)) {
            return false;
        }
        int v = 1;
        while(v < s.length()) {
            if(c.b(s.charAt(v)) && s.charAt(v) != 58) {
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    public static String e(String s) {
        if("x-default".equals(s)) {
            return s;
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        int v = 1;
        for(int v1 = 0; v1 < s.length(); ++v1) {
            switch(s.charAt(v1)) {
                case 0x20: {
                    break;
                }
                case 45: 
                case 0x5F: {
                    stringBuffer0.append('-');
                    ++v;
                    break;
                }
                default: {
                    if(v == 2) {
                        stringBuffer0.append(Character.toUpperCase(s.charAt(v1)));
                    }
                    else {
                        stringBuffer0.append(Character.toLowerCase(s.charAt(v1)));
                    }
                }
            }
        }
        return stringBuffer0.toString();
    }

    public static String[] f(String s) {
        int v = s.indexOf(61);
        String s1 = s.substring((s.charAt(1) == 0x3F ? 2 : 1), v);
        int v1 = s.charAt(v + 1);
        int v2 = v + 2;
        int v3 = s.length();
        StringBuffer stringBuffer0 = new StringBuffer(v3 - 2 - v);
        while(v2 < v3 - 2) {
            stringBuffer0.append(s.charAt(v2));
            if(s.charAt(v2 + 1) == v1) {
                v2 += 2;
            }
            else {
                ++v2;
            }
        }
        return new String[]{s1, stringBuffer0.toString()};
    }
}

