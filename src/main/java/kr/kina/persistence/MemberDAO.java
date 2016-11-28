package kr.kina.persistence;

import kr.kina.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();  //���� �ð� ���ϱ�
	public void insertMember(MemberVO memberVo); //�űԸ�� ���	
	public MemberVO readMember(String userId) throws Exception;//�������Ʈ �о���̱� 
	public MemberVO readWithPW(String userId, String userPW) throws Exception;//��й�ȣ,���̵� ��� �о���̱� 
	
}
