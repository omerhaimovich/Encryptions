package encryptions.text;

public class CeasarTextEncryption extends TextEncryption{

    private int shift;

    public CeasarTextEncryption(int shift)
    {
        this.shift = shift;
    }


    public String encrypt(String objectToEncrypt) {

        StringBuilder strBuilder = new StringBuilder();

        for (char character : objectToEncrypt.toCharArray()) {
            strBuilder.append((char)(character + shift));
        }


        return strBuilder.toString();
    }

    public String decrypt(String objectToDecrypt) {
        StringBuilder strBuilder = new StringBuilder();

        for (char character : objectToDecrypt.toCharArray()) {
            strBuilder.append((char)(character - shift));
        }


        return strBuilder.toString();
    }
}
