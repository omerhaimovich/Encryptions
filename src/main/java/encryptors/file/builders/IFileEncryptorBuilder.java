package encryptors.file.builders;

import enums.FileClassification;
import encryptors.file.IFileEncryptor;

public interface IFileEncryptorBuilder {
    IFileEncryptor buildEncryptor(String suffix, FileClassification fileType);
}
