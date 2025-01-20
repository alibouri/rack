package com.twilio.voice;

import android.content.Context;

final class Preconditions {
    private static String badElementIndex(int v, int v1, String s) {
        if(v < 0) {
            return Preconditions.format("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return Preconditions.format("%s (%s) must be less than size (%s)", new Object[]{s, v, v1});
    }

    private static String badPositionIndex(int v, int v1, String s) {
        if(v < 0) {
            return Preconditions.format("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return Preconditions.format("%s (%s) must not be greater than size (%s)", new Object[]{s, v, v1});
    }

    private static String badPositionIndexes(int v, int v1, int v2) {
        if(v >= 0 && v <= v2) {
            return v1 < 0 || v1 > v2 ? Preconditions.badPositionIndex(v1, v2, "end index") : Preconditions.format("end index (%s) must not be less than start index (%s)", new Object[]{v1, v});
        }
        return Preconditions.badPositionIndex(v, v2, "start index");
    }

    public static void checkApplicationContext(Context context0) {
    }

    public static void checkApplicationContext(Context context0, String s) {
    }

    public static void checkArgument(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static void checkArgument(boolean z, String s, char c) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{Character.valueOf(c)}));
        }
    }

    public static void checkArgument(boolean z, String s, char c, char c1) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{Character.valueOf(c), Character.valueOf(c1)}));
        }
    }

    public static void checkArgument(boolean z, String s, char c, int v) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{Character.valueOf(c), v}));
        }
    }

    public static void checkArgument(boolean z, String s, char c, long v) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{Character.valueOf(c), v}));
        }
    }

    public static void checkArgument(boolean z, String s, char c, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{Character.valueOf(c), object0}));
        }
    }

    public static void checkArgument(boolean z, String s, int v) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v}));
        }
    }

    public static void checkArgument(boolean z, String s, int v, char c) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v, Character.valueOf(c)}));
        }
    }

    public static void checkArgument(boolean z, String s, int v, int v1) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v, v1}));
        }
    }

    public static void checkArgument(boolean z, String s, int v, long v1) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v, v1}));
        }
    }

    public static void checkArgument(boolean z, String s, int v, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v, object0}));
        }
    }

    public static void checkArgument(boolean z, String s, long v) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v}));
        }
    }

    public static void checkArgument(boolean z, String s, long v, char c) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v, Character.valueOf(c)}));
        }
    }

    public static void checkArgument(boolean z, String s, long v, int v1) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v, v1}));
        }
    }

    public static void checkArgument(boolean z, String s, long v, long v1) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v, v1}));
        }
    }

    public static void checkArgument(boolean z, String s, long v, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{v, object0}));
        }
    }

    public static void checkArgument(boolean z, String s, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{object0}));
        }
    }

    public static void checkArgument(boolean z, String s, Object object0, char c) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{object0, Character.valueOf(c)}));
        }
    }

    public static void checkArgument(boolean z, String s, Object object0, int v) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{object0, v}));
        }
    }

    public static void checkArgument(boolean z, String s, Object object0, long v) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{object0, v}));
        }
    }

    public static void checkArgument(boolean z, String s, Object object0, Object object1) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{object0, object1}));
        }
    }

    public static void checkArgument(boolean z, String s, Object object0, Object object1, Object object2) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{object0, object1, object2}));
        }
    }

    public static void checkArgument(boolean z, String s, Object object0, Object object1, Object object2, Object object3) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, new Object[]{object0, object1, object2, object3}));
        }
    }

    public static void checkArgument(boolean z, String s, Object[] arr_object) {
        if(!z) {
            throw new IllegalArgumentException(Preconditions.format(s, arr_object));
        }
    }

    public static int checkElementIndex(int v, int v1) {
        return Preconditions.checkElementIndex(v, v1, "index");
    }

    public static int checkElementIndex(int v, int v1, String s) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(Preconditions.badElementIndex(v, v1, s));
        }
        return v;
    }

    public static Object checkNotNull(Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object checkNotNull(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, char c) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{Character.valueOf(c)}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, char c, char c1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{Character.valueOf(c), Character.valueOf(c1)}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, char c, int v) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{Character.valueOf(c), v}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, char c, long v) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{Character.valueOf(c), v}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, char c, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{Character.valueOf(c), object1}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, int v) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, int v, char c) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v, Character.valueOf(c)}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, int v, int v1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v, v1}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, int v, long v1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v, v1}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, int v, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v, object1}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, long v) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, long v, char c) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v, Character.valueOf(c)}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, long v, int v1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v, v1}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, long v, long v1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v, v1}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, long v, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{v, object1}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{object1}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, Object object1, char c) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{object1, Character.valueOf(c)}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, Object object1, int v) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{object1, v}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, Object object1, long v) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{object1, v}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, Object object1, Object object2) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{object1, object2}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, Object object1, Object object2, Object object3) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{object1, object2, object3}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, Object object1, Object object2, Object object3, Object object4) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, new Object[]{object1, object2, object3, object4}));
        }
        return object0;
    }

    public static Object checkNotNull(Object object0, String s, Object[] arr_object) {
        if(object0 == null) {
            throw new NullPointerException(Preconditions.format(s, arr_object));
        }
        return object0;
    }

    public static int checkPositionIndex(int v, int v1) {
        return Preconditions.checkPositionIndex(v, v1, "index");
    }

    public static int checkPositionIndex(int v, int v1, String s) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(Preconditions.badPositionIndex(v, v1, s));
        }
        return v;
    }

    public static void checkPositionIndexes(int v, int v1, int v2) {
        if(v < 0 || v1 < v || v1 > v2) {
            throw new IndexOutOfBoundsException(Preconditions.badPositionIndexes(v, v1, v2));
        }
    }

    public static void checkState(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }

    public static void checkState(boolean z, String s, char c) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{Character.valueOf(c)}));
        }
    }

    public static void checkState(boolean z, String s, char c, char c1) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{Character.valueOf(c), Character.valueOf(c1)}));
        }
    }

    public static void checkState(boolean z, String s, char c, int v) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{Character.valueOf(c), v}));
        }
    }

    public static void checkState(boolean z, String s, char c, long v) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{Character.valueOf(c), v}));
        }
    }

    public static void checkState(boolean z, String s, char c, Object object0) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{Character.valueOf(c), object0}));
        }
    }

    public static void checkState(boolean z, String s, int v) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v}));
        }
    }

    public static void checkState(boolean z, String s, int v, char c) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v, Character.valueOf(c)}));
        }
    }

    public static void checkState(boolean z, String s, int v, int v1) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v, v1}));
        }
    }

    public static void checkState(boolean z, String s, int v, long v1) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v, v1}));
        }
    }

    public static void checkState(boolean z, String s, int v, Object object0) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v, object0}));
        }
    }

    public static void checkState(boolean z, String s, long v) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v}));
        }
    }

    public static void checkState(boolean z, String s, long v, char c) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v, Character.valueOf(c)}));
        }
    }

    public static void checkState(boolean z, String s, long v, int v1) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v, v1}));
        }
    }

    public static void checkState(boolean z, String s, long v, long v1) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v, v1}));
        }
    }

    public static void checkState(boolean z, String s, long v, Object object0) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{v, object0}));
        }
    }

    public static void checkState(boolean z, String s, Object object0) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{object0}));
        }
    }

    public static void checkState(boolean z, String s, Object object0, char c) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{object0, Character.valueOf(c)}));
        }
    }

    public static void checkState(boolean z, String s, Object object0, int v) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{object0, v}));
        }
    }

    public static void checkState(boolean z, String s, Object object0, long v) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{object0, v}));
        }
    }

    public static void checkState(boolean z, String s, Object object0, Object object1) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{object0, object1}));
        }
    }

    public static void checkState(boolean z, String s, Object object0, Object object1, Object object2) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{object0, object1, object2}));
        }
    }

    public static void checkState(boolean z, String s, Object object0, Object object1, Object object2, Object object3) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, new Object[]{object0, object1, object2, object3}));
        }
    }

    public static void checkState(boolean z, String s, Object[] arr_object) {
        if(!z) {
            throw new IllegalStateException(Preconditions.format(s, arr_object));
        }
    }

    public static String format(String s, Object[] arr_object) {
        String s1 = String.valueOf(s);
        StringBuilder stringBuilder0 = new StringBuilder(arr_object.length * 16 + s1.length());
        int v = 0;
        int v1 = 0;
        while(v < arr_object.length) {
            int v2 = s1.indexOf("%s", v1);
            if(v2 == -1) {
                break;
            }
            stringBuilder0.append(s1, v1, v2);
            stringBuilder0.append(arr_object[v]);
            v1 = v2 + 2;
            ++v;
        }
        stringBuilder0.append(s1, v1, s1.length());
        if(v < arr_object.length) {
            stringBuilder0.append(" [");
            int v3 = v + 1;
            stringBuilder0.append(arr_object[v]);
            while(v3 < arr_object.length) {
                stringBuilder0.append(", ");
                stringBuilder0.append(arr_object[v3]);
                ++v3;
            }
            stringBuilder0.append(']');
        }
        return stringBuilder0.toString();
    }
}

