/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jon
 */
@WebServlet(name = "DescripcionJuego", urlPatterns = {"/DescripcionJuego"})
public class DescripcionJuego extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
"      xmlns:h=\"http://xmlns.jcp.org/jsf/html\"\n" +
"      xmlns:p=\"http://primefaces.org/ui\">\n" +
"	<h:head>\n" +
"		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
"		<title>Game Store</title>\n" +
"		<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"  media=\"all\" />\n" +
"		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>\n" +
"		<link rel=\"stylesheet\" href=\"css/responsiveslides.css\"/>\n" +
"		<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n" +
"		<script src=\"js/responsiveslides.min.js\"></script>\n" +
"                <script src=\"js/zoom.js\"></script>\n" +
"		  <script>\n" +
"		    // You can also use \"$(window).load(function() {\"\n" +
"			    $(function () {\n" +
"			\n" +
"			      // Slideshow 1\n" +
"			      $(\"#slider1\").responsiveSlides({\n" +
"			        maxwidth: 1600,\n" +
"			        speed: 600\n" +
"			      });\n" +
"			});\n" +
"		  </script>\n" +
"	</h:head>\n" +
"	<h:body>\n" +
"		<!--start-wrap-->\n" +
"		<div class=\"wrap\">\n" +
"			<!--start-header-->\n" +
"			<div class=\"header\">\n" +
"			<!--start-top-header-->\n" +
"			<div class=\"top-header\">\n" +
"				<div class=\"top-header-right\">\n" +
"					<ul>\n" +
"                                            <p:clock pattern=\"HH:mm:ss\" mode=\"server\" />\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div class=\"clear\"> </div>\n" +
"			</div>\n" +
"			<div class=\"clear\"> </div>\n" +
"			<div class=\"sub-header\">\n" +
"				<div class=\"logo\">\n" +
"					<a href=\"index.xhtml\"><img src=\"resources/tituloo.png\" title=\"logo\" /></a>\n" +
"				</div>\n" +
"				<div class=\"sub-header-center\">\n" +
"                                    <form>\n" +
"					<input type=\"text\"/>\n" +
"                                        <input type=\"submit\"  value=\"search\" />\n" +
"                                    </form>\n" +
"				</div>\n" +
"				<div class=\"sub-header-right\">\n" +
"					 <h:form>\n" +
"					<ul> \n" +
"                                           <!--TODOOOOO arreglar el \"no\"-->\n" +
"                                           <li><FONT size=\"5\" color=\"white\"> Hola, </FONT></li>\n" +
"                                           <li> <FONT size=\"5\" color=\"white\"> <h:outputLabel for=\"contact_name\" value=\"#{usuarioBean.userUsernameInserted}\" /> </FONT> </li>\n" +
"                                           <p:commandButton  value =\"Cerrar sesión\" action=\"#{usuarioBean.closeSession()}\"/>\n" +
"                                           <li><a href=\"#\">CART: (EMPTY) <img src=\"resources/design/cart.png\" title=\"cart\" /></a></li>\n" +
"					</ul>\n" +
"                                    </h:form>\n" +
"				</div>\n" +
"				<div class=\"clear\"> </div>\n" +
"			</div>\n" +
"			<div class=\"clear\"> </div>\n" +
"			<div class=\"top-nav\">\n" +
"				<ul>\n" +
"					<li class=\"active1\"><a href=\"index.xhtml\">Home</a></li>\n" +
"					<li><a href=\"ps3.jsp\">PS3</a></li>\n" +
"					<li><a href=\"xbox.jsp\">XBOX360</a></li>\n" +
"					<li><a href=\"wii.jsp\">Wii</a></li>\n" +
"					<li><a href=\"contact.xhtml\">Feedback</a></li>\n" +
"					<div class=\"clear\"> </div>\n" +
"				</ul>\n" +
"			</div>\n" +
"			<!--end-top-header-->\n" +
"			<!--End-header-->\n" +
"			</div>\n" +
"				<div class=\"content\">\n" +
"					<div class=\"single-page\"><br />\n" +
"						<div class=\"clear\"> </div>\n" +
"						<div class=\"product-info\">\n" +
"							<div class=\"product-image\">\n" +
"                                                            <!--TODO Introducir aqui fotos... 320x200-->                                                 \n" +
"							</div>\n" +
"							<div class=\"product-price-info\">\n" +
"							  <div class=\"product-value\">\n" +
"								<h4>"+request.getParameter("nombre")+"</h4>\n" +
"									<ul>\n" +
"										<li><h2>Price :</h2></li>\n" +
"										<li><span>$350</span></li>\n" +
"										<li><h5>$500</h5></li>\n" +
"										<li><a href=\"#\">Instock</a></li>\n" +
"									</ul>\n" +
"									<ul>\n" +
"										<li><h3>Not rated</h3></li>\n" +
"										<li><h5>No reviews</h5></li>\n" +
"									</ul>\n" +
"								</div>\n" +
"								<div class=\"product-shipping\">\n" +
"									<span>Shipping :</span>\n" +
"									<p><lable>FREE</lable> - Flat Rate Courier - Delivery anywhere in </p>\n" +
"									<div class=\"clear\"> </div>\n" +
"								</div>\n" +
"								<div class=\"product-payments\">\n" +
"									<span>Payments: :</span>\n" +
"									<p><lable>paypal</lable> - (Credit card, EMI, Debit card, Online Bank Transfer), PaisaPay COD  </p>\n" +
"									<div class=\"clear\"> </div>\n" +
"								</div>\n" +
"								<div class=\"product-description\">\n" +
"									<h3>Description : </h3>\n" +
"									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>\n" +
"									<a href=\"#\">Addcart</a>\n" +
"								</div>\n" +
"                                <div class=\"Comentarios\">\n" +
"								  <p><span>Comentarios: </span>\n" +
"\n" +
"		\n" +
"		<form action=\"/sign\" method=\"post\">\n" +
"			<div><textarea name=\"content\" rows=\"3\" cols=\"60\"></textarea></div>\n" +
"			<div><input type=\"submit\" value=\"Añadir comentario\" /></div>\n" +
"		</form></p>\n" +
"									\n" +
"									<div class=\"clear\"> </div>\n" +
"								</div>\n" +
"								<div class=\"product-share\">\n" +
"									<h3>share on:</h3>\n" +
"									<ul>\n" +
"										<li><a href=\"#\"><img src=\"images/facebook.png\" title=\"facebook\" />Facebook</a></li>\n" +
"										<li><a href=\"#\"><img src=\"images/twitter.png\" title=\"Twitter\" />Twitter</a></li>\n" +
"										<li><a href=\"#\"><img src=\"images/rss.png\" title=\"Rss\" />Rss</a></li>\n" +
"										<li><a href=\"#\"><img src=\"images/gpluse.png\" title=\"Googlepluse\" />Google+</a></li>\n" +
"									</ul>\n" +
"								</div>\n" +
"							</div>\n" +
"							<div class=\"clear\"> </div>\n" +
"						</div>\n" +
"					</div>\n" +
"			</div>\n" +
"			<div class=\"clear\"> </div>\n" +
"		</div>\n" +
"			<div class=\"footer\">\n" +
"				<div class=\"wrap\">\n" +
"				<div class=\"section group\">\n" +
"				<div class=\"col_1_of_4 span_1_of_4\">\n" +
"					<h3>INFORMATION</h3>\n" +
"					<ul>\n" +
"						<li><a href=\"#\">About us</a></li>\n" +
"						<li><a href=\"#\">Sitemap</a></li>\n" +
"						<li><a href=\"#\">Contact</a></li>\n" +
"						<li><a href=\"#\">Terms and conditions</a></li>\n" +
"						<li><a href=\"#\">Legal Notice</a></li>\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div class=\"col_1_of_4 span_1_of_4\">\n" +
"					<h3>OUR OFFERS</h3>\n" +
"					<ul>\n" +
"						<li><a href=\"#\">New products</a></li>\n" +
"						<li><a href=\"#\">top sellers</a></li>\n" +
"						<li><a href=\"#\">Specials</a></li>\n" +
"						<li><a href=\"#\">Products</a></li>\n" +
"						<li><a href=\"#\">Comments</a></li>\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div class=\"col_1_of_4 span_1_of_4\">\n" +
"					<h3>YOUR ACCOUNT</h3>\n" +
"					<ul>\n" +
"						<li><a href=\"#\">Your Account</a></li>\n" +
"						<li><a href=\"#\">Personal info</a></li>\n" +
"						<li><a href=\"#\">Prices</a></li>\n" +
"						<li><a href=\"#\">Address</a></li>\n" +
"						<li><a href=\"#\">Locations</a></li>\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div class=\"col_1_of_4 span_1_of_4 footer-lastgrid\">\n" +
"					<h3>Contacta</h3>\n" +
"					<ul>\n" +
"						<li><a href=\"#\"><img src=\"resources/design/facebook.png\" title=\"facebook\" /></a></li>\n" +
"						<li><a href=\"#\"><img src=\"resources/design/twitter.png\" title=\"Twiiter\" /></a></li>\n" +
"\n" +
"					</ul>\n" +
"					<p>Design by <a href=\"#\">Jon Udaondo</a></p>\n" +
"				</div>\n" +
"			</div>\n" +
"			</div>\n" +
"		</div>\n" +
"		<!--End-wrap-->\n" +
"	</h:body>\n" +
"</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
"      xmlns:h=\"http://xmlns.jcp.org/jsf/html\"\n" +
"      xmlns:p=\"http://primefaces.org/ui\">\n" +
"	<h:head>\n" +
"		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
"		<title>Game Store</title>\n" +
"		<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"  media=\"all\" />\n" +
"		<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>\n" +
"		<link rel=\"stylesheet\" href=\"css/responsiveslides.css\"/>\n" +
"		<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n" +
"		<script src=\"js/responsiveslides.min.js\"></script>\n" +
"                <script src=\"js/zoom.js\"></script>\n" +
"		  <script>\n" +
"		    // You can also use \"$(window).load(function() {\"\n" +
"			    $(function () {\n" +
"			\n" +
"			      // Slideshow 1\n" +
"			      $(\"#slider1\").responsiveSlides({\n" +
"			        maxwidth: 1600,\n" +
"			        speed: 600\n" +
"			      });\n" +
"			});\n" +
"		  </script>\n" +
"	</h:head>\n" +
"	<h:body>\n" +
"		<!--start-wrap-->\n" +
"		<div class=\"wrap\">\n" +
"			<!--start-header-->\n" +
"			<div class=\"header\">\n" +
"			<!--start-top-header-->\n" +
"			<div class=\"top-header\">\n" +
"				<div class=\"top-header-right\">\n" +
"					<ul>\n" +
"                                            <p:clock pattern=\"HH:mm:ss\" mode=\"server\" />\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div class=\"clear\"> </div>\n" +
"			</div>\n" +
"			<div class=\"clear\"> </div>\n" +
"			<div class=\"sub-header\">\n" +
"				<div class=\"logo\">\n" +
"					<a href=\"index.xhtml\"><img src=\"resources/tituloo.png\" title=\"logo\" /></a>\n" +
"				</div>\n" +
"				<div class=\"sub-header-center\">\n" +
"                                    <form>\n" +
"					<input type=\"text\"/>\n" +
"                                        <input type=\"submit\"  value=\"search\" />\n" +
"                                    </form>\n" +
"				</div>\n" +
"				<div class=\"sub-header-right\">\n" +
"					 <h:form>\n" +
"					<ul> \n" +
"                                           <!--TODOOOOO arreglar el \"no\"-->\n" +
"                                           <li><FONT size=\"5\" color=\"white\"> Hola, </FONT></li>\n" +
"                                           <li> <FONT size=\"5\" color=\"white\"> <h:outputLabel for=\"contact_name\" value=\"#{usuarioBean.userUsernameInserted}\" /> </FONT> </li>\n" +
"                                           <p:commandButton  value =\"Cerrar sesión\" action=\"#{usuarioBean.closeSession()}\"/>\n" +
"                                           <li><a href=\"#\">CART: (EMPTY) <img src=\"resources/design/cart.png\" title=\"cart\" /></a></li>\n" +
"					</ul>\n" +
"                                    </h:form>\n" +
"				</div>\n" +
"				<div class=\"clear\"> </div>\n" +
"			</div>\n" +
"			<div class=\"clear\"> </div>\n" +
"			<div class=\"top-nav\">\n" +
"				<ul>\n" +
"					<li class=\"active1\"><a href=\"index.xhtml\">Home</a></li>\n" +
"					<li><a href=\"ps3.jsp\">PS3</a></li>\n" +
"					<li><a href=\"xbox.jsp\">XBOX360</a></li>\n" +
"					<li><a href=\"wii.jsp\">Wii</a></li>\n" +
"					<li><a href=\"contact.xhtml\">Feedback</a></li>\n" +
"					<div class=\"clear\"> </div>\n" +
"				</ul>\n" +
"			</div>\n" +
"			<!--end-top-header-->\n" +
"			<!--End-header-->\n" +
"			</div>\n" +
"				<div class=\"content\">\n" +
"					<div class=\"single-page\"><br />\n" +
"						<div class=\"clear\"> </div>\n" +
"						<div class=\"product-info\">\n" +
"							<div class=\"product-image\">\n" +
"                                                            <!--TODO Introducir aqui fotos... 320x200-->                                                 \n" +
"							</div>\n" +
"							<div class=\"product-price-info\">\n" +
"							  <div class=\"product-value\">\n" +
"								<h4>"+request.getParameter("nombre")+"</h4>\n" +
"									<ul>\n" +
"										<li><h2>Price :</h2></li>\n" +
"										<li><span>$350</span></li>\n" +
"										<li><h5>$500</h5></li>\n" +
"										<li><a href=\"#\">Instock</a></li>\n" +
"									</ul>\n" +
"									<ul>\n" +
"										<li><h3>Not rated</h3></li>\n" +
"										<li><h5>No reviews</h5></li>\n" +
"									</ul>\n" +
"								</div>\n" +
"								<div class=\"product-shipping\">\n" +
"									<span>Shipping :</span>\n" +
"									<p><lable>FREE</lable> - Flat Rate Courier - Delivery anywhere in </p>\n" +
"									<div class=\"clear\"> </div>\n" +
"								</div>\n" +
"								<div class=\"product-payments\">\n" +
"									<span>Payments: :</span>\n" +
"									<p><lable>paypal</lable> - (Credit card, EMI, Debit card, Online Bank Transfer), PaisaPay COD  </p>\n" +
"									<div class=\"clear\"> </div>\n" +
"								</div>\n" +
"								<div class=\"product-description\">\n" +
"									<h3>Description : </h3>\n" +
"									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>\n" +
"									<a href=\"#\">Addcart</a>\n" +
"								</div>\n" +
"                                <div class=\"Comentarios\">\n" +
"								  <p><span>Comentarios: </span>\n" +
"\n" +
"		\n" +
"		<form action=\"/sign\" method=\"post\">\n" +
"			<div><textarea name=\"content\" rows=\"3\" cols=\"60\"></textarea></div>\n" +
"			<div><input type=\"submit\" value=\"Añadir comentario\" /></div>\n" +
"		</form></p>\n" +
"									\n" +
"									<div class=\"clear\"> </div>\n" +
"								</div>\n" +
"								<div class=\"product-share\">\n" +
"									<h3>share on:</h3>\n" +
"									<ul>\n" +
"										<li><a href=\"#\"><img src=\"images/facebook.png\" title=\"facebook\" />Facebook</a></li>\n" +
"										<li><a href=\"#\"><img src=\"images/twitter.png\" title=\"Twitter\" />Twitter</a></li>\n" +
"										<li><a href=\"#\"><img src=\"images/rss.png\" title=\"Rss\" />Rss</a></li>\n" +
"										<li><a href=\"#\"><img src=\"images/gpluse.png\" title=\"Googlepluse\" />Google+</a></li>\n" +
"									</ul>\n" +
"								</div>\n" +
"							</div>\n" +
"							<div class=\"clear\"> </div>\n" +
"						</div>\n" +
"					</div>\n" +
"			</div>\n" +
"			<div class=\"clear\"> </div>\n" +
"		</div>\n" +
"			<div class=\"footer\">\n" +
"				<div class=\"wrap\">\n" +
"				<div class=\"section group\">\n" +
"				<div class=\"col_1_of_4 span_1_of_4\">\n" +
"					<h3>INFORMATION</h3>\n" +
"					<ul>\n" +
"						<li><a href=\"#\">About us</a></li>\n" +
"						<li><a href=\"#\">Sitemap</a></li>\n" +
"						<li><a href=\"#\">Contact</a></li>\n" +
"						<li><a href=\"#\">Terms and conditions</a></li>\n" +
"						<li><a href=\"#\">Legal Notice</a></li>\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div class=\"col_1_of_4 span_1_of_4\">\n" +
"					<h3>OUR OFFERS</h3>\n" +
"					<ul>\n" +
"						<li><a href=\"#\">New products</a></li>\n" +
"						<li><a href=\"#\">top sellers</a></li>\n" +
"						<li><a href=\"#\">Specials</a></li>\n" +
"						<li><a href=\"#\">Products</a></li>\n" +
"						<li><a href=\"#\">Comments</a></li>\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div class=\"col_1_of_4 span_1_of_4\">\n" +
"					<h3>YOUR ACCOUNT</h3>\n" +
"					<ul>\n" +
"						<li><a href=\"#\">Your Account</a></li>\n" +
"						<li><a href=\"#\">Personal info</a></li>\n" +
"						<li><a href=\"#\">Prices</a></li>\n" +
"						<li><a href=\"#\">Address</a></li>\n" +
"						<li><a href=\"#\">Locations</a></li>\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div class=\"col_1_of_4 span_1_of_4 footer-lastgrid\">\n" +
"					<h3>Contacta</h3>\n" +
"					<ul>\n" +
"						<li><a href=\"#\"><img src=\"resources/design/facebook.png\" title=\"facebook\" /></a></li>\n" +
"						<li><a href=\"#\"><img src=\"resources/design/twitter.png\" title=\"Twiiter\" /></a></li>\n" +
"\n" +
"					</ul>\n" +
"					<p>Design by <a href=\"#\">Jon Udaondo</a></p>\n" +
"				</div>\n" +
"			</div>\n" +
"			</div>\n" +
"		</div>\n" +
"		<!--End-wrap-->\n" +
"	</h:body>\n" +
"</html>");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String name = request.getParameter("name");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
