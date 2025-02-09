package kr.ac.ync.service;

import java.util.List;

import kr.ac.ync.domain.Criteria;
import kr.ac.ync.domain.ReviewPageDTO;
import kr.ac.ync.domain.ReviewVO;

public interface ReviewService {

	public int register(ReviewVO vo);

	public ReviewVO get(int review_idx);

	public int modify(ReviewVO vo);

	public int remove(int review_idx);

	public List<ReviewVO> getList(Criteria cri, int prd_idx);
	
	public ReviewPageDTO getListPage(Criteria cri, int prd_idx);
	
	public int productCnt(int prd_idx);

}
