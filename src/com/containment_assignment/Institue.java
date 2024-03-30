package com.containment_assignment;


public class Institue {

	public static void main(String[] args) {
		
		InstitueInfo i = new InstitueInfo();
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
		topic.setName("Electonic");
		topic.setSubTopic(new SubTopic());
		
		SubTopic subTopic = topic.getSubTopic();
		subTopic.setId(12345);
		subTopic.setName("Operator");
		subTopic.setQuestion(new Question());
		
		Question question = subTopic.getQuestion();
		question.setId(123456);
		question.setName("Getter Setter");
				
		
		System.out.println(i.getId());
		System.out.println(i.getName());
		
		System.out.println(branch.getId());
		System.out.println(branch.getName());
		
		System.out.println(subject.getId());
		System.out.println(subject.getName());
		
		System.out.println(topic.getId());
		System.out.println(topic.getName());
		
		System.out.println(subTopic.getId());
		System.out.println(subTopic.getName());
		
		System.out.println(question.getId());
		System.out.println(question.getName());
	}

}
