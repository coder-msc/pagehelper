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
		// ������ѯ����ķ�ҳ������ڼ�ҳ�� ÿҳ���ټ�¼��
		PageHelper.startPage(pn, 2);
		List<DepartInfo> dep = service1.getAllDep();
		// ɧ������ ���������pageinfo�У����pageinfo���кܶ����õĲ���
		PageInfo<DepartInfo> info = new PageInfo<>(dep, 5);// new
															// PageInfo<>(dep)��ҳ
															// ����5��ҳnew
															// PageInfo<>(dep,5);
		System.out.println("��ǰҳ��" + info.getPageNum());
		System.out.println("��ҳ��" + info.getPages());
		System.out.println("�ܼ�¼��" + info.getTotal());
		System.out.println("��ǰҳ�м�����¼" + info.getSize());
		System.out.println("��ǰҳ��pagesize" + info.getPageSize());
		System.out.println("ǰһҳ" + info.getPrePage());
		System.out.println("���" + info.getList());
		int[] nums = info.getNavigatepageNums();
		model.addAttribute("info", info);
		return "success";
	}

}
