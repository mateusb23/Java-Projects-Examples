package com.ead.authuser.configs;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import net.kaczmarzyk.spring.data.jpa.web.SpecificationArgumentResolver;

@Configuration
public class ResolverConfig extends WebMvcConfigurationSupport {

    // This class can be used to configure additional web MVC settings if needed.
    // Currently, it extends WebMvcConfigurationSupport but does not override any
    // methods.
    // You can add custom configurations here in the future if required.
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new SpecificationArgumentResolver());

        PageableHandlerMethodArgumentResolver resolver = new PageableHandlerMethodArgumentResolver();
        argumentResolvers.add(resolver);
        super.addArgumentResolvers(argumentResolvers);

    }

}
