package com.containment_assignment;
class Question {
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}
class SubTopic {
	private int id;
	private String name;
	private Question question;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setQuestion(Question question)
	{
		this.question=question;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Question getQuestion()
	{
		return question;
	}
}
class Topic{
	private int id;
	private String name;
	private SubTopic subTopic;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSubTopic(SubTopic subTopic)
	{
		this.subTopic=subTopic;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public SubTopic getSubTopic()
	{
		return subTopic;
	}
}
class Subject{
	private int id;
	private String name;
	private Topic topic;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setTopic(Topic topic)
	{
		this.topic=topic;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Topic getTopic()
	{
		return topic;
	}
}
class Branch{
	private int id;
	private String name;
	private Subject subject;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSubject(Subject subject)
	{
		this.subject =subject;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Subject getSubject()
	{
		return subject;
	}
}
public class InstitueInfo {
	private int id;
	private String name;
	private Branch branch;
	
	public void setId(int id)
	{
		this.id=id;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBranch(Branch branch)
	{
		this.branch=branch;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Branch getBranch()
	{
		return branch;
	}

	public static void main(String[] args) {
		
     /*	InstitueInfo i = new InstitueInfo();
		i.setId(1);
		i.setName("RSML");
		i.setBranch(new Branch());
		
		Branch branch =i.getBranch();
		branch.setId(12);
		branch.setName("Physics");
		branch.setSubject(new Subject());
		
		Subject subject = branch.getSubject();
		subject.setId(123);
		subject.setName("ElectoStatic");
		subject.setTopic(new Topic());
		
		Topic topic = subject.getTopic();
		topic.setId(1234);
		topic.setName("Electronic");
		topic.setSubTopic(new SubTopic());
		
		SubTopic subTopic = topic.getSubTopic();
		subTopic.setId(12345);
		subTopic.setName("Operator");
		subTopic.setQuestion(new Question());
		
		Question question = subTopic.getQuestion();
		question.setId(123456);
		question.setName("Getter Setter");
	 */			
				
	}

}
