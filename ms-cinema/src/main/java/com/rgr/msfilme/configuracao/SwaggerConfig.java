//package com.rgr.mscidade.configuracao;
//
//import java.util.Arrays;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PagedResourcesAssembler;
//import org.springframework.http.MediaType;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.ParameterBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.schema.ModelRef;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Parameter;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig implements WebMvcConfigurer {
//
//	@Value("${springfox.documentation.swagger.v2.home}")
//	private String home;
//
//	@Autowired
//	private Docket dock;
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		dock.apiInfo(apiInfo());
//		registry.addResourceHandler(home + "/**").addResourceLocations("classpath:/META-INF/resources/");
//		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//	}
//
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).consumes(Set.of(MediaType.APPLICATION_JSON_VALUE))
//				.produces(Set.of(MediaType.APPLICATION_JSON_VALUE))
//				.protocols(Set.of("https", "http")).select()
//				.apis(RequestHandlerSelectors.basePackage("com.rgr.mscidade.controller")).paths(PathSelectors.any())
//				.build().ignoredParameterTypes(Pageable.class, PagedResourcesAssembler.class)
//				.globalOperationParameters(Arrays.asList(authParam())).apiInfo(apiInfo());
//	}
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("Enrollmentservice API Rest")
//				.description("Documentos da API de acesso aos endpoints de Enrollmentservice").version("Version API 1.0").build();
//	}
//
//	private Parameter authParam() {
//		return new ParameterBuilder().name("Authorization").description("Token ...").modelRef(new ModelRef("string"))
//				.parameterType("header").required(false).build();
//	}
//}
