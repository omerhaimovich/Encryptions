package encryptions.text;

public class ReverseTextEncyption extends TextEncryption {


    @Override
    public String encrypt(String objectToEncrypt) {
        return new StringBuilder(objectToEncrypt).reverse().toString();
    }

    @Override
    public String decrypt(String objectToDecrypt) {
        return new StringBuilder(objectToDecrypt).reverse().toString();
    }
}
