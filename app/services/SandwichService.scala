package services

import models.Sandwich
import com.google.inject.ImplementedBy

class RealSandwichService extends SandwichService {

  override def sandwiches(): List[Sandwich] = List()
}

@ImplementedBy(classOf[RealSandwichService])
trait SandwichService {
  def sandwiches() : List[Sandwich]
}