In [Pragmatic Project Automation](http://www.pragprog.com/titles/auto) erläutert der Autor folgende Eigenschaften eines Builds:
**Complete** Repeatable
**Informative** Schedulable
**Portable**

# Complete #

Vollständig heißt, keine manuellen Schritte. Keine Dateien aus irgendwelchen Tools manuell generieren müssen.

# Repeatable #

In Zusammenhang mit den Konfigurationsmanagement lässt sich ein beliebiger integrer Stand auschecken, der build aufrufen und jedesmal kommt das selbe Ergebnis heraus.

# Informative #

Informativ heisst, als Bestandteil des builds werden wichtige Aussagen zum "Gesundheitszustand" der Software ermittelt. Elementar ist dabei das Thema automatisierte Tests. Scheitert ein build, dann kann ein informativer Build gezielt Auskunft zu dem zugrundeliegenden Problem geben.

# Schedulable #

Gehört in den Themenbereich Continuos Integration. Ausgangsbedingung für Schedulable ist Complete und Repeatable.

# Portable #

Portabel heisst, der build läuft auf jeder Maschine. Nicht nur auf dem liebevoll zurecht konfigurierten Build-Server, sondern auf jedem Rechner von jedem Entwickler.