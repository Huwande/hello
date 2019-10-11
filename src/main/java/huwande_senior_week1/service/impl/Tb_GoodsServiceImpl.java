package huwande_senior_week1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huwande_senior_week1.dao.Tb_GoodsMapper;
import huwande_senior_week1.domain.Tb_Brand;
import huwande_senior_week1.domain.Tb_Goods;
import huwande_senior_week1.domain.Tb_goodskind;
import huwande_senior_week1.service.Tb_GoodsService;
/**
 * 
    * @ClassName: Tb_GoodsController
    * @Description: 这是我的Service层
    * @author De.nnn
    * @date 2019年10月9日
    *
 */
@Service
public class Tb_GoodsServiceImpl implements Tb_GoodsService{
	@Autowired
	private Tb_GoodsMapper mapper;
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: 这是我的查询service
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@Override
	public List<Tb_Goods> selects(String t_name) {
		// TODO Auto-generated method stub
		return mapper.selects(t_name);
	}
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: service
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@Override
	public List<Tb_Goods> select2(Integer t_id) {
		return mapper.select2(t_id);
	}
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: service
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@Override
	public List<Tb_Brand> findBrand() {
		// TODO Auto-generated method stub
		return mapper.findBrand();
	}
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: service
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@Override
	public List<Tb_goodskind> findGoodKind() {
		// TODO Auto-generated method stub
		return mapper.findGoodKind();
	}
	/**
	 * 
	    * @ClassName: Tb_GoodsController
	    * @Description: 这是我的查询service
	    * @author De.nnn
	    * @date 2019年10月9日
	    *
	 */
	@Override
	public int add(Tb_Goods tb_Goods) {
		// TODO Auto-generated method stub
		return mapper.add(tb_Goods);
	}
	@Override
	public int deleteAll(String t_id) {
		// TODO Auto-generated method stub
		return mapper.deleteAll(t_id);
	}
	
}
