package ua.voyager.spring.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.voyager.spring.calculator.model.Calculate;

@Controller
public class CalcController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView calculate() { return new ModelAndView("index", "command", new Calculate()); }

    @RequestMapping(value = "/calcResult", method = RequestMethod.POST)
    public String calcResult(@ModelAttribute("SpringWeb") Calculate calculate, ModelMap model) {
        int sum = calculate.getFirst() + calculate.getSecond();
        model.addAttribute("sum", sum);
        return "result";
    }
}
