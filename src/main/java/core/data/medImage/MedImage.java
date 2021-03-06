package core.data.medImage;

import core.data.Data;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Data about medical image, including both pixels data and metadata.
 *
 * <p>Any particular type of medical image should extend MedImage
 */
public abstract class MedImage extends Data implements Cloneable{

    protected List<MedImageAttribute> tags;

    public MedImage(List<MedImageAttribute> tags) {
        this.tags = tags;
    }


    //TODO: (avlomakin) replace byte[][] to BufferedImage
    
    public abstract byte[][] getImagePixels();

    public abstract void setImagePixels(byte[][] pixels);

    protected MedImageAttribute findTag(String tag) {

        //TODO: (avlomakin) read more about java streams (LINQ C#)
        Optional<MedImageAttribute> result = tags.stream().filter(x -> x.tag.equals(tag)).findFirst();
        return result.orElse(null);
    }

    //TODO: (avlomakin) check clone patterns in java
    @Override
    public abstract MedImage clone();

    /**
     * Adds custom attribute to the {@link MedImage}
     * @param attribute attribute to be added
     */
    public abstract void addAttribute(MedImageAttribute attribute);

    /**
     * @return volume of one pixel
     */
    public abstract double getOnePixelVolume();

    /**
     * Checks if image was processed by threshold Algorithm
     * @return check result
     */
    public abstract boolean isThresholdApplied();

    /**
     * Stores information about threshold algorithm applying
     * @param value
     */
    public abstract void setThresholded(boolean value);
}
