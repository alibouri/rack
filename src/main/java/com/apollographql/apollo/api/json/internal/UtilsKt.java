package com.apollographql.apollo.api.json.internal;

public final class UtilsKt {
    public static final int -DoubleToIntExact(double f) {
        if(((double)(((int)f))) != f) {
            throw new IllegalStateException((f + " cannot be converted to Int").toString());
        }
        return (int)f;
    }

    public static final long -DoubleToLongExact(double f) {
        if(((double)(((long)f))) != f) {
            throw new IllegalStateException((f + " cannot be converted to Long").toString());
        }
        return (long)f;
    }

    public static final double -LongToDoubleExact(long v) {
        if(((long)(((double)v))) != v) {
            throw new IllegalStateException((v + " cannot be converted to Double").toString());
        }
        return (double)v;
    }

    public static final int -LongToIntExact(long v) {
        if(((long)(((int)v))) != v) {
            throw new IllegalStateException((v + " cannot be converted to Int").toString());
        }
        return (int)v;
    }
}

