package mr

class Ram
{
  val s= " shivam "
  println(" My name is " +s)
}
class Mohan extends Ram
{

  def details: Unit =
  {
    val es= " Shivam Tiwari"
    println(" My full name is " +es)

  }

}
object Apps extends App{

 val e= new Mohan
  e.details


}
