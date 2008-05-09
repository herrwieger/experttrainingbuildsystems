package de.softwareexperts.buildit;

import org.buildng.defaults.Defaults;
import org.buildng.model.LibraryScope;
import org.buildng.model.Model;
import org.buildng.model.Project;


public class Build {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Model fModel = Defaults.createDefaultModel("..", "buildng");

        Project applicationProject =
            fModel.createProject("application")
                .addDependency("junit", "junit", "4.4", LibraryScope.TEST);

        Project domainProject =
            fModel.createProject("domain")
                .addDependency("junit", "junit", "3.8.1", LibraryScope.TEST)
                .addDependency("commons-lang", "commons-lang", "2.3")
                .addDependency("commons-collections", "commons-collections", "3.2")
                .addDependency("log4j", "log4j", "1.2.14");

        Project moneyProject =
            fModel.createProject("money")
                .addDependency("junit", "junit", "3.8.1", LibraryScope.TEST);

        applicationProject
            .addDependency(domainProject)
            .addDependency(moneyProject);
    }
}
