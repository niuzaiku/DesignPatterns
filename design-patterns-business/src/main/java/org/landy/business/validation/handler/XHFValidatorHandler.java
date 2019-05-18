package org.landy.business.validation.handler;

import org.landy.business.enums.WorkflowEnum;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @author landyl
 * @create 11:16 AM 05/09/2018
 */
@Component(XHFValidatorHandler.BEAN_NAME)
public class XHFValidatorHandler extends AbstractValidatorHandler {
    public static final String BEAN_NAME = "xHFValidatorHandler";

    @Override
    protected WorkflowEnum getWorkflowId() {
        return WorkflowEnum.XHF;
    }

    @Override
    protected Set<String> getBasePackages() {
        Set<String> packages = new HashSet<>();
        packages.add("org.landy.business.validation.detail.xhf");
        packages.add("org.landy.business.validation.detail.common");
        return packages;
    }

    @Override
    protected Set<Class> excludeClasses() {
        Set<Class> classes = new HashSet<>();
        return classes;
    }

    @Override
    protected String accessBeanName() {
        return BEAN_NAME;
    }
}
