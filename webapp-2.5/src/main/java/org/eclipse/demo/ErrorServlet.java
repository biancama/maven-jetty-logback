package org.eclipse.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@SuppressWarnings("serial")
public class ErrorServlet extends HttpServlet
{
	Logger logger = LoggerFactory.getLogger(ErrorServlet.class);

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/plain");
        PrintWriter out = null;
	    logger.debug("XXXXXxxxxxxsxsxsxsxsXXXXXXXXXXXX");
        try
        {
            out = resp.getWriter();
            out.printf("WebApp Issued Error%n");
            out.printf("Error: %s%n",req.getAttribute("jvax.servlet.error.servlet_name"));
            Throwable th = (Throwable)req.getAttribute("javax.servlet.error.exception");
            if (th != null)
            {
                th.printStackTrace(out);
            }
        } finally {
            out.close();
        }
    }
}
