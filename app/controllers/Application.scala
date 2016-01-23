package controllers

import play.api._
import play.api.mvc._
import javax.measure.unit.SI.KILOGRAM
import javax.measure.quantity.Mass
import org.jscience.physics.model.RelativisticModel
import org.jscience.physics.amount.Amount

class Application extends Controller {

  def index = Action {
    RelativisticModel.select()
    val energy = scala.util.Properties.envOrElse("ENERGY", "12 GeV")
    val m = Amount.valueOf(energy).to(KILOGRAM)
    val testRelativity = s"E=mc^2: $energy = $m => Cosmic"
    Ok(views.html.index(testRelativity))
  }

}
