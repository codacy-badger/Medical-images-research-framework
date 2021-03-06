package core.repository;

import core.data.medImage.ImageSeries;

/**
 * Provides method for repository interaction. To access your data storage,
 * use one of the implementations or create custom implementation
 */
public interface Repository {
    ImageSeries getImageSeries(String link);
}
