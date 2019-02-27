# Use

Here are some details to help you make use of this repository.

## Sources

Make a new file for sources. The _kind_ should be an `object` rather than a class. Be sure to set the `package` at 
the top of the file.

Example:

Create a new Scala _class_, in `src/main/scala`, for example `Space.scala`, and set the kind to `object`. 
It might look a bit like this.

```scala
package notes

object Space extends App {
  println("Hello")
}
```

This example `Space.scala` file has the package set to `notes`. It contains a top level `object` named `Space`. 
Most of the time you will not want to extend `App`. This was just a simple way to provide a main method for the app.

[Here](https://github.com/monix/minitest) is some additional information.

## Tests

Make a new file for testing a source, for example `SpaceSuite.scala`. The _kind_ should be an `object` This is required for [monix minitest](https://github.com/monix/minitest).
Ensure the package is set the same way as the source file. The object should extend `SimpleTestSuite`. 

It might look something like this.

```scala
package notes
import minitest._

object SpaceSuite extends SimpleTestSuite {
...
}
```

Now we can write a simple test.

```scala
...
object SpaceSuite extends SimpleTestSuite {
  import Space._
  test("should not be") {
        ... //There should be some code here that executes something in `Space.scala`
      assert(1 + 1 != 3)
  }
}
```

You can execute tests using the `sbt shell`. Here are some examples.

- `test` = Run all tests
- `testOnly *SpaceSuite` = Run tests with entity names matching the glob `*SpaceSuite`
- `testQuick` = limits tests to:
  - tests that failed in the previous run
  - tests that were not run before
  - tests that have one or more transitive dependencies, maybe in a different project, recompiled.

`testQuick` can also be limited by a glob. More detail can be found [here](https://www.scala-sbt.org/1.x/docs/Testing.html).

There are additional things that Intellij can to simplify your build-test workflow. Please let me know what you find. 