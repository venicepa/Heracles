package com.yhao.service;

import com.yhao.exception.EasonException;
import com.yhao.interfaces.Storage;

public class EasonStorage implements Storage {

    @Override
    public void close() throws Exception {

    }

    @Override
    public String createEason() throws EasonException {
        return null;
    }

    @Override
    public int modifyEason() throws Exception {
        return 0;
    }
}
