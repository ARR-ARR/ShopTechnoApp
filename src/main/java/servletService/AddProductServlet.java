package servletService;


import productBilder.productID.product.Laptop;
import productBilder.productID.product.Product;
import productBilder.productID.product.SmartPhone;
import productBilder.productID.product.Tv;
import productBilder.productID.productSrevice.ProductMapService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@WebServlet(urlPatterns = "/productAdd")
public class AddProductServlet extends HttpServlet {

    public static final String NAME = "nameProduct";
    public static final String BRAND = "brand";
    public static final String PRICE = "price";
    public static final String DESCRIPTION = "description";
    public static final String CONTENT_TYPE = "text/html;charset=UTF-8";
    public static final String UTF_8 = "UTF-8";

    private Map<String, List<Product>> products = null;

    @Override
    public void init() throws ServletException {
        super.init();

        products = ProductMapService.populateProduct();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding(UTF_8);
        resp.setContentType(CONTENT_TYPE);

        String nameProduct = req.getParameter(NAME);
        String brandProduct = req.getParameter(BRAND);
        String priceProduct = req.getParameter(PRICE);
        String descriptionProduct = req.getParameter(DESCRIPTION);
        List<Product> foundProduct = products.get(nameProduct);


        if (products.containsKey(nameProduct)) {
            if (nameProduct.equals("Ноутбук") ) {
                foundProduct.add(new Laptop(nameProduct, brandProduct, Double.valueOf(priceProduct), descriptionProduct));
                products.put(nameProduct, foundProduct);
                resp.getWriter().append("<p>Добавлен товар</p>");
            } else if (nameProduct.equals("Телефон")) {
                foundProduct.add(new SmartPhone(nameProduct, brandProduct, Double.valueOf(priceProduct), descriptionProduct));
                products.put(nameProduct, foundProduct);
                resp.getWriter().append("<p>Добавлен товар</p>");
            } else if (nameProduct.equals("Телевизор")) {
                foundProduct.add(new Tv(nameProduct, brandProduct, Double.valueOf(priceProduct), descriptionProduct));
                products.put(nameProduct, foundProduct);
                resp.getWriter().append("<p>Добавлен товар</p>");
            }
        } else {
            resp.getWriter().append("<p>Неизвестный продукт</p>");
        }
        ServletHelperHTML.populateHtmlBegin(resp);
        ServletHelperHTML.populateHtmlEnd(resp);
    }




}
