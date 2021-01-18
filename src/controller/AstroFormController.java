package controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.AstroCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.Month;

@WebServlet(urlPatterns = {"/entervalue"})
public class AstroFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String astrosign="";
	String name="";
	String gender="";
	String date="";
	String month="";
	String year="";
	int age=0;
	String email="";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/entervalues.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		name=request.getParameter("name");
		gender=request.getParameter("gender");
		date=request.getParameter("dob1");
		month=request.getParameter("dob2");
		year=request.getParameter("dob3");
		email = request.getParameter("email");
		LocalDate currentdate=LocalDate.now();
		String dob=year+"-"+month+"-"+date;
        LocalDate userDate = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month), Integer.parseInt(date));
        Period diff=Period.between(userDate,currentdate);
		age=diff.getYears();
		astrosign="";
		User user=new User(name,email,dob,gender);
		AstroCalculator astroCalculator=new AstroCalculator();
		astrosign=astroCalculator.findSign(user);
		System.out.println("Your details");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Astrology: "+astrosign);
		if(astrosign.equals("Aquarius")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/aquarius.svg'>");
			rd.forward(request, response);
		}
		
		if(astrosign.equals("Aries")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/aries.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Cancer")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/cancer.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Capricorn")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/capricorn.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Gemini")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/gemini.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Leo")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/leo.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Libra")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/libra.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Pisces")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/pisces.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Sagittarius")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/sagittaruis.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Scorpio")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/scorpio.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Taurus")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/taurus.svg'>");
			rd.forward(request, response);
		}
		if(astrosign.equals("Virgo")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/Outputview.jsp");
			request.setAttribute("astro", "<img src='./assets/virgo.svg'>");
			rd.forward(request, response);
		}
		}

}
