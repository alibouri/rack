package g8;

public abstract class g {
    public static final int a;

    static {
        int v1;
        String s = System.getProperty("java.version");
        try {
            String[] arr_s = s.split("[._]");
            v1 = Integer.parseInt(arr_s[0]);
            if(v1 == 1 && arr_s.length > 1) {
                v1 = Integer.parseInt(arr_s[1]);
            }
        }
        catch(NumberFormatException unused_ex) {
            v1 = -1;
        }
        if(v1 == -1) {
            try {
                StringBuilder stringBuilder0 = new StringBuilder();
                for(int v = 0; v < s.length(); ++v) {
                    int v2 = s.charAt(v);
                    if(!Character.isDigit(((char)v2))) {
                        break;
                    }
                    stringBuilder0.append(((char)v2));
                }
                v1 = Integer.parseInt(stringBuilder0.toString());
            }
            catch(NumberFormatException unused_ex) {
                v1 = -1;
            }
        }
        if(v1 == -1) {
            v1 = 6;
        }
        g.a = v1;
    }
}

