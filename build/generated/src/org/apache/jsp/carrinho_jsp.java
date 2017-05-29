package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carrinho_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Vitrine Informática</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/padrao.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/checkout.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("            <!-- inicio da nav bar-->\n");
      out.write("            <nav class=\"navbar navbar-default\" >\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"img/logo.png\" alt=\"Vitrine Informática\" id=\"logo\"></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                            <li><a href=\"contato.jsp\" id=\"linkcontato\">Contato</a></li>\n");
      out.write("                            <li><a href=\"quem-somos.jsp\" id=\"linkquemsomos\">Quem Somos</a></li>\n");
      out.write("                            <li><a href=\"politica.jsp\" id=\"linkpoliticas\">Política do Site</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"active\"><a href=\"carrinho.jsp\" id=\"linkcarrinho\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Carrinho <span class=\"badge\">3</span></a></li>\n");
      out.write("                            <li><a href=\"cadastro.jsp\" id=\"linkcadastrese\"><span class=\"glyphicon glyphicon-user\"></span> Cadastre-se</a></li>\n");
      out.write("                            <li><a href=\"login.jsp\" id=\"linklogin\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <img class=\"img-responsive\" src=\"img/placamae.png\" id=\"img\" alt=\"Placa Mãe\">\n");
      out.write("            </nav>\n");
      out.write("            <!-- fim da nav bar-->\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <h2>Carrinho</h2>\n");
      out.write("            <div class=\"table\">          \n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Cód.</th>\n");
      out.write("                            <th>Produto</th>\n");
      out.write("                            <th>Qtd</th>\n");
      out.write("                            <th>Valor</th>\n");
      out.write("                            <th></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tfoot>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Total:</td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td>540,00</td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tfoot>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"width: 10%;\">01</td>\n");
      out.write("                            <td style=\"width: 50%;\"><a href=\"infoproduto.jsp\">Processador A</a></td>\n");
      out.write("                            <td style=\"width: 10%;\"><input type=\"text\" placeholder=\"2\" style=\"width: 80%;\" pattern=\"[0-9]+\"></td>\n");
      out.write("                            <td style=\"width: 20%;\">230,00</td>\n");
      out.write("                            <td style=\"width: 10%;\"><a href=\"#\"><span class=\"glyphicon glyphicon-remove\"></span></a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"width: 10%;\">01</td>\n");
      out.write("                            <td style=\"width: 50%;\"><a href=\"infoproduto.jsp\">Processador A</a></td>\n");
      out.write("                            <td style=\"width: 10%;\"><input type=\"text\" placeholder=\"2\" style=\"width: 80%;\" pattern=\"[0-9]+\"></td>\n");
      out.write("                            <td style=\"width: 20%;\">230,00</td>\n");
      out.write("                            <td style=\"width: 10%;\"><a href=\"#\"><span class=\"glyphicon glyphicon-remove\"></span></a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"width: 10%;\">01</td>\n");
      out.write("                            <td style=\"width: 50%;\"><a href=\"infoproduto.jsp\">Processador A</a></td>\n");
      out.write("                            <td style=\"width: 10%;\"><input type=\"text\" placeholder=\"2\" style=\"width: 80%;\" pattern=\"[0-9]+\"></td>\n");
      out.write("                            <td style=\"width: 20%;\">230,00</td>\n");
      out.write("                            <td style=\"width: 10%;\"><a href=\"#\"><span class=\"glyphicon glyphicon-remove\"></span></a></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <small>É preciso estar logado para realizar a compra. Se não possui cadastro,\n");
      out.write("                    <a href=\"cadastro.jsp\">cadastre-se</a>, ou <a href=\"login.jsp\">logue-se</a>.\n");
      out.write("                </small>\n");
      out.write("                <br/>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-primary\" value=\"Finalizar\">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-danger\" value=\"Cancelar\">\n");
      out.write("            </div>          \n");
      out.write("            \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <footer class=\"container-fluid \">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><img src=\"img/logo.png\" alt=\"logo\"></a>\n");
      out.write("            <p>Endereço:<br/>\n");
      out.write("                Rua Dez, 560 -  Prazeres <br/>\n");
      out.write("                Jaboatão dos Guararapes - PE <br/>\n");
      out.write("            </p>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
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
