package dev.krishvora09.SpringMVC1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("home Method Called");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;

    /// /        System.out.println(result);
//
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
//
//        int result = num + num2;
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {

        int result = num + num2;

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }
//
//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname,
//                                 ModelAndView mv) {
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//
//        return mv;
//    }

    @RequestMapping("addAlien")
//    public String addAlien(@ModelAttribute("alien1") Alien alien) {
    public String addAlien(Alien alien) {
        return "result";
    }

}
