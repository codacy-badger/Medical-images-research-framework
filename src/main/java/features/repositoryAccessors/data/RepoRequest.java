package features.repositoryAccessors.data;

import core.data.Data;
import core.repository.Repository;

/**
 * Class used by Repository accessors. Contains information about repository and link for request
 */
public class RepoRequest extends Data {

    private String link;

    private Repository repository;

    public RepoRequest(String link, Repository repository) {
        this.link = link;
        this.repository = repository;
    }

    public String getLink() {
        return link;
    }

    public Repository getRepository() {
        return repository;
    }
}
