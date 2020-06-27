package com.hbyg.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbyg.pojo.DepartInfo;
import com.hbyg.service.departService;






@Controller
public class getAllDepController {
	@Autowired
	departService service1;

	@RequestMapping("/getAllDep")
	public String GetAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		// 紧跟查询结果的分页情况（第几页， 每页多少记录）
		PageHelper.startPage(pn, 2);
		List<DepartInfo> dep = service1.getAllDep();
		// 骚操作： 将结果放入pageinfo中，这个pageinfo就有很多有用的参数
		PageInfo<DepartInfo> info = new PageInfo<>(dep, 5);// new
															// PageInfo<>(dep)单页
															// 连续5分页new
															// PageInfo<>(dep,5);
		System.out.println("当前页面" + info.getPageNum());
		System.out.println("总页码" + info.getPages());
		System.out.println("总记录数" + info.getTotal());
		System.out.println("当前页有几个记录" + info.getSize());
		System.out.println("当前页的pagesize" + info.getPageSize());
		System.out.println("前一页" + info.getPrePage());
		System.out.println("结果" + info.getList());
		int[] nums = info.getNavigatepageNums();
		model.addAttribute("info", info);
		return "success";
	}

}
