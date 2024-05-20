package su.member.control;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import su.member.handler.MemberHandlerAdapter;

public interface Controller {
	public MemberHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response);
}
