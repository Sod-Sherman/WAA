package mum.controller;

import mum.model.OurNumber;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletParm
 */
public class CalculatorController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorController() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String add1 = request.getParameter("add1").trim();
        String add2 = request.getParameter("add2").trim();
        String mult1 = request.getParameter("mult1").trim();
        String mult2 = request.getParameter("mult2").trim();
        try {


            OurNumber ourNumberForAdding = new OurNumber(Double.parseDouble(add1), Double.parseDouble(add2));
            OurNumber ourNumberForMultiply = new OurNumber(Double.parseDouble(mult1), Double.parseDouble(mult2));


            request.setAttribute("ourNumberForAdding", ourNumberForAdding);
            request.setAttribute("ourNumberForMultiply", ourNumberForMultiply);

        } catch (Exception e) {
            System.out.println(e);
        }

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/calculator.jsp");
        rd.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
