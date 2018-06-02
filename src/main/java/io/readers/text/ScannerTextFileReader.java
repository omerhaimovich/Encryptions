package io.readers.text;

import attributes.CompatibleFiles;
import io.readers.IFileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

@CompatibleFiles({"txt", "nfo"})
public class ScannerTextFileReader implements IFileReader<String> {
    public String readFromFile(String path) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileInputStream(path));

        StringBuilder strBuilder = new StringBuilder();

        while(scanner.hasNextLine())
            strBuilder.append(scanner.nextLine());

        return strBuilder.toString();
    }
}
