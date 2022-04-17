package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.TodoVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("todoDAO")
public class TodoDAO extends EgovAbstractDAO {

	public List<?> selectTodoList(TodoVO vo) throws Exception{
		return (List<?>) list("todoDAO.selectTodoList",vo);
	}
	
}
