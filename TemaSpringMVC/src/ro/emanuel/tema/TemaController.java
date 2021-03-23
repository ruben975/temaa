package ro.emanuel.tema;


import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TemaController {
	@RequestMapping(value="form.htm",method=RequestMethod.GET)
	public ModelAndView getForm() {
	// in aceasta metoda vom intoarce JSP cu formularul	
	return new ModelAndView("form.jsp",new ModelMap());
	}
	@RequestMapping(value="calcul.htm",method=RequestMethod.POST)
	public ModelAndView computeSum(
			@RequestParam Integer a,
			@RequestParam Integer b,
			@RequestParam Integer c,
			@RequestParam Integer d,
			@RequestParam Integer e) {
	// in aceasta metoda facem calcului sumei
		ModelMap model = new ModelMap();
		int suma = a+b+c+d+e;
		int minim = Math.min(Math.min(Math.min(a, b),Math.min(c, d)),e);
		int maxim = Math.max(Math.max(Math.max(a, b),Math.max(c, d)),e);
		int mediaAritmetica = (a+b+c+d+e)/5;
		int[] ordonat = {a,b,c,d,e};
		Arrays.sort(ordonat);
		model.put("suma", suma);
		model.put("minim", minim);
		model.put("maxim", maxim);
		model.put("mediaAritmetica", mediaAritmetica);
		model.put("ordonat", Arrays.toString(ordonat));
	// apoi trimitem suma prin model la JSP
		
		return new ModelAndView("rezultat.jsp",model);
	}
	
}