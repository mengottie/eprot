package it.finsiel.siged.mvc.presentation.filter;

import it.finsiel.siged.constant.Constants;
import it.finsiel.siged.model.organizzazione.Menu;
import it.finsiel.siged.model.organizzazione.Organizzazione;
import it.finsiel.siged.model.organizzazione.Utente;
import it.finsiel.siged.mvc.business.MenuDelegate;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class AuthorizationFilter implements Filter {

    /**
     * The logger - it is visible to all subclasses.
     */
    protected Logger logger = Logger.getLogger(AuthorizationFilter.class
            .getName());

    private FilterConfig filterConfig = null;

    private ServletContext ctx = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        ctx = filterConfig.getServletContext();
    }

    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {

        if (req != null) {
            HttpServletRequest request = (HttpServletRequest) req;
            Organizzazione org = Organizzazione.getInstance();
            Menu menu = (Menu) org.getMenu(request.getServletPath());
            if (menu == null) {
                chain.doFilter(req, res);
            } else {
                Utente utente = (Utente) request.getSession().getAttribute(
                        Constants.UTENTE_KEY);
                MenuDelegate delegate = MenuDelegate.getInstance();
                if (utente != null && delegate.isUserEnabled(utente, menu)) {
                    chain.doFilter(req, res);
                } else {
                    String userName = null;
                    if (utente != null) {
                        userName = utente.getValueObject().getUsername();
                    } else {
                        userName = "anonymous";
                    }
                    logger.debug("Utente '" + userName
                            + "' non autorizzato >> pagina vuota");
                    RequestDispatcher ds = ctx
                            .getRequestDispatcher("/denied.jsp");
                    ds.forward(request, res);
                }
            }
        }
    }

    public void destroy() {
        // nothing to destroy yet
    }

    /**
     * @return Returns the filterConfig.
     */
    public FilterConfig getFilterConfig() {
        return filterConfig;
    }

    /**
     * @param filterConfig
     *            The filterConfig to set.
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

}