package encryptions.text;

import encryptions.IEncryption;

public abstract class TextEncryption implements IEncryption<String> {

    public abstract String encrypt(String objectToEncrypt);
    public abstract String decrypt(String objectToDecrypt);
}
