package io.writers;

import java.io.IOException;

public interface IFileWriter<T> {

    void WriteToFile(T object, String path) throws IOException;

}
