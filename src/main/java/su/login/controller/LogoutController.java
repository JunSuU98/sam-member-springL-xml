package su.login.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import su.member.control.Controller;
import su.member.handler.MemberHandlerAdapter;

public class LogoutController implements Controller {
	private static Log log = LogFactory.getLog(LogoutController.class);

	@Override
	public MemberHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession httpSession = request.getSession();
		
		httpSession.invalidate();
		
		
		MemberHandlerAdapter memberHandlerAdapter = new MemberHandlerAdapter();
		memberHandlerAdapter.setPath("/WEB-INF/view/login/logout.jsp");
		
		return memberHandlerAdapter;
	}

}
