package features.dicomImage.data;

import core.data.medImage.AttributeTagType;
import core.data.medImage.MedImageAttributeMockup;

/**
 * Stores {@link MedImageAttributeMockup} for all well-known DICOM data attributes
 */
public final class DicomAttributes{


    /**
     * todo: (avlomakin) add link to doc
     */
    public static final MedImageAttributeMockup ONE_PIXEL_VOLUME = new MedImageAttributeMockup("onepixelvolume", "(1234, 1234)",
            AttributeTagType.Dicom);

    private DicomAttributes() {}

}

