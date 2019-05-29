package com.github.roger.registration;

import com.github.roger.component.RogerCustomDao;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class RogerCustomBeanRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        //定义一个BeanDefinition
        RootBeanDefinition rogerCustomDaoBeanDefinition = new RootBeanDefinition(RogerCustomDao.class);
        //把自定义的bean导入到容器中去
        beanDefinitionRegistry.registerBeanDefinition("rogerCustomDao",rogerCustomDaoBeanDefinition);
    }
}
