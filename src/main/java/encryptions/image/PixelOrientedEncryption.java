package encryptions.image;

import java.awt.image.BufferedImage;

public abstract class PixelOrientedEncryption extends ImageEncryption {

    @Override
    public BufferedImage encrypt(BufferedImage objectToEncrypt) {

        for (int widthIndex = 0; widthIndex < objectToEncrypt.getWidth(); widthIndex++) {
            for (int heightIndex = 0; heightIndex < objectToEncrypt.getHeight(); heightIndex++) {
                encryptPixel(widthIndex, heightIndex, objectToEncrypt);
            }
        }
        
        return objectToEncrypt;
    }

    @Override
    public BufferedImage decrypt(BufferedImage objectToDecrypt) {
        for (int widthIndex = 0; widthIndex < objectToDecrypt.getWidth(); widthIndex++) {
            for (int heightIndex = 0; heightIndex < objectToDecrypt.getHeight(); heightIndex++) {
                decryptPixel(widthIndex, heightIndex, objectToDecrypt);
            }
        }

        return objectToDecrypt;
    }



    public abstract void encryptPixel(int widthIndex, int heightIndex, BufferedImage image);
    public abstract void decryptPixel(int widthIndex, int heightIndex, BufferedImage image);
}
