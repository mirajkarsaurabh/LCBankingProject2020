package com.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDao;
import com.model.AccountOpening;

@WebServlet("/AccountOpeningController")
public class AccountOpeningController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AccountOpeningController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		int age = Integer.parseInt(request.getParameter("age"));
		String account_type = request.getParameter("account_type");
		String branch = request.getParameter("branch");
		String mobile_number = request.getParameter("mobile_number");
		String email = request.getParameter("email");
		String occupation = request.getParameter("occupation");
		String aadhar_number = request.getParameter("aadhar_number");
		String pan_number = request.getParameter("pan_number");

		AccountOpening register = new AccountOpening();	
		register.setFirstName(first_name);
		register.setLastName(last_name);
		register.setGender(gender);
		register.setDateOfBirth(dob);
		register.setAge(age);
		register.setAccountType(account_type);
		register.setBranch(branch);
		register.setMobileNumber(mobile_number);
		register.setEmail(email);
		register.setOccupation(occupation);
		register.setAadharNumber(aadhar_number);
		register.setPanNumber(pan_number);

		ProjectDao db=new ProjectDao();

		List<AccountOpening> lst=new ArrayList<AccountOpening>();

	//	AccountOpening r = null;
		lst.add(register);
		int i=db.regsaveData(lst);

		if(i>0)
		{
			System.out.println("Login Successful!!");
			response.sendRedirect(" ");
		}
		else
		{
			System.out.println("Login Unsuccessful!!");
			response.sendRedirect(" ");
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

