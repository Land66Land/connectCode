package connectCode.mapper;

import connectCode.model.MemberDTO;
import connectCode.model.MenteeDTO;
import connectCode.model.MentorDTO;

public interface MemberMapper {

	//UserDetailsServiceImpl에서 사용하는 메서드 시작
	
	MemberDTO getAuth(String id);
	
	int getMentor_no(int member_no);
	int getMentee_no(int member_no);
	
	//UserDetailsServiceImpl에서 사용하는 메서드 끝
	
	MemberDTO findUuid(Long uuid);

	void insertMenteeMember(MemberDTO member);

	int getMemberNo(String uuid);
	
	void insertMentee(MenteeDTO mentee, int member_no);

	int getSameId(String id);

	void normalMenteeMemberInsert(MemberDTO member);

	int getNormalMemberNo(String id);

	void insertNormalMentee(MenteeDTO mentee, int member_no);

	MemberDTO getMember(String id);

	int findMenteeId(String phone);

	MemberDTO getMemberMentee(int member_no);
	
	void updateMenteePw(String encodepw, String id);
	
/////////////////////////용경 멘토
	
void insertMentorMember(MemberDTO member);

void insertNormalMentor(MentorDTO mentor, int member_no);

int findMentorId(String phone);

MemberDTO getMemberMentor(int member_no);

void updateMentorPw(String encodepw, String id);
	
}
