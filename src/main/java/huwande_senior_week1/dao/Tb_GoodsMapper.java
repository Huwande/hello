package huwande_senior_week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import huwande_senior_week1.domain.Tb_Brand;
import huwande_senior_week1.domain.Tb_Goods;
import huwande_senior_week1.domain.Tb_goodskind;

public interface Tb_GoodsMapper {

	List<Tb_Goods> selects(@Param("t_name")String t_name);

	List<Tb_Goods> select2(@Param("t_id")Integer t_id);

	List<Tb_Brand> findBrand();

	List<Tb_goodskind> findGoodKind();

	int add(Tb_Goods tb_Goods);

	int deleteAll(@Param("t_id")String t_id);


}