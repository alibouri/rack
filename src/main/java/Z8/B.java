package z8;

public final class b {
    public final a a;
    public final int[] b;

    public b(a a0, int[] arr_v) {
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = a0;
        int v = 1;
        if(arr_v.length > 1 && arr_v[0] == 0) {
            while(v < arr_v.length && arr_v[v] == 0) {
                ++v;
            }
            if(v == arr_v.length) {
                this.b = new int[]{0};
                return;
            }
            int v1 = arr_v.length - v;
            int[] arr_v1 = new int[v1];
            this.b = arr_v1;
            System.arraycopy(arr_v, v, arr_v1, 0, v1);
            return;
        }
        this.b = arr_v;
    }

    public final b a(b b0) {
        a a0 = this.a;
        if(!a0.equals(b0.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(this.e()) {
            return b0;
        }
        if(b0.e()) {
            return this;
        }
        int[] arr_v = this.b;
        int[] arr_v1 = b0.b;
        if(arr_v.length <= arr_v1.length) {
            int[] arr_v2 = arr_v;
            arr_v = arr_v1;
            arr_v1 = arr_v2;
        }
        int[] arr_v3 = new int[arr_v.length];
        int v = arr_v.length - arr_v1.length;
        System.arraycopy(arr_v, 0, arr_v3, 0, v);
        for(int v1 = v; v1 < arr_v.length; ++v1) {
            arr_v3[v1] = arr_v1[v1 - v] ^ arr_v[v1];
        }
        return new b(a0, arr_v3);
    }

    public final int b(int v) {
        if(v == 0) {
            return this.c(0);
        }
        int[] arr_v = this.b;
        if(v == 1) {
            int v2 = 0;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                v2 ^= arr_v[v1];
            }
            return v2;
        }
        int v3 = arr_v[0];
        for(int v4 = 1; v4 < arr_v.length; ++v4) {
            v3 = this.a.c(v, v3) ^ arr_v[v4];
        }
        return v3;
    }

    public final int c(int v) {
        return this.b[this.b.length - 1 - v];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final b f(int v) {
        a a0 = this.a;
        if(v == 0) {
            return a0.c;
        }
        if(v == 1) {
            return this;
        }
        int[] arr_v = this.b;
        int[] arr_v1 = new int[arr_v.length];
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            arr_v1[v1] = a0.c(arr_v[v1], v);
        }
        return new b(a0, arr_v1);
    }

    public final b g(b b0) {
        a a0 = this.a;
        if(!a0.equals(b0.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(!this.e() && !b0.e()) {
            int[] arr_v = this.b;
            int[] arr_v1 = b0.b;
            int[] arr_v2 = new int[arr_v.length + arr_v1.length - 1];
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    arr_v2[v + v2] ^= a0.c(v1, arr_v1[v2]);
                }
            }
            return new b(a0, arr_v2);
        }
        return a0.c;
    }

    public final b h(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        a a0 = this.a;
        if(v1 == 0) {
            return a0.c;
        }
        int[] arr_v = this.b;
        int[] arr_v1 = new int[v + arr_v.length];
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            arr_v1[v2] = a0.c(arr_v[v2], v1);
        }
        return new b(a0, arr_v1);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.d() * 8);
        int v = this.d();
        while(v >= 0) {
            int v1 = this.c(v);
            if(v1 != 0) {
                if(v1 < 0) {
                    stringBuilder0.append(" - ");
                    v1 = -v1;
                }
                else if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(" + ");
                }
                if(v == 0 || v1 != 1) {
                    a a0 = this.a;
                    if(v1 != 0) {
                        int v2 = a0.b[v1];
                        if(v2 == 0) {
                            stringBuilder0.append('1');
                        }
                        else if(v2 == 1) {
                            stringBuilder0.append('a');
                        }
                        else {
                            stringBuilder0.append("a^");
                            stringBuilder0.append(v2);
                        }
                        goto label_26;
                    }
                    a0.getClass();
                    throw new IllegalArgumentException();
                }
            label_26:
                if(v != 0) {
                    if(v == 1) {
                        stringBuilder0.append('x');
                    }
                    else {
                        stringBuilder0.append("x^");
                        stringBuilder0.append(v);
                    }
                }
            }
            --v;
        }
        return stringBuilder0.toString();
    }
}

