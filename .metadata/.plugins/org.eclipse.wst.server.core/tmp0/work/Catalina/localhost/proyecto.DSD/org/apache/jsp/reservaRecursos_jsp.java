/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-07-14 05:38:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservaRecursos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1436851731000L));
    _jspx_dependants.put("/headfile.jsp", Long.valueOf(1436852098000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Quick Win</title>\r\n");
      out.write("\t");
      out.write("<link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"vendor/bootstrap/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"styles/main.css\" rel=\"stylesheet\">\n");
      out.write("<script defer src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background:#999999\">\r\n");
      out.write("\t");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Actualizar <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"actualizarTrabajador.jsp\">Trabajador</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"actualizarHabilidad.jsp\">Habilidad por Proyecto</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Consultar Trabajador <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"consultarTrabajadorxEstado.jsp\">Por Estado</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"consultarTrabajadorProy.jsp\">Por Proyecto</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"reservaRecursos.jsp\">Reserva de Recursos</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Cerrar Session</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td></td>   <td> Reservar Recurso\t  </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Buscar Recurso</td>   <td> <a  href=\"modalBuscarRecurso.jsp\" > Ingresar</a>\t  </td>   <td>     </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Solicitud</td>   <td> <input  type=\"text\" value=\"S0001\" >\t  </td>   <td>     </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Recurso</td>   <td> <input  type=\"text\" value=\"Alberto Ortega\" >\t  </td>   <td>     </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Cantidad Horas</td>   <td> <input  type=\"text\" value=\"\" >\t  </td>   <td>     </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td> Fecha Inicio </td>\r\n");
      out.write("\t\t<td> <input  type=\"button\" value=\"..........\" >\t  </td>   <td>     </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td> Fecha Fin </td>\r\n");
      out.write("\t\t<td> <input  type=\"button\" value=\"..........\" >\t  </td>   <td>     </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Detalle</td>   <td> <textarea rows=\"\" cols=\"\"></textarea>\t  </td>   <td>     </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Perfil</td>   <td> <input  type=\"text\" value=\"Analista Programador\" >\t  </td>   <td>  <a  href=\"reservaRecursos.jsp\" >Generar Reserva</a>   </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
