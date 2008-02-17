package hudson.plugins.findbugs.parser.ant;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Java Bean class to collect project information of a FindBugs run (native
 * format only).
 */
public class ProjectInformation {
    /** All source paths of this project. */
    private final Set<String> paths = new HashSet<String>();

    /**
     * Adds the specified path to the set of source paths.
     *
     * @param path
     *            path to the sources
     */
    public void addSourcePath(final String path) {
        paths.add(path);
    }

    /**
     * Returns the set of source paths.
     *
     * @return the source paths
     */
    public Set<String> getSourcePaths() {
        return Collections.unmodifiableSet(paths);
    }
}
