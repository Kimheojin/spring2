package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//controller에는 무조건 달기(annotation)
@Controller
public class HelloController {

//    hello에 매핑
//    model은 spring boot ui, 실어서 넘길수가 있음(view로)
    @GetMapping("hello")
    public String hello(Model model) {
        //model에 값을 담음
//        data는 hello
//        data라는 키에 값은 hello
        model.addAttribute("data","hello");


//  return은 화면 이름
//  template파일에 ㅔ존제
        return "hello";
    }
}
