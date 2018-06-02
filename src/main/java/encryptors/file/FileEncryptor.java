package encryptors.file;


import encryptions.IEncryption;
import io.readers.IFileReader;
import io.writers.IFileWriter;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileEncryptor<T> implements IFileEncryptor {

    private IFileReader<T> fileReader;
    private IFileWriter<T> fileWriter;
    private IEncryption<T>[] encryptions;

    public FileEncryptor(IFileReader<T> fileReader, IFileWriter<T> fileWriter, IEncryption<T>... encryptions)
    {
        this.encryptions = encryptions;
        this.fileWriter = fileWriter;
        this.fileReader = fileReader;
    }


    public void encryptFile(String sourceFilePath, String destDirectoryPath) throws IOException {
        T objectToEncrypt = fileReader.readFromFile(sourceFilePath);
        T result = objectToEncrypt;

        for (IEncryption<T> encryption : encryptions) {
            result  = encryption.encrypt(objectToEncrypt);
        }

        fileWriter.WriteToFile(result, destDirectoryPath);
    }

    public void decryptFile(String sourceFilePath, String destDirectoryPath) throws IOException {
        T objectToDecrypt = fileReader.readFromFile(sourceFilePath);
        T result = objectToDecrypt;
        List<IEncryption<T>> reverseEncryptions = Arrays.asList(encryptions);
        Collections.reverse(reverseEncryptions);

        for (IEncryption<T> encryption : reverseEncryptions) {
            result  = encryption.decrypt(objectToDecrypt);
        }

        fileWriter.WriteToFile(result, destDirectoryPath);
    }
}
