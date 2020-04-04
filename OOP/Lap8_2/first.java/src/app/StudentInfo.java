package app;
public class StudentInfo {
	private String studentId;
	private String studentFirstname;
	private String studentLastname;
	
	public String getStudentId() {
        char[] ss =studentId.toCharArray();
        if(ss.length==9){
            int year =Integer.parseInt(ss[0]+""+ss[1]);
            int kana= Integer.parseInt(ss[2]+""+ss[3]);
            if(year<=62&&kana<=21){
                return studentId;
            }
        }else{
            return "No information for this ID";
        }
        return "plz insert your id agian";
		
	}
	public void setStudentId(String studentId) {
        this.studentId = studentId;
        
	}
	public String getStudentFirstname() {
		return studentFirstname;
	}
	public void setStudentFirstname(String studentFirstname) {
		this.studentFirstname = studentFirstname;
	}
	public String getStudentLastname() {
		return studentLastname;
	}
	public void setStudentLastname(String studentLastname) {
		this.studentLastname = studentLastname;
    }
}
  
