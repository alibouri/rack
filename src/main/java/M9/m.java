package m9;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class m {
    public final URI a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final long g;
    public final String h;
    public static final Pattern i;

    static {
        m.i = Pattern.compile("^(\\d+)(_([0-9a-f]+))?-(\\d+)_([0-9a-f]+)\\.(\\d+)\\.([\\w-]+).up$");
    }

    public m(File file0) {
        this(m.a(("file://" + file0.getAbsolutePath())));
    }

    public m(URI uRI0) {
        if(uRI0.getScheme() == null || !uRI0.getScheme().matches("^(https?|file)$")) {
            throw new l("Invalid URI: " + uRI0);  // initializer: Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
        }
        this.a = uRI0;
        int v = uRI0.getPath().lastIndexOf("/");
        String s = uRI0.getPath().substring(v + 1);
        this.b = s;
        Matcher matcher0 = m.i.matcher(s);
        if(matcher0.matches()) {
            try {
                this.c = Long.parseLong(matcher0.group(1));
                this.d = matcher0.group(3);
                this.e = Long.parseLong(matcher0.group(4));
                this.f = matcher0.group(5);
                this.g = Long.parseLong(matcher0.group(6));
                this.h = matcher0.group(7);
                return;
            }
            catch(Exception unused_ex) {
                throw new l("Invalid name for an update file: " + uRI0);  // initializer: Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
            }
        }
        throw new l("Invalid name for an update file: " + uRI0);  // initializer: Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    }

    public static URI a(String s) {
        try {
            return new URI(s);
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new l("Invalid URI: " + uRISyntaxException0);  // initializer: Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
        }
    }

    @Override
    public final String toString() {
        return "<UpdateFile " + this.a + ">";
    }
}

