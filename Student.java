public class Student {
     private long id;
	 private String name;
	 private String gender;
	 public void setId(long id){
	      this.id=id;
		  }
     public long getId(){
	      return this.id;
		  }
	public void setName(String name){
	      this.name=name;
		  }
	public String getName(){
	      return this.name;
		  }
    public String toString(){
		return "Student[id:"+this.id+",name:"+this.name+"]";
	}
}