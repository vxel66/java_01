package Day16;


public class Day16_1 {

	//1.Member Board
		//��Ű�� ����
			//MVC
		//M(model):data
		//V(view) :front
		//C(control): model <--����--> view
		//*Database : DB,File
	
	//2.Ŭ���� ����
		// *Data:file
	
		// *M:Member,Board,Reply
		
		// *C:MemberController , BoardController , ReplyControler
		
		// *V:Application( mainmenu, membermenu, boardmenu )
	
	//3.Ŭ���� ���� [ �ʵ� , ������ , �޼ҵ�]
		//Member
			//	�ʵ�: id, password , name ,email , point
			//  ������: �������,��ü������
			//  �޼ҵ�: get,set �޼ҵ�
		
		//File
			//�ʵ�:filepath
			//�޼ҵ�:save, load �޼ҵ�
		
		//*MemberContrllor 
			//�ʵ�: Arraylist<Member> memberlist
			//�޼ҵ�:login , signup , forgotid , forgotpassword ,logout ,info , update ,deledt
	//[�ڵ�]
	
		
	
	
		
}
