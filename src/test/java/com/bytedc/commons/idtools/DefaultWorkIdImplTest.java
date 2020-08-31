package com.bytedc.commons.idtools;

import org.junit.Test;

public class DefaultWorkIdImplTest {

    @Test
    public void getWorkId() {
        DefaultWorkIdImpl defaultWorkId = new DefaultWorkIdImpl();
        int workId = defaultWorkId.getWorkId();
        System.out.println(workId);
    }
}