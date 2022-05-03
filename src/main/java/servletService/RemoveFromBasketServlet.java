package servletService;

import productBilder.productID.product.Product;
import productBilder.productID.productSrevice.ProductMapService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/removeToBasket")
public class RemoveFromBasketServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public static final String CONTENT_TYPE = "text/html;charset=UTF-8";
    public static final String UTF_8 = "UTF-8";
    public static final String NAME = "nameProduct";

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
        int id = Integer.valueOf(req.getParameter("id"));
        Object basket = req.getSession().getAttribute("basket");

        if(basket != null) {
            List<Product> basketList = (List<Product>) basket;
            basketList.remove(id);
        } else {
            resp.getWriter().append("<p>Что-то пошло не так</p>");
        }

        RequestDispatcher rd = req.getRequestDispatcher("/viewBasket");
        rd.forward(req, resp);

    }
}
