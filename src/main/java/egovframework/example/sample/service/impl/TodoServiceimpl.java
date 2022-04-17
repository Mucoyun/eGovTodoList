package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.TodoService;
import egovframework.example.sample.service.TodoVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("todoService")
public class TodoServiceimpl extends EgovAbstractServiceImpl implements TodoService {

		@Resource(name="todoDAO")
		private TodoDAO todoDAO;
		
		@Override
		public List<?> selectTodoList(TodoVO vo) throws Exception{
			
			return todoDAO.selectTodoList(vo);
		}
		
}
