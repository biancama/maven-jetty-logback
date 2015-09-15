package org.eclipse.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@SuppressWarnings("serial")
public class TimeServlet extends HttpServlet
{
    Logger logger = LoggerFactory.getLogger(TimeServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        logger.debug("YYYYYYYxxxxxxsxsxsxsxsYYYY");
        logger.info("YYYYYYYxxxxxxsxsxsxsxsYYYY");
        resp.setContentType("text/plain");
        resp.getWriter().println(new Date());
    }
}
