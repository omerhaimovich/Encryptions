package encryptions.image;

import encryptions.IEncryption;
import java.awt.image.BufferedImage;

public abstract class ImageEncryption implements IEncryption<BufferedImage> {
    public abstract BufferedImage encrypt(BufferedImage objectToEncrypt);
    public abstract BufferedImage decrypt(BufferedImage objectToDecrypt);
}
