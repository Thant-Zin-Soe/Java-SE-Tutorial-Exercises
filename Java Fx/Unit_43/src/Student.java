class Student
{
	private String name;
	private int mark;
	Student(){}
	Student(String name,int mark)
	{
		this.name=name;
		this.mark=mark;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMark(int mark)
	{
		this.mark=mark;
	}
	public String getName()
	{
		return name;
	}
	public int getMark()
	{
		return mark;
	}
}