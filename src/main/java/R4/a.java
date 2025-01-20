package r4;

import M.J;
import com.drew.metadata.b;
import com.drew.metadata.g;
import com.drew.metadata.gif.GifAnimationDirectory;
import com.drew.metadata.heif.HeifDirectory;
import com.drew.metadata.icc.IccDirectory;
import com.drew.metadata.ico.IcoDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.jfif.JfifDirectory;
import com.drew.metadata.jfxx.JfxxDirectory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

public final class a extends g {
    public final int b;

    public a(int v, b b0) {
        this.b = v;
        super(b0);
    }

    @Override  // com.drew.metadata.g
    public String c(int v) {
        String s5;
        String s3;
        String s2;
        String s6;
        int v1 = 0x100;
        String s = "";
        b b0 = this.a;
        switch(this.b) {
            case 1: {
                if(v != 1) {
                    return super.c(v);
                }
                Integer integer0 = ((GifAnimationDirectory)b0).getInteger(1);
                if(integer0 == null) {
                    return null;
                }
                switch(((int)integer0)) {
                    case 0: {
                        return "Infinite";
                    }
                    case 1: {
                        return "Once";
                    }
                    case 2: {
                        return "Twice";
                    }
                    default: {
                        return integer0.toString() + " times";
                    }
                }
            }
            case 6: {
                switch(v) {
                    case 4: 
                    case 5: {
                        return ((HeifDirectory)b0).getString(v) + " pixels";
                    }
                    case 6: {
                        Integer integer1 = ((HeifDirectory)b0).getInteger(6);
                        return integer1 == null ? null : ((int)integer1) * 90 + " degrees";
                    }
                    default: {
                        return super.c(v);
                    }
                }
            }
            case 7: {
                switch(v) {
                    case 8: {
                        Integer integer2 = ((IccDirectory)b0).getInteger(8);
                        return integer2 == null ? null : String.format("%d.%d.%d", ((int)((((int)integer2) & 0xFF000000) >> 24)), ((int)((((int)integer2) & 0xF00000) >> 20)), ((int)((((int)integer2) & 0xF0000) >> 16)));
                    }
                    case 12: {
                        s6 = ((IccDirectory)b0).getString(12);
                        if(s6 != null) {
                            try {
                                switch(new l4.b(0, s6.getBytes()).j(0)) {
                                    case 1633842036: {
                                        return "Abstract";
                                    }
                                    case 0x6C696E6B: {
                                        return "DeviceLink";
                                    }
                                    case 0x6D6E7472: {
                                        return "Display Device";
                                    }
                                    case 0x6E6D636C: {
                                        return "Named Color";
                                    }
                                    case 0x70727472: {
                                        return "Output Device";
                                    }
                                    case 0x73636E72: {
                                        return "Input Device";
                                    }
                                    case 0x73706163: {
                                        return "ColorSpace Conversion";
                                    }
                                }
                            }
                            catch(IOException unused_ex) {
                                return s6;
                            }
                            return J.e("Unknown (", s6, ")");
                        }
                        break;
                    }
                    case 40: {
                        s6 = ((IccDirectory)b0).getString(40);
                        if(s6 != null) {
                            try {
                                switch(new l4.b(0, s6.getBytes()).j(0)) {
                                    case 0x4150504C: {
                                        return "Apple Computer, Inc.";
                                    }
                                    case 1297303124: {
                                        return "Microsoft Corporation";
                                    }
                                    case 1397180704: {
                                        return "Silicon Graphics, Inc.";
                                    }
                                    case 1398099543: {
                                        return "Sun Microsystems, Inc.";
                                    }
                                    case 0x54474E54: {
                                        return "Taligent, Inc.";
                                    }
                                }
                            }
                            catch(IOException unused_ex) {
                                return s6;
                            }
                            return J.e("Unknown (", s6, ")");
                        }
                        break;
                    }
                    case 0x40: {
                        return this.g(0x40, 0, new String[]{"Perceptual", "Media-Relative Colorimetric", "Saturation", "ICC-Absolute Colorimetric"});
                    }
                    default: {
                        if(v > 0x20202020 && v < 2054847098) {
                            try {
                                byte[] arr_b = ((IccDirectory)b0).getByteArray(v);
                                if(arr_b == null) {
                                    return ((IccDirectory)b0).getString(v);
                                }
                                l4.b b1 = new l4.b(0, arr_b);
                                int v3 = b1.j(0);
                                switch(v3) {
                                    case 0x58595A20: {
                                        StringBuilder stringBuilder0 = new StringBuilder();
                                        DecimalFormat decimalFormat0 = new DecimalFormat("0.####");
                                        int v4 = (arr_b.length - 8) / 12;
                                        for(int v5 = 0; v5 < v4; ++v5) {
                                            float f = b1.r(v5 * 12 + 8);
                                            float f1 = b1.r(v5 * 12 + 12);
                                            float f2 = b1.r(v5 * 12 + 16);
                                            if(v5 > 0) {
                                                stringBuilder0.append(", ");
                                            }
                                            stringBuilder0.append("(");
                                            stringBuilder0.append(decimalFormat0.format(((double)f)));
                                            stringBuilder0.append(", ");
                                            stringBuilder0.append(decimalFormat0.format(((double)f1)));
                                            stringBuilder0.append(", ");
                                            stringBuilder0.append(decimalFormat0.format(((double)f2)));
                                            stringBuilder0.append(")");
                                        }
                                        return stringBuilder0.toString();
                                    }
                                    case 0x63757276: {
                                        int v6 = b1.j(8);
                                        StringBuilder stringBuilder1 = new StringBuilder();
                                        for(int v7 = 0; v7 < v6; ++v7) {
                                            if(v7 != 0) {
                                                stringBuilder1.append(", ");
                                            }
                                            stringBuilder1.append(a.m(((double)(((float)b1.y(v7 * 2 + 12)))) / 65535.0));
                                        }
                                        return stringBuilder1.toString();
                                    }
                                    case 1684370275: {
                                        return new String(arr_b, 12, b1.j(8) - 1);
                                    }
                                    case 1835360627: {
                                        int v8 = b1.j(8);
                                        float f3 = b1.r(12);
                                        float f4 = b1.r(16);
                                        float f5 = b1.r(20);
                                        int v9 = b1.j(24);
                                        float f6 = b1.r(28);
                                        int v10 = b1.j(0x20);
                                        String s1 = "Unknown";
                                        switch(v8) {
                                            case 0: {
                                                s2 = "Unknown";
                                                break;
                                            }
                                            case 1: {
                                                s2 = "1931 2°";
                                                break;
                                            }
                                            case 2: {
                                                s2 = "1964 10°";
                                                break;
                                            }
                                            default: {
                                                s2 = String.format("Unknown %d", v8);
                                            }
                                        }
                                        switch(v9) {
                                            case 0: {
                                                break;
                                            }
                                            case 1: {
                                                s1 = "0/45 or 45/0";
                                                break;
                                            }
                                            case 2: {
                                                s1 = "0/d or d/0";
                                                break;
                                            }
                                            default: {
                                                s1 = String.format("Unknown %d", v8);
                                            }
                                        }
                                        switch(v10) {
                                            case 0: {
                                                s3 = "unknown";
                                                break;
                                            }
                                            case 1: {
                                                s3 = "D50";
                                                break;
                                            }
                                            case 2: {
                                                s3 = "D65";
                                                break;
                                            }
                                            case 3: {
                                                s3 = "D93";
                                                break;
                                            }
                                            case 4: {
                                                s3 = "F2";
                                                break;
                                            }
                                            case 5: {
                                                s3 = "D55";
                                                break;
                                            }
                                            case 6: {
                                                s3 = "A";
                                                break;
                                            }
                                            case 7: {
                                                s3 = "Equi-Power (E)";
                                                break;
                                            }
                                            case 8: {
                                                s3 = "F8";
                                                break;
                                            }
                                            default: {
                                                s3 = String.format("Unknown %d", v10);
                                            }
                                        }
                                        DecimalFormat decimalFormat1 = new DecimalFormat("0.###");
                                        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", s2, decimalFormat1.format(((double)f3)), decimalFormat1.format(((double)f4)), decimalFormat1.format(((double)f5)), s1, Math.round(f6 * 100.0f), s3);
                                    }
                                    case 0x6D6C7563: {
                                        int v11 = b1.j(8);
                                        StringBuilder stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append(v11);
                                        for(int v2 = 0; true; ++v2) {
                                            if(v2 >= v11) {
                                                return stringBuilder2.toString();
                                            }
                                            String s4 = com.drew.metadata.jpeg.b.g(b1.j(v2 * 12 + 16));
                                            int v12 = b1.j(v2 * 12 + 20);
                                            int v13 = b1.j(v2 * 12 + 24);
                                            try {
                                                s5 = new String(arr_b, v13, v12, "UTF-16BE");
                                            }
                                            catch(UnsupportedEncodingException unused_ex) {
                                                s5 = new String(arr_b, v13, v12);
                                            }
                                            stringBuilder2.append(" ");
                                            stringBuilder2.append(s4);
                                            stringBuilder2.append("(");
                                            stringBuilder2.append(s5);
                                            stringBuilder2.append(")");
                                        }
                                    }
                                    case 0x73696720: {
                                        return com.drew.metadata.jpeg.b.g(b1.j(8));
                                    }
                                    case 1952807028: {
                                        try {
                                            return new String(arr_b, 8, arr_b.length - 9, "ASCII");
                                        }
                                        catch(UnsupportedEncodingException unused_ex) {
                                            return new String(arr_b, 8, arr_b.length - 9);
                                        }
                                    }
                                    default: {
                                        return String.format("%s (0x%08X): %d bytes", com.drew.metadata.jpeg.b.g(v3), v3, ((int)arr_b.length));
                                    }
                                }
                            }
                            catch(IOException unused_ex) {
                                break;
                            }
                        }
                        return super.c(v);
                    }
                }
                return null;
            }
            case 8: {
                if(v != 1) {
                    switch(v) {
                        case 2: {
                            Integer integer3 = ((IcoDirectory)b0).getInteger(2);
                            if(integer3 == null) {
                                return null;
                            }
                            StringBuilder stringBuilder3 = new StringBuilder();
                            if(((int)integer3) != 0) {
                                v1 = (int)integer3;
                            }
                            return J.f(stringBuilder3, v1, " pixels");
                        }
                        case 3: {
                            Integer integer4 = ((IcoDirectory)b0).getInteger(3);
                            if(integer4 == null) {
                                return null;
                            }
                            StringBuilder stringBuilder4 = new StringBuilder();
                            if(((int)integer4) != 0) {
                                v1 = (int)integer4;
                            }
                            return J.f(stringBuilder4, v1, " pixels");
                        }
                        case 4: {
                            Integer integer5 = ((IcoDirectory)b0).getInteger(4);
                            if(integer5 == null) {
                                return null;
                            }
                            if(((int)integer5) == 0) {
                                return "No palette";
                            }
                            StringBuilder stringBuilder5 = new StringBuilder();
                            stringBuilder5.append(integer5);
                            stringBuilder5.append(" colour");
                            if(((int)integer5) != 1) {
                                s = "s";
                            }
                            stringBuilder5.append(s);
                            return stringBuilder5.toString();
                        }
                        default: {
                            return super.c(v);
                        }
                    }
                }
                return this.g(1, 1, new String[]{"Icon", "Cursor"});
            }
            case 9: {
                switch(v) {
                    case 276: {
                        Integer integer6 = ((IptcDirectory)b0).getInteger(276);
                        if(integer6 != null) {
                            switch(((int)integer6)) {
                                case 0: {
                                    return "No ObjectData";
                                }
                                case 1: {
                                    return "IPTC-NAA Digital Newsphoto Parameter Record";
                                }
                                case 2: {
                                    return "IPTC7901 Recommended Message Format";
                                }
                                case 3: {
                                    return "Tagged Image File Format (Adobe/Aldus Image data)";
                                }
                                case 4: {
                                    return "Illustrator (Adobe Graphics data)";
                                }
                                case 5: {
                                    return "AppleSingle (Apple Computer Inc)";
                                }
                                case 6: {
                                    return "NAA 89-3 (ANPA 1312)";
                                }
                                case 7: {
                                    return "MacBinary II";
                                }
                                case 8: {
                                    return "IPTC Unstructured Character Oriented File Format (UCOFF)";
                                }
                                case 9: {
                                    return "United Press International ANPA 1312 variant";
                                }
                                case 10: {
                                    return "United Press International Down-Load Message";
                                }
                                case 11: {
                                    return "JPEG File Interchange (JFIF)";
                                }
                                case 12: {
                                    return "Photo-CD Image-Pac (Eastman Kodak)";
                                }
                                case 13: {
                                    return "Bit Mapped Graphics File [.BMP] (Microsoft)";
                                }
                                case 14: {
                                    return "Digital Audio File [.WAV] (Microsoft & Creative Labs)";
                                }
                                case 15: {
                                    return "Audio plus Moving Video [.AVI] (Microsoft)";
                                }
                                case 16: {
                                    return "PC DOS/Windows Executable Files [.COM][.EXE]";
                                }
                                case 17: {
                                    return "Compressed Binary File [.ZIP] (PKWare Inc)";
                                }
                                case 18: {
                                    return "Audio Interchange File Format AIFF (Apple Computer Inc)";
                                }
                                case 19: {
                                    return "RIFF Wave (Microsoft Corporation)";
                                }
                                case 20: {
                                    return "Freehand (Macromedia/Aldus)";
                                }
                                case 21: {
                                    return "Hypertext Markup Language [.HTML] (The Internet Society)";
                                }
                                case 22: {
                                    return "MPEG 2 Audio Layer 2 (Musicom), ISO/IEC";
                                }
                                case 23: {
                                    return "MPEG 2 Audio Layer 3, ISO/IEC";
                                }
                                case 24: {
                                    return "Portable Document File [.PDF] Adobe";
                                }
                                case 25: {
                                    return "News Industry Text Format (NITF)";
                                }
                                case 26: {
                                    return "Tape Archive [.TAR]";
                                }
                                case 27: {
                                    return "Tidningarnas Telegrambyra NITF version (TTNITF DTD)";
                                }
                                case 28: {
                                    return "Ritzaus Bureau NITF version (RBNITF DTD)";
                                }
                                case 29: {
                                    return "Corel Draw [.CDR]";
                                }
                                default: {
                                    return String.format("Unknown (%d)", integer6);
                                }
                            }
                        }
                        break;
                    }
                    case 326: {
                        return this.n(326);
                    }
                    case 0x150: {
                        return this.o(0x150);
                    }
                    case 537: {
                        String[] arr_s = ((IptcDirectory)b0).getStringArray(537);
                        if(arr_s != null) {
                            int v15 = 0;
                            for(int v14 = 0; v14 < arr_s.length; ++v14) {
                                v15 += arr_s[v14].length() + 1;
                            }
                            StringBuilder stringBuilder6 = new StringBuilder(v15);
                            boolean z = true;
                            for(int v16 = 0; v16 < arr_s.length; ++v16) {
                                String s7 = arr_s[v16];
                                if(z) {
                                    z = false;
                                }
                                else {
                                    stringBuilder6.append(";");
                                }
                                stringBuilder6.append(s7);
                            }
                            return stringBuilder6.toString();
                        }
                        break;
                    }
                    case 542: {
                        return this.n(542);
                    }
                    case 547: {
                        return this.o(547);
                    }
                    case 549: {
                        return this.n(549);
                    }
                    case 550: {
                        return this.o(550);
                    }
                    case 0x22F: {
                        return this.n(0x22F);
                    }
                    case 567: {
                        return this.n(567);
                    }
                    case 572: {
                        return this.o(572);
                    }
                    case 574: {
                        return this.n(574);
                    }
                    case 0x23F: {
                        return this.o(0x23F);
                    }
                    default: {
                        return super.c(v);
                    }
                }
                return null;
            }
            case 10: {
                if(v != 5) {
                    switch(v) {
                        case 7: {
                            Integer integer7 = ((JfifDirectory)b0).getInteger(7);
                            if(integer7 != null) {
                                switch(((int)integer7)) {
                                    case 0: {
                                        return "none";
                                    }
                                    case 1: {
                                        return "inch";
                                    }
                                    case 2: {
                                        return "centimetre";
                                    }
                                    default: {
                                        return "unit";
                                    }
                                }
                            }
                            break;
                        }
                        case 8: {
                            Integer integer8 = ((JfifDirectory)b0).getInteger(8);
                            if(integer8 != null) {
                                if(((int)integer8) != 1) {
                                    s = "s";
                                }
                                return String.format("%d dot%s", integer8, s);
                            }
                            break;
                        }
                        case 10: {
                            Integer integer9 = ((JfifDirectory)b0).getInteger(10);
                            if(integer9 != null) {
                                if(((int)integer9) != 1) {
                                    s = "s";
                                }
                                return String.format("%d dot%s", integer9, s);
                            }
                            break;
                        }
                        default: {
                            return super.c(v);
                        }
                    }
                    return null;
                }
                Integer integer10 = ((JfifDirectory)b0).getInteger(5);
                return integer10 == null ? null : String.format("%d.%d", ((int)((((int)integer10) & 0xFF00) >> 8)), ((int)(((int)integer10) & 0xFF)));
            }
            case 11: {
                if(v != 5) {
                    return super.c(v);
                }
                Integer integer11 = ((JfxxDirectory)b0).getInteger(5);
                if(integer11 == null) {
                    return null;
                }
                switch(((int)integer11)) {
                    case 16: {
                        return "Thumbnail coded using JPEG";
                    }
                    case 17: {
                        return "Thumbnail stored using 1 byte/pixel";
                    }
                    case 19: {
                        return "Thumbnail stored using 3 bytes/pixel";
                    }
                    default: {
                        return "Unknown extension code " + integer11;
                    }
                }
            }
            default: {
                return super.c(v);
            }
        }
    }

    public static String m(double f) {
        boolean z;
        long v = Math.abs(((long)f));
        long v2 = (long)(((int)Math.round(Math.pow(10.0, 7.0) * (Math.abs(f) - ((double)v)))));
        String s = "";
        long v3 = v2;
        String s1 = "";
        for(int v1 = 7; true; --v1) {
            z = true;
            if(v1 <= 0) {
                break;
            }
            int v4 = (byte)(((int)Math.abs(v3 % 10L)));
            v3 /= 10L;
            if(s1.length() > 0 || v4 != 0 || v1 == 1) {
                s1 = v4 + s1;
            }
        }
        long v5 = v + v3;
        if(f >= 0.0 || v5 == 0L && v2 == 0L) {
            z = false;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            s = "-";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(v5);
        stringBuilder0.append(".");
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    public String n(int v) {
        String s = ((IptcDirectory)this.a).getString(v);
        if(s == null) {
            return null;
        }
        return s.length() == 8 ? s.substring(0, 4) + ':' + s.substring(4, 6) + ':' + s.substring(6) : s;
    }

    public String o(int v) {
        String s = ((IptcDirectory)this.a).getString(v);
        if(s == null) {
            return null;
        }
        return s.length() == 6 || s.length() == 11 ? s.substring(0, 2) + ':' + s.substring(2, 4) + ':' + s.substring(4) : s;
    }
}

