package n0;

import android.graphics.BlendMode;

public abstract class b {
    public static final int[] a;

    static {
        int[] arr_v = new int[BlendMode.values().length];
        try {
            arr_v[BlendMode.CLEAR.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.SRC.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.DST.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.SRC_OVER.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.DST_OVER.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.SRC_IN.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.DST_IN.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.SRC_OUT.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.DST_OUT.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.SRC_ATOP.ordinal()] = 10;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.DST_ATOP.ordinal()] = 11;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.XOR.ordinal()] = 12;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.PLUS.ordinal()] = 13;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.MODULATE.ordinal()] = 14;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.SCREEN.ordinal()] = 15;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.OVERLAY.ordinal()] = 16;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.DARKEN.ordinal()] = 17;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.LIGHTEN.ordinal()] = 18;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.COLOR_DODGE.ordinal()] = 19;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.COLOR_BURN.ordinal()] = 20;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.HARD_LIGHT.ordinal()] = 21;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.SOFT_LIGHT.ordinal()] = 22;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.DIFFERENCE.ordinal()] = 23;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.EXCLUSION.ordinal()] = 24;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.MULTIPLY.ordinal()] = 25;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.HUE.ordinal()] = 26;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.SATURATION.ordinal()] = 27;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.COLOR.ordinal()] = 28;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[BlendMode.LUMINOSITY.ordinal()] = 29;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        b.a = arr_v;
    }
}

