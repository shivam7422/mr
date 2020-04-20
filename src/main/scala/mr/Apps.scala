package mr

class Ram
{
  val s= " shivam "
  println(" My name is " +s)
}
class Shyam extends Ram
{

  def details: Unit =
  {
    val bank= " State bank of india"
    println(" My bank name is " +bank)

  }
}
class  mild extends Shyam
{
  val e= "Kadipur"
  println(" My hometown is " + e)
}
object Apps extends App{

 val e= new mild
  e.details


}
