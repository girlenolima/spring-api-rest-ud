package br.com.leno.config;

import br.com.leno.serialization.converter.YamlJackson2HttpMesageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


/**
 * Essa classe de configuraçao serve para permitir a serializaçao do DTO em varios formatos
 * nessa API sera JSON e YMAL
 * É importante mencionar que ela esta diretamente vinculada ao conceito de content negotiation,
 * que esta implementado atraves das dependecias do fast.
 * -
 * -
 * Essa anotaçao @Configuration avisa ao spring para acessar essa clase e pegar as configuraçao
 * no momento que estiver subindo apliaçao.
 * Ou seja essa classe sera umas das primeiras a subir o contexto. Pois nela contem configuraçoes
 * que ditam o funcionamento da aplicaçao.
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private static final MediaType MEDIA_TYPE_APPLICATION_YML = MediaType.valueOf("application/x-yaml");

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new YamlJackson2HttpMesageConverter());
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

        // Via QUERY PARAM. http://localhost:8080/api/person/v1?mediaType=xml
		/*configurer.favorParameter(true)
			.parameterName("mediaType").ignoreAcceptHeader(true)
			.useRegisteredExtensionsOnly(false)
			.defaultContentType(MediaType.APPLICATION_JSON)
				.mediaType("json", MediaType.APPLICATION_JSON)
				.mediaType("xml", MediaType.APPLICATION_XML);*/


        // Via HEADER PARAM. http://localhost:8080/api/person
        configurer.favorParameter(false)
                .ignoreAcceptHeader(false)
                .useRegisteredExtensionsOnly(false)
                .defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("json", MediaType.APPLICATION_JSON)
                .mediaType("xml", MediaType.APPLICATION_XML)
                .mediaType("x-yaml", MEDIA_TYPE_APPLICATION_YML)
        ;
    }




}
