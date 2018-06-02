package io.readers;

import java.io.IOException;

public interface IFileReader<T> {

    T readFromFile(String path) throws IOException;
}
