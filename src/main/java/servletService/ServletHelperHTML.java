package servletService;

import productBilder.productID.product.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ServletHelperHTML {

    public static final String HTML_BODY_BEGIN = "<html><head><link rel=\"stylesheet\" href=\"styles.css\">\n</head><body>";
    public static final String HTML_BODY_END = "</body></html>";
    public static final String HREF_LINK_BACK = "<p><a href=\"./\">Вернуться назад</a></p>";
    public static final String TABLE_BEGIN = "<table style=\" border: 1px solid white;   border-collapse: collapse;\">\n" +
            "  <tr>\n" +
            "    <th>Категоря продукта</th>\n" +
            "    <th>Бренд</th> \n" +
            "    <th>Цена</th>\n" +
            "    <th>Описание</th>\n" +
            "    <th>Добавление продукта</th>\n" +
            "  </tr>";
    public static final String TABLE_END = "</table>";

    private static Map<String, List<Product>> products = null;

    public static void populateHtmlBegin(HttpServletResponse resp) throws IOException {
        resp.getWriter().append(HTML_BODY_BEGIN);
    }

    public static void populateHtmlEnd(HttpServletResponse resp) throws IOException {
        resp.getWriter().append(HREF_LINK_BACK);
        resp.getWriter().append(HTML_BODY_END);
    }

    public static void iterationTabletHtml(List<Product> foundProduct, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().append(TABLE_BEGIN);
        for (int i = 0; i < foundProduct.size(); i++) {
            Product p = foundProduct.get(i);
            resp.getWriter().append("<tr>\n" +
                    "   <td align=\"center\">" + p.getNameProduct() + "</td>\n" +
                    "   <td align=\"center\">" + p.getBrand() + "</td> \n" +
                    "   <td align=\"center\">" + p.getPrice() + "</td>\n" +
                    "   <td>" + p.getDescription() + "</td>\n" +
                    "   <td align=\"center\"><a href= \"./addToBasket?id=" + i + "&nameProduct=" + p.getNameProduct()
                    + "\">Добавить</a></td>\n" + "</tr>");
        }
        resp.getWriter().append(TABLE_END);
    }

}
