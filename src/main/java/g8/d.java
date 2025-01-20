package g8;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

public abstract class d {
    public static final Type[] a;

    static {
        d.a = new Type[0];
    }

    public static void a(Class class0) {
        int v = class0.getModifiers();
        if(Modifier.isInterface(v)) {
            throw new UnsupportedOperationException("Interface can\'t be instantiated! Interface name: " + class0.getName());
        }
        if(Modifier.isAbstract(v)) {
            throw new UnsupportedOperationException("Abstract class can\'t be instantiated! Class name: " + class0.getName());
        }
    }

    public static Type b(Type type0) {
        if(type0 instanceof Class) {
            return ((Class)type0).isArray() ? new a(d.b(((Class)type0).getComponentType())) : ((Class)type0);
        }
        if(type0 instanceof ParameterizedType) {
            return new b(((ParameterizedType)type0).getOwnerType(), ((ParameterizedType)type0).getRawType(), ((ParameterizedType)type0).getActualTypeArguments());
        }
        if(type0 instanceof GenericArrayType) {
            return new a(((GenericArrayType)type0).getGenericComponentType());
        }
        return type0 instanceof WildcardType ? new c(((WildcardType)type0).getUpperBounds(), ((WildcardType)type0).getLowerBounds()) : type0;
    }

    public static void c(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(Type type0) {
        d.c(!(type0 instanceof Class) || !((Class)type0).isPrimitive());
    }

    public static boolean e(Type type0, Type type1) {
        if(type0 == type1) {
            return true;
        }
        if(type0 instanceof Class) {
            return type0.equals(type1);
        }
        if(type0 instanceof ParameterizedType) {
            if(!(type1 instanceof ParameterizedType)) {
                return false;
            }
            Type type2 = ((ParameterizedType)type0).getOwnerType();
            Type type3 = ((ParameterizedType)type1).getOwnerType();
            return (type2 == type3 || type2 != null && type2.equals(type3)) && ((ParameterizedType)type0).getRawType().equals(((ParameterizedType)type1).getRawType()) && Arrays.equals(((ParameterizedType)type0).getActualTypeArguments(), ((ParameterizedType)type1).getActualTypeArguments());
        }
        if(type0 instanceof GenericArrayType) {
            return type1 instanceof GenericArrayType ? d.e(((GenericArrayType)type0).getGenericComponentType(), ((GenericArrayType)type1).getGenericComponentType()) : false;
        }
        if(type0 instanceof WildcardType) {
            return type1 instanceof WildcardType ? Arrays.equals(((WildcardType)type0).getUpperBounds(), ((WildcardType)type1).getUpperBounds()) && Arrays.equals(((WildcardType)type0).getLowerBounds(), ((WildcardType)type1).getLowerBounds()) : false;
        }
        return type0 instanceof TypeVariable && type1 instanceof TypeVariable ? ((TypeVariable)type0).getGenericDeclaration() == ((TypeVariable)type1).getGenericDeclaration() && ((TypeVariable)type0).getName().equals(((TypeVariable)type1).getName()) : false;
    }

    public static Type f(Type type0, Class class0, Class class1) {
        if(class1 == class0) {
            return type0;
        }
        if(class1.isInterface()) {
            Class[] arr_class = class0.getInterfaces();
            for(int v = 0; v < arr_class.length; ++v) {
                Class class2 = arr_class[v];
                if(class2 == class1) {
                    return class0.getGenericInterfaces()[v];
                }
                if(class1.isAssignableFrom(class2)) {
                    return d.f(class0.getGenericInterfaces()[v], arr_class[v], class1);
                }
            }
        }
        if(!class0.isInterface()) {
            while(class0 != Object.class) {
                Class class3 = class0.getSuperclass();
                if(class3 == class1) {
                    return class0.getGenericSuperclass();
                }
                if(class1.isAssignableFrom(class3)) {
                    return d.f(class0.getGenericSuperclass(), class3, class1);
                }
                class0 = class3;
            }
        }
        return class1;
    }

    public static Class g(Type type0) {
        if(type0 instanceof Class) {
            return (Class)type0;
        }
        if(type0 instanceof ParameterizedType) {
            Type type1 = ((ParameterizedType)type0).getRawType();
            d.c(type1 instanceof Class);
            return (Class)type1;
        }
        if(type0 instanceof GenericArrayType) {
            return Array.newInstance(d.g(((GenericArrayType)type0).getGenericComponentType()), 0).getClass();
        }
        if(type0 instanceof TypeVariable) {
            return Object.class;
        }
        if(!(type0 instanceof WildcardType)) {
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type0 + "> is of type " + (type0 == null ? "null" : type0.getClass().getName()));
        }
        return d.g(((WildcardType)type0).getUpperBounds()[0]);
    }

    public abstract Object h(Class arg1);

    public static Type i(Type type0, Class class0, Type type1, HashSet hashSet0) {
        while(type1 instanceof TypeVariable) {
            TypeVariable typeVariable0 = (TypeVariable)type1;
            if(hashSet0.contains(typeVariable0)) {
                return type1;
            }
            hashSet0.add(typeVariable0);
            GenericDeclaration genericDeclaration0 = typeVariable0.getGenericDeclaration();
            Class class1 = genericDeclaration0 instanceof Class ? ((Class)genericDeclaration0) : null;
            if(class1 != null) {
                Type type2 = d.f(type0, class0, class1);
                if(type2 instanceof ParameterizedType) {
                    TypeVariable[] arr_typeVariable = class1.getTypeParameters();
                    int v1 = 0;
                    while(v1 < arr_typeVariable.length) {
                        if(typeVariable0.equals(arr_typeVariable[v1])) {
                            type1 = ((ParameterizedType)type2).getActualTypeArguments()[v1];
                            goto label_21;
                        }
                        ++v1;
                    }
                    throw new NoSuchElementException();
                }
            }
            type1 = typeVariable0;
        label_21:
            if(type1 == typeVariable0) {
                return type1;
            }
            if(false) {
                break;
            }
        }
        if(type1 instanceof Class && ((Class)type1).isArray()) {
            Class class2 = ((Class)type1).getComponentType();
            Type type3 = d.i(type0, class0, class2, hashSet0);
            return class2 != type3 ? new a(type3) : ((Class)type1);
        }
        if(type1 instanceof GenericArrayType) {
            Type type4 = ((GenericArrayType)type1).getGenericComponentType();
            Type type5 = d.i(type0, class0, type4, hashSet0);
            return type4 != type5 ? new a(type5) : ((GenericArrayType)type1);
        }
        if(type1 instanceof ParameterizedType) {
            Type type6 = ((ParameterizedType)type1).getOwnerType();
            Type type7 = d.i(type0, class0, type6, hashSet0);
            boolean z = type7 != type6;
            Type[] arr_type = ((ParameterizedType)type1).getActualTypeArguments();
            for(int v = 0; v < arr_type.length; ++v) {
                Type type8 = d.i(type0, class0, arr_type[v], hashSet0);
                if(type8 != arr_type[v]) {
                    if(!z) {
                        arr_type = (Type[])arr_type.clone();
                        z = true;
                    }
                    arr_type[v] = type8;
                }
            }
            return z ? new b(type7, ((ParameterizedType)type1).getRawType(), arr_type) : ((ParameterizedType)type1);
        }
        if(type1 instanceof WildcardType) {
            type1 = (WildcardType)type1;
            Type[] arr_type1 = ((WildcardType)type1).getLowerBounds();
            Type[] arr_type2 = ((WildcardType)type1).getUpperBounds();
            if(arr_type1.length == 1) {
                Type type9 = d.i(type0, class0, arr_type1[0], hashSet0);
                if(type9 != arr_type1[0]) {
                    if(type9 instanceof WildcardType) {
                        Type[] arr_type3 = ((WildcardType)type9).getLowerBounds();
                        return new c(new Type[]{Object.class}, arr_type3);
                    }
                    return new c(new Type[]{Object.class}, new Type[]{type9});
                }
            }
            else if(arr_type2.length == 1) {
                Type type10 = d.i(type0, class0, arr_type2[0], hashSet0);
                if(type10 != arr_type2[0]) {
                    return type10 instanceof WildcardType ? new c(((WildcardType)type10).getUpperBounds(), d.a) : new c(new Type[]{type10}, d.a);
                }
            }
        }
        return type1;
    }

    // Deobfuscation rating: LOW(20)
    public static String j(Type type0) {
        return type0 instanceof Class ? ((Class)type0).getName() : type0.toString();
    }
}

