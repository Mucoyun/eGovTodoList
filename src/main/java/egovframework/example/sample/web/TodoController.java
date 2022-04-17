package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.TodoService;
import egovframework.example.sample.service.TodoVO;

@Controller
public class TodoController {
	
	@Resource(name="todoService")
	private TodoService todoService;
	
	@RequestMapping(value="/todoList.do")
	public String todoList(TodoVO vo, ModelMap model) throws Exception {
		
		List<?> list = todoService.selectTodoList(vo);
		
		System.out.println(list);
		
		model.addAttribute("TodoLists",list);
		
		return "todo/todoList";
	}
}
