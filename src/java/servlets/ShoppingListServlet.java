package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alix
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get session
        HttpSession session = request.getSession();

        //welcome page is ShoppingList page
        //check if userName attribute is null or not, if yes redirect to login page.
        String username = (String) session.getAttribute("userName");
        String actionValue = request.getParameter("action");
        if (username != null) {
            //Handle logout
            //if (!actionValue.equals("logout")) {
              //  getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
               // return;

           // } else {
                getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
                return;
            //}

        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get session
        HttpSession session = request.getSession();
        //handle registration. if user_name is not yet input, load register jsp. 
        //otherwise get username session attribute and pass to shoppinglist jsp
        String actionValue = request.getParameter("action");
        if (actionValue.equals("register")) {
            String username = request.getParameter("user_name");

            if (username != null) {
                session.setAttribute("userName", username);
                response.sendRedirect("ShoppingList");
                return;
            } else {
                getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
                return;
            }
        }

    }

}
