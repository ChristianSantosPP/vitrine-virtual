package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exibirdados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Vitrine Informática</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/padrao.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/forms.css\">\n");
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
      out.write("                            <li><a href=\"carrinho.jsp\" id=\"linkcarrinho\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Carrinho <span class=\"badge\">0</span></a></li>\n");
      out.write("                            <li class=\"active\"><a href=\"cadastro.jsp\" id=\"linkcadastrese\"><span class=\"glyphicon glyphicon-user\"></span> Cadastre-se</a></li>\n");
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
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <form action=Cadastrar\" method=\"post\" >\n");
      out.write("                    <h2>Cadastro</h2>\n");
      out.write("                    \n");
      out.write("                    <label class=\"radio-inline\">\n");
      out.write("                        <input type=\"radio\" name=\"opt\" id=\"pf\" onchange=\"document.getElementById('inputcpf').style.display = 'block';\n");
      out.write("                                document.getElementById('inputcnpj').style.display = 'none';\n");
      out.write("                                document.getElementById('labelnome').innerHTML='Nome'\" checked=\"checked\">Pessoa Física\n");
      out.write("                    </label>\n");
      out.write("                    <label class=\"radio-inline\">\n");
      out.write("                        <input type=\"radio\" name=\"opt\" id=\"pj\" onchange=\"document.getElementById('inputcpf').style.display = 'none';\n");
      out.write("                                document.getElementById('inputcnpj').style.display = 'block';\n");
      out.write("                                document.getElementById('labelnome').innerHTML='Razão Social'\">Pessoa Jurídica\n");
      out.write("                    </label>              \n");
      out.write("                    <div class=\"form-group\" id=\"inputcpf\">\n");
      out.write("                        <label for=\"cpf\">CPF:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"cpf\" id=\"cpf\" maxlength=\"14\" placeholder=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cadastro.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" pattern=\"[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}\">\n");
      out.write("                        <small>Ex.: 000.000.000-00</small>\n");
      out.write("                    </div>                                   \n");
      out.write("                    <div class=\"form-group\" id=\"inputcnpj\" style=\"display: none\">\n");
      out.write("                        <label for=\"cnpj\">CNPJ:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"cnpj\" id=\"cnpj\" maxlength=\"14\" placeholder=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cadastro.cnpj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" pattern=\"[0-9]{2}.?[0-9]{3}.?[0-9]{3}/?[0-9]{4}-?[0-9]{2}\">\n");
      out.write("                        <small>Ex.: 00.000.000/0000-00</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"nome\" id=\"labelnome\">Nome:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"nome\" id=\"nome\" maxlength=\"50\" placeholder=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cadastro.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" pattern=\"[a-zA-Z\\s]+\" required>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"mail\">E-mail:</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"email\" id=\"mail\" maxlength=\"30\" placeholder=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"user\">Usuário:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"user\" id=\"user\" maxlength=\"15\" placeholder=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" pattern=\"[a-zA-Z0-9]+\" required>\n");
      out.write("                    </div>\n");
      out.write("                                   \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"rua\">Rua:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"rua\" id=\"rua\" maxlength=\"50\" placeholder=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endereco.rua}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" pattern=\"[A-Za-z\\s]+\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"num\">Nº:</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" name=\"num\" id=\"num\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endereco.numero}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("\t\t\t         \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"comp\">Complemento:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"comp\" id=\"comp\" maxlength=\"30\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endereco.complemento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                        <label for=\"cep\">CEP:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"cep\" name=\"cep\" maxlength=\"10\"placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endereco.cep}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[0-9]{5}-?[0-9]{3}\" required>\n");
      out.write("                        <small>Ex.: 00000-000</small>\n");
      out.write("                    </div>     \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"rua\">Bairro:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"bairro\" id=\"rua\" maxlength=\"50\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endereco.bairro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[A-Za-z\\s]+\" required>\n");
      out.write("                    </div>           \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"cidade\">Cidade:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"cidade\" id=\"cidade\" maxlength=\"50\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endereco.cidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[A-Za-z\\s]+\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"estado\">Estado:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"estado\" id=\"estado\" maxlength=\"50\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endereco.estado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[A-Za-z\\s]+\" required>\n");
      out.write("                    </div>      \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"fone\">Telefone Fixo:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"fone\" id=\"fone\" maxlength=\"13\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${telefone.telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[(?[0-9]{2})?[0-9]{4}-?[0-9]{4}]\">\n");
      out.write("                        <small>Ex.: (00)0000-0000 </small>\n");
      out.write("                    </div>               \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"cel\">Celular:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"cel\" id=\"cel\" maxlength=\"14\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${telefone.celular}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[(?[0-9]{2})?[0-9]{5}-?[0-9]{4}]\">\n");
      out.write("                        <small>Ex.: (00)00000-0000 </small>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Alterar</button>        \n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" onclick=\"index.jsp\">Confirmar</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
