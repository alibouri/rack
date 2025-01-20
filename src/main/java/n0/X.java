package n0;

import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace.Rgb.TransferParameters;
import android.graphics.ColorSpace.Rgb;
import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;

public abstract class x {
    public static double A(ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0) {
        return colorSpace$Rgb$TransferParameters0.c;
    }

    public static double B(ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0) {
        return colorSpace$Rgb$TransferParameters0.d;
    }

    public static double C(ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0) {
        return colorSpace$Rgb$TransferParameters0.e;
    }

    public static double D(ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0) {
        return colorSpace$Rgb$TransferParameters0.f;
    }

    public static double a(ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0) {
        return colorSpace$Rgb$TransferParameters0.g;
    }

    public static float b(ColorSpace colorSpace0) {
        return colorSpace0.getMinValue(0);
    }

    public static int c(ColorSpace.Named colorSpace$Named0) {
        return colorSpace$Named0.ordinal();
    }

    public static int d(ColorSpace.Rgb colorSpace$Rgb0) {
        return colorSpace$Rgb0.getId();
    }

    public static int e(ColorSpace colorSpace0) {
        return colorSpace0.getId();
    }

    public static ColorSpace.Named f() {
        return ColorSpace.Named.BT709;
    }

    public static ColorSpace.Rgb.TransferParameters g(double f, double f1, double f2, double f3, double f4, double f5, double f6) {
        return new ColorSpace.Rgb.TransferParameters(f, f1, f2, f3, f4, f5, f6);
    }

    public static ColorSpace.Rgb.TransferParameters h(ColorSpace.Rgb colorSpace$Rgb0) {
        return colorSpace$Rgb0.getTransferParameters();
    }

    public static ColorSpace.Rgb i(Object object0) [...] // Inlined contents

    public static ColorSpace.Rgb j(String s, float[] arr_f, float[] arr_f1, ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0) {
        return new ColorSpace.Rgb(s, arr_f, arr_f1, colorSpace$Rgb$TransferParameters0);
    }

    public static ColorSpace.Rgb k(String s, float[] arr_f, float[] arr_f1, z z0, z z1, float f, float f1) {
        return new ColorSpace.Rgb(s, arr_f, arr_f1, z0, z1, f, f1);
    }

    public static ColorSpace l(ColorSpace.Named colorSpace$Named0) {
        return ColorSpace.get(colorSpace$Named0);
    }

    public static String m(ColorSpace.Rgb colorSpace$Rgb0) {
        return colorSpace$Rgb0.getName();
    }

    public static DoubleUnaryOperator n(ColorSpace.Rgb colorSpace$Rgb0) {
        return colorSpace$Rgb0.getEotf();
    }

    public static void o() {
    }

    public static boolean p(Object object0) {
        return object0 instanceof ColorSpace.Rgb;
    }

    public static float[] q(ColorSpace.Rgb colorSpace$Rgb0) {
        return colorSpace$Rgb0.getWhitePoint();
    }

    public static double r(ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0) {
        return colorSpace$Rgb$TransferParameters0.a;
    }

    public static float s(ColorSpace colorSpace0) {
        return colorSpace0.getMaxValue(0);
    }

    public static ColorSpace.Named t() {
        return ColorSpace.Named.CIE_LAB;
    }

    public static DoubleUnaryOperator u(ColorSpace.Rgb colorSpace$Rgb0) {
        return colorSpace$Rgb0.getOetf();
    }

    public static void v() {
    }

    public static float[] w(ColorSpace.Rgb colorSpace$Rgb0) {
        return colorSpace$Rgb0.getPrimaries();
    }

    public static double x(ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0) {
        return colorSpace$Rgb$TransferParameters0.b;
    }

    public static ColorSpace.Named y() {
        return ColorSpace.Named.CIE_XYZ;
    }

    public static float[] z(ColorSpace.Rgb colorSpace$Rgb0) {
        return colorSpace$Rgb0.getTransform();
    }
}

