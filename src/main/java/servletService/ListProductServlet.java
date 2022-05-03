package servletService;

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

@WebServlet(urlPatterns = "/productList")
public class ListProductServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public static final String NAME = "nameProduct";
    public static final String CONTENT_TYPE = "text/html;charset=UTF-8";
    public static final String UTF_8 = "UTF-8";

    private Map<String, List<Product>> products = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        products = ProductMapService.populateProduct();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding(UTF_8);
        resp.setContentType(CONTENT_TYPE);
        ServletHelperHTML.populateHtmlBegin(resp);
        String nameProduct = req.getParameter(NAME);
        List<Product> foundProduct = products.get(nameProduct);
        ServletHelperHTML.iterationTabletHtml(foundProduct, resp);
        ServletHelperHTML.populateHtmlEnd(resp);

    }
}

