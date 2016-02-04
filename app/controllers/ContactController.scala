package controllers

import play.api.mvc._
import play.api.libs.json._

/**
 * Created by mare on 16/2/4.
 */
class ContactController extends Controller {

  def submit = Action { implicit request =>

    val data = request.body.asFormUrlEncoded.get
    val partial = data.get("partial").fold(false)(_ => true)
    val name = data.get("name").map(_.mkString)
    val email = data.get("email").map(_.mkString)
    val subject = data.get("subject").map(_.mkString)
    val message = data.get("message").map(_.mkString)

    var status = ""
    var msg = ""
    var info = Json.arr()

    checkField("Full name", name, partial).foreach { msg =>

      info :+= Json.obj("field" -> "name", "message" -> msg)
    }

    checkField("Email", email, partial).foreach { msg =>

      info :+= Json.obj("field" -> "email", "message" -> msg)
    }

    checkField("Subject", subject, partial).foreach { msg =>

      info :+= Json.obj("field" -> "subject", "message" -> msg)
    }

    checkField("Message", message, partial).foreach { msg =>

      info :+= Json.obj("field" -> "message", "message" -> msg)
    }

    if (info.value.length > 0) {

      status = "error"
      msg = errors
    } else {

      status = "success"
      if (!partial) msg = success(name.getOrElse("unknown"))
    }

    Ok(
      Json.obj(
        "status" -> status,
        "message" -> msg,
        "info" -> info)
    )
  }

  private def checkField(field: String, value: Option[String], partial: Boolean) = {

    val minLength = 4;

    if (!partial && value.get.isEmpty)
      Some(required(field))
    else if ((!partial || value.isDefined) && value.get.length < minLength)
      Some(short(field, minLength))
    else
      None
  }

  private def required(field: String) =
    s"The field $field is required"

  private def invalid(field: String) =
    s"The field $field is invalid"

  private val errors =
    "Please fix the errors in the form to continue"

  private def generic(name: String) =
    s"An error has occurred and your message has not been delivered. Try later $name"

  private def short(field: String, minLength: Int) =
    s"The value of the field $field is too short. It must have at least $minLength characters"

  private def success(name: String) =
    s"Thank you for your message $name. It has been successfully sent"
}
