package t1Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("user")
public class UserController {
	@RequestMapping("test01.do")
	public void test01() {
		System.out.println("hahahaha");
		System.out.println("大大大大大大");
		System.out.println("草草草草草草草草");
	}
}
