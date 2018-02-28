package mum.edu.cs545;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculator
 */
public class ServletCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<form method=\"post\" action=\"Calculator.jsp\">"
				+ "            <input type=\"text\" name=\"txtNum1\" size=\"6\"/> + <input type=\"text\" name=\"txtNum2\" size=\"6\"/> = <input type=\"text\" name=\"txtNum3\" size=\"6\"/>"
				+ "            <br/>"
				+ "            <input type=\"text\" name=\"txtNum4\" size=\"6\"/> * <input type=\"text\" name=\"txtNum5\" size=\"6\"/> = <input type=\"text\" name=\"txtNum6\" size=\"6\"/> "
				+ "            <br/>" + "            <input type=\"submit\" value=\"Submit\"/>" + "        </form>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str1 = request.getParameter("txtNum1");
		String str2 = request.getParameter("txtNum2");
		String str3 = request.getParameter("txtNum4");
		String str4 = request.getParameter("txtNum5");

		Integer num1 = !str1.equals("") ? Integer.parseInt(str1) : 0;
		Integer num2 = !str2.equals("") ? Integer.parseInt(str2) : 0;
		Integer num3 = !str3.equals("") ? Integer.parseInt(str3) : 0;
		Integer num4 = !str4.equals("") ? Integer.parseInt(str4) : 0;

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<body><p>");
		if (!str1.equals("") || !str2.equals("")) {

			out.print("<input type=\"text\" value=" + num1 + "> + <input type=\"text\" value=" + num2
					+ "> = <input type=\"text\" value =" + String.valueOf(num1 + num2) + ">");

		}
		out.print("<br/>");
		if (!str3.equals("") || !str4.equals("")) {
			out.print("<input type=\"text\" value=" + num3 + "> * <input type=\"text\" value=" + num4
					+ "> = <input type=\"text\" value =" + String.valueOf(num3 * num4) + ">");
		}
		out.print("</p></body>");

	}

}
