package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;
import javax.faces.view.Location;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Controller
public class DeptController {

	@Resource(name="deptService")
	private DeptService deptService;
	
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {

		
		return "dept/deptWrite";
	}
	
	@RequestMapping(value = "/deptWriteSave.do")
	public String deptWriteSave(DeptVO vo) throws Exception {

		System.out.println("부서번호 : " + vo.getDeptno());
		System.out.println("부서이름 : " + vo.getDeptname());
		System.out.println("부서위치 : " + vo.getLoc());
		
		String result = deptService.InsertDept(vo);
		
		if(result == null) { //저장됨
			System.out.println("저장완료");	
		}else {
			System.out.println("저장실패");
		}
		
		return "";
	}
	
	@RequestMapping(value = "/deptList.do")
	public String selectDeptList(DeptVO vo, ModelMap model) throws Exception {
		
		List<?> list = deptService.SelectDeptList(vo);

		System.out.println(list);
		
		model.addAttribute("resultList",list);
		
		return "dept/deptList";
	}
	
	@RequestMapping(value = "/deptDelete.do")
	public String deptDelete(int deptno) throws Exception {
		
		int sendDeptno = deptService.deleteDept(deptno);
		
		if(sendDeptno == 1) { //삭제됨
			System.out.println("삭제완료");	
		}else {
			System.out.println("삭제실패");
		}
		
		return "";
	}
	
	@RequestMapping(value="/deptUpdate.do")
	public String deptUpdate(DeptVO vo) throws Exception{
		
		int result = deptService.updateDept(vo);
		if(result == 1) {
			System.out.println("수정완료");
		}else {
			System.out.println("수정실패");

		}
		
		return "";
	}
	
	
}
