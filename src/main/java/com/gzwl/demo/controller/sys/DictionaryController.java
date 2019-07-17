package com.gzwl.demo.controller.sys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gzwl.demo.pojo.Dictionary;
import com.gzwl.demo.pojo.DictionaryType;
import com.gzwl.demo.search.sys.DictionarySearch;
import com.gzwl.demo.service.sys.DictionaryService;
import com.gzwl.demo.service.sys.DictionaryTypeService;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * @version:1.0
 * @Description:字典
 * @author:李云飞
 * @date: 2019年3月29日上午11:49:53
 */
@Controller
@RequestMapping("/dictionary")
public class DictionaryController {

	@Resource
	private DictionaryService dictionaryService;

	@Resource
	private DictionaryTypeService dictionaryTypeService;

	/**
	 * 打开页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Model model) {
		List<DictionaryType> dictionaryTypeList = dictionaryTypeService.ListByTable();
		model.addAttribute("dictionaryTypeList", dictionaryTypeList);
		model.addAttribute("titleName", "数据字典");
		return "/sys/dictionary/dictionaryList";
	}

	/**
	 * 查询 or 条件查询
	 * 
	 * @param lwDictionarySearch
	 * @return
	 */
	@RequestMapping("getData")
	@ResponseBody
	public ResultUtil getData(DictionarySearch dictionarySearch) {
		return dictionaryService.ListByPage(dictionarySearch);
	}

	/**
	 * 进入新增或修改页面
	 * 
	 * @param model
	 * @param method
	 * @param dkId
	 * @return
	 */
	@RequestMapping(value = "/toInsertOrupdate")
	public String toInsertOrupdate(Model model, String method, Integer dictionaryId) {
		List<DictionaryType> dictionaryTypeList = dictionaryTypeService.ListByTable();
		model.addAttribute("dictionaryTypeList", dictionaryTypeList);
		if (method.equals("ADD")) {
			model.addAttribute("titleName", "添加");
		} else if (method.equals("EDIT")) {
			Dictionary dictionary = dictionaryService.getById(dictionaryId);
			model.addAttribute("titleName", "编辑");
			model.addAttribute("data", dictionary);
		}
		return "/sys/dictionary/dictionaryEdit";
	}

	/**
	 * 执行新增或修改保存
	 * 
	 * @param lwDictionary
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/insertOrupdate")
	@ResponseBody
	public Map<String, Object> insertOrupdate(Dictionary dictionary, HttpServletRequest request) {
		Map<String, Object> result = new HashMap<>();
		if (null != dictionary.getDictionaryId() && dictionary.getDictionaryId() != 0) {// 修改
			if (dictionaryService.updateSelective(dictionary) > 0) {
				result.put("STATE", "SUCCESS");
			} else {
				result.put("STATE", "FAIL");
			}
		} else {// 新增
			if (dictionaryService.insert(dictionary) > 0) {
				result.put("STATE", "SUCCESS");
			} else {
				result.put("STATE", "FAIL");
			}
		}
		return result;
	}

	/**
	 * 级联查询（根据表id查询别对应的字段）
	 * 
	 * @param dtParentId
	 * @return
	 */
	@RequestMapping(value = "/selectByValue")
	@ResponseBody
	public Map<String, Object> selectByValue(Integer parentId) {
		Map<String, Object> result = new HashMap<>();
		List<DictionaryType> dictionaryTypeList = dictionaryTypeService.ListByParentId(parentId);
		result.put("data", dictionaryTypeList);
		return result;
	}

	/**
	 * 启用 or 停用
	 * 
	 * @param lwDictionary
	 * @return
	 */
	@RequestMapping(value = "/alterStatus")
	@ResponseBody
	public Map<String, Object> alterStatus(Dictionary dictionary) {
		Map<String, Object> result = new HashMap<>();
		if (null != dictionary.getDictionaryStatus() && dictionary.getDictionaryId() != 0) {
			if (dictionaryService.updateSelective(dictionary) > 0) {
				result.put("STATE", "SUCCESS");
				result.put("MSG", "改变状态成功");
			} else {
				result.put("STATE", "FAIL");
				result.put("MSG", "改变状态失败");
			}
		} else {
			result.put("STATE", "FAIL");
			result.put("MSG", "数据异常");
		}
		return result;
	}

}
