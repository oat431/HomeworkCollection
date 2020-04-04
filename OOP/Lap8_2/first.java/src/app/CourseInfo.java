package app;
public class CourseInfo {
	private String courseId;
	private String courseName;
	private int courseCredits;
	private String courseGrade;
	
	public CourseInfo(){}
	public CourseInfo(String id,String cname, int credits)
	{
		this.courseId = id;this.courseName = cname;this.courseCredits = credits;
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseCredits() {
       if(courseGrade.equals("U")||courseGrade.equals("P")||courseGrade.equals("I")|| courseGrade.equals("V")||courseGrade.equals("W")){
           return 0;
       } 
		return courseCredits;
	}
	public void setCourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}
	public String getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
        
	}
	
	public double getCourseGradeValue()
	{
		double gvalue = 0.0;
		switch(courseGrade) 
		{
			case "A":
				gvalue = 4.0;
				break;
			case "B+":	
				gvalue = 3.5;
				break;
			case "B":	
				gvalue = 3.0;
				break;
			case "C+":	
				gvalue = 2.5;
				break;
			case "C":	
				gvalue = 2.0;
				break;
			case "D+":	
				gvalue = 1.5;
				break;
			case "D":	
				gvalue = 1.0;
				break;
			case "F":	
				gvalue = 0.0;
                break;
            case "S" :
                gvalue=0.0;
                break;
            case "W" :
                gvalue=0.0;
                break;
                case "U":
                gvalue=0.0;
                break;
                case "I":
                gvalue=0.0;
                break;
                case "P":
                gvalue=0.0;
                case "V" :
                gvalue=0.0;
                break;
                

		}
		return gvalue;
	}

	public String getCourseFullInfo()
	{
		return courseId + " "+ courseName + " "+ courseCredits+ " " +courseGrade;
    }
    public String getC(){
        
        return courseGrade;
    }
    public int getCourseCreditss() {
        if(courseGrade.equals("U")||courseGrade.equals("P")||courseGrade.equals("I")|| courseGrade.equals("V")||courseGrade.equals("W")||courseGrade.equals("S")){
            return 0;
        } 
         return courseCredits;
     }
	
}
