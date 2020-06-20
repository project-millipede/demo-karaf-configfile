package demo;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
    name = "Hello World Service Configuration",
    description = "Component Service Configuration")
public @interface DemoConfig {

  @AttributeDefinition(name = "Hello", type = AttributeType.STRING)
  String hello();

}