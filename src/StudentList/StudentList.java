package StudentList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.jar.Attributes.Name;

public class StudentList {
	private ArrayList<Student> list;

	
	public StudentList() {
		this.list = new ArrayList<Student>();
	}


	public StudentList(ArrayList<Student> list) {
		this.list = list;
	}
	//1. Thêm sinh viên vào danh sách.
	public void addStudent(Student sv) {
		this.list.add(sv);
	}	
	//2. In danh sách sinh viên ra màn hình.
	public void printStudentList() {	
		for (Student Student : list) {
			System.out.println(Student);
		}
	}
	
	//3.kiểm tra danh sách rỗng hay không.
	public boolean checkEmptylist() {
		return this.list.isEmpty();
	}
	
//4. lấy ra số lượng sinh viên trong danh sách.
	public int getTheNumberOfStudent() {
		return this.list.size();
	}
//5. Làm rỗng danh sách sinh viên.	
	public void emptyTheListOfStudent() {
		this.list.removeAll(list);
	}
	
//6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên
	public boolean checkForExistence(Student sv) {
		return this.list.contains(sv);
	}
	
//7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.	
	public boolean deleteStudent(Student sv) {
		return this.list.remove(sv);
	}
//8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
	public void findStudent(String name) {
		for (Student student: list) {
			if(student.getname().indexOf(name)>=0) {
				System.out.println(student);
				}
			}
		}
//9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
	 public void sortstudentdescendingorderbygrade() {
		 Collections.sort(this.list, new Comparator<Student>() {
			 
			 @Override
				public int compare(Student sv1, Student sv2) {
					if(sv1.getscore()<sv2.getscore()) {
						return 1;
					}
					else if(sv1.getscore()>sv2.getscore()) {
						return -1;
					}
					else {
						return 0;
					}
		
					}
		}); 

			
		
			 
	}
}
