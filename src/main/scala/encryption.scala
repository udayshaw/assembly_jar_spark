
import DES3._

object encryption {
  def main(args: Array[String]) {
    if(args(0).toString=="e")
        println(encryptKey(args(1).toString))
    else if(args(0).toString=="d")
        println(decryptKey(args(1).toString))
    else
        println("wrong input")
   }
}
