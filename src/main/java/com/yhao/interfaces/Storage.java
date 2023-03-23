package com.yhao.interfaces;

import com.yhao.exception.EasonException;
import org.springframework.lang.NonNull;

public interface Storage extends AutoCloseable{

    @NonNull
    String createEason() throws EasonException;

    @NonNull
    int modifyEason() throws Exception;
}
