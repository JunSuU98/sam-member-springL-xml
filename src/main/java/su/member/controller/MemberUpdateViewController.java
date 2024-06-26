package su.member.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import su.member.control.Controller;
import su.member.dao.MemberDAO;
import su.member.dto.MemberDTO;
import su.member.handler.MemberHandlerAdapter;

public class MemberUpdateViewController implements Controller {
	private static Log log = LogFactory.getLog(MemberUpdateViewController.class);
	

	@Override
	public MemberHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		int member_number = Integer.parseInt(request.getParameter("member_number"));
		
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO = memberDAO.memberSelect(member_number);
		
		request.setAttribute("memberDTO", memberDTO);
		
		log.info("특정 회원 조회");
		
		MemberHandlerAdapter memberHandlerAdapter = new MemberHandlerAdapter();
		memberHandlerAdapter.setPath("/WEB-INF/view/member/member_update_view.jsp");

		return memberHandlerAdapter;
	}

}
