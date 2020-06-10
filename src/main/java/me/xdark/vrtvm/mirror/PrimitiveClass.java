package me.xdark.vrtvm.mirror;

import me.xdark.vrtvm.JavaValue;

/**
 * Note that these classes will NOT be linked to {@link me.xdark.vrtvm.SystemDictionary}
 */
public final class PrimitiveClass implements JavaClass {
    private final String name;
    private final String internalName;
    private final JavaValue protectionDomain;
    private JavaValue handle;

    public PrimitiveClass(String name, String internalName, JavaValue protectionDomain) {
        this.name = name;
        this.internalName = internalName;
        this.protectionDomain = protectionDomain;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInternalName() {
        return internalName;
    }

    @Override
    public boolean isInstance(JavaValue value) {
        return false;
    }

    @Override
    public boolean isAssignableFrom(JavaClass cls) {
        return cls == this;
    }

    @Override
    public boolean isInterface() {
        return false;
    }

    @Override
    public boolean isArray() {
        return false;
    }

    @Override
    public boolean isPrimitive() {
        return true;
    }

    @Override
    public JavaClass getSuperclass() {
        return null;
    }

    @Override
    public JavaClass[] getInterfaces() {
        return new JavaClass[0];
    }

    @Override
    public JavaClass getComponentType() {
        return null;
    }

    @Override
    public int getModifiers() {
        return 1041;
    }

    @Override
    public JavaValue[] getSigners() {
        return new JavaValue[0];
    }

    @Override
    public void setSigners(JavaValue[] signers) {
    }

    @Override
    public JavaValue[] getEnclosingMethod() {
        return new JavaValue[0];
    }

    @Override
    public JavaClass getDeclaringClass() {
        return null;
    }

    @Override
    public JavaValue getProtectionDomain() {
        return protectionDomain;
    }

    @Override
    public String getGenericSignature() {
        return null;
    }

    @Override
    public byte[] getRawAnnotations() {
        return RAW_ANNOTATIONS;
    }

    @Override
    public byte[] getRawTypeAnnotations() {
        return RAW_ANNOTATIONS;
    }

    @Override
    public JavaValue getConstantPool() {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public JavaValue[] getDeclaredFields(boolean publicOnly) {
        return new JavaValue[0];
    }

    @Override
    public JavaValue[] getDeclaredMethods(boolean publicOnly) {
        return new JavaValue[0];
    }

    @Override
    public JavaValue[] getDeclaredConstructors(boolean publicOnly) {
        return new JavaValue[0];
    }

    @Override
    public JavaClass[] getDeclaredClasses() {
        return new JavaClass[0];
    }

    @Override
    public JavaValue getHandle() {
        return handle;
    }

    @Override
    public void setHandle(JavaValue handle) {
        this.handle = handle;
    }
}