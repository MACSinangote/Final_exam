public class Quiz
{
	private int id;
	private int totalScore;
	private int maxScore;
	private String Student;
	private double grade;
	
	public Quiz(int id, int totalScore, int maxScore, String Student){
		this.id = id;
		this.totalScore = totalScore;
		this.maxScore = maxScore;
		this.Student = Student;
	}
	public Quiz(){
		id = 0;
		totalScore = 0;
		maxScore = 0;
		Student = "Unkown";
		
	}
	public int getId(){
		return id;
	}
	public void setid(int id){
		this.id = id;
	}
	public int getTotalScoree(){
		return totalScore;
	}
	public void setTotalScore(int totalScore){
		this.totalScore = totalScore;
	}
	public int getMaxScore(){
		return maxScore;
	}
	public void setMaxScore(int maxScore){
		this.maxScore = maxScore;
	}
	public String getStudent(){
		return Student;
	}
	public void setStudent(String Student){
		this.Student  = Student;
	}
	public double grade(){
		this.grade = totalScore/maxScore;
		return grade;
	}
}
