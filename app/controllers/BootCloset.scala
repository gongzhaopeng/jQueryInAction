package controllers

import play.api.mvc._
import services.Boot

/**
 * Created by mare on 16/2/3.
 */
class BootCloset extends Controller {

  def bootDetails(model: String) = Action {

    val boot = Boot.find(model)
    Ok(views.html.c10.bootDetails(boot))
  }
}
