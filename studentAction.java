package action;

import model.student;
import dao.studentdao;

public class studentAction {

	public static void main(String[] args) throws Exception{
		
		studentdao s =  new studentdao();
		
		//List<student> result = s.query();
		//for(int i = 0;i < result.size();i++){
			//System.out.println(result.get(i).toString());
		//}
		
		student s1 = new student();
		
		s1.setSid("s_103");
		s1.setAge(30);
		s1.setSname("zhoulian");
		
		//student test = s.get("s_101");
		//System.out.println(test.toString());
		
		//s.delStudent("s_102");
		
		//s.updateStudent(s1);
		
		//s.addStudent(s1);
	}
}
