package servlets;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/HtwgBook")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<String> names = new ArrayList<String>();
    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.write("<html><body><h1> Ich bin eine Überschrift </h1></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session;
	PrintWriter writer = response.getWriter();
	ArrayList<String> names = new ArrayList<String>();
	names.add(request.getParameter("tfVorname"));
	String ausgabe=ausgeben();
		
	 writer.write("<html><body><form action=\"/Aufgabe6_Servlet/HtwgBook\" method=\"post\"><h1>Vorname ist " +request.getParameter("tfVorname")+
				"</h1><td>Zum Name ändern bitte neuen Namen eingeben</td>"
				+ "<td> <input type=\"text\" value=\"Lisa\" name=\"tfVorname\">"
				+ "</td> <td><input type=\"submit\" value=\"ändern\" name =\"btaendern\" >"
				+ "</td></form>"
				+ "<br>"
				+ausgabe +"</body></html>");
		
			
//
//		String stimmung = request.getParameter("tfStimmung");
//		String answer;
//		if (stimmung.equals("stimmung")) answer="Dir geht es gut";
//		else answer="dir geht es beschissen";
//		writer.write("<html><body>" +answer + "</body></html>");
				
	}
	
	protected String ausgeben(){
	String ausgabe="";
	for (String name : names) {
		ausgabe= name + " "	;
			
		}
		return ausgabe;
	}

}
