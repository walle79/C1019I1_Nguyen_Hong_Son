import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display_discount.php")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String product_description = request.getParameter("description");
    float list_price = Float.parseFloat(request.getParameter("price"));
    float percent = Float.parseFloat(request.getParameter("discount_percent"));
    float discount_amount = (float) (list_price*(percent/100));
    float discount_price = list_price - discount_amount;

    PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3>Product Description: " + product_description+ "</h3>");
        writer.println("<h3>Price: " + list_price+ "</h3>");
        writer.println("<h3>Discount Percent: " + percent+ "</h3>");
        writer.println("<h3>Discount Amount: " + discount_amount+ "</h3>");
        writer.println("<h3>Discount Price: " + discount_price+ "</h3>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
