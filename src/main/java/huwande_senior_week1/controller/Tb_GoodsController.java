package huwande_senior_week1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import huwande_senior_week1.domain.Tb_Brand;
import huwande_senior_week1.domain.Tb_Goods;
import huwande_senior_week1.domain.Tb_goodskind;
import huwande_senior_week1.service.Tb_GoodsService;
/**
 * 
    * @ClassName: Tb_GoodsController
    * @Description: 这是我的Controller
    * @author De.nnn
    * @date 2019年10月9日
    *
 */
@Controller
public class Tb_GoodsController {
	@Autowired
	private Tb_GoodsService service;
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: 这是我的查询
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@GetMapping
	@RequestMapping("select")
	public String getTb_Goods(Model model,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "2")Integer pageSize,@RequestParam(defaultValue = "")String t_name) {
		PageHelper.startPage(pageNum, pageSize);
		List<Tb_Goods> list = service.selects(t_name);
		PageInfo info=new PageInfo(list);
		model.addAttribute("list", list);
		model.addAttribute("info", info);
		model.addAttribute("t_name", t_name);
		return "list";
	}
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: 这是我的详情
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@RequestMapping("selectId")
	public String selectId(Model model,Integer t_id) {
			System.out.println(t_id);
			System.out.println(t_id);
			System.out.println(t_id);
			List<Tb_Goods> hu=service.select2(t_id);
			model.addAttribute("hu",hu);
			return "FindById";
	}
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: 这是我的Controller
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@RequestMapping("findBrand")
	public String findBrand(Model model) {
		List<Tb_Brand> brands=service.findBrand();
		
		model.addAttribute("brands", brands);
		List<Tb_goodskind> kind=service.findGoodKind();
		model.addAttribute("kind", kind);
		return "insert";
	}
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: 这是我的Controller
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@ResponseBody
	@RequestMapping("add")
	public int add(Tb_Goods tb_Goods) {
		int i=service.add(tb_Goods);
		return i;
	}
	@ResponseBody
	@RequestMapping("deleteAll")
	public int deleteAll(String t_id) {
		int i=service.deleteAll(t_id);
		return i;
	}
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: 这是我的Controller
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@RequestMapping("update")
	public String update(Model model,Integer t_id) {
		List<Tb_Brand> brands=service.findBrand();
		model.addAttribute("brands", brands);
		List<Tb_goodskind> kind=service.findGoodKind();
		model.addAttribute("kind", kind);
		List<Tb_Goods> hu=service.select2(t_id);
		model.addAttribute("hu",hu);
		return "update";
	}
}
