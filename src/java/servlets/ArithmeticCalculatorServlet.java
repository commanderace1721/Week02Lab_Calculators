/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 826847
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


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
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
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
        String sign = request.getParameter("sign");
        String first_number = request.getParameter("first_number");
        String second_number = request.getParameter("second_number");
        String regex = "[a-zA-Z_]";
        request.setAttribute("first_number", first_number);
        request.setAttribute("second_number", second_number);
        request.setAttribute("sign", sign);
        if(first_number == null | first_number.equals("") | second_number == null | second_number.equals("") | first_number.matches(regex) | second_number.matches(regex))
        {
           request.setAttribute("message", "Invalid");
              getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        
           return;
        }
        
        int num1 = Integer.parseInt(first_number);
        int num2 = Integer.parseInt(second_number);
        int total;
        if(sign.equals("%") && num2 == 0)
        {
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
        }
        if(sign.equals("+"))
        {
           total = num1 + num2;
           request.setAttribute("message", total);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
           return;
        }
        if(sign.equals("-"))
        {
           total = num1 - num2;
           request.setAttribute("message", total);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
           return;
        }
       if(sign.equals("*"))
        {
           total = num1 * num2;
           request.setAttribute("message", total);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
           return;
        }
       if(sign.equals("%"))
        {
           total = num1 % num2;
           request.setAttribute("message", total);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
           return;
        }
    }

}
