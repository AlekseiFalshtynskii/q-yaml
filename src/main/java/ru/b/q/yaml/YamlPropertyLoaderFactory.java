package ru.b.q.yaml;

import static java.util.Objects.requireNonNull;

import lombok.SneakyThrows;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

public class YamlPropertyLoaderFactory implements PropertySourceFactory {

  @SneakyThrows
  @Override
  public PropertySource<?> createPropertySource(String name, EncodedResource resource) {
    var factory = new YamlPropertiesFactoryBean();
    factory.setResources(resource.getResource());
    var properties = factory.getObject();
    return new PropertiesPropertySource(
        requireNonNull(resource.getResource().getFilename()),
        requireNonNull(properties)
    );
  }
}
