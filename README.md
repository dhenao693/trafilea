# Gradle Project Setup

This README file contains the necessary information for setting up and executing your Gradle project, specifically for the task `gradle clean build test`. We also recommend using Gradle version 7.0 and provide instructions for changing the default Firefox browser configuration to run your project with Chrome or Edge.

## Commands

- `gradle clean build test`: Executes the Gradle build tasks, cleans, compiles, and tests your project.

## Recommendations

- Use Gradle version 7.0 for compatibility and optimal performance.

## Default Configuration

By default, the project is configured to run in Firefox. You can change the browser by following the instructions in the [Changing Browser Configuration](#changing-browser-configuration) section.

## Changing Browser Configuration

1. Open the `serenity.properties` file in the `src/test/resources` directory.
2. Uncomment the desired browser configuration (Chrome, Edge) by removing the leading `#`.
3. Comment the currently active line (Firefox) by adding a leading `#`.

## Updating Drivers

In some cases, the driver version used by Serenity's DriverManager may not be compatible with the chosen browser. If that happens, you need to update the drivers in the `src/test/resources/drivers` directory.

1. Download and save the compatible driver version for your chosen browser.
2. Open the `serenity.properties` file in the `src/test/resources` directory.
3. Uncomment the driver property for your chosen browser by removing the leading `#`.