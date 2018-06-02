package io.readers.image;

import attributes.CompatibleFiles;
import io.readers.IFileReader;
import io.writers.IFileWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@CompatibleFiles({"jpg", "png"})
public class IOImageFileReader implements IFileReader<BufferedImage> {

    @Override
    public BufferedImage readFromFile(String path) throws IOException {
        return ImageIO.read(new File(path));
    }
}
