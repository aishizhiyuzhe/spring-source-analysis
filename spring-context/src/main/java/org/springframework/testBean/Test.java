package org.springframework.testBean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Test implements BeanNameAware, ApplicationEventPublisherAware {

	String age;
	String baneName;
	ApplicationEventPublisher applicationEventPublisher;
	@Override
	public void setBeanName(String name) {
		this.baneName=name;
	}

	public String getBaneName() {
		return baneName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
	}

	public ApplicationEventPublisher getApplicationEventPublisher() {
		return applicationEventPublisher;
	}
}
