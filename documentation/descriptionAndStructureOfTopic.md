# Description and structure of topic

**HyperWeiqi** is open-source go software.

**HyperWeiqi** provides the following game modes:
* human vs. human (hotseat)
* human vs. AI
* AI vs. AI

**HyperWeiqi** is written in Java and compiles with Maven.

The code of HyperWeiqi project is organized as follows:

* hyperweiqi (root package)
  * Main.java (Main class).
* hyperweiqi.ai (contains AI classes)
* hyperweiqi.domain (contains game entities)
  * Player.java
  * Stone.java
* hyperweiqi.logic (contains game logic)
* hyperweiqi.ui (contains UI classes)
  * Cli.java (contains command line interface)
  * Gui.java (contains graphical user interface)
  * Ui.java (a Java interface which HyperWeiqi interface classes implement).

Copyright (C) 2017 Antti Nuortimo.
