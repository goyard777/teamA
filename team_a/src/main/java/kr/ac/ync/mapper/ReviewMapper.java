package kr.ac.ync.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.ac.ync.domain.Criteria;
import kr.ac.ync.domain.ReviewVO;

public interface ReviewMapper {

	public int insert(ReviewVO vo);

	public ReviewVO read(int prd_idx);

	public int delete(int prd_idx);

	public int update(ReviewVO Review);

	public List<ReviewVO> getListWithPaging(@Param("cri") Criteria cri, @Param("prd_idx") int prd_idx);

	public int getCountByProduct(int prd_idx);
}
