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

@WebServlet(urlPatterns = "/viewBasket")
public class ViewBasketServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public static final String CONTENT_TYPE = "text/html;charset=UTF-8";
    public static final String UTF_8 = "UTF-8";
    public static final String TABLE_BEGIN = "<table style=\" border: 1px solid white;   border-collapse: collapse;\">\n" +
            "  <tr>\n" +
            "    <th>Категоря продукта</th>\n" +
            "    <th>Бренд</th> \n" +
            "    <th>Цена</th>\n" +
            "    <th>Описание</th>\n" +
            "    <th>Удалить продукт</th>\n" +
            "  </tr>";

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

        List<Product> basket = (List<Product>) req.getSession().getAttribute("basket");

        if (basket != null && basket.size() != 0) {
            resp.getWriter().append(TABLE_BEGIN);
            for (int i = 0; i < basket.size(); i++) {
                Product p = basket.get(i);
                resp.getWriter().append("<tr>\n" +
                        "   <td align=\"center\">" + p.getNameProduct() + "</td>\n" +
                        "   <td align=\"center\">" + p.getBrand() + "</td> \n" +
                        "   <td align=\"center\">" + p.getPrice() + "</td>\n" +
                        "   <td>" + p.getDescription() + "</td>\n" +
                        "   <td align=\"center\"><a href= \"./removeToBasket?id=" + i + "\">Удалить</a></td>\n" +
                        "</tr>");
            }
            ServletHelperHTML.populateHtmlEnd(resp);
        } else {
            resp.getWriter().append("<p>Корзина пуста!</p>");
            ServletHelperHTML.populateHtmlEnd(resp);
        }

    }
}
