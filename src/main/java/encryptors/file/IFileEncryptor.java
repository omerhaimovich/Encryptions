package encryptors.file;

import java.io.IOException;

public interface IFileEncryptor {
    void encryptFile(String sourceFilePath, String destDirectoryPath) throws IOException;
    void decryptFile(String sourceFilePath, String destDirectoryPath) throws IOException;
}
