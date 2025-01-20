package c4;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class a extends Enum {
    public static final enum a A0;
    public static final enum a B0;
    public static final enum a C0;
    public static final enum a D0;
    public static final enum a E0;
    public static final enum a F0;
    public static final enum a G0;
    public static final enum a H0;
    public static final enum a I0;
    public static final enum a J0;
    public static final enum a K0;
    public static final enum a L0;
    public static final enum a M0;
    public static final enum a N0;
    public static final enum a O0;
    public static final a[] P0;
    public final String X;
    public final String Y;
    public final String Z;
    public final String[] b0;
    public static final enum a c0;
    public static final enum a d0;
    public static final enum a e0;
    public static final enum a f0;
    public static final enum a g0;
    public static final enum a h0;
    public static final enum a i0;
    public static final enum a j0;
    public static final enum a k0;
    public static final enum a l0;
    public static final enum a m0;
    public static final enum a n0;
    public static final enum a o0;
    public static final enum a p0;
    public static final enum a q0;
    public static final enum a r0;
    public static final enum a s0;
    public static final enum a t0;
    public static final enum a u0;
    public static final enum a v0;
    public static final enum a w0;
    public static final enum a x0;
    public static final enum a y0;
    public static final enum a z0;

    static {
        a.c0 = new a("Unknown", 0, "Unknown", "Unknown", null, new String[0]);
        a.d0 = new a("Jpeg", 1, "JPEG", "Joint Photographic Experts Group", "image/jpeg", new String[]{"jpg", "jpeg", "jpe"});
        a.e0 = new a("Tiff", 2, "TIFF", "Tagged Image File Format", "image/tiff", new String[]{"tiff", "tif"});
        a.f0 = new a("Psd", 3, "PSD", "Photoshop Document", "image/vnd.adobe.photoshop", new String[]{"psd"});
        a.g0 = new a("Png", 4, "PNG", "Portable Network Graphics", "image/png", new String[]{"png"});
        a.h0 = new a("Bmp", 5, "BMP", "Device Independent Bitmap", "image/bmp", new String[]{"bmp"});
        a.i0 = new a("Gif", 6, "GIF", "Graphics Interchange Format", "image/gif", new String[]{"gif"});
        a.j0 = new a("Ico", 7, "ICO", "Windows Icon", "image/x-icon", new String[]{"ico"});
        a.k0 = new a("Pcx", 8, "PCX", "PiCture eXchange", "image/x-pcx", new String[]{"pcx"});
        a.l0 = new a("Riff", 9, "RIFF", "Resource Interchange File Format", null, new String[0]);
        a.m0 = new a("Wav", 10, "WAV", "Waveform Audio File Format", "audio/vnd.wave", new String[]{"wav", "wave"});
        a.n0 = new a("Avi", 11, "AVI", "Audio Video Interleaved", "video/vnd.avi", new String[]{"avi"});
        a.o0 = new a("WebP", 12, "WebP", "WebP", "image/webp", new String[]{"webp"});
        a.p0 = new a("QuickTime", 13, "MOV", "QuickTime Movie", "video/quicktime", new String[]{"mov", "qt"});
        a.q0 = new a("Mp4", 14, "MP4", "MPEG-4 Part 14", "video/mp4", new String[]{"mp4", "m4a", "m4p", "m4b", "m4r", "m4v"});
        a.r0 = new a("Heif", 15, "HEIF", "High Efficiency Image File Format", "image/heif", new String[]{"heif", "heic"});
        a.s0 = new a("Eps", 16, "EPS", "Encapsulated PostScript", "application/postscript", new String[]{"eps", "epsf", "epsi"});
        a.t0 = new a("Mp3", 17, "MP3", "MPEG Audio Layer III", "audio/mpeg", new String[]{"mp3"});
        a.u0 = new a("Arw", 18, "ARW", "Sony Camera Raw", null, new String[]{"arw"});
        a.v0 = new a("Crw", 19, "CRW", "Canon Camera Raw", null, new String[]{"crw"});
        a.w0 = new a("Cr2", 20, "CR2", "Canon Camera Raw", null, new String[]{"cr2"});
        a a0 = new a("Nef", 21, "NEF", "Nikon Camera Raw", null, new String[]{"nef"});
        a.x0 = new a("Orf", 22, "ORF", "Olympus Camera Raw", null, new String[]{"orf"});
        a.y0 = new a("Raf", 23, "RAF", "FujiFilm Camera Raw", null, new String[]{"raf"});
        a.z0 = new a("Rw2", 24, "RW2", "Panasonic Camera Raw", null, new String[]{"rw2"});
        a.A0 = new a("Crx", 25, "CRX", "Canon Camera Raw", null, new String[]{"cr3", "crm"});
        a.B0 = new a("Aac", 26, "AAC", "Advanced Audio Coding", "audio/aac", new String[]{"m4a"});
        a.C0 = new a("Asf", 27, "ASF", "Advanced Systems Format", "video/x-ms-asf", new String[]{"asf", "wma", "wmv"});
        a.D0 = new a("Cfbf", 28, "CFBF", "Compound File Binary Format", null, null);
        a.E0 = new a("Flv", 29, "FLV", "Flash Video", "video/x-flv", new String[]{".flv", ".f4v,"});
        a.F0 = new a("Indd", 30, "INDD", "INDesign Document", "application/octet-stream", new String[]{".indd"});
        a.G0 = new a("Mxf", 0x1F, "MXF", "Material Exchange Format", "application/mxf", new String[]{"mxf"});
        a a1 = new a("Pdf", 0x20, "PDF", "Portable Document Format", "application/pdf", new String[]{"pdf"});
        a.H0 = new a("Qxp", 33, "QXP", "Quark XPress Document", null, new String[]{"qzp", "qxd"});
        a.I0 = new a("Ram", 34, "RAM", "RealAudio", "audio/vnd.rn-realaudio", new String[]{"aac", "ra"});
        a.J0 = new a("Rtf", 35, "RTF", "Rich Text Format", "application/rtf", new String[]{"rtf"});
        a.K0 = new a("Sit", 36, "SIT", "Stuffit Archive", "application/x-stuffit", new String[]{"sit"});
        a.L0 = new a("Sitx", 37, "SITX", "Stuffit X Archive", "application/x-stuffitx", new String[]{"sitx"});
        a.M0 = new a("Swf", 38, "SWF", "Small Web Format", "application/vnd.adobe.flash-movie", new String[]{"swf"});
        a.N0 = new a("Vob", 39, "VOB", "Video Object", "video/dvd", new String[]{".vob"});
        a.O0 = new a("Zip", 40, "ZIP", "ZIP Archive", "application/zip", new String[]{".zip", ".zipx"});
        a.P0 = new a[]{a.c0, a.d0, a.e0, a.f0, a.g0, a.h0, a.i0, a.j0, a.k0, a.l0, a.m0, a.n0, a.o0, a.p0, a.q0, a.r0, a.s0, a.t0, a.u0, a.v0, a.w0, a0, a.x0, a.y0, a.z0, a.A0, a.B0, a.C0, a.D0, a.E0, a.F0, a.G0, a1, a.H0, a.I0, a.J0, a.K0, a.L0, a.M0, a.N0, a.O0};
    }

    public a(String s, int v, String s1, String s2, String s3, String[] arr_s) {
        super(s, v);
        this.X = s1;
        this.Y = s2;
        this.Z = s3;
        this.b0 = arr_s;
    }

    public static a valueOf(String s) {
        return (a)Enum.valueOf(a.class, s);
    }

    public static a[] values() {
        return (a[])a.P0.clone();
    }
}

