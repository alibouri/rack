package a2;

import a3.k;
import android.content.res.AssetManager.AssetInputStream;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public final class g {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final d E;
    public static final d[][] F;
    public static final d[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final HashSet J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public static final boolean l;
    public static final int[] m;
    public static final int[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;

    static {
        Integer integer0 = 3;
        g.l = Log.isLoggable("ExifInterface", 3);
        Integer integer1 = 1;
        Integer integer2 = 8;
        Arrays.asList(new Integer[]{integer1, 6, integer0, integer2});
        Integer integer3 = 2;
        Integer integer4 = 7;
        Integer integer5 = 5;
        Arrays.asList(new Integer[]{integer3, integer4, 4, integer5});
        g.m = new int[]{8, 8, 8};
        g.n = new int[]{8};
        g.o = new byte[]{-1, -40, -1};
        g.p = new byte[]{102, 0x74, 0x79, 0x70};
        g.q = new byte[]{109, 105, 102, 49};
        g.r = new byte[]{104, 101, 105, 99};
        g.s = new byte[]{0x4F, 76, 89, 77, 80, 0};
        g.t = new byte[]{0x4F, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        g.u = new byte[]{(byte)0x89, 80, 78, 71, 13, 10, 26, 10};
        g.v = new byte[]{101, 88, 73, 102};
        g.w = new byte[]{73, 72, 68, 82};
        g.x = new byte[]{73, 69, 78, 68};
        g.y = new byte[]{82, 73, 70, 70};
        g.z = new byte[]{87, 69, 66, 80};
        g.A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        g.B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        g.C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        g.D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] arr_d = {new d("NewSubfileType", 0xFE, 4), new d("SubfileType", 0xFF, 4), new d("ImageWidth", 0x100, 3, 4), new d("ImageLength", 0x101, 3, 4), new d("BitsPerSample", 0x102, 3), new d("Compression", 0x103, 3), new d("PhotometricInterpretation", 0x106, 3), new d("ImageDescription", 270, 2), new d("Make", 0x10F, 2), new d("Model", 0x110, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 0x13F, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 0x201, 4), new d("JPEGInterchangeFormatLength", 0x202, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 0x8298, 2), new d("ExifIFDPointer", 0x8769, 4), new d("GPSInfoIFDPointer", 0x8825, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] arr_d1 = {new d("ExposureTime", 0x829A, 5), new d("FNumber", 0x829D, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 0x8824, 2), new d("PhotographicSensitivity", 0x8827, 3), new d("OECF", 0x8828, 7), new d("SensitivityType", 0x8830, 3), new d("StandardOutputSensitivity", 0x8831, 4), new d("RecommendedExposureIndex", 0x8832, 4), new d("ISOSpeed", 0x8833, 4), new d("ISOSpeedLatitudeyyy", 0x8834, 4), new d("ISOSpeedLatitudezzz", 0x8835, 4), new d("ExifVersion", 0x9000, 2), new d("DateTimeOriginal", 0x9003, 2), new d("DateTimeDigitized", 0x9004, 2), new d("OffsetTime", 0x9010, 2), new d("OffsetTimeOriginal", 0x9011, 2), new d("OffsetTimeDigitized", 0x9012, 2), new d("ComponentsConfiguration", 0x9101, 7), new d("CompressedBitsPerPixel", 0x9102, 5), new d("ShutterSpeedValue", 0x9201, 10), new d("ApertureValue", 0x9202, 5), new d("BrightnessValue", 0x9203, 10), new d("ExposureBiasValue", 0x9204, 10), new d("MaxApertureValue", 0x9205, 5), new d("SubjectDistance", 0x9206, 5), new d("MeteringMode", 0x9207, 3), new d("LightSource", 0x9208, 3), new d("Flash", 0x9209, 3), new d("FocalLength", 0x920A, 5), new d("SubjectArea", 0x9214, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 0x9290, 2), new d("SubSecTimeOriginal", 0x9291, 2), new d("SubSecTimeDigitized", 0x9292, 2), new d("FlashpixVersion", 0xA000, 7), new d("ColorSpace", 0xA001, 3), new d("PixelXDimension", 0xA002, 3, 4), new d("PixelYDimension", 0xA003, 3, 4), new d("RelatedSoundFile", 0xA004, 2), new d("InteroperabilityIFDPointer", 0xA005, 4), new d("FlashEnergy", 0xA20B, 5), new d("SpatialFrequencyResponse", 0xA20C, 7), new d("FocalPlaneXResolution", 0xA20E, 5), new d("FocalPlaneYResolution", 0xA20F, 5), new d("FocalPlaneResolutionUnit", 0xA210, 3), new d("SubjectLocation", 0xA214, 3), new d("ExposureIndex", 0xA215, 5), new d("SensingMethod", 0xA217, 3), new d("FileSource", 0xA300, 7), new d("SceneType", 0xA301, 7), new d("CFAPattern", 0xA302, 7), new d("CustomRendered", 0xA401, 3), new d("ExposureMode", 0xA402, 3), new d("WhiteBalance", 0xA403, 3), new d("DigitalZoomRatio", 0xA404, 5), new d("FocalLengthIn35mmFilm", 0xA405, 3), new d("SceneCaptureType", 0xA406, 3), new d("GainControl", 0xA407, 3), new d("Contrast", 0xA408, 3), new d("Saturation", 0xA409, 3), new d("Sharpness", 0xA40A, 3), new d("DeviceSettingDescription", 0xA40B, 7), new d("SubjectDistanceRange", 0xA40C, 3), new d("ImageUniqueID", 0xA420, 2), new d("CameraOwnerName", 0xA430, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 0xA500, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] arr_d2 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 0x1F, 5)};
        d[] arr_d3 = {new d("InteroperabilityIndex", 1, 2)};
        d[] arr_d4 = {new d("NewSubfileType", 0xFE, 4), new d("SubfileType", 0xFF, 4), new d("ThumbnailImageWidth", 0x100, 3, 4), new d("ThumbnailImageLength", 0x101, 3, 4), new d("BitsPerSample", 0x102, 3), new d("Compression", 0x103, 3), new d("PhotometricInterpretation", 0x106, 3), new d("ImageDescription", 270, 2), new d("Make", 0x10F, 2), new d("Model", 0x110, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 0x13F, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 0x201, 4), new d("JPEGInterchangeFormatLength", 0x202, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 0x8298, 2), new d("ExifIFDPointer", 0x8769, 4), new d("GPSInfoIFDPointer", 0x8825, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        g.E = new d("StripOffsets", 273, 3);
        g.F = new d[][]{arr_d, arr_d1, arr_d2, arr_d3, arr_d4, arr_d, new d[]{new d("ThumbnailImage", 0x100, 7), new d("CameraSettingsIFDPointer", 0x2020, 4), new d("ImageProcessingIFDPointer", 0x2040, 4)}, new d[]{new d("PreviewImageStart", 0x101, 4), new d("PreviewImageLength", 0x102, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        g.G = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 0x8769, 4), new d("GPSInfoIFDPointer", 0x8825, 4), new d("InteroperabilityIFDPointer", 0xA005, 4), new d("CameraSettingsIFDPointer", 0x2020, 1), new d("ImageProcessingIFDPointer", 0x2040, 1)};
        g.H = new HashMap[10];
        g.I = new HashMap[10];
        g.J = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
        g.K = new HashMap();
        Charset charset0 = Charset.forName("US-ASCII");
        g.L = charset0;
        g.M = "Exif\u0000\u0000".getBytes(charset0);
        g.N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset0);
        Locale locale0 = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale0).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale0).setTimeZone(TimeZone.getTimeZone("UTC"));
        for(int v = 0; true; ++v) {
            d[][] arr2_d = g.F;
            if(v >= arr2_d.length) {
                break;
            }
            g.H[v] = new HashMap();
            g.I[v] = new HashMap();
            d[] arr_d5 = arr2_d[v];
            for(int v1 = 0; v1 < arr_d5.length; ++v1) {
                d d0 = arr_d5[v1];
                g.H[v].put(((int)d0.a), d0);
                g.I[v].put(d0.b, d0);
            }
        }
        g.K.put(((int)g.G[0].a), integer5);
        g.K.put(((int)g.G[1].a), integer1);
        g.K.put(((int)g.G[2].a), integer3);
        g.K.put(((int)g.G[3].a), integer0);
        g.K.put(((int)g.G[4].a), integer4);
        g.K.put(((int)g.G[5].a), integer2);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public g(k k0) {
        b b0;
        d[][] arr2_d = g.F;
        this.d = new HashMap[arr2_d.length];
        this.e = new HashSet(arr2_d.length);
        this.f = ByteOrder.BIG_ENDIAN;
        boolean z = g.l;
        this.b = null;
        this.a = null;
        try {
            for(int v = 0; v < arr2_d.length; ++v) {
                this.d[v] = new HashMap();
            }
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(k0, 5000);
            int v1 = this.f(bufferedInputStream0);
            this.c = v1;
            if(v1 == 4 || v1 == 9 || v1 == 13 || v1 == 14) {
                b0 = new b(bufferedInputStream0);
                int v3 = this.c;
                switch(v3) {
                    case 4: {
                        goto label_37;
                    }
                    case 9: {
                        goto label_39;
                    }
                    case 13: {
                        goto label_41;
                    }
                }
            }
            else {
                f f0 = new f(bufferedInputStream0);
                int v2 = this.c;
                if(v2 == 12) {
                    this.d(f0);
                }
                else {
                    switch(v2) {
                        case 7: {
                            this.g(f0);
                            break;
                        }
                        case 10: {
                            this.k(f0);
                            break;
                        }
                        default: {
                            this.j(f0);
                        }
                    }
                }
                f0.b(((long)this.h));
                this.u(f0);
            }
            goto label_55;
        }
        catch(IOException | UnsupportedOperationException iOException0) {
            goto label_46;
        }
        catch(Throwable throwable0) {
            goto label_51;
        }
        if(v3 == 14) {
            try {
                try {
                    this.l(b0);
                    goto label_55;
                label_37:
                    this.e(b0, 0, 0);
                    goto label_55;
                label_39:
                    this.i(b0);
                    goto label_55;
                label_41:
                    this.h(b0);
                    goto label_55;
                label_46:
                    if(z) {
                        goto label_47;
                    }
                    goto label_48;
                }
                catch(IOException | UnsupportedOperationException iOException0) {
                    goto label_46;
                }
            label_47:
                Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", iOException0);
            }
            catch(Throwable throwable0) {
                goto label_51;
            }
        label_48:
            this.a();
            if(z) {
                this.p();
                return;
            }
            return;
        label_51:
            this.a();
            if(z) {
                this.p();
            }
            throw throwable0;
        }
    label_55:
        this.a();
        if(z) {
            this.p();
        }
    }

    public final void a() {
        String s = this.b("DateTimeOriginal");
        HashMap[] arr_hashMap = this.d;
        if(s != null && this.b("DateTime") == null) {
            byte[] arr_b = (s + "\u0000").getBytes(g.L);
            arr_hashMap[0].put("DateTime", new c(arr_b, 2, arr_b.length));
        }
        if(this.b("ImageWidth") == null) {
            arr_hashMap[0].put("ImageWidth", c.a(0L, this.f));
        }
        if(this.b("ImageLength") == null) {
            arr_hashMap[0].put("ImageLength", c.a(0L, this.f));
        }
        if(this.b("Orientation") == null) {
            arr_hashMap[0].put("Orientation", c.a(0L, this.f));
        }
        if(this.b("LightSource") == null) {
            arr_hashMap[1].put("LightSource", c.a(0L, this.f));
        }
    }

    public final String b(String s) {
        c c0 = this.c(s);
        if(c0 != null) {
            if(!g.J.contains(s)) {
                return c0.f(this.f);
            }
            if(s.equals("GPSTimeStamp")) {
                int v = c0.a;
                if(v != 5 && v != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + v);
                    return null;
                }
                e[] arr_e = (e[])c0.g(this.f);
                if(arr_e != null && arr_e.length == 3) {
                    return String.format("%02d:%02d:%02d", ((int)(((float)arr_e[0].a) / ((float)arr_e[0].b))), ((int)(((float)arr_e[1].a) / ((float)arr_e[1].b))), ((int)(((float)arr_e[2].a) / ((float)arr_e[2].b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(arr_e));
                return null;
            }
            try {
                return Double.toString(c0.d(this.f));
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }

    public final c c(String s) {
        if("ISOSpeedRatings".equals(s)) {
            if(g.l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            s = "PhotographicSensitivity";
        }
        for(int v = 0; v < g.F.length; ++v) {
            c c0 = (c)this.d[v].get(s);
            if(c0 != null) {
                return c0;
            }
        }
        return null;
    }

    public final void d(f f0) {
        int v1;
        String s6;
        String s5;
        String s4;
        if(Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
        try {
            i.a(mediaMetadataRetriever0, new a(f0));
            String s = mediaMetadataRetriever0.extractMetadata(33);
            String s1 = mediaMetadataRetriever0.extractMetadata(34);
            String s2 = mediaMetadataRetriever0.extractMetadata(26);
            String s3 = mediaMetadataRetriever0.extractMetadata(17);
            if("yes".equals(s2)) {
                s4 = mediaMetadataRetriever0.extractMetadata(29);
                s5 = mediaMetadataRetriever0.extractMetadata(30);
                s6 = mediaMetadataRetriever0.extractMetadata(0x1F);
            }
            else if("yes".equals(s3)) {
                s4 = mediaMetadataRetriever0.extractMetadata(18);
                s5 = mediaMetadataRetriever0.extractMetadata(19);
                s6 = mediaMetadataRetriever0.extractMetadata(24);
            }
            else {
                s4 = null;
                s5 = null;
                s6 = null;
            }
            HashMap[] arr_hashMap = this.d;
            if(s4 != null) {
                arr_hashMap[0].put("ImageWidth", c.c(Integer.parseInt(s4), this.f));
            }
            if(s5 != null) {
                arr_hashMap[0].put("ImageLength", c.c(Integer.parseInt(s5), this.f));
            }
            if(s6 != null) {
                switch(Integer.parseInt(s6)) {
                    case 90: {
                        v1 = 6;
                        break;
                    }
                    case 180: {
                        v1 = 3;
                        break;
                    }
                    case 270: {
                        v1 = 8;
                        break;
                    }
                    default: {
                        v1 = 1;
                    }
                }
                arr_hashMap[0].put("Orientation", c.c(v1, this.f));
            }
            if(s != null && s1 != null) {
                int v2 = Integer.parseInt(s);
                int v3 = Integer.parseInt(s1);
                if(v3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                f0.b(((long)v2));
                byte[] arr_b = new byte[6];
                f0.readFully(arr_b);
                if(!Arrays.equals(arr_b, g.M)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] arr_b1 = new byte[v3 - 6];
                f0.readFully(arr_b1);
                this.h = v2 + 6;
                this.r(0, arr_b1);
            }
            if(g.l) {
                Log.d("ExifInterface", "Heif meta: " + s4 + "x" + s5 + ", rotation " + s6);
            }
        }
        catch(RuntimeException unused_ex) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
        }
        finally {
            mediaMetadataRetriever0.release();
        }
    }

    public final void e(b b0, int v, int v1) {
        boolean z = g.l;
        if(z) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + b0);
        }
        b0.Z = ByteOrder.BIG_ENDIAN;
        int v2 = b0.readByte();
        if(v2 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(v2 & 0xFF));
        }
        if(b0.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(0xFF));
        }
        int v3 = 2;
        while(true) {
            int v4 = b0.readByte();
            if(v4 != -1) {
                throw new IOException("Invalid marker:" + Integer.toHexString(v4 & 0xFF));
            }
            int v5 = b0.readByte();
            if(z) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(v5 & 0xFF));
            }
            if(v5 == -39 || v5 == -38) {
                b0.Z = this.f;
                return;
            }
            int v6 = b0.readUnsignedShort();
            int v7 = v6 - 2;
            int v8 = v3 + 4;
            if(z) {
                Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(v5 & 0xFF) + " (length: " + v6 + ")");
            }
            if(v7 < 0) {
                throw new IOException("Invalid length");
            }
            HashMap[] arr_hashMap = this.d;
            switch(v5) {
                case 0xFFFFFFE1: {
                    byte[] arr_b = new byte[v7];
                    b0.readFully(arr_b);
                    byte[] arr_b1 = g.M;
                    if(arr_b1 == null || v7 < arr_b1.length) {
                    label_42:
                        byte[] arr_b3 = g.N;
                        if(arr_b3 != null && v7 >= arr_b3.length) {
                            int v10 = 0;
                            while(true) {
                                if(v10 < arr_b3.length) {
                                    if(arr_b[v10] == arr_b3[v10]) {
                                        ++v10;
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                int v11 = v8 + arr_b3.length;
                                byte[] arr_b4 = Arrays.copyOfRange(arr_b, arr_b3.length, v7);
                                if(this.b("Xmp") != null) {
                                    break;
                                }
                                arr_hashMap[0].put("Xmp", new c(((long)v11), arr_b4, 1, arr_b4.length));
                                break;
                            }
                        }
                    }
                    else {
                        int v9 = 0;
                        while(v9 < arr_b1.length) {
                            if(arr_b[v9] != arr_b1[v9]) {
                                goto label_42;
                            }
                            ++v9;
                        }
                        byte[] arr_b2 = Arrays.copyOfRange(arr_b, arr_b1.length, v7);
                        this.h = v + v8 + arr_b1.length;
                        this.r(v1, arr_b2);
                        this.u(new b(arr_b2));
                    }
                    v8 += v7;
                    v7 = 0;
                    break;
                }
                case -2: {
                    byte[] arr_b5 = new byte[v7];
                    b0.readFully(arr_b5);
                    if(this.b("UserComment") == null) {
                        byte[] arr_b6 = (new String(arr_b5, g.L) + "\u0000").getBytes(g.L);
                        arr_hashMap[1].put("UserComment", new c(arr_b6, 2, arr_b6.length));
                    }
                    v7 = 0;
                    break;
                }
                default: {
                    if(v5 == 0xFFFFFFC0 || v5 == 0xFFFFFFC1 || v5 == -62 || v5 == -61 || (v5 == -59 || v5 == -58 || v5 == -57) || (v5 == -55 || v5 == -54 || v5 == -53) || (v5 == -51 || v5 == -50 || v5 == -49)) {
                        b0.a(1);
                        arr_hashMap[v1].put((v1 == 4 ? "ThumbnailImageLength" : "ImageLength"), c.a(b0.readUnsignedShort(), this.f));
                        arr_hashMap[v1].put((v1 == 4 ? "ThumbnailImageWidth" : "ImageWidth"), c.a(b0.readUnsignedShort(), this.f));
                        v7 = v6 - 7;
                    }
                }
            }
            if(v7 < 0) {
                break;
            }
            b0.a(v7);
            v3 = v8 + v7;
        }
        throw new IOException("Invalid length");
    }

    public final int f(BufferedInputStream bufferedInputStream0) {
        boolean z3;
        b b6;
        b b5;
        b b4;
        boolean z2;
        int v6;
        b b2;
        boolean z1;
        long v5;
        long v3;
        b b0;
        bufferedInputStream0.mark(5000);
        byte[] arr_b = new byte[5000];
        bufferedInputStream0.read(arr_b);
        bufferedInputStream0.reset();
        int v = 0;
        while(true) {
            byte[] arr_b1 = g.o;
            if(v >= arr_b1.length) {
                break;
            }
            if(arr_b[v] != arr_b1[v]) {
                byte[] arr_b2 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                int v1 = 0;
                while(v1 < arr_b2.length) {
                    if(arr_b[v1] != arr_b2[v1]) {
                        try {
                            b0 = null;
                            b0 = new b(arr_b);
                            goto label_18;
                        }
                        catch(Exception exception0) {
                            goto label_48;
                        }
                        catch(Throwable throwable0) {
                        }
                        b b1 = null;
                        goto label_52;
                        try {
                        label_18:
                            long v2 = (long)b0.readInt();
                            byte[] arr_b3 = new byte[4];
                            b0.readFully(arr_b3);
                            if(Arrays.equals(arr_b3, g.p)) {
                                if(Long.compare(v2, 1L) == 0) {
                                    v2 = b0.readLong();
                                    v3 = 16L;
                                    if(v2 >= 16L) {
                                        goto label_28;
                                    }
                                }
                                else {
                                    v3 = 8L;
                                label_28:
                                    if(v2 > 5000L) {
                                        v2 = 5000L;
                                    }
                                    long v4 = v2 - v3;
                                    if(v4 >= 8L) {
                                        byte[] arr_b4 = new byte[4];
                                        v5 = 0L;
                                        boolean z = false;
                                        z1 = false;
                                        while(true) {
                                        label_36:
                                            if(v5 >= v4 / 4L) {
                                                break;
                                            }
                                            try {
                                                b0.readFully(arr_b4);
                                                if(v5 != 1L) {
                                                    goto label_39;
                                                }
                                                ++v5;
                                                continue;
                                            }
                                            catch(EOFException unused_ex) {
                                                break;
                                            }
                                        label_39:
                                            if(Arrays.equals(arr_b4, g.q)) {
                                                z = true;
                                            }
                                            else if(Arrays.equals(arr_b4, g.r)) {
                                                goto label_55;
                                            }
                                            goto label_56;
                                        }
                                    }
                                }
                            }
                            goto label_61;
                        }
                        catch(Exception exception0) {
                            goto label_48;
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            try {
                                b1 = b0;
                                goto label_52;
                            }
                            catch(Exception exception0) {
                            }
                        label_48:
                            if(g.l) {
                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", exception0);
                            }
                        }
                        catch(Throwable throwable0) {
                            b1 = b0;
                            goto label_52;
                        }
                        if(b0 == null) {
                            b2 = null;
                            b2 = new b(arr_b);
                            goto label_68;
                        label_52:
                            if(b1 != null) {
                                b1.close();
                            }
                            throw throwable0;
                        label_55:
                            z1 = true;
                        label_56:
                            if(z && z1) {
                                b0.close();
                                return 12;
                            }
                            ++v5;
                            goto label_36;
                        }
                    label_61:
                        b0.close();
                        try {
                            b2 = null;
                            b2 = new b(arr_b);
                            goto label_68;
                        }
                        catch(Exception unused_ex) {
                            goto label_73;
                        }
                        catch(Throwable throwable1) {
                        }
                        b b3 = null;
                        goto label_79;
                        try {
                        label_68:
                            ByteOrder byteOrder0 = g.q(b2);
                            this.f = byteOrder0;
                            b2.Z = byteOrder0;
                            v6 = b2.readShort();
                            goto label_82;
                        }
                        catch(Exception unused_ex) {
                        label_73:
                            if(b2 != null) {
                                b2.close();
                            }
                            z2 = false;
                            goto label_84;
                        }
                        catch(Throwable throwable1) {
                            b3 = b2;
                        }
                    label_79:
                        if(b3 != null) {
                            b3.close();
                        }
                        throw throwable1;
                    label_82:
                        z2 = v6 == 20306 || v6 == 21330;
                        b2.close();
                    label_84:
                        if(z2) {
                            return 7;
                        }
                        try {
                            b4 = new b(arr_b);
                        }
                        catch(Exception unused_ex) {
                            b5 = null;
                            goto label_99;
                        }
                        catch(Throwable throwable2) {
                            b6 = null;
                            goto label_105;
                        }
                        try {
                            ByteOrder byteOrder1 = g.q(b4);
                            this.f = byteOrder1;
                            b4.Z = byteOrder1;
                            if(b4.readShort() == 85) {
                                z3 = true;
                            }
                            else {
                                goto label_110;
                            }
                            goto label_111;
                        }
                        catch(Exception unused_ex) {
                            b5 = b4;
                        label_99:
                            if(b5 != null) {
                                b5.close();
                            }
                            z3 = false;
                            goto label_112;
                        }
                        catch(Throwable throwable2) {
                            b6 = b4;
                        }
                    label_105:
                        if(b6 != null) {
                            b6.close();
                        }
                        throw throwable2;
                    label_110:
                        z3 = false;
                    label_111:
                        b4.close();
                    label_112:
                        if(z3) {
                            return 10;
                        }
                        for(int v7 = 0; true; ++v7) {
                            boolean z4 = true;
                            byte[] arr_b5 = g.u;
                            if(v7 >= arr_b5.length) {
                                break;
                            }
                            if(arr_b[v7] != arr_b5[v7]) {
                                z4 = false;
                                break;
                            }
                        }
                        if(z4) {
                            return 13;
                        }
                        for(int v8 = 0; true; ++v8) {
                            byte[] arr_b6 = g.y;
                            if(v8 >= arr_b6.length) {
                                break;
                            }
                            if(arr_b[v8] != arr_b6[v8]) {
                                return 0;
                            }
                        }
                        for(int v9 = 0; true; ++v9) {
                            byte[] arr_b7 = g.z;
                            if(v9 >= arr_b7.length) {
                                return 14;
                            }
                            if(arr_b[arr_b6.length + v9 + 4] != arr_b7[v9]) {
                                break;
                            }
                        }
                        return 0;
                    }
                    ++v1;
                }
                return 9;
            }
            ++v;
        }
        return 4;
    }

    public final void g(f f0) {
        this.j(f0);
        HashMap[] arr_hashMap = this.d;
        c c0 = (c)arr_hashMap[1].get("MakerNote");
        if(c0 != null) {
            f f1 = new f(c0.d);
            f1.Z = this.f;
            byte[] arr_b = new byte[g.s.length];
            f1.readFully(arr_b);
            f1.b(0L);
            byte[] arr_b1 = g.t;
            byte[] arr_b2 = new byte[arr_b1.length];
            f1.readFully(arr_b2);
            if(Arrays.equals(arr_b, g.s)) {
                f1.b(8L);
            }
            else if(Arrays.equals(arr_b2, arr_b1)) {
                f1.b(12L);
            }
            this.s(f1, 6);
            c c1 = (c)arr_hashMap[7].get("PreviewImageStart");
            c c2 = (c)arr_hashMap[7].get("PreviewImageLength");
            if(c1 != null && c2 != null) {
                arr_hashMap[5].put("JPEGInterchangeFormat", c1);
                arr_hashMap[5].put("JPEGInterchangeFormatLength", c2);
            }
            c c3 = (c)arr_hashMap[8].get("AspectFrame");
            if(c3 != null) {
                int[] arr_v = (int[])c3.g(this.f);
                if(arr_v == null || arr_v.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(arr_v));
                }
                else {
                    int v = arr_v[2];
                    int v1 = arr_v[0];
                    if(v > v1) {
                        int v2 = arr_v[3];
                        int v3 = arr_v[1];
                        if(v2 > v3) {
                            int v4 = v - v1 + 1;
                            int v5 = v2 - v3 + 1;
                            if(v4 < v5) {
                                int v6 = v4 + v5;
                                v5 = v6 - v5;
                                v4 = v6 - v5;
                            }
                            c c4 = c.c(v4, this.f);
                            c c5 = c.c(v5, this.f);
                            arr_hashMap[0].put("ImageWidth", c4);
                            arr_hashMap[0].put("ImageLength", c5);
                        }
                    }
                }
            }
        }
    }

    public final void h(b b0) {
        if(g.l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + b0);
        }
        b0.Z = ByteOrder.BIG_ENDIAN;
        b0.a(g.u.length);
        int v = g.u.length;
        try {
            while(true) {
                int v1 = b0.readInt();
                byte[] arr_b = new byte[4];
                b0.readFully(arr_b);
                if(v + 8 == 16 && !Arrays.equals(arr_b, g.w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if(Arrays.equals(arr_b, g.x)) {
                    break;
                }
                if(Arrays.equals(arr_b, g.v)) {
                    byte[] arr_b1 = new byte[v1];
                    b0.readFully(arr_b1);
                    int v2 = b0.readInt();
                    CRC32 cRC320 = new CRC32();
                    cRC320.update(arr_b);
                    cRC320.update(arr_b1);
                    if(((int)cRC320.getValue()) != v2) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + v2 + ", calculated CRC value: " + cRC320.getValue());
                    }
                    this.h = v + 8;
                    this.r(0, arr_b1);
                    this.x();
                    this.u(new b(arr_b1));
                    return;
                }
                b0.a(v1 + 4);
                v = v + v1 + 12;
            }
        }
        catch(EOFException unused_ex) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }

    public final void i(b b0) {
        boolean z = g.l;
        if(z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + b0);
        }
        b0.a(84);
        byte[] arr_b = new byte[4];
        byte[] arr_b1 = new byte[4];
        byte[] arr_b2 = new byte[4];
        b0.readFully(arr_b);
        b0.readFully(arr_b1);
        b0.readFully(arr_b2);
        int v = ByteBuffer.wrap(arr_b).getInt();
        int v1 = ByteBuffer.wrap(arr_b1).getInt();
        int v2 = ByteBuffer.wrap(arr_b2).getInt();
        byte[] arr_b3 = new byte[v1];
        b0.a(v - b0.Y);
        b0.readFully(arr_b3);
        this.e(new b(arr_b3), v, 5);
        b0.a(v2 - b0.Y);
        b0.Z = ByteOrder.BIG_ENDIAN;
        int v3 = b0.readInt();
        if(z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + v3);
        }
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = b0.readUnsignedShort();
            int v6 = b0.readUnsignedShort();
            if(v5 == g.E.a) {
                int v7 = b0.readShort();
                int v8 = b0.readShort();
                c c0 = c.c(v7, this.f);
                c c1 = c.c(v8, this.f);
                this.d[0].put("ImageLength", c0);
                this.d[0].put("ImageWidth", c1);
                if(z) {
                    Log.d("ExifInterface", "Updated to length: " + v7 + ", width: " + v8);
                }
                return;
            }
            b0.a(v6);
        }
    }

    public final void j(f f0) {
        this.o(f0);
        this.s(f0, 0);
        this.w(f0, 0);
        this.w(f0, 5);
        this.w(f0, 4);
        this.x();
        if(this.c == 8) {
            HashMap[] arr_hashMap = this.d;
            c c0 = (c)arr_hashMap[1].get("MakerNote");
            if(c0 != null) {
                f f1 = new f(c0.d);
                f1.Z = this.f;
                f1.a(6);
                this.s(f1, 9);
                c c1 = (c)arr_hashMap[9].get("ColorSpace");
                if(c1 != null) {
                    arr_hashMap[1].put("ColorSpace", c1);
                }
            }
        }
    }

    public final void k(f f0) {
        if(g.l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + f0);
        }
        this.j(f0);
        HashMap[] arr_hashMap = this.d;
        c c0 = (c)arr_hashMap[0].get("JpgFromRaw");
        if(c0 != null) {
            this.e(new b(c0.d), ((int)c0.c), 5);
        }
        c c1 = (c)arr_hashMap[0].get("ISO");
        if(c1 != null && ((c)arr_hashMap[1].get("PhotographicSensitivity")) == null) {
            arr_hashMap[1].put("PhotographicSensitivity", c1);
        }
    }

    public final void l(b b0) {
        if(g.l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + b0);
        }
        b0.Z = ByteOrder.LITTLE_ENDIAN;
        b0.a(g.y.length);
        int v = b0.readInt();
        b0.a(g.z.length);
        int v1 = g.z.length + 8;
        try {
            while(true) {
                byte[] arr_b = new byte[4];
                b0.readFully(arr_b);
                int v2 = b0.readInt();
                if(Arrays.equals(g.A, arr_b)) {
                    byte[] arr_b1 = new byte[v2];
                    b0.readFully(arr_b1);
                    this.h = v1 + 8;
                    this.r(0, arr_b1);
                    this.u(new b(arr_b1));
                    return;
                }
                if(v2 % 2 == 1) {
                    ++v2;
                }
                v1 = v1 + 8 + v2;
                if(v1 == v + 8) {
                    return;
                }
                if(v1 > v + 8) {
                    break;
                }
                b0.a(v2);
            }
            throw new IOException("Encountered WebP file with invalid chunk size");
        }
        catch(EOFException unused_ex) {
            throw new IOException("Encountered corrupt WebP file.");
        }
    }

    public final void m(b b0, HashMap hashMap0) {
        c c0 = (c)hashMap0.get("JPEGInterchangeFormat");
        c c1 = (c)hashMap0.get("JPEGInterchangeFormatLength");
        if(c0 != null && c1 != null) {
            int v = c0.e(this.f);
            int v1 = c1.e(this.f);
            if(this.c == 7) {
                v += this.i;
            }
            if(v > 0 && v1 > 0 && this.b == null && this.a == null) {
                b0.a(v);
                b0.readFully(new byte[v1]);
            }
            if(g.l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + v + ", length: " + v1);
            }
        }
    }

    public final boolean n(HashMap hashMap0) {
        c c0 = (c)hashMap0.get("ImageLength");
        c c1 = (c)hashMap0.get("ImageWidth");
        return c0 != null && c1 != null && (c0.e(this.f) <= 0x200 && c1.e(this.f) <= 0x200);
    }

    public final void o(f f0) {
        ByteOrder byteOrder0 = g.q(f0);
        this.f = byteOrder0;
        f0.Z = byteOrder0;
        int v = f0.readUnsignedShort();
        if(this.c != 7 && this.c != 10 && v != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(v));
        }
        int v1 = f0.readInt();
        if(v1 < 8) {
            throw new IOException("Invalid first Ifd offset: " + v1);
        }
        if(v1 - 8 > 0) {
            f0.a(v1 - 8);
        }
    }

    public final void p() {
        for(int v = 0; true; ++v) {
            HashMap[] arr_hashMap = this.d;
            if(v >= arr_hashMap.length) {
                break;
            }
            StringBuilder stringBuilder0 = m5.b.A(v, "The size of tag group[", "]: ");
            stringBuilder0.append(arr_hashMap[v].size());
            Log.d("ExifInterface", stringBuilder0.toString());
            for(Object object0: arr_hashMap[v].entrySet()) {
                c c0 = (c)((Map.Entry)object0).getValue();
                Log.d("ExifInterface", "tagName: " + ((String)((Map.Entry)object0).getKey()) + ", tagType: " + c0.toString() + ", tagValue: \'" + c0.f(this.f) + "\'");
            }
        }
    }

    public static ByteOrder q(b b0) {
        int v = b0.readShort();
        boolean z = g.l;
        switch(v) {
            case 0x4949: {
                if(z) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align II");
                }
                return ByteOrder.LITTLE_ENDIAN;
            }
            case 0x4D4D: {
                if(z) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            default: {
                throw new IOException("Invalid byte order: " + Integer.toHexString(v));
            }
        }
    }

    public final void r(int v, byte[] arr_b) {
        f f0 = new f(arr_b);
        this.o(f0);
        this.s(f0, v);
    }

    // This method was un-flattened
    public final void s(f f0, int v) {
        long v14;
        d d1;
        int v13;
        long v12;
        HashSet hashSet2;
        int v8;
        HashSet hashSet1;
        int v1 = v;
        HashSet hashSet0 = this.e;
        hashSet0.add(((int)f0.Y));
        int v2 = f0.readShort();
        boolean z = g.l;
        if(z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + v2);
        }
        if(v2 <= 0) {
            return;
        }
        int v3 = 0;
        while(true) {
            HashMap[] arr_hashMap = this.d;
            if(v3 >= v2) {
                break;
            }
            int v4 = f0.readUnsignedShort();
            int v5 = f0.readUnsignedShort();
            int v6 = f0.readInt();
            long v7 = ((long)f0.Y) + 4L;
            d d0 = (d)g.H[v1].get(v4);
            if(z) {
                hashSet1 = hashSet0;
                v8 = v3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", v, v4, (d0 == null ? null : d0.b), v5, v6));
            }
            else {
                hashSet1 = hashSet0;
                v8 = v3;
            }
            if(d0 == null) {
                if(z) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + v4);
                }
                f0.b(v7);
                hashSet2 = hashSet1;
            }
            else if(v5 > 0) {
                int[] arr_v = g.C;
                if(v5 < arr_v.length) {
                    int v9 = d0.c;
                    if(v9 == 7 || v5 == 7 || v9 == v5 || (d0.d == v5 || (v9 == 4 || d0.d == 4) && v5 == 3 || (v9 == 9 || d0.d == 9) && v5 == 8 || (v9 == 12 || d0.d == 12) && v5 == 11)) {
                        if(v5 == 7) {
                            v5 = v9;
                        }
                        long v10 = ((long)arr_v[v5]) * ((long)v6);
                        if(v10 >= 0L && v10 <= 0x7FFFFFFFL) {
                            if(Long.compare(v10, 4L) > 0) {
                                int v11 = f0.readInt();
                                v12 = v7;
                                if(z) {
                                    Log.d("ExifInterface", "seek to data offset: " + v11);
                                }
                                if(this.c != 7) {
                                label_68:
                                    v13 = v6;
                                    d1 = d0;
                                }
                                else if("MakerNote".equals(d0.b)) {
                                    this.i = v11;
                                    goto label_68;
                                }
                                else if(v1 == 6 && "ThumbnailImage".equals(d0.b)) {
                                    this.j = v11;
                                    this.k = v6;
                                    c c0 = c.c(6, this.f);
                                    v13 = v6;
                                    c c1 = c.a(this.j, this.f);
                                    d1 = d0;
                                    c c2 = c.a(this.k, this.f);
                                    arr_hashMap[4].put("Compression", c0);
                                    arr_hashMap[4].put("JPEGInterchangeFormat", c1);
                                    arr_hashMap[4].put("JPEGInterchangeFormatLength", c2);
                                }
                                f0.b(((long)v11));
                            }
                            else {
                                v13 = v6;
                                d1 = d0;
                                v12 = v7;
                            }
                            Integer integer0 = (Integer)g.K.get(v4);
                            if(z) {
                                Log.d("ExifInterface", "nextIfdType: " + integer0 + " byteCount: " + v10);
                            }
                            if(integer0 == null) {
                                hashSet2 = hashSet1;
                                int v16 = f0.Y + this.h;
                                byte[] arr_b = new byte[((int)v10)];
                                f0.readFully(arr_b);
                                c c3 = new c(((long)v16), arr_b, v5, v13);
                                arr_hashMap[v].put(d1.b, c3);
                                String s = d1.b;
                                if("DNGVersion".equals(s)) {
                                    this.c = 3;
                                }
                                if(("Make".equals(s) || "Model".equals(s)) && c3.f(this.f).contains("PENTAX") || "Compression".equals(s) && c3.e(this.f) == 0xFFFF) {
                                    this.c = 8;
                                }
                                if(((long)f0.Y) != v12) {
                                    f0.b(v12);
                                }
                            }
                            else {
                                switch(v5) {
                                    case 3: {
                                        v14 = (long)f0.readUnsignedShort();
                                        break;
                                    }
                                    case 4: {
                                        v14 = ((long)f0.readInt()) & 0xFFFFFFFFL;
                                        break;
                                    }
                                    case 8: {
                                        v14 = (long)f0.readShort();
                                        break;
                                    }
                                    case 9: 
                                    case 13: {
                                        v14 = (long)f0.readInt();
                                        break;
                                    }
                                    default: {
                                        v14 = -1L;
                                    }
                                }
                                if(z) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", v14, d1.b));
                                }
                                int v15 = f0.c0;
                                if(Long.compare(v14, 0L) > 0 && (v15 == -1 || v14 < ((long)v15))) {
                                    hashSet2 = hashSet1;
                                    if(!hashSet2.contains(((int)v14))) {
                                        f0.b(v14);
                                        this.s(f0, ((int)integer0));
                                    }
                                    else if(z) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + integer0 + " (at " + v14 + ")");
                                    }
                                }
                                else {
                                    hashSet2 = hashSet1;
                                    if(z) {
                                        Log.d("ExifInterface", (v15 == -1 ? m5.b.t(v14, "Skip jump into the IFD since its offset is invalid: ") : m5.b.t(v14, "Skip jump into the IFD since its offset is invalid: ") + " (total length: " + v15 + ")"));
                                    }
                                }
                                f0.b(v12);
                            }
                        }
                        else {
                            if(z) {
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + v6);
                            }
                            goto label_122;
                        }
                    }
                    else {
                        if(z) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + g.B[v5] + ") is unexpected for tag: " + d0.b);
                        }
                        f0.b(v7);
                        hashSet2 = hashSet1;
                    }
                }
                else {
                    goto label_120;
                }
            }
            else {
            label_120:
                if(z) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + v5);
                }
            label_122:
                f0.b(v7);
                hashSet2 = hashSet1;
            }
            v1 = v;
            hashSet0 = hashSet2;
            v2 = v2;
            v3 = (short)(v8 + 1);
        }
        int v17 = f0.readInt();
        if(z) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", v17));
        }
        if(((long)v17) > 0L) {
            if(!hashSet0.contains(v17)) {
                f0.b(((long)v17));
                if(arr_hashMap[4].isEmpty()) {
                    this.s(f0, 4);
                    return;
                }
                if(arr_hashMap[5].isEmpty()) {
                    this.s(f0, 5);
                }
            }
            else if(z) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + v17);
            }
        }
        else if(z) {
            Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + v17);
        }
    }

    public final void t(int v, String s, String s1) {
        HashMap[] arr_hashMap = this.d;
        if(!arr_hashMap[v].isEmpty() && arr_hashMap[v].get(s) != null) {
            HashMap hashMap0 = arr_hashMap[v];
            hashMap0.put(s1, hashMap0.get(s));
            arr_hashMap[v].remove(s);
        }
    }

    public final void u(b b0) {
        HashMap hashMap0 = this.d[4];
        c c0 = (c)hashMap0.get("Compression");
        if(c0 == null) {
            this.m(b0, hashMap0);
        }
        else {
            int v = c0.e(this.f);
            switch(v) {
                case 1: {
                    break;
                }
                case 6: {
                    this.m(b0, hashMap0);
                    return;
                label_8:
                    if(v != 7) {
                        return;
                    }
                    break;
                }
                default: {
                    goto label_8;
                }
            }
            c c1 = (c)hashMap0.get("BitsPerSample");
            if(c1 == null) {
            label_71:
                if(g.l) {
                    Log.d("ExifInterface", "Unsupported data type value");
                }
            }
            else {
                int[] arr_v = (int[])c1.g(this.f);
                int[] arr_v1 = g.m;
                if(Arrays.equals(arr_v1, arr_v)) {
                label_20:
                    c c3 = (c)hashMap0.get("StripOffsets");
                    c c4 = (c)hashMap0.get("StripByteCounts");
                    if(c3 != null && c4 != null) {
                        long[] arr_v2 = yc.d.i(c3.g(this.f));
                        long[] arr_v3 = yc.d.i(c4.g(this.f));
                        if(arr_v2 == null || arr_v2.length == 0) {
                            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                            return;
                        }
                        if(arr_v3 == null || arr_v3.length == 0) {
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        if(arr_v2.length != arr_v3.length) {
                            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                            return;
                        }
                        long v2 = 0L;
                        for(int v3 = 0; v3 < arr_v3.length; ++v3) {
                            v2 += arr_v3[v3];
                        }
                        byte[] arr_b = new byte[((int)v2)];
                        this.g = true;
                        int v5 = 0;
                        int v6 = 0;
                        for(int v4 = 0; v4 < arr_v2.length; ++v4) {
                            int v7 = (int)arr_v2[v4];
                            int v8 = (int)arr_v3[v4];
                            if(v4 < arr_v2.length - 1 && ((long)(v7 + v8)) != arr_v2[v4 + 1]) {
                                this.g = false;
                            }
                            int v9 = v7 - v5;
                            if(v9 < 0) {
                                Log.d("ExifInterface", "Invalid strip offset value");
                                return;
                            }
                            try {
                                b0.a(v9);
                            }
                            catch(EOFException unused_ex) {
                                Log.d("ExifInterface", "Failed to skip " + v9 + " bytes.");
                                return;
                            }
                            byte[] arr_b1 = new byte[v8];
                            try {
                                b0.readFully(arr_b1);
                            }
                            catch(EOFException unused_ex) {
                                Log.d("ExifInterface", "Failed to read " + v8 + " bytes.");
                                return;
                            }
                            v5 = v5 + v9 + v8;
                            System.arraycopy(arr_b1, 0, arr_b, v6, v8);
                            v6 += v8;
                        }
                        if(this.g) {
                            long v10 = arr_v2[0];
                        }
                    }
                }
                else if(this.c == 3) {
                    c c2 = (c)hashMap0.get("PhotometricInterpretation");
                    if(c2 == null) {
                        goto label_71;
                    }
                    else {
                        int v1 = c2.e(this.f);
                        if((v1 != 1 || !Arrays.equals(arr_v, g.n)) && (v1 != 6 || !Arrays.equals(arr_v, arr_v1))) {
                            goto label_71;
                        }
                        else {
                            goto label_20;
                        }
                    }
                }
                else {
                    goto label_71;
                }
            }
        }
    }

    public final void v(int v, int v1) {
        HashMap[] arr_hashMap = this.d;
        boolean z = g.l;
        if(!arr_hashMap[v].isEmpty() && !arr_hashMap[v1].isEmpty()) {
            c c0 = (c)arr_hashMap[v].get("ImageLength");
            c c1 = (c)arr_hashMap[v].get("ImageWidth");
            c c2 = (c)arr_hashMap[v1].get("ImageLength");
            c c3 = (c)arr_hashMap[v1].get("ImageWidth");
            if(c0 != null && c1 != null) {
                if(c2 != null && c3 != null) {
                    int v2 = c0.e(this.f);
                    int v3 = c1.e(this.f);
                    if(v2 < c2.e(this.f) && v3 < c3.e(this.f)) {
                        HashMap hashMap0 = arr_hashMap[v];
                        arr_hashMap[v] = arr_hashMap[v1];
                        arr_hashMap[v1] = hashMap0;
                        return;
                    }
                }
                else if(z) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
            }
            else if(z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
            return;
        }
        if(z) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(f f0, int v) {
        c c6;
        c c5;
        HashMap[] arr_hashMap = this.d;
        c c0 = (c)arr_hashMap[v].get("DefaultCropSize");
        c c1 = (c)arr_hashMap[v].get("SensorTopBorder");
        c c2 = (c)arr_hashMap[v].get("SensorLeftBorder");
        c c3 = (c)arr_hashMap[v].get("SensorBottomBorder");
        c c4 = (c)arr_hashMap[v].get("SensorRightBorder");
        if(c0 != null) {
            if(c0.a == 5) {
                e[] arr_e = (e[])c0.g(this.f);
                if(arr_e != null && arr_e.length == 2) {
                    c5 = c.b(arr_e[0], this.f);
                    c6 = c.b(arr_e[1], this.f);
                    arr_hashMap[v].put("ImageWidth", c5);
                    arr_hashMap[v].put("ImageLength", c6);
                    return;
                }
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(arr_e));
                return;
            }
            int[] arr_v = (int[])c0.g(this.f);
            if(arr_v != null && arr_v.length == 2) {
                c5 = c.c(arr_v[0], this.f);
                c6 = c.c(arr_v[1], this.f);
                arr_hashMap[v].put("ImageWidth", c5);
                arr_hashMap[v].put("ImageLength", c6);
                return;
            }
            Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(arr_v));
            return;
        }
        if(c1 != null && c2 != null && c3 != null && c4 != null) {
            int v1 = c1.e(this.f);
            int v2 = c3.e(this.f);
            int v3 = c4.e(this.f);
            int v4 = c2.e(this.f);
            if(v2 > v1 && v3 > v4) {
                c c7 = c.c(v2 - v1, this.f);
                c c8 = c.c(v3 - v4, this.f);
                arr_hashMap[v].put("ImageLength", c7);
                arr_hashMap[v].put("ImageWidth", c8);
            }
        }
        else if(((c)arr_hashMap[v].get("ImageLength")) == null || ((c)arr_hashMap[v].get("ImageWidth")) == null) {
            c c9 = (c)arr_hashMap[v].get("JPEGInterchangeFormat");
            if(c9 != null && ((c)arr_hashMap[v].get("JPEGInterchangeFormatLength")) != null) {
                int v5 = c9.e(this.f);
                int v6 = c9.e(this.f);
                f0.b(((long)v5));
                byte[] arr_b = new byte[v6];
                f0.readFully(arr_b);
                this.e(new b(arr_b), v5, v);
            }
        }
    }

    public final void x() {
        this.v(0, 5);
        this.v(0, 4);
        this.v(5, 4);
        HashMap[] arr_hashMap = this.d;
        c c0 = (c)arr_hashMap[1].get("PixelXDimension");
        c c1 = (c)arr_hashMap[1].get("PixelYDimension");
        if(c0 != null && c1 != null) {
            arr_hashMap[0].put("ImageWidth", c0);
            arr_hashMap[0].put("ImageLength", c1);
        }
        if(arr_hashMap[4].isEmpty() && this.n(arr_hashMap[5])) {
            arr_hashMap[4] = arr_hashMap[5];
            arr_hashMap[5] = new HashMap();
        }
        if(!this.n(arr_hashMap[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        this.t(0, "ThumbnailOrientation", "Orientation");
        this.t(0, "ThumbnailImageLength", "ImageLength");
        this.t(0, "ThumbnailImageWidth", "ImageWidth");
        this.t(5, "ThumbnailOrientation", "Orientation");
        this.t(5, "ThumbnailImageLength", "ImageLength");
        this.t(5, "ThumbnailImageWidth", "ImageWidth");
        this.t(4, "Orientation", "ThumbnailOrientation");
        this.t(4, "ImageLength", "ThumbnailImageLength");
        this.t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}

