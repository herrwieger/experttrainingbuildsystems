# Einführung #

Auf dieser Seite schauen wir Maven 2 unter die Motorhaube.

# Wichtige Kernklassen & Methoden #

  * ReactorManager
  * MavenSession
  * MavenCli
  * DefaultPluginManager
  * ArtifactResolver
  * DefaultArtifactResolver
    * #resolveTransitively
  * LifecycleExecutor
  * DefaultLifecycleExecutor
    * #executeTaskSegments
    * #executeGoals
  * PluginManager
  * DefaultPluginManager
    * #resolveTransitiveDependencies

  * CompilerMojo

# Wichtige Konfigurationsdateien #

  * maven-core\src\main\resources\META-INF\plexus\components.xml. Hier sind die default Lifecycles und Phasen definiert.

# Maven starten #

```
java org.codehaus.classworlds.Launcher -Dclassworlds.conf=C:/Work/Home/build_systems/maven-2.0.8-src/maven-core/src/bin/m2.conf -Dmaven.home=C:/Temp/apache-maven-2.0.8
```