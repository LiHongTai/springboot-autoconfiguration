package com.github.roger.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class RogerCustomConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //容器中包含rogerAspect组件才返回true
        if(conditionContext.getBeanFactory().containsBean("rogerAspect")){
            return true;
        }
        return false;
    }
}
