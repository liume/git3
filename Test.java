public class Test{
    public static void main(String[] args){
      Student stu1=new Student();
	  
	  stu1.setId(1001L);
	  stu1.setName("zhou");
	  System.out.println("stu1 id:"+stu1.getId());
	  System.out.println("stu1 name:"+stu1.getName());
	  
	  System.out.println(stu1);
	}
}