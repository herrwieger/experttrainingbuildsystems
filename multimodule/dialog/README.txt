Modify jdbc.properties to reflect your JDBC configuration.
Modify profile.xml to modify target environment (database, container).

mvn eclipse:eclipse

mvn jetty:run

mvn test


Using with JBoss
 * modify profile.xml
 * run
   
    mvn jboss:deploy

See http://mojo.codehaus.org/jboss-maven-plugin/index.html
