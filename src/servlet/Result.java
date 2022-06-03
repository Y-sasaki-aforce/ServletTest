package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ContactBean;

@WebServlet("/servlet/result")
public class Result extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");


		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String mail = request.getParameter("mail");
		String kansou = request.getParameter("kansou");
		String[] mailmagazine = request.getParameterValues("mailmagazine");
		String documentrequest = request.getParameter("documentrequest");

		ContactBean c = new ContactBean();
		c.setName(name);
		c.setCompany(company);
		c.setMail(mail);
		c.setKansou(kansou);
		c.setMail(mail);
		c.setMailmagazine(mailmagazine);
		c.setDocumentrequest(documentrequest);

		request.setAttribute("contact", c);

		if (documentrequest.equals("yes")){
			request.getRequestDispatcher("../jsp/document.jsp").forward(request, response);

		}else{
			request.getRequestDispatcher("../jsp/result.jsp").forward(request, response);

		}

	}

}