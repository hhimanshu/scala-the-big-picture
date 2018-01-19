object Math {
  def sum(a: Int, b: Int): Int = a + b
  def getPrivateMember: Int = new Math().max
}

class Math {
  private val max = 100
}
