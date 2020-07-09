package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDao;
//import com.dao.RegisterDao;
//import com.model.AdminRegister;
import com.model.AdminRegistration;
import com.controller.AdminRegistrationController;

@WebServlet("/AdminRegistrationController")
public class AdminRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminRegistrationController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String Admin_Id = request.getParameter("admin_id");
		String Admin_Password=request.getParameter("admin_password");

		AdminRegistration adminregister = new AdminRegistration();
		adminregister.setAdmin_id(Admin_Id);
		adminregister.setAdmin_password(Admin_Password);

		ProjectDao db=new ProjectDao();
		List<AdminRegistration> lst=new LinkedList<AdminRegistration>();
		AdminRegistration r = null;
		lst.add(r);
		int i=db.saveAdminData(lst);
		if(i>0)
		{
			System.out.println("AdminLoggedIn Successful");
			response.sendRedirect("Login.html");
		}
		else 
		{
			System.out.println("AdminLogin Not Successful");
			response.sendRedirect("Registration.html");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
