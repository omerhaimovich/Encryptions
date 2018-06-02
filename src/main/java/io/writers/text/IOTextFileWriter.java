package io.writers.text;

import attributes.CompatibleFiles;
import io.writers.IFileWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@CompatibleFiles({"txt", "nfo"})
public class IOTextFileWriter implements IFileWriter<String> {
    public void WriteToFile(String object, String path) throws IOException {
        Files.write(Paths.get(path), object.getBytes(), StandardOpenOption.CREATE);
    }
}
