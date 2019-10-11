package huwande_senior_week1.service;

import java.util.List;

import huwande_senior_week1.domain.Tb_Brand;
import huwande_senior_week1.domain.Tb_Goods;
import huwande_senior_week1.domain.Tb_goodskind;

public interface Tb_GoodsService {
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: 这是我的查询service
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	List<Tb_Goods> selects(String t_name);

	List<Tb_Goods> select2(Integer t_id);

	List<Tb_Brand> findBrand();

	List<Tb_goodskind> findGoodKind();

	int add(Tb_Goods tb_Goods);

	int deleteAll(String t_id);
}
