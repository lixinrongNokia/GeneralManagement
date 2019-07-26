/**
 * 
 */
package com.gzwl.demo.controller.sys;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gzwl.demo.pojo.Employee;
import com.gzwl.demo.pojo.Menu;
import com.gzwl.demo.pojo.Role;
import com.gzwl.demo.pojo.RoleMenuKey;
import com.gzwl.demo.service.personnel.DepartmentService;
import com.gzwl.demo.service.personnel.EmployeeService;
import com.gzwl.demo.service.sys.MenuService;
import com.gzwl.demo.service.sys.RoleMenuService;
import com.gzwl.demo.service.sys.RoleService;
import com.gzwl.demo.util.ResultBean;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * <p>
 * Title: ViewController
 * </p>
 * 
 * <p>
 * Description:系统级控制器
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Controller
@RequestMapping("/sys")
@Scope("request")
public class SystemController {
	@Resource
	private RoleMenuService roleMenuService;
	@Resource
	private RoleService roleService;
	@Resource
	private EmployeeService employeeService;
	@Resource
	private MenuService menuService;
	
	@Resource
	private DepartmentService departmentService;

	/** 访问项目主页 */
	@RequestMapping("/home")
	public String goHome(HttpServletRequest req) {
		Employee admin = (Employee) SecurityUtils.getSubject().getPrincipal();
		if (admin != null) {
			Role role = roleMenuService.getRole(new RoleMenuKey(admin.getRoleId().longValue()));
			req.setAttribute("menus", role.getMenuList());
			return "common/home";
		}
		return "redirect:/user/login";
	}

	/** 默认欢迎页面 */
	@RequestMapping("/welcome")
	public String showWelcome(HttpServletRequest req) {
		return "common/welcome";
	}

	/** 显示菜单列表页面 */
	@RequestMapping("/menuListView")
	public String menuList() {
		return "sys/system/menuList";
	}

	/** 获取菜单列表 */
	@RequestMapping("/menuData")
	@RequiresPermissions("sys:menu:list")
	@ResponseBody
	public ResultUtil menuData(Menu menu) {
		return menuService.listByExample(menu);
	}

	/** 显示添加菜单页面 */
	@RequestMapping("/addMenuView")
	public String addMenuView(HttpServletRequest req, Long parentId) {
		if (parentId != null && parentId != 0) {
			req.setAttribute("parentMenu", menuService.getByPrimaryKey(parentId));
		}
		return "sys/system/menuform";
	}

	/** 显示编辑菜单页面 */
	@RequestMapping("/editMenuView")
	public String editMenuView(HttpServletRequest req, Long menuId) {
		if (menuId != null && menuId != 0) {
			req.setAttribute("menu", menuService.getByPrimaryKey(menuId));
		}
		return "sys/system/menuform";
	}

	/** 编辑菜单操作 */
	@RequestMapping("/editMenu")
	@RequiresPermissions("sys:menu:update")
	@ResponseBody
	public ResultBean editMenu(HttpServletRequest req, Menu menu) {
		int i = menuService.saveOrUpdate(menu);
		if (i > 0) {
			return new ResultBean(true, true);
		}
		return new ResultBean(false);
	}

	/** 删除菜单操作 */
	@RequestMapping("/delMenu")
	@RequiresPermissions("sys:menu:delete")
	@ResponseBody
	public ResultBean delMenu(HttpServletRequest req, Long menuId) {
		if (menuId != null) {
			int i = menuService.deleteByPrimaryKey(menuId);
			if (i > 0) {
				return new ResultBean(true, true);
			}
		}
		return new ResultBean(false, "该菜单拖家带口不能全干掉");
	}

	/** 显示角色列表页面 */
	@RequestMapping("/roleListView")
	@RequiresPermissions("sys:role:list")
	public String roleList() {
		return "sys/system/roleList";
	}

	/** 分页获取角色列表 */
	@RequestMapping("/getRoleList")
	@RequiresPermissions("sys:role:list")
	@ResponseBody
	public ResultUtil getRoleList(Integer page, Integer limit, Role role) {
		return roleService.listByExample(page, limit, role);
	}

	/** 显示编辑角色页面 */
	@RequestMapping("/editRoleView")
	@RequiresPermissions("sys:role:update")
	public String editRoleView(HttpServletRequest req, Long roleId) {
		if (roleId != null && roleId != 0) {
			req.setAttribute("role", roleMenuService.getRoleNoTree(new RoleMenuKey(roleId)));
		}
		List<Menu> list = menuService.listMenu();
		req.setAttribute("menus", list);
		return "sys/system/roleform";
	}

	/** 编辑角色操作 */
	@RequestMapping("/editRole")
	@RequiresPermissions("sys:role:update")
	@ResponseBody
	public ResultBean editRole(HttpServletRequest req, @RequestBody Role role) {
		int i = roleService.saveOrUpdate(role);
		if (i > 0) {
			return new ResultBean(true, true);
		}
		return new ResultBean(false);
	}

	/** 删除角色操作 */
	@RequestMapping("/delRole")
	@RequiresPermissions("sys:role:delete")
	@ResponseBody
	public ResultBean delRole(HttpServletRequest req, Long roleId) {
		if (roleId != null) {
			int i = roleService.deleteByPrimaryKey(roleId);
			if (i > 0) {
				return new ResultBean(true, true);
			}
		}
		return new ResultBean(false);
	}

	/** 显示管理员列表页面 */
	@RequestMapping("/adminListView")
	@RequiresPermissions("sys:admin:list")
	public String adminListView() {
		return "employee/employeeListView";
	}

	/** 分页获取管理员列表数据 */
	@RequestMapping("/adminList")
	@RequiresPermissions("sys:admin:list")
	@ResponseBody
	public ResultUtil adminList(Integer page, Integer limit, Employee employee) {
		if (employee.getEmployeeId() == null) {
			employee = (Employee) SecurityUtils.getSubject().getPrincipal();
		}
		return employeeService.listOrByWhere(page, limit, employee);
	}

	/** 显示添加管理员页面 */
	@RequestMapping("/addAdminView")	
	@RequiresPermissions("sys:admin:save")
	public String addAdminView(HttpServletRequest req) {
		req.setAttribute("roles", roleService.list());
		req.setAttribute("departments", departmentService.listDepartmentNonSort());
		return "employee/addEmployeeView";
	}

	/** 显示编辑管理员页面 */
	@RequestMapping("/editAdminView")
	public String editAdminView(HttpServletRequest req, Integer employeeId) {
		if (employeeId != null && employeeId != 0) {
			req.setAttribute("employee", employeeService.getEmployeeByPrimaryKey(employeeId));
		}
		req.setAttribute("departments", departmentService.listDepartmentNonSort());
		req.setAttribute("roles", roleService.list());
		return "employee/employeeEditView";
	}

	/** 编辑管理员操作 */
	@RequestMapping("/editAdmin")
	@RequiresPermissions("sys:admin:update")
	@ResponseBody
	public ResultBean editAdmin(HttpServletRequest req, Employee employee) {
		int i = employeeService.saveOrUpdate(employee);
		if (i > 0) {
			return new ResultBean(true, true);
		}
		return new ResultBean(false);
	}

	/** 删除管理员操作 */
	@RequestMapping("/delAdmin")
	@RequiresPermissions("sys:admin:delete")
	@ResponseBody
	public ResultBean delAdmin(HttpServletRequest req, Integer employeeId) {
		if (employeeId != null && employeeId != 0) {
			int i = employeeService.deleteByPrimaryKey(employeeId);
			if (i > 0) {
				return new ResultBean(true, true);
			}
		}
		return new ResultBean(false);
	}

}
