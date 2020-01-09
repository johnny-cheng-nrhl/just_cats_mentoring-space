import minitest.SimpleTestSuite

object MySemigroupalTestSuite extends SimpleTestSuite {
  import notes.MySemigroupal._

  test("Tuple can construct in different ways") {
    assertEquals(tuple3, tuple3Apply)
  }

  test("Cat with None field becomes None") {
    assertEquals(None, catOpt)
  }
}
