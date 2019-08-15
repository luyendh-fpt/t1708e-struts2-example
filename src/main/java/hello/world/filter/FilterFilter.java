package hello.world.filter;

import com.googlecode.objectify.ObjectifyService;
import hello.world.entity.User;

import javax.servlet.*;
import java.io.IOException;

public class FilterFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ObjectifyService.register(User.class);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
