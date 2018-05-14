package com.spodin.resumes.storage;

import com.spodin.resumes.Config;

public class SqlStorageTest extends AbstractStorageTest {

    public SqlStorageTest() {
        super(Config.get().getStorage());
    }
}
