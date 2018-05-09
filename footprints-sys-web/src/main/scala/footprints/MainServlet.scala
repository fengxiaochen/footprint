package footprints

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport
import org.slf4j.LoggerFactory

class MainServlet extends ScalatraServlet with ScalateSupport {
  val logger = LoggerFactory.getLogger(getClass)
  before() {
    contentType = "text/html"
  }

  get("/") {
    layoutTemplate("/WEB-INF/templates/views/index.ssp")
  }

}