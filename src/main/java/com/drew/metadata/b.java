package com.drew.metadata;

import M.J;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.k;

public abstract class b {
    static final boolean $assertionsDisabled = false;
    protected final Collection _definedTagList;
    protected g _descriptor;
    private final Collection _errorList;
    private static final String _floatFormatPattern = "0.###";
    private b _parent;
    protected final Map _tagMap;

    public b() {
        this._tagMap = new HashMap();
        this._definedTagList = new ArrayList();
        this._errorList = new ArrayList(4);
    }

    public void addError(String s) {
        this._errorList.add(s);
    }

    public boolean containsTag(int v) {
        return this._tagMap.containsKey(v);
    }

    public boolean getBoolean(int v) {
        Boolean boolean0 = this.getBooleanObject(v);
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        Object object0 = this.getObject(v);
        if(object0 == null) {
            throw new d("Tag \'" + this.getTagName(v) + "\' has not been set -- check using containsTag() first", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "Tag \'", "\' cannot be converted to a boolean.  It is of type \'");
        stringBuilder0.append(object0.getClass());
        stringBuilder0.append("\'.");
        throw new d(stringBuilder0.toString(), null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
    }

    public Boolean getBooleanObject(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof Boolean) {
            return (Boolean)object0;
        }
        if(!(object0 instanceof String) && !(object0 instanceof e)) {
            if(object0 instanceof Number) {
                return ((Number)object0).doubleValue() == 0.0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            return null;
        }
        return Boolean.valueOf(Boolean.getBoolean(object0.toString()));
    }

    public byte[] getByteArray(int v) {
        int v1 = 0;
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof e) {
            return ((e)object0).a;
        }
        if(object0 instanceof k[]) {
            byte[] arr_b = new byte[((k[])object0).length];
            while(v1 < ((k[])object0).length) {
                arr_b[v1] = (byte)(((int)((k[])object0)[v1].doubleValue()));
                ++v1;
            }
            return arr_b;
        }
        if(object0 instanceof byte[]) {
            return (byte[])object0;
        }
        if(object0 instanceof int[]) {
            byte[] arr_b1 = new byte[((int[])object0).length];
            while(v1 < ((int[])object0).length) {
                arr_b1[v1] = (byte)((int[])object0)[v1];
                ++v1;
            }
            return arr_b1;
        }
        if(object0 instanceof short[]) {
            byte[] arr_b2 = new byte[((short[])object0).length];
            while(v1 < ((short[])object0).length) {
                arr_b2[v1] = (byte)((short[])object0)[v1];
                ++v1;
            }
            return arr_b2;
        }
        if(object0 instanceof CharSequence) {
            byte[] arr_b3 = new byte[((CharSequence)object0).length()];
            while(v1 < ((CharSequence)object0).length()) {
                arr_b3[v1] = (byte)((CharSequence)object0).charAt(v1);
                ++v1;
            }
            return arr_b3;
        }
        return object0 instanceof Integer ? new byte[]{((Integer)object0).byteValue()} : null;
    }

    public Date getDate(int v) {
        return this.getDate(v, null, null);
    }

    public Date getDate(int v, String s, TimeZone timeZone0) {
        Date date0;
        String s1;
        String s4;
        TimeZone timeZone1;
        String s3;
        Object object0 = this.getObject(v);
        if(object0 instanceof Date) {
            return (Date)object0;
        }
        if(object0 instanceof String || object0 instanceof e) {
            String s2 = object0.toString();
            Matcher matcher0 = Pattern.compile("(\\d\\d:\\d\\d:\\d\\d)(\\.\\d+)").matcher(s2);
            if(matcher0.find()) {
                s1 = matcher0.group(2).substring(1);
                s3 = matcher0.replaceAll("$1");
            }
            else {
                s3 = s2;
                s1 = s;
            }
            Matcher matcher1 = Pattern.compile("(Z|[+-]\\d\\d:\\d\\d|[+-]\\d\\d\\d\\d)$").matcher(s3);
            if(matcher1.find()) {
                timeZone1 = TimeZone.getTimeZone(("GMT" + matcher1.group().replaceAll("Z", "")));
                s4 = matcher1.replaceAll("");
            }
            else {
                s4 = s3;
                timeZone1 = timeZone0;
            }
            int v1 = 0;
            while(true) {
                String s5 = new String[]{"yyyy:MM:dd HH:mm:ss", "yyyy:MM:dd HH:mm", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy-MM-dd\'T\'HH:mm:ss", "yyyy-MM-dd\'T\'HH:mm", "yyyy-MM-dd", "yyyy-MM", "yyyyMMdd", "yyyy"}[v1];
                try {
                    SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s5);
                    if(timeZone1 == null) {
                        simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("GMT"));
                    }
                    else {
                        simpleDateFormat0.setTimeZone(timeZone1);
                    }
                    date0 = simpleDateFormat0.parse(s4);
                    break;
                }
                catch(ParseException unused_ex) {
                    ++v1;
                }
            }
        }
        else {
            s1 = s;
            date0 = null;
        }
        if(date0 == null) {
            return null;
        }
        if(s1 == null) {
            return date0;
        }
        try {
            double f = Double.parseDouble(("." + s1));
            if(((int)(f * 1000.0)) >= 0 && ((int)(f * 1000.0)) < 1000) {
                Calendar calendar0 = Calendar.getInstance();
                calendar0.setTime(date0);
                calendar0.set(14, ((int)(f * 1000.0)));
                return calendar0.getTime();
            }
        }
        catch(NumberFormatException unused_ex) {
        }
        return date0;
    }

    public Date getDate(int v, TimeZone timeZone0) {
        return this.getDate(v, null, timeZone0);
    }

    public String getDescription(int v) {
        return this._descriptor.c(v);
    }

    public double getDouble(int v) {
        Double double0 = this.getDoubleObject(v);
        if(double0 != null) {
            return (double)double0;
        }
        Object object0 = this.getObject(v);
        if(object0 == null) {
            throw new d("Tag \'" + this.getTagName(v) + "\' has not been set -- check using containsTag() first", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "Tag \'", "\' cannot be converted to a double.  It is of type \'");
        stringBuilder0.append(object0.getClass());
        stringBuilder0.append("\'.");
        throw new d(stringBuilder0.toString(), null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
    }

    public Double getDoubleObject(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof String) && !(object0 instanceof e)) {
            return object0 instanceof Number ? ((Number)object0).doubleValue() : null;
        }
        try {
            return Double.parseDouble(object0.toString());
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public int getErrorCount() {
        return this._errorList.size();
    }

    public Iterable getErrors() {
        return Collections.unmodifiableCollection(this._errorList);
    }

    public float getFloat(int v) {
        Float float0 = this.getFloatObject(v);
        if(float0 != null) {
            return (float)float0;
        }
        Object object0 = this.getObject(v);
        if(object0 == null) {
            throw new d("Tag \'" + this.getTagName(v) + "\' has not been set -- check using containsTag() first", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "Tag \'", "\' cannot be converted to a float.  It is of type \'");
        stringBuilder0.append(object0.getClass());
        stringBuilder0.append("\'.");
        throw new d(stringBuilder0.toString(), null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
    }

    public Float getFloatObject(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof String) && !(object0 instanceof e)) {
            return object0 instanceof Number ? ((Number)object0).floatValue() : null;
        }
        try {
            return Float.parseFloat(object0.toString());
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public int getInt(int v) {
        Integer integer0 = this.getInteger(v);
        if(integer0 != null) {
            return (int)integer0;
        }
        Object object0 = this.getObject(v);
        if(object0 == null) {
            throw new d("Tag \'" + this.getTagName(v) + "\' has not been set -- check using containsTag() first", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "Tag \'", "\' cannot be converted to int.  It is of type \'");
        stringBuilder0.append(object0.getClass());
        stringBuilder0.append("\'.");
        throw new d(stringBuilder0.toString(), null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
    }

    public int[] getIntArray(int v) {
        int v1 = 0;
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof int[]) {
            return (int[])object0;
        }
        if(object0 instanceof k[]) {
            int[] arr_v = new int[((k[])object0).length];
            while(v1 < ((k[])object0).length) {
                arr_v[v1] = (int)((k[])object0)[v1].doubleValue();
                ++v1;
            }
            return arr_v;
        }
        if(object0 instanceof short[]) {
            int[] arr_v1 = new int[((short[])object0).length];
            while(v1 < ((short[])object0).length) {
                arr_v1[v1] = ((short[])object0)[v1];
                ++v1;
            }
            return arr_v1;
        }
        if(object0 instanceof byte[]) {
            int[] arr_v2 = new int[((byte[])object0).length];
            while(v1 < ((byte[])object0).length) {
                arr_v2[v1] = ((byte[])object0)[v1];
                ++v1;
            }
            return arr_v2;
        }
        if(object0 instanceof CharSequence) {
            int[] arr_v3 = new int[((CharSequence)object0).length()];
            while(v1 < ((CharSequence)object0).length()) {
                arr_v3[v1] = ((CharSequence)object0).charAt(v1);
                ++v1;
            }
            return arr_v3;
        }
        return object0 instanceof Integer ? new int[]{((int)(((Integer)object0)))} : null;
    }

    public Integer getInteger(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof Number) {
            return ((Number)object0).intValue();
        }
        if(!(object0 instanceof String) && !(object0 instanceof e)) {
            if(object0 instanceof k[]) {
                return ((k[])object0).length == 1 ? ((int)((k[])object0)[0].doubleValue()) : null;
            }
            if(object0 instanceof byte[]) {
                return ((byte[])object0).length == 1 ? ((int)((byte[])object0)[0]) : null;
            }
            if(object0 instanceof int[]) {
                return ((int[])object0).length == 1 ? ((int)((int[])object0)[0]) : null;
            }
            return !(object0 instanceof short[]) || ((short[])object0).length != 1 ? null : ((int)((short[])object0)[0]);
        }
        try {
            return Integer.parseInt(object0.toString());
        }
        catch(NumberFormatException unused_ex) {
            byte[] arr_b = object0.toString().getBytes();
            long v2 = 0L;
            for(int v1 = 0; v1 < arr_b.length; ++v1) {
                v2 = (v2 << 8) + ((long)(arr_b[v1] & 0xFF));
            }
            return (int)v2;
        }
    }

    public long getLong(int v) {
        Long long0 = this.getLongObject(v);
        if(long0 != null) {
            return (long)long0;
        }
        Object object0 = this.getObject(v);
        if(object0 == null) {
            throw new d("Tag \'" + this.getTagName(v) + "\' has not been set -- check using containsTag() first", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "Tag \'", "\' cannot be converted to a long.  It is of type \'");
        stringBuilder0.append(object0.getClass());
        stringBuilder0.append("\'.");
        throw new d(stringBuilder0.toString(), null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
    }

    public Long getLongObject(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof Number) {
            return ((Number)object0).longValue();
        }
        if(!(object0 instanceof String) && !(object0 instanceof e)) {
            if(object0 instanceof k[]) {
                return ((k[])object0).length == 1 ? ((long)((k[])object0)[0].doubleValue()) : null;
            }
            if(object0 instanceof byte[]) {
                return ((byte[])object0).length == 1 ? ((long)((byte[])object0)[0]) : null;
            }
            if(object0 instanceof int[]) {
                return ((int[])object0).length == 1 ? ((long)((int[])object0)[0]) : null;
            }
            return !(object0 instanceof short[]) || ((short[])object0).length != 1 ? null : ((long)((short[])object0)[0]);
        }
        try {
            return Long.parseLong(object0.toString());
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public abstract String getName();

    public Object getObject(int v) {
        return this._tagMap.get(v);
    }

    public b getParent() {
        return this._parent;
    }

    public k getRational(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof k) {
            return (k)object0;
        }
        if(object0 instanceof Integer) {
            return new k(((long)(((int)(((Integer)object0))))), 1L);
        }
        return object0 instanceof Long ? new k(((long)(((Long)object0))), 1L) : null;
    }

    public k[] getRationalArray(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        return object0 instanceof k[] ? ((k[])object0) : null;
    }

    public String getString(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof k) {
            return ((k)object0).d(true);
        }
        if(object0.getClass().isArray()) {
            int v1 = Array.getLength(object0);
            Class class0 = object0.getClass().getComponentType();
            StringBuilder stringBuilder0 = new StringBuilder();
            int v2 = 0;
            if(Object.class.isAssignableFrom(class0)) {
                while(v2 < v1) {
                    if(v2 != 0) {
                        stringBuilder0.append(' ');
                    }
                    stringBuilder0.append(Array.get(object0, v2).toString());
                    ++v2;
                }
                return stringBuilder0.toString();
            }
            if(class0.getName().equals("int")) {
                while(v2 < v1) {
                    if(v2 != 0) {
                        stringBuilder0.append(' ');
                    }
                    stringBuilder0.append(Array.getInt(object0, v2));
                    ++v2;
                }
                return stringBuilder0.toString();
            }
            if(class0.getName().equals("short")) {
                while(v2 < v1) {
                    if(v2 != 0) {
                        stringBuilder0.append(' ');
                    }
                    stringBuilder0.append(Array.getShort(object0, v2));
                    ++v2;
                }
                return stringBuilder0.toString();
            }
            if(class0.getName().equals("long")) {
                while(v2 < v1) {
                    if(v2 != 0) {
                        stringBuilder0.append(' ');
                    }
                    stringBuilder0.append(Array.getLong(object0, v2));
                    ++v2;
                }
                return stringBuilder0.toString();
            }
            if(class0.getName().equals("float")) {
                DecimalFormat decimalFormat0 = new DecimalFormat("0.###");
                while(v2 < v1) {
                    if(v2 != 0) {
                        stringBuilder0.append(' ');
                    }
                    String s = decimalFormat0.format(((double)Array.getFloat(object0, v2)));
                    if(s.equals("-0")) {
                        s = "0";
                    }
                    stringBuilder0.append(s);
                    ++v2;
                }
                return stringBuilder0.toString();
            }
            if(class0.getName().equals("double")) {
                DecimalFormat decimalFormat1 = new DecimalFormat("0.###");
                while(v2 < v1) {
                    if(v2 != 0) {
                        stringBuilder0.append(' ');
                    }
                    String s1 = decimalFormat1.format(Array.getDouble(object0, v2));
                    if(s1.equals("-0")) {
                        s1 = "0";
                    }
                    stringBuilder0.append(s1);
                    ++v2;
                }
                return stringBuilder0.toString();
            }
            if(class0.getName().equals("byte")) {
                while(v2 < v1) {
                    if(v2 != 0) {
                        stringBuilder0.append(' ');
                    }
                    stringBuilder0.append(Array.getByte(object0, v2) & 0xFF);
                    ++v2;
                }
                return stringBuilder0.toString();
            }
            this.addError("Unexpected array component type: " + class0.getName());
            return stringBuilder0.toString();
        }
        if(object0 instanceof Double) {
            return new DecimalFormat("0.###").format(((double)(((Double)object0))));
        }
        return object0 instanceof Float ? new DecimalFormat("0.###").format(((double)(((float)(((Float)object0)))))) : object0.toString();
    }

    public String getString(int v, String s) {
        byte[] arr_b = this.getByteArray(v);
        if(arr_b == null) {
            return null;
        }
        try {
            return new String(arr_b, s);
        }
        catch(UnsupportedEncodingException unused_ex) {
            return null;
        }
    }

    public String[] getStringArray(int v) {
        int v1 = 0;
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof String[]) {
            return (String[])object0;
        }
        if(object0 instanceof String) {
            return new String[]{((String)object0)};
        }
        if(object0 instanceof e) {
            return new String[]{object0.toString()};
        }
        if(object0 instanceof e[]) {
            String[] arr_s = new String[((e[])object0).length];
            while(v1 < ((e[])object0).length) {
                arr_s[v1] = ((e[])object0)[v1].toString();
                ++v1;
            }
            return arr_s;
        }
        if(object0 instanceof int[]) {
            String[] arr_s1 = new String[((int[])object0).length];
            while(v1 < ((int[])object0).length) {
                arr_s1[v1] = Integer.toString(((int[])object0)[v1]);
                ++v1;
            }
            return arr_s1;
        }
        if(object0 instanceof byte[]) {
            String[] arr_s2 = new String[((byte[])object0).length];
            while(v1 < ((byte[])object0).length) {
                arr_s2[v1] = Byte.toString(((byte[])object0)[v1]);
                ++v1;
            }
            return arr_s2;
        }
        if(object0 instanceof k[]) {
            String[] arr_s3 = new String[((k[])object0).length];
            for(int v2 = 0; v2 < ((k[])object0).length; ++v2) {
                arr_s3[v2] = ((k[])object0)[v2].d(false);
            }
            return arr_s3;
        }
        return null;
    }

    public e getStringValue(int v) {
        Object object0 = this.getObject(v);
        return object0 instanceof e ? ((e)object0) : null;
    }

    public e[] getStringValueArray(int v) {
        Object object0 = this.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof e[]) {
            return (e[])object0;
        }
        return object0 instanceof e ? new e[]{((e)object0)} : null;
    }

    public int getTagCount() {
        return this._definedTagList.size();
    }

    public String getTagName(int v) {
        HashMap hashMap0 = this.getTagNameMap();
        if(!hashMap0.containsKey(v)) {
            String s;
            for(s = Integer.toHexString(v); s.length() < 4; s = "0" + s) {
            }
            return J.e("Unknown tag (0x", s, ")");
        }
        return (String)hashMap0.get(v);
    }

    public abstract HashMap getTagNameMap();

    public Collection getTags() {
        return Collections.unmodifiableCollection(this._definedTagList);
    }

    public boolean hasErrors() {
        return this._errorList.size() > 0;
    }

    public boolean hasTagName(int v) {
        return this.getTagNameMap().containsKey(v);
    }

    // Deobfuscation rating: LOW(20)
    public boolean isEmpty() {
        return this._errorList.isEmpty() && this._definedTagList.isEmpty();
    }

    public void setBoolean(int v, boolean z) {
        this.setObject(v, Boolean.valueOf(z));
    }

    public void setByteArray(int v, byte[] arr_b) {
        this.setObjectArray(v, arr_b);
    }

    public void setDate(int v, Date date0) {
        this.setObject(v, date0);
    }

    public void setDescriptor(g g0) {
        if(g0 == null) {
            throw new NullPointerException("cannot set a null descriptor");
        }
        this._descriptor = g0;
    }

    public void setDouble(int v, double f) {
        this.setObject(v, f);
    }

    public void setDoubleArray(int v, double[] arr_f) {
        this.setObjectArray(v, arr_f);
    }

    public void setFloat(int v, float f) {
        this.setObject(v, f);
    }

    public void setFloatArray(int v, float[] arr_f) {
        this.setObjectArray(v, arr_f);
    }

    public void setInt(int v, int v1) {
        this.setObject(v, v1);
    }

    public void setIntArray(int v, int[] arr_v) {
        this.setObjectArray(v, arr_v);
    }

    public void setLong(int v, long v1) {
        this.setObject(v, v1);
    }

    public void setObject(int v, Object object0) {
        if(object0 == null) {
            throw new NullPointerException("cannot set a null object");
        }
        if(!this._tagMap.containsKey(v)) {
            f f0 = new f(v, this);
            this._definedTagList.add(f0);
        }
        this._tagMap.put(v, object0);
    }

    public void setObjectArray(int v, Object object0) {
        this.setObject(v, object0);
    }

    public void setParent(b b0) {
        this._parent = b0;
    }

    public void setRational(int v, k k0) {
        this.setObject(v, k0);
    }

    public void setRationalArray(int v, k[] arr_k) {
        this.setObjectArray(v, arr_k);
    }

    public void setString(int v, String s) {
        if(s == null) {
            throw new NullPointerException("cannot set a null String");
        }
        this.setObject(v, s);
    }

    public void setStringArray(int v, String[] arr_s) {
        this.setObjectArray(v, arr_s);
    }

    public void setStringValue(int v, e e0) {
        if(e0 == null) {
            throw new NullPointerException("cannot set a null StringValue");
        }
        this.setObject(v, e0);
    }

    public void setStringValueArray(int v, e[] arr_e) {
        this.setObjectArray(v, arr_e);
    }

    @Override
    public String toString() {
        String s = this.getName();
        Integer integer0 = this._tagMap.size();
        return this._tagMap.size() == 1 ? String.format("%s Directory (%d %s)", s, integer0, "tag") : String.format("%s Directory (%d %s)", s, integer0, "tags");
    }
}

