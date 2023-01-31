//ch4_ex2
class Member {
	private String name, id, pass = null ;
	private int age = 0 ;
	
	public Member (String name, String id, String pass, int age) {
		this.age = age;
		this.id = id;
		this.pass = pass;
		this.name = name;
	}
	
	public void setage (int age) {
		this.age = age ;}
	public int getage () {
		return age ; 
	}
	
	public void setname (String name) {
		this.name = name ;}
	public String getname () {
		return name ; 
	}
	
	public void setid (String id) {
		this.id = id ;}
	public String getid () {
		return id ; 
	}
	
	public void setpass (String pass) {
		this.pass = pass ;}
	public String getpass () {
		return pass ; 
	}
}


public class ExCh4 {

	
	public static void main(String[] args) {
		
		Member p = new Member("sdafads","abcd","efg",45) ;
		System.out.printf("이름 : %s\n", p.getname());
		System.out.printf("아이디 : %s\n", p.getid());
		System.out.printf("패스워드 : %s\n", p.getpass());
		System.out.printf("나이 : %d\n", p.getage());

	}

}
