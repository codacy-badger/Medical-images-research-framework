package features.dicomImage;

import core.data.medImage.MedImageAttribute;

/**
 * Manages DICOM attributes creation
 */
public final class DicomAttributeCreator {

    private DicomAttributeCreator() {

    }

    /**
     * Creates DICOM data attribute
     * @param tag attribute tag  - (XXXX,XXXX) with hexadecimal numbers
     * @param name attribute name
     * @param value attribute value
     * @return created attribute for Dicom format
     */
    public static MedImageAttribute createDicomAttribute(String tag, String name, Object value)
    {
        if(!isDicomTag(tag))
            throw new IllegalArgumentException("tag");

        return new MedImageAttribute(name, tag, value);
    }


    private static boolean isDicomTag(String tag) {

        if (tag == null || tag.isEmpty())
            return false;

        String pattern = "^[(][0-9a-fA-F]{4}[,][0-9a-fA-F]{4}[)]$";
        return tag.matches(pattern);
    }

}
