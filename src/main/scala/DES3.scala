import org.apache.commons.codec.binary.Base64
import crypto._
import protocol.defaults._
  
object DES3 extends App {

  def encodeBase64(bytes: Array[Byte]) = Base64.encodeBase64String(bytes)
  def encryptKey(key : String): String = {
    encodeBase64(DES.encrypt(key.getBytes("UTF-8"), "01234567"))  //8bit key is required
  }

  def decryptKey(key : String): String = {
   new String(DES.decrypt(Base64.decodeBase64(key.getBytes("UTF-8")),"01234567"))
  }

}
