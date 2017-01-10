package myweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MessageController extends AbstractController{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mv = 
			new ModelAndView("/WEB-INF/views/result.jsp");
		mv.addObject("msg", "첫번째 요청입니다.");
		return mv;
	}
}
