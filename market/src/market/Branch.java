package market;
class Branch{
	private String manager;
	private String ifsc_num;
	
	Branch(String manager,String ifsc_num) {
		this.manager=manager;
		this.ifsc_num=ifsc_num;
	}
	
	String getManager(){
		return this.manager;
	}
	String getIfsc(){
		return this.ifsc_num;
	}
}