package controllers

import play.api.mvc._
import services.Boot
import play.api.data._
import play.api.data.Forms._

/**
 * Created by mare on 16/2/3.
 */
class BootCloset extends Controller {

  val detailForm = Form (
    single("model" -> nonEmptyText)
  )

  def bootDetail = Action { implicit request =>

    val model = detailForm.bindFromRequest.get

    val boot = Boot.find(model)
    Ok(views.html.c10.bootDetails(boot))
  }
}
