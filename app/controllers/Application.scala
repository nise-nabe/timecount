package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }

  def timecount = Action {
    var list = List[Tuple2[Int,String]]()
    list = (1, "string") :: list
    Ok(views.html.timecount(list))
  }
  
}
