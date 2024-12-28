class StudentArray
{
	Student stdArr[];
	int max=50;
	int index=0;
	StudentArray()
	{
		stdArr=new Student[max];
	}
	StudentArray(int max)
	{
		this.max=max;
		stdArr=new Student[max];
	}
	public void insert(String name,int mark)
	{
		stdArr[index++]=new Student(name,mark);
	}
	public int getSize()
	{
		return index;
	}
	public String getName(int index)
	{
		return stdArr[index].getName();
	}
	public int getMark(int index)
	{
		return stdArr[index].getMark();
	}
}