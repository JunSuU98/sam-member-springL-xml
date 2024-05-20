package su.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import su.member.dto.MemberDTO;
import su.member.service.MemberServiceImp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class Insert {
	
	private static final Logger logger = LoggerFactory.getLogger(Insert.class);
	
	@Autowired
	MemberServiceImp memberServiceImp;
	
	@Test
	public void MemberInsert() {
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMember_number(0);
		memberDTO.setMember_status("active");
		memberDTO.setMember_rate(0);
		memberDTO.setMember_id("test2");
		memberDTO.setMember_password("test2");
		memberDTO.setMember_name("test2");
		memberDTO.setMember_email("test2@naver.com");
		memberDTO.setMember_phone("010-0000-0002");
		memberDTO.setMember_address("test2 address");
		memberDTO.setMember_birth("1998/12/11");
		memberDTO.setMember_create("2002/02/22");
		memberDTO.setMember_update("2002/02/22");
		
		
		memberServiceImp.memberInsert(memberDTO);
		
	}

}
