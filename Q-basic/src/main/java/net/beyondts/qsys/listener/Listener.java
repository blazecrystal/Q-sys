package net.beyondts.qsys.listener;

import java.io.File;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import net.beyondts.config.BeanFactory;
import net.beyondts.config.LogbackConfigurator;
import net.beyondts.filter.SecurityFilter;
import net.beyondts.utils.Transformer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
public class Listener implements ServletContextListener,
        ServletContextAttributeListener, HttpSessionListener,
        HttpSessionAttributeListener, HttpSessionActivationListener,
        HttpSessionBindingListener, ServletRequestListener,
        ServletRequestAttributeListener {

    private static Logger logger;

    /**
     * Default constructor. 
     */
    public Listener() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    }

    //	private Timer timer;

    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event) {
        try {
            String logConfig = Transformer
                    .toLocalFilePathWithSeperatorEnd(System
                            .getProperty("user.dir"))
                    + "etc" + File.separator + "logback-Q-sys.xml";
            LogbackConfigurator.configLogback(logConfig);
            logger = LoggerFactory.getLogger(Listener.class);
            logger.debug("logback init successfully, configure file(absolute path) : "
                    + logConfig);
            BeanFactory.init("spring.xml");
            logger.debug("spring init successfully, configure file(class path) : spring.xml");
        } catch (Exception ex) {
            System.err
                    .println("failed to load logback or spring configures, system can't startup");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {

    }

    /**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        //		int taskCount = timer.purge();
        //		logger.info(taskCount + " task(s) removed");
    }

    /**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent req) {
        HttpServletRequest request = (HttpServletRequest) req
                .getServletRequest();
        Object tmp = request.getSession().getAttribute("CSRF_TOKEN_IN_SESSION");
        if (null == tmp) {
            request.getSession().setAttribute("CSRF_TOKEN_IN_SESSION",
                    SecurityFilter.generateGUID());
        }
    }

}
