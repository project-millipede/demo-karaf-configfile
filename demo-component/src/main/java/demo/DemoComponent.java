package demo;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Designate(ocd = DemoConfig.class)
@Component(
    service = DemoComponent.class,
    configurationPid = "demo.component.pid",
    configurationPolicy = ConfigurationPolicy.REQUIRE
)
public class DemoComponent {

  private static final Logger LOGGER = LoggerFactory.getLogger(DemoComponent.class);

  private DemoConfig config;

  @Activate
  @Modified
  protected void activate(final DemoConfig config) {
    this.config = config;
    LOGGER.info("Loaded config");
    LOGGER.info("Hello " + this.config.hello());
  }
}
