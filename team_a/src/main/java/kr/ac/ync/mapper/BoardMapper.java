package kr.ac.ync.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.ac.ync.domain.BoardVO;
import kr.ac.ync.domain.Criteria;

public interface BoardMapper {
	
	public List<BoardVO> getList();

	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public Integer insertSelectKey(BoardVO board);

	public BoardVO read(int bd_idx);

	public int delete(int bd_idx);

	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);
	
	// 2개 이상의 파라미터를 넘기기위해 @Param 사용. 댓글 추가/삭제 시 amount에 1/-1 값
	public void updateReplyCnt(@Param("bd_idx") int bd_idx, @Param("amount") int amount);
}
