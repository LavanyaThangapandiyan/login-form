package com.register.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.register.model.User;
@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public LoginRegister() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterImpl reg=new RegisterImpl();
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String submitType=request.getParameter("submit");
		User user=new User();
	     user=reg.getUserDetails(userName, password);
		if(submitType.equals("Login")&&user.getEmail()!=null&&user.getMobileNumber()!=null)
		{
			request.setAttribute("message",user.getEmail());
			request.setAttribute("message",user.getMobileNumber());
			request.getRequestDispatcher("Welcome.jsp").forward(request, response);
		}else if(submitType.equals("Register"))
		{
		  user.setUserName(userName);
		  user.setPassword(password);
		  user.setEmail(request.getParameter("email"));
		  user.setMobileNumber(request.getParameter("mobileNumber"));
		  reg.insertUserDetails(user);
		  request.setAttribute("SuccessMessage", "Registration done,Please login to Continue..");
		  request.getRequestDispatcher("Login.jsp").forward(request, response);
		  
		}
		else {
			request.setAttribute("message","Data Not Found,Click On Register");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

}
