package in.abc.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.abc.bean.Flipkart;

public class ClientApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/abc/cfg/applicationContext.xml");

		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		String result = flipkart.Shopping(new String[] { "fossil", "puma", "iphone" },
				new float[] { 35000.5f, 56000.0f, 75000.35f });
		System.out.println(result);
	}
}
