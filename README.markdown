# standalone-war Readme

## Introduction

standalone-war is a [Gradle](http://gradle.org/) build that will help you repackage an ordinary Java webapp together with an embedded web-server, [Jetty](http://jetty.codehaus.org/jetty/) in our case. Starting a webapp will be as easy as typing `java -jar yourapp-standalone.war` when you're done.

## Getting Started

### Prerequisites & Setup

1. Download and install Gradle 0.8 or later (instructions [here](http://gradle.org/installation.html))
2. Download `build.gradle` from [GitHub](https://github.com/xlson/standalone-war/raw/master/build.gradle) and put it into your directory of choice

### Usage

If you've followed the previous steps you should be good to go. Run the following from the directory where you put the build:

    gradle -PinWar=/path/to/webapp.war

Running the above command will create the repackaged war in `build/webapp-standalone.war`. If you would like to be able to run the build without specifying the parameters every time you can create a `gradle.properties` file in the same folder as the `build.war`. Like this:

    inWar=/path/to/webapp.war
    outWar=build/my-standalone.war

You can also configure where you'd like to put the repackaged war using the `outWar` parameter as in the previous example. Running the war should now be possible by calling `java -jar my-standalone.war`. The war can still be deployed to your normal Java web-server of choice ([Tomcat](http://tomcat.apache.org/) for example).

## Disclaimer

This project has been live since the end of 2009 without any complaints so it should probably work in most cases. Still, it's in no way heavily tested and it might not work for you. Feel free to [create an issue](https://github.com/xlson/standalone-war/issues) here on GitHub if you have any problems as that will help me iron out any bugs.

Also, I can't do any magic with your war, if it doesn't work in Jetty or have an external dependency on MySQL that will stay the same. I originally created this build to be used with Qanban (a digital Kanban board) which was written in Grails and uses HSQLDB. More information about QANBAN here http://code.qbranch.se/ and here http://github.com/qbranchcode/Qanban

## Plans for the future

I'd like to break standalone-war out into 4 components as follows:

1. A project for the starter source [DONE]
2. A Gradle plugin
3. The old (non-plugin) Gradle build [DONE]
4. A [Grails](http://grails.org/) plugin
