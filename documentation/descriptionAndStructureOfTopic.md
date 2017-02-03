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

Go is played one move at a time. If players play without a handicap,
black begins the game. If players have different skill levels on go,
a handicap may be used. The player who gets the handicap will play on
white stones. The opponent (black) gets a some black stones as her/his
first move to fixed locations depending on the number of handicap
stones. The number of handicap stones can be from 2 to 9. After placing
the handicap stones, white playes her/his first move, and from that
point on game continues exactly the same way as when played without
a handicap.



Copyright (C) 2017 Antti Nuortimo.
