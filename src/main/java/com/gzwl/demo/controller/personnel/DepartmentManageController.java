package com.gzwl.demo.controller.personnel;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gzwl.demo.pojo.Department;
import com.gzwl.demo.search.personnel.DepartmentFormBean;
import com.gzwl.demo.service.personnel.DepartmentService;
import com.gzwl.demo.util.ResultBean;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * @ClassName: DepartmentManageController
 * @Desc: 部门管理控制器
 * @author: lxr
 * @date: 2019年6月3日 上午10:09:51
 * @version 1.0
 */
@RequestMapping("/departmentManage")
@Controller
public class DepartmentManageController {

	@Resource
	private DepartmentService departmentService;

	/**
	 * 
	 * @Title: departmentListView
	 * @Desc: 显示部门列表页面
	 * @return departmentListView.jsp
	 */
	@RequestMapping("/departmentListView")
	@RequiresPermissions("departmentManage:departmentList:browse")
	public String departmentListView() {
		return "department/departmentListView";
	}
/**
 * 
 * @Title: departmentList 
 * @Desc: 部门列表 
 * @param departmentFormBean
 * @return
 */
	@RequestMapping("/departmentList")
	@ResponseBody
	public ResultUtil departmentList(DepartmentFormBean departmentFormBean) {
		return departmentService.listDepartment(departmentFormBean);
	}
	/**
	 * 
	 * @Title: editDepartmentView 
	 * @Desc: 修改部门页面 
	 * @param req
	 * @param departmentId
	 * @return
	 */
	@RequestMapping("/editDepartmentView")
	public String editDepartmentView(HttpServletRequest req,Integer departmentId) {
		if(departmentId!=null && departmentId!=0) {
			req.setAttribute("department",departmentService.getDepartmentById(departmentId));
		}
		return "department/departmentform";
	}
	/**
	 * 
	 * @Title: editDepartment 
	 * @Desc: 编辑部门 
	 * @param department
	 * @return
	 */
	@RequestMapping("/editDepartment")
	@ResponseBody
	public ResultBean editDepartment(Department department) {
		int i = departmentService.saveOrUpdate(department);
		if(i>0) {
			return new ResultBean(true,true);
		}
		if(i==-1) {
			return new ResultBean(false,"部门名称重复");
		}
		return new ResultBean(false);
	}
}
