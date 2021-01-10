def printMsg(first: Int, msg: String){
  val ret = msg * first
  println(ret)
  ret
}
val message = printMsg(3, "abc")

print(message)