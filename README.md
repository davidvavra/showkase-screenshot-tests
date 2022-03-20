# showkase-screenshot-tests
Sample app for integration between Showkase library and Facebook's screenshot testing library

## Shot integration

This branch displays how to integrate the [Shot](https://github.com/pedrovgs/Shot) library with
Showkase. It will run a screenshot comparison for all previews in the project.

### Useful commands:

The first time, you probably want to record the screenshots so you have a base reference to compare.
To do so, run `./gradlew executeScreenshotTests -Precord`.

After that, in an ongoing basis you can run `./gradlew executeScreenshotTests` to compare the current
status of your views with the reference screenshots.

More info and other useful commands can be found in [Shot](https://github.com/pedrovgs/Shot) docs. 
