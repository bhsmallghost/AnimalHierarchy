# AnimalHierarchy - Unit Test File - Solution.java
AQ1 - go for the simplest way based on requirements

AQ2 - kind of messy with different animal behaviours inheriting
- restructure into different folders indicating Animal Class and Object

AQ3 - use interface instead of inheritance
- standardize all sounds input with a Animal Type

AQ4 - Introduce Parrot "stayWith" variables across the Animal Objects that is in requirements


BQ1 - Classified Fish as an Animal Class.
- Design Fish to inherit from Bird due to the various behaviours exists in Bird

BQ2 - Model Shark and ClownFish under Animal Object
- Debug relevant Bird sub-class.

BQ3 - Dolphins inherits directly from Bird's swim function


DQ1 - Butterfly inherits directly from Bird to reduce overhead

DQ2 - Introduce different "stage" in Butterfly to cater for metamorphosis
- Caterpillar is a standalone class which has the function to alter the stage of Butterfly


EQ1 - There is no frog (suppose that's for the "missing" section "C")
- Bird is categorized as Class, so it will not be counted
- Introduce an super class AnimalAbilityCount on top of main ability classes - Animal and Bird, to do the counting