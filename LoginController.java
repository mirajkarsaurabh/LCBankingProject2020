package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProjectDao;
import com.model.AdminRegistration;
import com.model.Login;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");

		String str=null;

		Login l=new Login();
		l.setUsername(username);
		l.setPassword(password);

		List<AdminRegistration>lst=new ArrayList<AdminRegistration>();
		lst.addAll(l);

		ProjectDao db=new ProjectDao();

		int i=db.saveAdminData(lst);
		if(i==true)
		{
			System.out.println("Successful");
			response.sendRedirect("");
		}
		else
		{
			System.out.println("Unsuccessful");
			response.sendRedirect("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
