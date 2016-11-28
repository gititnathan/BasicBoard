package kr.kina.persistence;

import java.util.List;

import kr.kina.domain.BoardVO;
import kr.kina.domain.Criteria;
import kr.kina.domain.SearchCriteria;

public interface BoardDAO {

	public void insertBoard(BoardVO vo)throws Exception;     //�Խ��� �� ���
	public BoardVO selectOneBoard(Integer bno)throws Exception;  //�Խ��� ���� �� ��ȸ
	public List<BoardVO> selectAllBoard()throws Exception;  						 //�Խ��� ��� ��ȸ
	public void updateBoard(BoardVO vo)throws Exception;  //�Խ��� �� ������Ʈ
	public void deleteBoard(Integer bno)throws Exception;     //�Խ��� �� ����
	public List<BoardVO> listCriteria(Criteria cri) throws Exception; //�Խ��� ���
	public int countPaging(Criteria cri)throws Exception;  //�Խ��� ����¡ ó�� 
	public List<BoardVO> listSearch(SearchCriteria cri)throws Exception; //���� SQL�� ó���� ���� �޼ҵ� 
	public int listSearchCount(SearchCriteria cri)throws Exception;  //����SQL�� ó���� ���� �޼ҵ� 
	
}
