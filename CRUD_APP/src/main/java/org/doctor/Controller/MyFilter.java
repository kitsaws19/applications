package org.doctor.Controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;



public class MyFilter  extends HttpServlet implements Filter{

  public MyFilter() {
    // TODO Auto-generated constructor stub
  }

  
  public void destroy() {
    // TODO Auto-generated method stub
  }

 
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
   
    if (request.getParameter("Action").equals("Add Doctor"))
      chain.doFilter(request, response);
    if (request.getParameter("Action").equals("Edit"))
      chain.doFilter(request, response);
    if (request.getParameter("Action").equals("Delete"))
      chain.doFilter(request, response);
  }

  
  public void init(FilterConfig fConfig) throws ServletException {
  }

}