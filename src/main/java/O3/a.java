package o3;

import java.io.PushbackReader;
import java.io.Reader;

public final class a extends PushbackReader {
    public int X;
    public int Y;
    public int Z;

    public a(Reader reader0) {
        super(reader0, 8);
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
    }

    @Override
    public final int read(char[] arr_c, int v, int v1) {
        boolean z;
        char[] arr_c1 = new char[8];
        int v2 = v;
        int v3 = 0;
        int v4 = 0;
        while(true) {
            z = true;
        label_5:
            if(!z || v3 >= v1) {
                break;
            }
            z = super.read(arr_c1, v4, 1) == 1;
            if(z) {
                char c = arr_c1[v4];
                switch(this.X) {
                    case 0: {
                        if(c == 38) {
                            this.X = 1;
                        }
                        break;
                    }
                    case 1: {
                        this.X = c == 35 ? 2 : 5;
                        break;
                    }
                    case 2: {
                        if(c == 120) {
                            this.Y = 0;
                            this.Z = 0;
                            this.X = 3;
                        }
                        else if(0x30 > c || c > 57) {
                            this.X = 5;
                        }
                        else {
                            this.Y = Character.digit(c, 10);
                            this.Z = 1;
                            this.X = 4;
                        }
                        break;
                    }
                    case 3: {
                        if(0x30 <= c && c <= 57 || 97 <= c && c <= 102 || 65 <= c && c <= 70) {
                            this.Y = Character.digit(c, 16) + this.Y * 16;
                            int v5 = this.Z + 1;
                            this.Z = v5;
                            this.X = v5 <= 4 ? 3 : 5;
                        }
                        else if(c != 59 || !c.a(((char)this.Y))) {
                            this.X = 5;
                        }
                        else {
                            this.X = 0;
                            c = (char)this.Y;
                        }
                        break;
                    }
                    case 4: {
                        if(0x30 <= c && c <= 57) {
                            this.Y = Character.digit(c, 10) + this.Y * 10;
                            int v6 = this.Z + 1;
                            this.Z = v6;
                            this.X = v6 <= 5 ? 4 : 5;
                        }
                        else if(c != 59 || !c.a(((char)this.Y))) {
                            this.X = 5;
                        }
                        else {
                            this.X = 0;
                            c = (char)this.Y;
                        }
                        break;
                    }
                    case 5: {
                        this.X = 0;
                    }
                }
                int v7 = this.X;
                if(v7 == 0) {
                    if(c.a(c)) {
                        c = ' ';
                    }
                    arr_c[v2] = c;
                    ++v3;
                    ++v2;
                    v4 = 0;
                }
                else if(v7 == 5) {
                    this.unread(arr_c1, 0, v4 + 1);
                    v4 = 0;
                }
                else {
                    ++v4;
                }
                goto label_5;
            }
            if(v4 > 0) {
                this.unread(arr_c1, 0, v4);
                this.X = 5;
                v4 = 0;
                continue;
            }
            if(false) {
                break;
            }
            goto label_5;
        }
        return v3 > 0 || z ? v3 : -1;
    }
}

