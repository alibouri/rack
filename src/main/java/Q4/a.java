package q4;

import M.J;
import c4.d;
import com.drew.metadata.b;
import com.drew.metadata.exif.ExifThumbnailDirectory;
import com.drew.metadata.g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import l4.k;

public final class a extends g {
    public final int b;

    public a(int v, b b0) {
        this.b = v;
        super(b0);
    }

    @Override  // com.drew.metadata.g
    public String c(int v) {
        if(this.b != 4) {
            return this.n(v);
        }
        b b0 = this.a;
        switch(v) {
            case 0x201: {
                Integer integer0 = ((ExifThumbnailDirectory)b0).getAdjustedThumbnailOffset();
                return integer0 == null ? null : ((int)integer0) + " bytes";
            }
            case 0x202: {
                String s = ((ExifThumbnailDirectory)b0).getString(0x202);
                return s == null ? null : s + " bytes";
            }
            default: {
                return this.n(v);
            }
        }
    }

    public static String m(int[] arr_v) {
        if(arr_v == null) {
            return null;
        }
        if(arr_v.length < 2) {
            return "<truncated data>";
        }
        int v1 = arr_v[0];
        if(v1 == 0 && arr_v[1] == 0) {
            return "<zero pattern size>";
        }
        int v2 = v1 * arr_v[1];
        if(v2 + 2 > arr_v.length) {
            return "<invalid pattern size>";
        }
        StringBuilder stringBuilder0 = new StringBuilder("[");
        for(int v = 2; v < v2 + 2; ++v) {
            int v3 = arr_v[v];
            if(v3 <= 6) {
                stringBuilder0.append(new String[]{"Red", "Green", "Blue", "Cyan", "Magenta", "Yellow", "White"}[v3]);
            }
            else {
                stringBuilder0.append("Unknown");
            }
            if((v - 2) % arr_v[1] == 0) {
                stringBuilder0.append(",");
            }
            else if(v != v2 + 1) {
                stringBuilder0.append("][");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public final String n(int v) {
        boolean z;
        int[] arr_v3;
        b b0 = this.a;
        switch(v) {
            case 1: {
                String s12 = b0.getString(1);
                if(s12 == null) {
                    return null;
                }
                return "R98".equalsIgnoreCase(s12.trim()) ? "Recommended Exif Interoperability Rules (ExifR98)" : J.e("Unknown (", s12, ")");
            }
            case 2: {
                return this.l(2, 2);
            }
            case 0xFE: {
                return this.g(0xFE, 0, new String[]{"Full-resolution image", "Reduced-resolution image", "Single page of multi-page image", "Single page of multi-page reduced-resolution image", "Transparency mask", "Transparency mask of reduced-resolution image", "Transparency mask of multi-page image", "Transparency mask of reduced-resolution multi-page image"});
            }
            case 0xFF: {
                return this.g(0xFF, 1, new String[]{"Full-resolution image", "Reduced-resolution image", "Single page of multi-page image"});
            }
            case 0x100: {
                String s13 = b0.getString(0x100);
                return s13 == null ? null : s13 + " pixels";
            }
            case 0x101: {
                String s14 = b0.getString(0x101);
                return s14 == null ? null : s14 + " pixels";
            }
            case 0x102: {
                String s15 = b0.getString(0x102);
                return s15 == null ? null : s15 + " bits/component/pixel";
            }
            case 0x103: {
                Integer integer1 = b0.getInteger(0x103);
                if(integer1 == null) {
                    return null;
                }
                switch(((int)integer1)) {
                    case 1: {
                        return "Uncompressed";
                    }
                    case 2: {
                        return "CCITT 1D";
                    }
                    case 3: {
                        return "T4/Group 3 Fax";
                    }
                    case 4: {
                        return "T6/Group 4 Fax";
                    }
                    case 5: {
                        return "LZW";
                    }
                    case 6: {
                        return "JPEG (old-style)";
                    }
                    case 8: {
                        return "Adobe Deflate";
                    }
                    case 9: {
                        return "JBIG B&W";
                    }
                    case 10: {
                        return "JBIG Color";
                    }
                    case 7: 
                    case 99: {
                        return "JPEG";
                    }
                    case 0x106: {
                        return "Kodak 262";
                    }
                    case 0x7FFE: {
                        return "Next";
                    }
                    case 0x7FFF: {
                        return "Sony ARW Compressed";
                    }
                    case 0x8001: {
                        return "Packed RAW";
                    }
                    case 0x8002: {
                        return "Samsung SRW Compressed";
                    }
                    case 0x8003: {
                        return "CCIRLEW";
                    }
                    case 0x8004: {
                        return "Samsung SRW Compressed 2";
                    }
                    case 0x8005: {
                        return "PackBits";
                    }
                    case 0x8029: {
                        return "Thunderscan";
                    }
                    case 0x8063: {
                        return "Kodak KDC Compressed";
                    }
                    case 0x807F: {
                        return "IT8CTPAD";
                    }
                    case 0x8080: {
                        return "IT8LW";
                    }
                    case 0x8081: {
                        return "IT8MP";
                    }
                    case 0x8082: {
                        return "IT8BL";
                    }
                    case 0x808C: {
                        return "PixarFilm";
                    }
                    case 0x808D: {
                        return "PixarLog";
                    }
                    case 0x80B2: {
                        return "Deflate";
                    }
                    case 0x80B3: {
                        return "DCS";
                    }
                    case 0x8765: {
                        return "JBIG";
                    }
                    case 0x8774: {
                        return "SGILog";
                    }
                    case 0x8775: {
                        return "SGILog24";
                    }
                    case 0x8798: {
                        return "JPEG 2000";
                    }
                    case 0x8799: {
                        return "Nikon NEF Compressed";
                    }
                    case 0x879B: {
                        return "JBIG2 TIFF FX";
                    }
                    case 0x879E: {
                        return "Microsoft Document Imaging (MDI) Binary Level Codec";
                    }
                    case 0x879F: {
                        return "Microsoft Document Imaging (MDI) Progressive Transform Codec";
                    }
                    case 0x87A0: {
                        return "Microsoft Document Imaging (MDI) Vector";
                    }
                    case 0x884C: {
                        return "Lossy JPEG";
                    }
                    case 65000: {
                        return "Kodak DCR Compressed";
                    }
                    case 0xFFFF: {
                        return "Pentax PEF Compressed";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer1, ")");
                    }
                }
            }
            case 0x106: {
                Integer integer2 = b0.getInteger(0x106);
                if(integer2 == null) {
                    return null;
                }
                switch(((int)integer2)) {
                    case 0: {
                        return "WhiteIsZero";
                    }
                    case 1: {
                        return "BlackIsZero";
                    }
                    case 2: {
                        return "RGB";
                    }
                    case 3: {
                        return "RGB Palette";
                    }
                    case 4: {
                        return "Transparency Mask";
                    }
                    case 5: {
                        return "CMYK";
                    }
                    case 6: {
                        return "YCbCr";
                    }
                    case 8: {
                        return "CIELab";
                    }
                    case 9: {
                        return "ICCLab";
                    }
                    case 10: {
                        return "ITULab";
                    }
                    case 0x8023: {
                        return "Color Filter Array";
                    }
                    case 0x804C: {
                        return "Pixar LogL";
                    }
                    case 0x804D: {
                        return "Pixar LogLuv";
                    }
                    case 0x807C: {
                        return "Linear Raw";
                    }
                    default: {
                        return "Unknown colour space";
                    }
                }
            }
            case 0x107: {
                return this.g(0x107, 1, new String[]{"No dithering or halftoning", "Ordered dither or halftone", "Randomized dither"});
            }
            case 0x10A: {
                return this.g(0x10A, 1, new String[]{"Normal", "Reversed"});
            }
            case 274: {
                return this.g(274, 1, new String[]{"Top, left side (Horizontal / normal)", "Top, right side (Mirror horizontal)", "Bottom, right side (Rotate 180)", "Bottom, left side (Mirror vertical)", "Left side, top (Mirror horizontal and rotate 270 CW)", "Right side, top (Rotate 90 CW)", "Right side, bottom (Mirror horizontal and rotate 90 CW)", "Left side, bottom (Rotate 270 CW)"});
            }
            case 296: {
                return this.g(296, 1, new String[]{"(No unit)", "Inch", "cm"});
            }
            case 338: {
                return this.g(338, 0, new String[]{"Unspecified", "Associated alpha", "Unassociated alpha"});
            }
            case 339: {
                int[] arr_v4 = b0.getIntArray(339);
                if(arr_v4 == null) {
                    return null;
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                for(int v9 = 0; v9 < arr_v4.length; ++v9) {
                    int v10 = arr_v4[v9];
                    if(stringBuilder3.length() != 0) {
                        stringBuilder3.append(", ");
                    }
                    switch(v10) {
                        case 1: {
                            stringBuilder3.append("Unsigned");
                            break;
                        }
                        case 2: {
                            stringBuilder3.append("Signed");
                            break;
                        }
                        case 3: {
                            stringBuilder3.append("Float");
                            break;
                        }
                        case 4: {
                            stringBuilder3.append("Undefined");
                            break;
                        }
                        case 5: {
                            stringBuilder3.append("Complex int");
                            break;
                        }
                        case 6: {
                            stringBuilder3.append("Complex float");
                            break;
                        }
                        default: {
                            stringBuilder3.append("Unknown (");
                            stringBuilder3.append(v10);
                            stringBuilder3.append(")");
                        }
                    }
                }
                return stringBuilder3.toString();
            }
            case 0x200: {
                Integer integer3 = b0.getInteger(0x200);
                if(integer3 == null) {
                    return null;
                }
                switch(((int)integer3)) {
                    case 1: {
                        return "Baseline";
                    }
                    case 14: {
                        return "Lossless";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer3, ")");
                    }
                }
            }
            case 0x828E: {
                byte[] arr_b1 = b0.getByteArray(0x828E);
                if(arr_b1 == null) {
                    return null;
                }
                int[] arr_v5 = b0.getIntArray(0x828D);
                if(arr_v5 == null) {
                    return J.e("Repeat Pattern not found for CFAPattern (", super.c(0x828E), ")");
                }
                if(arr_v5.length == 2) {
                    int v11 = arr_v5[0];
                    int v12 = arr_v5[1];
                    if(arr_b1.length == v11 * v12) {
                        int[] arr_v6 = new int[arr_b1.length + 2];
                        arr_v6[0] = v11;
                        arr_v6[1] = v12;
                        for(int v13 = 0; v13 < arr_b1.length; ++v13) {
                            arr_v6[v13 + 2] = arr_b1[v13] & 0xFF;
                        }
                        return a.m(arr_v6);
                    }
                }
                return J.e("Unknown Pattern (", super.c(0x828E), ")");
            }
            case 0x829A: {
                String s16 = b0.getString(0x829A);
                return s16 == null ? null : s16 + " sec";
            }
            case 0x829D: {
                k k12 = b0.getRational(0x829D);
                return k12 == null ? null : g.e(k12.doubleValue());
            }
            case 34850: {
                return this.g(34850, 1, new String[]{"Manual control", "Program normal", "Aperture priority", "Shutter priority", "Program creative (slow program)", "Program action (high-speed program)", "Portrait mode", "Landscape mode"});
            }
            case 0x8827: {
                Integer integer4 = b0.getInteger(0x8827);
                return integer4 == null ? null : Integer.toString(((int)integer4));
            }
            case 0x8830: {
                return this.g(0x8830, 0, new String[]{"Unknown", "Standard Output Sensitivity", "Recommended Exposure Index", "ISO Speed", "Standard Output Sensitivity and Recommended Exposure Index", "Standard Output Sensitivity and ISO Speed", "Recommended Exposure Index and ISO Speed", "Standard Output Sensitivity, Recommended Exposure Index and ISO Speed"});
            }
            case 0x9000: {
                return this.l(0x9000, 2);
            }
            case 0x9201: {
                return this.i(0x9201);
            }
            case 0x9202: {
                Double double0 = b0.getDoubleObject(0x9202);
                return double0 == null ? null : g.e(Math.pow(d.a, ((double)double0)));
            }
            case 0x9203: {
                k k13 = b0.getRational(0x9203);
                if(k13 == null) {
                    return null;
                }
                return k13.X == 0xFFFFFFFFL ? "Unknown" : new DecimalFormat("0.0##").format(k13.doubleValue());
            }
            case 0x9204: {
                k k14 = b0.getRational(0x9204);
                return k14 == null ? null : k14.d(true) + " EV";
            }
            case 0x9205: {
                Double double1 = b0.getDoubleObject(0x9205);
                return double1 == null ? null : g.e(Math.pow(d.a, ((double)double1)));
            }
            case 0x9206: {
                k k15 = b0.getRational(0x9206);
                if(k15 == null) {
                    return null;
                }
                long v14 = k15.X;
                if(v14 == 0xFFFFFFFFL) {
                    return "Infinity";
                }
                return v14 == 0L ? "Unknown" : new DecimalFormat("0.0##").format(k15.doubleValue()) + " metres";
            }
            case 0x9207: {
                Integer integer5 = b0.getInteger(0x9207);
                if(integer5 == null) {
                    return null;
                }
                int v15 = (int)integer5;
                if(v15 != 0xFF) {
                    switch(v15) {
                        case 0: {
                            return "Unknown";
                        }
                        case 1: {
                            return "Average";
                        }
                        case 2: {
                            return "Center weighted average";
                        }
                        case 3: {
                            return "Spot";
                        }
                        case 4: {
                            return "Multi-spot";
                        }
                        case 5: {
                            return "Multi-segment";
                        }
                        case 6: {
                            return "Partial";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer5, ")");
                        }
                    }
                }
                return "(Other)";
            }
            case 0x9208: {
                Integer integer6 = b0.getInteger(0x9208);
                return integer6 == null ? null : a.p(((int)integer6));
            }
            case 0x9209: {
                Integer integer7 = b0.getInteger(0x9209);
                if(integer7 == null) {
                    return null;
                }
                StringBuilder stringBuilder4 = new StringBuilder();
                if((((int)integer7) & 1) == 0) {
                    stringBuilder4.append("Flash did not fire");
                }
                else {
                    stringBuilder4.append("Flash fired");
                }
                if((((int)integer7) & 4) != 0) {
                    if((((int)integer7) & 2) == 0) {
                        stringBuilder4.append(", return not detected");
                    }
                    else {
                        stringBuilder4.append(", return detected");
                    }
                }
                if((((int)integer7) & 16) != 0 && (((int)integer7) & 15) != 0) {
                    stringBuilder4.append(", auto");
                }
                if((((int)integer7) & 0x40) != 0) {
                    stringBuilder4.append(", red-eye reduction");
                }
                return stringBuilder4.toString();
            }
            case 0x920A: {
                k k16 = b0.getRational(0x920A);
                return k16 == null ? null : g.f(k16.doubleValue());
            }
            case 37510: {
                return this.d(37510);
            }
            case 40091: {
                return this.o(40091);
            }
            case 40092: {
                return this.o(40092);
            }
            case 40093: {
                return this.o(40093);
            }
            case 40094: {
                return this.o(40094);
            }
            case 40095: {
                return this.o(40095);
            }
            case 0xA000: {
                return this.l(0xA000, 2);
            }
            case 0xA001: {
                Integer integer8 = b0.getInteger(0xA001);
                if(integer8 == null) {
                    return null;
                }
                switch(((int)integer8)) {
                    case 1: {
                        return "sRGB";
                    }
                    case 0xFFFF: {
                        return "Undefined";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer8, ")");
                    }
                }
            }
            case 0xA002: {
                Integer integer9 = b0.getInteger(0xA002);
                return integer9 == null ? null : integer9 + " pixels";
            }
            case 0xA003: {
                Integer integer10 = b0.getInteger(0xA003);
                return integer10 == null ? null : integer10 + " pixels";
            }
            case 0xA217: {
                return this.g(0xA217, 1, new String[]{"(Not defined)", "One-chip color area sensor", "Two-chip color area sensor", "Three-chip color area sensor", "Color sequential area sensor", 0, "Trilinear sensor", "Color sequential linear sensor"});
            }
            case 0xA40C: {
                return this.g(0xA40C, 0, new String[]{"Unknown", "Macro", "Close view", "Distant view"});
            }
            case 42034: {
                return this.h(42034);
            }
            default: {
                String s = "";
                switch(v) {
                    case 277: {
                        String s7 = b0.getString(277);
                        return s7 == null ? null : s7 + " samples/pixel";
                    }
                    case 278: {
                        String s8 = b0.getString(278);
                        return s8 == null ? null : s8 + " rows/strip";
                    }
                    case 279: {
                        String s9 = b0.getString(279);
                        return s9 == null ? null : s9 + " bytes";
                    }
                    case 0xA20E: {
                        k k9 = b0.getRational(0xA20E);
                        if(k9 == null) {
                            return null;
                        }
                        String s10 = this.g(0xA210, 1, new String[]{"(No unit)", "Inches", "cm"});
                        StringBuilder stringBuilder1 = new StringBuilder();
                        stringBuilder1.append(new k(k9.Y, k9.X).d(true));
                        if(s10 != null) {
                            s = " " + s10.toLowerCase();
                        }
                        stringBuilder1.append(s);
                        return stringBuilder1.toString();
                    }
                    case 0xA20F: {
                        k k10 = b0.getRational(0xA20F);
                        if(k10 == null) {
                            return null;
                        }
                        String s11 = this.g(0xA210, 1, new String[]{"(No unit)", "Inches", "cm"});
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(new k(k10.Y, k10.X).d(true));
                        if(s11 != null) {
                            s = " " + s11.toLowerCase();
                        }
                        stringBuilder2.append(s);
                        return stringBuilder2.toString();
                    }
                    case 0xA210: {
                        return this.g(0xA210, 1, new String[]{"(No unit)", "Inches", "cm"});
                    }
                    case 0xA300: {
                        return this.g(0xA300, 1, new String[]{"Film Scanner", "Reflection Print Scanner", "Digital Still Camera (DSC)"});
                    }
                    case 0xA301: {
                        return this.g(0xA301, 1, new String[]{"Directly photographed image"});
                    }
                    case 0xA302: {
                        byte[] arr_b = b0.getByteArray(0xA302);
                        if(arr_b == null) {
                            return a.m(null);
                        }
                        if(arr_b.length < 4) {
                            arr_v3 = new int[arr_b.length];
                            for(int v6 = 0; v6 < arr_b.length; ++v6) {
                                arr_v3[v6] = arr_b[v6];
                            }
                            return a.m(arr_v3);
                        }
                        arr_v3 = new int[arr_b.length - 2];
                        try {
                            l4.b b1 = new l4.b(0, arr_b);
                            int v7 = b1.g(0);
                            int v8 = b1.g(2);
                            if(v7 * v8 + 2 > arr_b.length) {
                                b1.a = !b1.a;
                                v7 = b1.g(0);
                                v8 = b1.g(2);
                                z = arr_b.length < v7 * v8 + 2 ? false : true;
                            }
                            else {
                                z = true;
                            }
                            if(z) {
                                arr_v3[0] = v7;
                                arr_v3[1] = v8;
                                for(int v1 = 4; v1 < arr_b.length; ++v1) {
                                    arr_v3[v1 - 2] = b1.m(v1);
                                }
                            }
                        }
                        catch(IOException iOException0) {
                            b0.addError("IO exception processing data: " + iOException0.getMessage());
                        }
                        return a.m(arr_v3);
                    }
                    case 0xA401: {
                        return this.g(0xA401, 0, new String[]{"Normal process", "Custom process"});
                    }
                    case 0xA402: {
                        return this.g(0xA402, 0, new String[]{"Auto exposure", "Manual exposure", "Auto bracket"});
                    }
                    case 0xA403: {
                        return this.g(0xA403, 0, new String[]{"Auto white balance", "Manual white balance"});
                    }
                    case 0xA404: {
                        k k11 = b0.getRational(0xA404);
                        if(k11 == null) {
                            return null;
                        }
                        return k11.X == 0L ? "Digital zoom not used" : new DecimalFormat("0.#").format(k11.doubleValue());
                    }
                    case 0xA405: {
                        Integer integer0 = b0.getInteger(0xA405);
                        if(integer0 == null) {
                            return null;
                        }
                        return ((int)integer0) == 0 ? "Unknown" : g.f(((int)integer0));
                    }
                    case 0xA406: {
                        return this.g(0xA406, 0, new String[]{"Standard", "Landscape", "Portrait", "Night scene"});
                    }
                    case 0xA407: {
                        return this.g(0xA407, 0, new String[]{"None", "Low gain up", "Low gain down", "High gain up", "High gain down"});
                    }
                    case 0xA408: {
                        return this.g(0xA408, 0, new String[]{"None", "Soft", "Hard"});
                    }
                    case 0xA409: {
                        return this.g(0xA409, 0, new String[]{"None", "Low saturation", "High saturation"});
                    }
                    case 0xA40A: {
                        return this.g(0xA40A, 0, new String[]{"None", "Low", "Hard"});
                    }
                    default: {
                        String s1 = "unit";
                        switch(v) {
                            case 282: {
                                k k0 = b0.getRational(282);
                                if(k0 == null) {
                                    return null;
                                }
                                String s2 = this.g(296, 1, new String[]{"(No unit)", "Inch", "cm"});
                                String s3 = k0.d(true);
                                if(s2 != null) {
                                    s1 = s2.toLowerCase();
                                }
                                return com.apollographql.apollo.api.b.q(s3, " dots per ", s1);
                            }
                            case 283: {
                                k k1 = b0.getRational(283);
                                if(k1 == null) {
                                    return null;
                                }
                                String s4 = this.g(296, 1, new String[]{"(No unit)", "Inch", "cm"});
                                String s5 = k1.d(true);
                                if(s4 != null) {
                                    s1 = s4.toLowerCase();
                                }
                                return com.apollographql.apollo.api.b.q(s5, " dots per ", s1);
                            }
                            case 284: {
                                return this.g(284, 1, new String[]{"Chunky (contiguous for each subsampling pixel)", "Separate (Y-plane/Cb-plane/Cr-plane format)"});
                            }
                            case 530: {
                                int[] arr_v = b0.getIntArray(530);
                                if(arr_v != null && arr_v.length >= 2) {
                                    int v2 = arr_v[0];
                                    if(v2 == 2 && arr_v[1] == 1) {
                                        return "YCbCr4:2:2";
                                    }
                                    return v2 != 2 || arr_v[1] != 2 ? "(Unknown)" : "YCbCr4:2:0";
                                }
                                return null;
                            }
                            case 531: {
                                return this.g(531, 1, new String[]{"Center of pixel array", "Datum point"});
                            }
                            case 532: {
                                int[] arr_v1 = b0.getIntArray(532);
                                if(arr_v1 == null || arr_v1.length < 6) {
                                    Object object0 = b0.getObject(532);
                                    if(object0 != null || !(object0 instanceof long[]) || ((long[])object0).length < 6) {
                                        return null;
                                    }
                                    arr_v1 = new int[((long[])object0).length];
                                    for(int v3 = 0; v3 < ((long[])object0).length; ++v3) {
                                        arr_v1[v3] = (int)((long[])object0)[v3];
                                    }
                                }
                                return String.format("[%d,%d,%d] [%d,%d,%d]", ((int)arr_v1[0]), ((int)arr_v1[2]), ((int)arr_v1[4]), ((int)arr_v1[1]), ((int)arr_v1[3]), ((int)arr_v1[5]));
                            }
                            case 0x9101: {
                                int[] arr_v2 = b0.getIntArray(0x9101);
                                if(arr_v2 == null) {
                                    return null;
                                }
                                StringBuilder stringBuilder0 = new StringBuilder();
                                for(int v4 = 0; v4 < Math.min(4, arr_v2.length); ++v4) {
                                    int v5 = arr_v2[v4];
                                    if(v5 > 0 && v5 < 7) {
                                        stringBuilder0.append(new String[]{"", "Y", "Cb", "Cr", "R", "G", "B"}[v5]);
                                    }
                                }
                                return stringBuilder0.toString();
                            }
                            case 0x9102: {
                                k k2 = b0.getRational(0x9102);
                                if(k2 == null) {
                                    return null;
                                }
                                String s6 = k2.d(true);
                                return !k2.a() || ((int)k2.doubleValue()) != 1 ? s6 + " bits/pixel" : s6 + " bit/pixel";
                            }
                            case 0x9400: {
                                k k3 = b0.getRational(0x9400);
                                if(k3 == null) {
                                    return null;
                                }
                                return k3.Y == 0xFFFFFFFFL ? "Unknown" : new DecimalFormat("0.0").format(k3.doubleValue()) + " °C";
                            }
                            case 0x9401: {
                                k k4 = b0.getRational(0x9401);
                                if(k4 == null) {
                                    return null;
                                }
                                return k4.Y == 0xFFFFFFFFL ? "Unknown" : new DecimalFormat("0.0").format(k4.doubleValue()) + " %";
                            }
                            case 0x9402: {
                                k k5 = b0.getRational(0x9402);
                                if(k5 == null) {
                                    return null;
                                }
                                return k5.Y == 0xFFFFFFFFL ? "Unknown" : new DecimalFormat("0.0").format(k5.doubleValue()) + " hPa";
                            }
                            case 0x9403: {
                                k k6 = b0.getRational(0x9403);
                                if(k6 == null) {
                                    return null;
                                }
                                return k6.Y == 0xFFFFFFFFL ? "Unknown" : new DecimalFormat("0.0##").format(k6.doubleValue()) + " metres";
                            }
                            case 0x9404: {
                                k k7 = b0.getRational(0x9404);
                                if(k7 == null) {
                                    return null;
                                }
                                return k7.Y == 0xFFFFFFFFL ? "Unknown" : new DecimalFormat("0.0##").format(k7.doubleValue()) + " mGal";
                            }
                            case 0x9405: {
                                k k8 = b0.getRational(0x9405);
                                if(k8 == null) {
                                    return null;
                                }
                                return k8.Y == 0xFFFFFFFFL ? "Unknown" : new DecimalFormat("0.##").format(k8.doubleValue()) + " degrees";
                            }
                            default: {
                                return super.c(v);
                            }
                        }
                    }
                }
            }
        }
    }

    public final String o(int v) {
        byte[] arr_b = this.a.getByteArray(v);
        if(arr_b == null) {
            return null;
        }
        try {
            return new String(arr_b, "UTF-16LE").trim();
        }
        catch(UnsupportedEncodingException unused_ex) {
            return null;
        }
    }

    public static String p(int v) {
        switch(v) {
            case 0: {
                return "Unknown";
            }
            case 1: {
                return "Daylight";
            }
            case 2: {
                return "Florescent";
            }
            case 3: {
                return "Tungsten (Incandescent)";
            }
            case 4: {
                return "Flash";
            }
            case 9: {
                return "Fine Weather";
            }
            case 10: {
                return "Cloudy";
            }
            case 11: {
                return "Shade";
            }
            case 12: {
                return "Daylight Fluorescent";
            }
            case 13: {
                return "Day White Fluorescent";
            }
            case 14: {
                return "Cool White Fluorescent";
            }
            case 15: {
                return "White Fluorescent";
            }
            case 16: {
                return "Warm White Fluorescent";
            }
            case 17: {
                return "Standard light A";
            }
            case 18: {
                return "Standard light B";
            }
            case 19: {
                return "Standard light C";
            }
            case 20: {
                return "D55";
            }
            case 21: {
                return "D65";
            }
            case 22: {
                return "D75";
            }
            case 23: {
                return "D50";
            }
            case 24: {
                return "ISO Studio Tungsten";
            }
            case 0xFF: {
                return "Other";
            }
            default: {
                return J.d(v, "Unknown (", ")");
            }
        }
    }
}

