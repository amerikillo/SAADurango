package org.apache.jsp.facturacion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.sql.ResultSet;
import conn.*;

public final class verIFIQ_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/facturacion/../jspf/menuPrincipal.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
java.text.DateFormat df = new java.text.SimpleDateFormat("yyyyMMddhhmmss"); 
      out.write('\n');
java.text.DateFormat df2 = new java.text.SimpleDateFormat("yyyy-MM-dd"); 
      out.write('\n');
java.text.DateFormat df3 = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
      out.write('\n');

    DecimalFormat formatter = new DecimalFormat("#,###,###");
    DecimalFormatSymbols custom = new DecimalFormatSymbols();
    custom.setDecimalSeparator('.');
    custom.setGroupingSeparator(',');
    formatter.setDecimalFormatSymbols(custom);
    HttpSession sesion = request.getSession();
    String usua = "";
    String tipo = "";
    if (sesion.getAttribute("nombre") != null) {
        usua = (String) sesion.getAttribute("nombre");
        tipo = (String) sesion.getAttribute("Tipo");
    } else {
        response.sendRedirect("../index.jsp");
    }
    ConectionDB con = new ConectionDB();


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Estilos CSS -->\n");
      out.write("        <link href=\"../css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/cupertino/jquery-ui-1.10.3.custom.css\" />\n");
      out.write("        <link href=\"../css/navbar-fixed-top.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/dataTables.bootstrap.css\">\n");
      out.write("        <!---->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SIALSS</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container\">\n");
      out.write("        <h1>SIALSS</h1>\n");
      out.write("\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');


      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar-default\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                <span clss=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"/SAADurango/main_menu.jsp\">Inicio</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-collapse collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Entradas<b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        ");

                            if (tipo.equals("2") || tipo.equals("3") || tipo.equals("1")) {
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li><a href=\"/SAADurango/captura.jsp\">Entrada Manual</a></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/compraAuto2.jsp\">Entrada Automática OC</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/hh/compraAuto3.jsp\">HANDHELD | Entrada Automática OC</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li-->\r\n");
      out.write("                            ");

                                }
                                if (tipo.equals("2") || tipo.equals("3") || tipo.equals("5")) {
                            
      out.write("\r\n");
      out.write("                        <li><a href=\"/SAADurango/verificarCompraAuto.jsp\">Verificar Remisión</a></li>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        <li><a href=\"#\" onclick=\"window.open('/SAADurango/reimpresion.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Reimpresión de Remisiones</a></li>\r\n");
      out.write("                        <li><a href=\"#\"  onclick=\"window.open('/SAADurango/ordenesCompra.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Órdenes de Compras</a></li>\r\n");
      out.write("                        <li><a href=\"#\"  onclick=\"window.open('/SAADurango/kardexClave.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Kardex Claves</a></li>\r\n");
      out.write("                        <li><a href=\"#\"  onclick=\"window.open('/SAADurango/hh/ubicacionesConsultas.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Ubicaciones</a></li>\r\n");
      out.write("                        <!--li><a href=\"#\"  onclick=\"window.open('/SAADurango/creaMarbetes.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Generar Marbetes</a></li-->\r\n");
      out.write("\r\n");
      out.write("                        ");

                            if (tipo.equals("5") || tipo.equals("3")) {
                        
      out.write("\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/hh/insumoNuevoRedist.jsp\">Redistribución HH</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                            ");

                                if (usua.equals("oscar")) {
                            
      out.write("\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\"  onclick=\"window.open('/SAADurango/devolucionesInsumo.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Cambio Físico</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        <!--li><a href=\"#\"  onclick=\"window.open('/SAADurango/modula/avisosIngreso.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Modula - Avisos de Ingreso</a></li>\r\n");
      out.write("                        <!--li><a href=\"#\"  onclick=\"window.open('/SAADurango/Ubicaciones/index_Marbete_resto.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Marbete de Resto</a></li-->\r\n");
      out.write("                        <!--li><a href=\"#\"  onclick=\"window.open('verDevolucionesEntrada.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Imprimir Devoluciones</a></li>\r\n");
      out.write("                        <li><a href=\"#\"  onclick=\"window.open('devolucionesInsumo.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Devolver</a></li-->\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Facturación<b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        ");

                            if (tipo.equals("7") || tipo.equals("3")) {
                        
      out.write("\r\n");
      out.write("                        <li><a href=\"/SAADurango/requerimiento.jsp\">Carga de Requerimiento</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/factura.jsp\">Facturación Automática</a></li>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                            ");

                                if (tipo.equals("5") || tipo.equals("3") || tipo.equals("7") || tipo.equals("2")) {
                            
      out.write("\r\n");
      out.write("                        <li><a href=\"/SAADurango/facturacionManual.jsp\">Facturación Manual</a></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/facturacionRural/verReqsWeb.jsp\">Facturación Web</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <!--li><a href=\"/SAADurango/validacionSurtido.jsp\">Validación Surtido</a></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/validacionAuditores.jsp\">Validación Auditores</a></li-->\r\n");
      out.write("                        <!--li><a href=\"#\"  onclick=\"window.open('modula/modulaHistorico.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Histórico Modula</a></li-->\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("                        ");

                            if (tipo.equals("7")) {
                        
      out.write("\r\n");
      out.write("                        <li><a href=\"/SAADurango/remisionarCamion.jsp\">Generar Remisiones</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        <li><a href=\"#\"  onclick=\"window.open('verDevoluciones.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Devoluciones</a></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/reimp_factura.jsp\">Administrar Remisiones</a></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/reimpConcentrado.jsp\">Reimpresión Folios a Remisionar</a></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/comparativoGlobal.jsp\">Folios a Remisionar</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"/SAADurango/facturacion/adminIFIQ.jsp\">Administrar IFIQ</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Inventario<b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"#\"  onclick=\"window.open('Ubicaciones/Inventario.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Inventario</a></li>\r\n");
      out.write("                ");

                    if (tipo.equals("5") || tipo.equals("3") || tipo.equals("7") || tipo.equals("2")) {
                
      out.write("\r\n");
      out.write("            <li><a href=\"#\"  onclick=\"window.open('movimientosUsuarioInventario.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Movimientos por Usuario</a></li>\r\n");
      out.write("            <li><a href=\"#\"  onclick=\"window.open('semaforo.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Semaforización</a></li>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            <li><a href=\"#\"  onclick=\"window.open('invenCiclico/nuevoInventario.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Inventario Ciclico</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li-->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Operaciones<b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        ");

                            if (tipo.equals("8")) {
                        
      out.write("\r\n");
      out.write("                        <li><a href=\"/SAADurango/operaciones/adminRutas.jsp\">Administrar Rutas</a></li>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        <li><a href=\"/SAADurango/operaciones/verRutas.jsp\">Consultar Rutas</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Catálogos<b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"#\" onclick=\"window.open('/SAADurango/medicamento.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Catálogo de Medicamento</a></li>\r\n");
      out.write("                        <li><a href=\"#\" onclick=\"window.open('/SAADurango/catalogo.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Catálogo de Proveedores</a></li>\r\n");
      out.write("                        <li><a href=\"#\" onclick=\"window.open('/SAADurango/marcas.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Catálogo de Marcas</a></li><li><a href=\"#\" onclick=\"window.open('/SAADurango/marcas.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Catálogo de Marcas</a></li>\r\n");
      out.write("                        <li><a href=\"#\" onclick=\"window.open('/SAADurango/modula/catalogoCB.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Catálogo de CB</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Reportes<b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"#\" onclick=\"window.open('Entrega.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Fecha de Recibo en CEDIS</a></li> \r\n");
      out.write("                        <li><a href=\"#\" onclick=\"window.open('historialOC.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Historial OC</a></li>\r\n");
      out.write("                        <li><a href=\"#\" onclick=\"window.open('ReporteF.jsp', '', 'width=1200,height=800,left=50,top=50,toolbar=no')\">Reporte por Fecha Proveedor</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li-->\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(usua);
      out.write("</a></li>\r\n");
      out.write("                <li class=\"active\"><a href=\"/SAADurango/index.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <h3>Administración de IFIQ's</h3>\n");
      out.write("        <hr/>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <form method=\"get\" action=\"adminIFIQ.jsp\">\n");
      out.write("                <h4 class=\"col-sm-2\">Seleccione la U.A.</h4>\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                    <select class=\"form-control\" name=\"F_ClaCli\">\n");
      out.write("                        <option value=\"\">Seleccione</option>\n");
      out.write("                        ");
                        try {
                                con.conectar();
                                ResultSet rset = con.consulta("select F_ClaCli, F_NomCli from tb_uniatn");
                                while (rset.next()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rset.getString("F_ClaCli"));
      out.write('"');
      out.write('>');
      out.print(rset.getString("F_Nomcli"));
      out.write("</option>\n");
      out.write("                        ");

                                }
                                con.cierraConexion();
                            } catch (Exception e) {
                                out.println(e.getMessage());
                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                    <button class=\"btn btn-block btn-primary\" name=\"accion\" value=\"Buscar\">Buscar</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <hr/>\n");
      out.write("        ");

            try {
                con.conectar();
                if (request.getParameter("accion").equals("Buscar")) {
        
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <form method=\"get\" action=\"../ActualizarIFIQ\">\n");
      out.write("                <input value=\"");
      out.print(request.getParameter("F_ClaCli"));
      out.write("\" name=\"F_ClaCli\" class=\"hidden\" />\n");
      out.write("                <table class=\"table table-bordered table-condensed table-striped\" id=\"tablaIFIQ\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Clave</td>\n");
      out.write("                            <td>Descripción</td>\n");
      out.write("                            <td>Cantidad</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            ResultSet rset = con.consulta("select F_ClaPro, F_DesPro from tb_medica");
                            while (rset.next()) {
                                int cant = 0;
                                ResultSet rset2 = con.consulta("select F_Cant from tb_ifiq where F_ClaPro = '" + rset.getString("F_ClaPro") + "' and F_ClaCli = '" + request.getParameter("F_ClaCli") + "'");
                                while (rset2.next()) {
                                    cant = rset2.getInt("F_Cant");
                                }
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rset.getString("F_ClaPro"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rset.getString("F_DesPro"));
      out.write("</td>\n");
      out.write("                            <td><input class=\"form-control\" value=\"");
      out.print(cant);
      out.write("\" name=\"");
      out.print(rset.getString("F_ClaPro"));
      out.write("\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                    <button name=\"accion\" value=\"Actualizar\" class=\"btn btn-block btn-primary\">Actualizar</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");

                    con.cierraConexion();
                }
            } catch (Exception e) {
                //out.println(e.getMessage());
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <!-- \n");
      out.write("        ================================================== -->\n");
      out.write("    <!-- Se coloca al final del documento para que cargue mas rapido -->\n");
      out.write("    <!-- Se debe de seguir ese orden al momento de llamar los JS -->\n");
      out.write("    <script src=\"../js/funcRutas.js\"></script>\n");
      out.write("    <script src=\"../js/jquery-1.9.1.js\"></script>\n");
      out.write("    <script src=\"../js/bootstrap.js\"></script>\n");
      out.write("    <script src=\"../js/jquery-ui-1.10.3.custom.js\"></script>\n");
      out.write("    <script src=\"../js/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"../js/dataTables.bootstrap.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $('#tablaIFIQ').dataTable();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
