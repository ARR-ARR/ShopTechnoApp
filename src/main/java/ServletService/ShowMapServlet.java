package ServletService;


import productBilder.productID.product.Product;
import productBilder.productID.productSrevice.ProductMapService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@WebServlet(urlPatterns = "/productStock")
public class ShowMapServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public static final String NAME = "nameProduct";
    public static final String CONTENT_TYPE = "text/html;charset=UTF-8";
    public static final String UTF_8 = "UTF-8";

    private Map<String, List<Product>> products = null;


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        products = ProductMapService.populateProduct();
        System.out.println("It's running");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.setCharacterEncoding(UTF_8);
        resp.setContentType(CONTENT_TYPE);

        String nameProduct = req.getParameter(NAME);
        List<Product> foundProduct = products.get(nameProduct);

   //     System.out.println(req.getSession().getId());
   //     ServletBilderHTML.populateHtmlBegin(resp);

        System.out.println(nameProduct);

        if (nameProduct.equals("Laptop")) {
            resp.getWriter().append("<html><head>\n" + "</head><body>" +
                    "<p> Name: \"" + foundProduct + "</p><p><a href=\"./\">Return back</a></p></body></html>");
        } else if (nameProduct.equals("SmartPhone")) {
            resp.getWriter().append("<html><head>\n" + "</head><body>" +
                    "<p> Name: \"" + foundProduct + "</p><p><a href=\"./\">Return back</a></p></body></html>");
        } else if (nameProduct.equals("Tv")) {
            resp.getWriter().append("<html><head>\n" + "</head><body>" +
                    "<p> Name: \"" + foundProduct + "</p><p><a href=\"./\">Return back</a></p></body></html>");
        } else {
            resp.getWriter().append("<html><head>\n" +
                    "</head><body>Unknown product<p><a href=\"./\">Return back</a></p></body></html>");
        }
    }
}
