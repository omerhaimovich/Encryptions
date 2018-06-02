package io.writers.image;

import attributes.CompatibleFiles;
import io.writers.IFileWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@CompatibleFiles({"jpg", "png"})
public class IOImageFileWriter implements IFileWriter<BufferedImage> {


    @Override
    public void WriteToFile(BufferedImage object, String path) throws IOException {
        ImageIO.write(object, path.split(".")[path.split(".").length - 1], new File(path));
    }
}
