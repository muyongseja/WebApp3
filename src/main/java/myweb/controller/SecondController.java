package myweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller("second")
public class SecondController {
	@RequestMapping("/second.spr1")
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mv = 
			new ModelAndView("/WEB-INF/views/result.jsp");
		mv.addObject("msg", "두번째 요청입니다.");
		return mv;
	}
}
