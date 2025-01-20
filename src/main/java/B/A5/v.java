package a5;

import Nb.j;
import Vb.q;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class v implements FilenameFilter {
    public final int a;

    public v(int v) {
        this.a = v;
        super();
    }

    @Override
    public final boolean accept(File file0, String s) {
        switch(this.a) {
            case 0: {
                return Pattern.matches("cpu[0-9]+", s);
            }
            case 1: {
                j.e(s, "name");
                Pattern pattern0 = Pattern.compile(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3)));
                j.e(pattern0, "compile(...)");
                return pattern0.matcher(s).matches();
            }
            case 2: {
                j.e(s, "name");
                Pattern pattern1 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1)));
                j.e(pattern1, "compile(...)");
                return pattern1.matcher(s).matches();
            }
            case 3: {
                j.e(s, "name");
                Pattern pattern2 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1)));
                j.e(pattern2, "compile(...)");
                return pattern2.matcher(s).matches();
            }
            case 4: {
                j.e(s, "name");
                Pattern pattern3 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1)));
                j.e(pattern3, "compile(...)");
                return pattern3.matcher(s).matches();
            }
            case 5: {
                j.c(s);
                return q.O(s, "log_", false);
            }
            default: {
                return s.endsWith(".envelope");
            }
        }
    }
}

