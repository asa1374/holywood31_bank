package service;

import domain.MemberBean;

/**
 * @author Park Jung-Kwan
 * @date 2018. 12. 26.
 * @desc 멤버기능구현
 */
public class MemberServiceImpl implements MemberService{
	private int count;
	private MemberBean[] members;
	@Override
	public void join(String id, String pass, String name, String ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		
		for(int i = 0;i<count;i++) {
			if(existMember(id, pass)) {
				members[i].setPass(newPass);
			}
		}
		
	}

	@Override
	public void deleteMember(String id, String pass) {
		for(int i=0;i<count;i++) {
			if(existMember(id, pass)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				break;
			}
		}
		
	}
	
}








