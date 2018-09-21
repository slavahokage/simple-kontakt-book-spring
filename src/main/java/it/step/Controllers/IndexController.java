package it.step.Controllers;


import it.step.Entity.KontaktBook;
import it.step.service.WareHouseKontaktBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    WareHouseKontaktBook wareHouseKontaktBook;

    @RequestMapping("/addKontakt")
    public String step3(@ModelAttribute KontaktBook book) {
        wareHouseKontaktBook.add(book);
        return "2";
    }

    @RequestMapping("/")
    public ModelAndView step1(@RequestParam (value = "index", required = false) Integer index) {
        ModelAndView mav = new ModelAndView("1");
        if(index == null){
            mav.addObject("kontakts",  wareHouseKontaktBook.getAll());
            return mav;
        }else {
            wareHouseKontaktBook.delete(index);
            return mav;
        }

    }
    @RequestMapping("/form")
    public String step2() {
        return "2";
    }
}



