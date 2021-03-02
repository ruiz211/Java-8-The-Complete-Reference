package com.ruiz211.TheJavaLanguage.VIIII.PackagesAndInterfaces.one.two;

import com.ruiz211.TheJavaLanguage.VIIII.PackagesAndInterfaces.one.One;

public class Two extends One {
    @Override
    public String toString() {
        return globalVariable + " " + subClassVariable;
    }
}
